package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema(description = "储值付款请求参数")
public class DepositPayRequest {

    @Schema(description = "手机号", example = "18187819158")
    private String mobile;

    @Schema(description = "会员编号", example = "2507140000000849")
    private String customerNo;

    @Schema(description = "会员储值单号", example = "bbafb48539d4")
    private String tradeCode;

    @Schema(description = "会员储值付款动态码", example = "bbafb48539d4")
    private String depositDyCode;

    @Schema(description = "储值类型: 31-平台代付款, 32-会员付款", requiredMode = Schema.RequiredMode.REQUIRED, example = "32")
    private Integer depositType;

    @Schema(description = "储值账户类型 (默认1)", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    private Integer accountType;

    @Schema(description = "储值金额 (必须为负数)", requiredMode = Schema.RequiredMode.REQUIRED, example = "-11.00")
    private BigDecimal amount;

    @Schema(description = "外部支付单号", example = "WX123456789")
    private String outTradeCode;

    @Schema(description = "回调地址", example = "www.baidu.com")
    private String url;

    @Schema(description = "渠道编码", requiredMode = Schema.RequiredMode.REQUIRED, example = "KEDJD")
    private String channelCode;

    @Schema(description = "操作理由", example = "平台付款/支付")
    private String reason;

    @Schema(description = "备注", example = "备注：付款/支付")
    private String remark;
}