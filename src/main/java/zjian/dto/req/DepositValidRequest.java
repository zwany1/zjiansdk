package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "储值审核请求参数")
public class DepositValidRequest {
    
    @Schema(description = "审核单号 (由充值、付款、退款等接口返回)", requiredMode = Schema.RequiredMode.REQUIRED, example = "2508040000008163")
    private String tradeCode;
}