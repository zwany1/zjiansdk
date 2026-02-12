package zjian.dto.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(name = "UsefulCouponResponse", description = "查询会员可用券列表响应数据")
public class UsefulCouponResponse extends BaseCrmResponse{
    @Schema(description = "会员可用券数量")
    private Integer coupon_use_num;


    @Schema(description = "会员券列表详情")
    private List<CouponItem> coupon_items;

    @Data
    @Schema(name = "CouponItem", description = "优惠券明细信息")
    public static class CouponItem {
        @Schema(description = "券定义ID")
        private Long coupon_id;

        @Schema(description = "会员券编码")
        private String coupon_no;

        @Schema(description = "会员券数量")
        private Integer coupon_num;

        @Schema(description = "券名称")
        private String coupon_name;

        @Schema(description = "券类型: 1折让, 2折扣, 3兑换, 4服务, 7停车")
        private Integer coupon_type;

        @Schema(description = "券优惠金额")
        private Double coupon_amt;

        @Schema(description = "折扣值")
        private Double dis_rate;

        @Schema(description = "抵止金额/抵扣金额")
        private Double dis_amt;

        @Schema(description = "消费门槛金额")
        private Double min_amt;

        @Schema(description = "使用规则说明")
        private String usage_rule;

        @Schema(description = "所属平台范围")
        private String platforms;

        @Schema(description = "是否可叠加")
        private Boolean is_stackable;

        @Schema(description = "是否禁用 (通过该字段选择可用的优惠券)")
        private Boolean disabled;

        @Schema(description = "不可用时的提示消息")
        private String message;

        @Schema(description = "有效期开始时间")
        private String bdate;

        @Schema(description = "有效期结束时间")
        private String edate;
    }
}