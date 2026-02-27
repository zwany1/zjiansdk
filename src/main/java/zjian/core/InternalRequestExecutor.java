package zjian.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import zjian.config.CrmSdkConfig;
import zjian.excetiopn.CrmSdkException;
import zjian.util.SignUtil;
import zjian.util.SnakeCaseUtil;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Slf4j
public class InternalRequestExecutor {

    private final CrmSdkConfig config;
    private final OkHttpClient httpClient;

    public InternalRequestExecutor(CrmSdkConfig config) {
        this.config = config;
        this.httpClient = new OkHttpClient.Builder()
                .connectTimeout(config.getTimeout(), TimeUnit.SECONDS)
                .readTimeout(config.getTimeout(), TimeUnit.SECONDS)
                .build();
    }

    public <T> T execute(String apiPath, Object requestParams, Class<T> responseClass, String apiDesc) {
        // 转下划线 Map
        Map<String, Object> bodyMap = requestParams instanceof Map ? 
            (Map<String, Object>) requestParams : SnakeCaseUtil.toSnakeMap(requestParams);
        
        String jsonParams = JSON.toJSONString(bodyMap);
        String timestamp = String.valueOf(System.currentTimeMillis());
        String url = config.getHost() + apiPath;

        try {
            //  签名
            String signSource = SignUtil.splicingUrl(
                    config.getClientId(), config.getClientCode(), config.getTenId(),
                    config.getAccessToken(), timestamp, jsonParams
            );
            String sign = SignUtil.encryptHmacString(signSource, config.getClientSecret());

            RequestBody body = RequestBody.create(jsonParams, MediaType.parse("application/json"));
            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .addHeader("clientId", config.getClientId())
                    .addHeader("clientCode", config.getClientCode())
                    .addHeader("tenid", config.getTenId())
                    .addHeader("accessToken", config.getAccessToken())
                    .addHeader("timestamp", timestamp)
                    .addHeader("sign", sign)
                    .build();

            if (log.isDebugEnabled()) {
                log.debug(" Request: URL={}, Body={}", url, jsonParams);
            }
            
            try (Response response = httpClient.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new CrmSdkException(" Error: " + response.code());
                }

                String responseBody = null;
                if (response.body() != null) {
                    responseBody = response.body().string();
                }

                JSONObject jsonObject = JSON.parseObject(responseBody);
                String code = jsonObject.getString("code");
                
                if (!"200".equals(code)) {
                    String desc = jsonObject.getString("desc");
                    throw new CrmSdkException(code, apiDesc + "失败: " + desc);
                }

                if (responseClass == Void.class) return null;
    
                T data = jsonObject.getObject("data", responseClass);

                checkBusinessSuccess(data, apiDesc);

                return data;
            }

        } catch (IOException e) {
            throw new CrmSdkException("网络请求失败: " + e.getMessage());
        } catch (Exception e) {
            if (e instanceof CrmSdkException) throw (CrmSdkException) e;
            throw new RuntimeException("SDK内部错误", e);
        }
    }

    /**
     * 检查 success
     *
     */
    private void checkBusinessSuccess(Object data, String apiDesc) {
        if (data == null) return;
        
        JSONObject dataJson = (JSONObject) JSON.toJSON(data);
        if (dataJson.containsKey("success")) {
            boolean success = dataJson.getBooleanValue("success");
            if (!success) {
                String msg = dataJson.getString("message");
                throw new CrmSdkException(apiDesc + "业务处理失败: " + msg);
            }
        }
    }
}