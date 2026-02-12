package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Schema(name = "UsefulCouponRequest", description = "查询会员可用优惠券请求参数")
public class UsefulCouponRequest {

    @Schema(description = "会员手机号", example = "18187819158")
    private String mobile;

    @Schema(description = "会员编号", example = "2507140000000849")
    private String customerNo;

    @Schema(description = "会员券包动态码", example = "bbafb48539d4")
    private String couponpackDyCode;

    @Schema(description = "渠道编码", example = "TEST001", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "渠道编码不能为空")
    private String channelNo;

    @Schema(description = "员工编号", example = "YG0001")
    private String employeeNo;

    @Schema(description = "所属平台: 0其他、100微信小程序或企微等", example = "100", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "所属平台不能为空")
    private String platform;

    @Schema(description = "商品集合，用于匹配单品券或品类券")
    private List<ProductItem> productItems;

    @Data
    @Schema(name = "ProductItem", description = "下单商品明细")
    public static class ProductItem {
        @Schema(description = "序号", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
        private Long id;

        @Schema(description = "销售商品编号 (SKU)", example = "T000001960", requiredMode = Schema.RequiredMode.REQUIRED)
        private String skuNo;

        @Schema(description = "销售商品数量", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
        private Integer qty;

        @Schema(description = "销售商品总价格", example = "100.00", requiredMode = Schema.RequiredMode.REQUIRED)
        private Double saleAmt;

        @Schema(description = "入库日期", example = "2025-10-21 15:00:00")
        private String actualDate;
    }
}