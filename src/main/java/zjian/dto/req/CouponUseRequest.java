package zjian.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "优惠券核销请求参数")
public class CouponUseRequest {

    @Schema(description = "手机号", example = "18187819158")
    private String mobile;

    @JsonProperty("customer_no")
    @Schema(description = "会员编号", example = "2507140000000849")
    private String customerNo;

    @JsonProperty("channel_no")
    @Schema(description = "渠道编码", example = "TEST001", requiredMode = Schema.RequiredMode.REQUIRED)
    private String channelNo;

    @JsonProperty("employee_no")
    @Schema(description = "员工编号", example = "p0001")
    private String employeeNo;

    @Schema(description = "来源平台", example = "1900", requiredMode = Schema.RequiredMode.REQUIRED)
    private String platform;

    @JsonProperty("source_no")
    @Schema(description = "来源单号(订单编号)", example = "2025111200001")
    private String sourceNo;

    @JsonProperty("product_items")
    @Schema(description = "商品列表")
    private List<ProductItem> productItems;

    @JsonProperty("coupon_items")
    @Schema(description = "会员券列表")
    private List<CouponItem> couponItems;

    @JsonProperty("product_coupon_items")
    @Schema(description = "商品优惠金额关联列表")
    private List<ProductCouponItem> productCouponItems;

    @Data
    @Builder
    @Schema(description = "商品明细")
    public static class ProductItem {
        @Schema(description = "序号ID", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
        private Integer id;

        @JsonProperty("sku_no")
        @Schema(description = "销售商品编号", example = "T000001960")
        private String skuNo;

        @Schema(description = "销售数量", example = "5", requiredMode = Schema.RequiredMode.REQUIRED)
        private Integer qty;

        @JsonProperty("exchange_qty")
        @Schema(description = "已被兑换券使用的数量", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
        private Integer exchangeQty;

        @JsonProperty("sale_amt")
        @Schema(description = "销售金额", example = "100", requiredMode = Schema.RequiredMode.REQUIRED)
        private Double saleAmt;

        @JsonProperty("coupon_amt")
        @Schema(description = "券优惠金额", example = "10", requiredMode = Schema.RequiredMode.REQUIRED)
        private Double couponAmt;

        @JsonProperty("actual_date")
        @Schema(description = "入住日期", example = "2025-10-21 15:00:00", requiredMode = Schema.RequiredMode.REQUIRED)
        private String actualDate;
    }

    @Data
    @Builder
    @Schema(description = "优惠券明细")
    public static class CouponItem {
        @JsonProperty("coupon_id")
        @Schema(description = "券定义ID", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
        private Integer couponId;

        @JsonProperty("coupon_no")
        @Schema(description = "会员券编码", example = "666", requiredMode = Schema.RequiredMode.REQUIRED)
        private String couponNo;

        @JsonProperty("coupon_name")
        @Schema(description = "券名称", example = "折扣券", requiredMode = Schema.RequiredMode.REQUIRED)
        private String couponName;

        @JsonProperty("coupon_type")
        @Schema(description = "券类型", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
        private Integer couponType;

        @JsonProperty("coupon_num")
        @Schema(description = "券使用次数", example = "2", requiredMode = Schema.RequiredMode.REQUIRED)
        private Integer couponNum;

        @JsonProperty("total_num")
        @Schema(description = "券总次数", example = "5")
        private Integer totalNum;

        @JsonProperty("sale_amt")
        @Schema(description = "匹配的商品销售金额", example = "120")
        private Double saleAmt;

        @JsonProperty("coupon_amt")
        @Schema(description = "券优惠金额", example = "2")
        private Double couponAmt;

        @JsonProperty("is_stackable")
        @Schema(description = "是否可叠加", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
        private Boolean isStackable;

        @JsonProperty("is_current_check")
        @Schema(description = "是否当前勾选", example = "false", requiredMode = Schema.RequiredMode.REQUIRED)
        private Boolean isCurrentCheck;

        private String bdate;
        private String edate;
    }

    @Data
    @Builder
    @Schema(description = "商品券关联明细")
    public static class ProductCouponItem {
        @JsonProperty("product_item_id")
        @Schema(description = "商品列表ID", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
        private Integer productItemId;

        @JsonProperty("coupon_no")
        @Schema(description = "会员券编码", example = "666", requiredMode = Schema.RequiredMode.REQUIRED)
        private String couponNo;

        @JsonProperty("coupon_num")
        @Schema(description = "券使用次数", example = "2")
        private Integer couponNum;

        @JsonProperty("sale_amt")
        @Schema(description = "销售金额", example = "100")
        private Double saleAmt;

        @JsonProperty("coupon_amt")
        @Schema(description = "实际优惠金额", example = "10")
        private Double couponAmt;
    }
}