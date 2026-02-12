package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema(description = "储值付款冲正请求参数")
public class DepositPayRefundRequest {

    @Schema(description = "手机号", example = "18187819158")
    private String mobile;

    @Schema(description = "会员编号", example = "2507140000000849")
    private String customerNo;

    @Schema(description = "储值类型: 41-平台代冲正, 42-会员付款冲正", requiredMode = Schema.RequiredMode.REQUIRED, example = "41")
    private Integer depositType;

    @Schema(description = "冲正金额 (必须大于0，精确到小数2位)", requiredMode = Schema.RequiredMode.REQUIRED, example = "11.00")
    private BigDecimal amount;

    @Schema(description = "原始支付(付款)凭证，即付款接口返回的 trade_code", requiredMode = Schema.RequiredMode.REQUIRED, example = "2508040000008163")
    private String tradeCode;

    @Schema(description = "外部冲正单号", example = "WX123456789")
    private String outTradeCode;

    @Schema(description = "渠道编码", requiredMode = Schema.RequiredMode.REQUIRED, example = "TEST001")
    private String channelCode;

    @Schema(description = "操作理由", example = "平台测试退款/冲正")
    private String reason;

    @Schema(description = "备注", example = "备注：退款/冲正")
    private String remark;
}