package zjian.dto.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "CouponPackDyCodeResponse", description = "券包动态二维码响应")
public class CouponPackDyCodeResponse {

    @Schema(description = "券包动态码", example = "95f4c9cb5d18")
    private String couponpack_dy_code;

    @Schema(description = "时效时间戳", example = "2025-07-28 16:31:35")
    private String dyCode_invalid_times;
}