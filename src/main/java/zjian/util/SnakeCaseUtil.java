package zjian.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.util.Map;

public class SnakeCaseUtil {

    private static final ObjectMapper MAPPER = new ObjectMapper()
            .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
//            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    /**
     * 将任意对象转换为 Map (Key 为下划线格式)
     */
    public static Map<String, Object> toSnakeMap(Object object) {
        if (object ==null){
            return null;
        }
        return MAPPER.convertValue(object, new TypeReference<Map<String, Object>>() {
        });
    }

    /**
     * 转成 JSON
     */
    public static String toSnakeJson(Object object) {
        try {
            return MAPPER.writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException("JSON转换异常", e);
        }
    }
}