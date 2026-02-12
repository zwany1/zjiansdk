package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema(description = "会员储值充值请求参数")
public class DepositRechargeRequest {

    @Schema(description = "手机号 (与会员编号二选一)", example = "18187819158")
    private String mobile;

    @Schema(description = "会员编号", example = "2601130000156822")
    private String customerNo;

    @Schema(description = "储值类型 (11:平台代充值, 12:微信支付等)", requiredMode = Schema.RequiredMode.REQUIRED, example = "11")
    private Integer depositType;

    @Schema(description = "储值账户类型 (默认1)", defaultValue = "1", example = "1")
    private Integer accountType;

    @Schema(description = "金额类型 (0:自定义输入金额, 1:通过活动选择金额)", requiredMode = Schema.RequiredMode.REQUIRED, example = "0")
    private Integer payType;

    @Schema(description = "充值卡密 (deposit_type=19时必填)")
    private String cardPassword;

    @Schema(description = "金额 (pay_type=0时必填，必须大于0)", example = "100.00")
    private BigDecimal amount;

    @Schema(description = "充值促销活动明细ID (pay_type=1时必填)")
    private Long promotionDtId; // 对应接口 promotion_dt_id

    @Schema(description = "外部充值单号 (唯一)", requiredMode = Schema.RequiredMode.REQUIRED, example = "WX20231010001")
    private String outTradeCode;

    @Schema(description = "是否已支付 (true/false)", requiredMode = Schema.RequiredMode.REQUIRED, example = "true")
    private Boolean isPaid;

    @Schema(description = "渠道编码", requiredMode = Schema.RequiredMode.REQUIRED, example = "KEDJD")
    private String channelCode;

    @Schema(description = "操作理由", example = "平台测试充值")
    private String reason;

    @Schema(description = "备注", example = "VIP充值")
    private String remark;
}