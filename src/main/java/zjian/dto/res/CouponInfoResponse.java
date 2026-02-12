package zjian.dto.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(name = "CouponInfoResponse", description = "获取券规则列表响应数据")
public class CouponInfoResponse extends BaseCrmResponse {



    @Schema(description = "券规则详情列表")
    private List<CouponRuleItem> coupon_list;

    @Data
    @Schema(name = "CouponRuleItem")
    public static class CouponRuleItem {
        @Schema(description = "券定义 ID", example = "1")
        private Long id;

        @Schema(description = "券名称", example = "券名称123")
        private String name;

        @Schema(description = "券类型描述: 1:代金券, 2:折让券, 3:兑换券, 4:服务券")
        private String type;

        @Schema(description = "日期类型: 1:固定日期, 2:有效期天数, 3:由活动定义")
        private String dateType;

        @Schema(description = "有效开始日期", example = "2025-08-15 00:00:00")
        private String bdate;

        @Schema(description = "有效结束日期", example = "2025-08-16 00:00:00")
        private String edate;

        @Schema(description = "有效天数", example = "1")
        private Integer periodDays;

        @Schema(description = "最低消费金额", example = "500.0")
        private Double minAmt;

        @Schema(description = "抵扣/折扣金额", example = "500.0")
        private Double disAmt;

        @Schema(description = "折扣率", example = "0.5")
        private Double disRate;

        @Schema(description = "限定商品名称", example = "商品名称123")
        private String skuName;

        @Schema(description = "使用次数描述: -1表示不限次数")
        private String usageNum;

        @Schema(description = "是否启用")
        private Boolean isEnable;

        @Schema(description = "使用规则", example = "使用规则123")
        private String usageRule;

        @Schema(description = "投放平台范围", example = "实体零售,自建商城")
        private String websites;

        @Schema(description = "备注")
        private String remark;
    }
}