package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "储值退款请求参数")
public class DepositRefundRequest {

    @Schema(description = "手机号 (与会员编号二选一)", example = "18187819158")
    private String mobile;

    @Schema(description = "会员编号", example = "2507140000000849")
    private String customerNo;

    @Schema(description = "储值类型: 21-平台退款, 22-平台退卡", requiredMode = Schema.RequiredMode.REQUIRED, example = "21")
    private Integer depositType;

    @Schema(description = "充值时返回的充值单号 (21类型退款需指定)", example = "2508040000007902")
    private String tradeCode;

    @Schema(description = "外部退款单号", example = "WX123456789")
    private String outTradeCode;

    @Schema(description = "渠道编码", requiredMode = Schema.RequiredMode.REQUIRED, example = "TEST001")
    private String channelCode;

    @Schema(description = "操作理由", example = "平台测试退款")
    private String reason;

    @Schema(description = "备注", example = "备注：退款")
    private String remark;
}