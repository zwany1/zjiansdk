package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "获取储值付款动态码请求参数")
public class DepositDyCodeRequest {

    @Schema(description = "储值单号", requiredMode = Schema.RequiredMode.REQUIRED, example = "2601090000111295")
    private String tradeCode;

    @Schema(description = "会员编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "2601130000156822")
    private String customerNo;
}