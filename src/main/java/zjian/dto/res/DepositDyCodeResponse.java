package zjian.dto.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "获取储值付款动态码响应数据")
public class DepositDyCodeResponse {

    @Schema(description = "动态码失效时间", example = "2025-07-28 16:31:35")
    private String dyCodeInvalidTimes;
    @Schema(description = "储值付款动态码", example = "95f4c9cb5d18")
    private String depositDyCode;
}