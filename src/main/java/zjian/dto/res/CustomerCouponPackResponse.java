package zjian.dto.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(name = "CustomerCouponPackResponse", description = "会员券包列表响应")
public class CustomerCouponPackResponse extends BaseCrmResponse{


    @Schema(description = "会员拥有券包数量", example = "1")
    private Integer couponpackNum;

    @Schema(description = "会员券包集合")
    private List<CouponPackItem> customer_couponpack_list;

    @Data
    @Schema(name = "CouponPackItem")
    public static class CouponPackItem {
        @Schema(description = "会员ID", example = "123123123")
        private Long customer_id;

        @Schema(description = "券包ID", example = "3333")
        private Long couponpack_id;

        @Schema(description = "会员券包编号", example = "P33131")
        private String couponpack_code;

        @Schema(description = "券包名称", example = "超值优惠券包")
        private String couponpack_name;

        @Schema(description = "开始日期", example = "2025-01-01 00:00:00")
        private String start_date;

        @Schema(description = "结束日期", example = "2025-12-31 00:00:00")
        private String end_date;

        @Schema(description = "使用规则", example = "不可与其他优惠券同时使用")
        private String usage_rule;

        @Schema(description = "备注", example = "备注")
        private String remark;

        @Schema(description = "日期类型: 1:固定日期, 2:有效期天数, 3:由活动定义", example = "1")
        private Integer date_type;

        @Schema(description = "会员券包明细ID", example = "1")
        private Long cus_couponpack_id;

        @Schema(description = "有效天数", example = "30")
        private Integer period_days;
    }
}