package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Schema(name = "CouponCancelListRequest", description = "批量冲正优惠券请求参数")
public class CouponCancelListRequest {

    @Schema(description = "手机号", example = "18187819158", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String mobile;

    @Schema(description = "会员编号", example = "2507140000000849", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String customerNo;

    @Schema(description = "来源编号(一般为订单编号)", example = "2025111200001", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "来源订单号不能为空")
    private String sourceNo;

    @Schema(description = "所属平台: 0其他、100微信小程序或企微等", example = "1900", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "所属平台不能为空")
    private String platform;

    @Schema(description = "待冲正的优惠券集合", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "冲正优惠券列表不能为空")
    private List<CouponItem> couponItems;

    @Data
    @Schema(name = "CancelCouponItem", description = "批量冲正项详情")
    public static class CouponItem {
        
        @Schema(description = "券定义ID", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private Long couponId;

        @Schema(description = "会员券编码", example = "666", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotBlank(message = "券编码不能为空")
        private String couponNo;

        @Schema(description = "冲正数量", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotNull(message = "冲正数量不能为空")
        private Integer couponNum;

        @Schema(description = "券名称", example = "折扣券", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private String couponName;

        @Schema(description = "券类型: 1折让, 2折扣, 3兑换, 4服务, 7停车", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private Integer couponType;

        @Schema(description = "券总次数", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private Integer totalNum;

        @Schema(description = "券优惠金额", example = "50.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private Double couponAmt;

        @Schema(description = "销售金额", example = "100.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private Double saleAmt;

        @Schema(description = "消费门槛金额", example = "100.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private Double minAmt;

        @Schema(description = "折扣值", example = "0.6", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private Double disRate;

        @Schema(description = "抵止金额", example = "50.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private Double disAmt;

        @Schema(description = "使用规则说明", example = "不可与其他优惠券同时使用", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private String usageRule;

        @Schema(description = "所属平台范围", example = "实体零售,自建商城", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private String platforms;

        @Schema(description = "是否可叠加", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private Boolean isStackable;

        @Schema(description = "是否禁用", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private Boolean disabled;

        @Schema(description = "提示消息", example = "成功", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private String message;

        @Schema(description = "开始时间", example = "2025-10-01", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private String bdate;

        @Schema(description = "结束时间", example = "2025-10-01", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private String edate;
    }
}