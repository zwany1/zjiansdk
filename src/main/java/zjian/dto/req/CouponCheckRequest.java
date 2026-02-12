package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Schema(name = "CouponCheckRequest", description = "会员用券检查请求参数")
public class CouponCheckRequest {

    @Schema(description = "手机号", example = "18187819158", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String mobile;

    @Schema(description = "会员编号", example = "2507140000000849", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String customerNo;

    @Schema(description = "渠道编码", example = "TEST001", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "渠道编码不能为空")
    private String channelNo;

    @Schema(description = "员工编号", example = "YG0001", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String employeeNo;

    @Schema(description = "所属平台", example = "1900", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "所属平台不能为空")
    private String platform;

    @Schema(description = "会员券包动态码", example = "bbafb48539d4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String couponpackDyCode;

    @Schema(description = "商品列表", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private List<ProductItem> productItems;

    @Schema(description = "券列表", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private List<CouponItem> couponItems;

    @Schema(description = "商品券优惠金额列表", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private List<ProductCouponItem> productCouponItems;


    @Data
    @Schema(name = "CheckProductItem")
    public static class ProductItem {
        @Schema(description = "序号 ID", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
        private Long id;
        @Schema(description = "SKU 编号", example = "T000001960", requiredMode = Schema.RequiredMode.REQUIRED)
        private String skuNo;
        @Schema(description = "数量", example = "5", requiredMode = Schema.RequiredMode.REQUIRED)
        private Integer qty;
        @Schema(description = "已被换购券使用的数量", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
        private Integer exchangeQty;
        @Schema(description = "总销售金额", example = "100.0", requiredMode = Schema.RequiredMode.REQUIRED)
        private Double saleAmt;
        @Schema(description = "券优惠金额", example = "10.0", requiredMode = Schema.RequiredMode.REQUIRED)
        private Double couponAmt;
        @Schema(description = "入驻/入住日期", example = "2025-10-21 15:00:00")
        private String actualDate;
    }

    @Data
    @Schema(name = "CheckCouponItem")
    public static class CouponItem {
        @Schema(description = "券定义 ID", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
        private Long couponId;
        @Schema(description = "会员券编码", example = "666", requiredMode = Schema.RequiredMode.REQUIRED)
        private String couponNo;
        @Schema(description = "券名称", example = "折扣券", requiredMode = Schema.RequiredMode.REQUIRED)
        private String couponName;
        @Schema(description = "券类型", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
        private Integer couponType;
        @Schema(description = "券使用次数", example = "2", requiredMode = Schema.RequiredMode.REQUIRED)
        private Integer couponNum;
        @Schema(description = "券总次数", example = "5")
        private Integer totalNum;
        @Schema(description = "匹配商品销售金额", example = "120.0")
        private Double saleAmt;
        @Schema(description = "券优惠金额", example = "2.0")
        private Double couponAmt;
        @Schema(description = "是否叠加", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
        private Boolean isAtackable;
        @Schema(description = "是否为当前勾选/检查的券", example = "false", requiredMode = Schema.RequiredMode.REQUIRED)
        private Boolean isCurrentCheck;
        private String bdate;
        private String edate;
    }

    @Data
    @Schema(name = "CheckProductCouponItem")
    public static class ProductCouponItem {
        @Schema(description = "商品列表ID，将该笔商品第一次请求会员券检查接口的返回值product_coupon_items数组里的product_item_id ", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
        private Long productItemId;
        @Schema(description = "会员券编码", example = "666", requiredMode = Schema.RequiredMode.REQUIRED)
        private String couponNo;
        @Schema(description = "该券在当前商品上使用的次数", example = "2", requiredMode = Schema.RequiredMode.REQUIRED)
        private Integer couponNum;
        @Schema(description = "销售金额", example = "100.0")
        private Double saleAmt;
        @Schema(description = "实际优惠金额", example = "10.0")
        private Double couponAmt;
    }
}