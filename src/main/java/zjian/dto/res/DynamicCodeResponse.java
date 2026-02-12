package zjian.dto.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "获取会员动态二维码响应")
public class DynamicCodeResponse {
    @Schema(description = "会员动态码")
    private String customer_dy_code;
    
    @Schema(description = "时效时间戳")
    private String dyCode_invalid_times;
}