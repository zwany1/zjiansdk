package zjian.config;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CrmSdkConfig {
    /** 接口地址 ( http://118.178.230.10) */
    private String host;
    
    /** ( 1001) */
    private String clientId;
    
    /** ( 1001) */
    private String clientCode;
    
    /**  ( 1) */
    private String tenId;
    
    private String accessToken;
    
    /** 签名密钥 */
    private String clientSecret;

    /** 超时时间(秒) */
    @Builder.Default
    private int timeout = 10;
}