package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Schema(description = "同步商品SKU请求参数")
public class ProductSkuSyncRequest {

    @Schema(description = "商品信息列表", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<ProductSkuItem> productSkuList;

    @Data
    public static class ProductSkuItem {
        @Schema(description = "外部id", example = "ext_001", requiredMode = Schema.RequiredMode.REQUIRED)
        private String outId;

        @Schema(description = "sku编码(唯一)", example = "T000000724", requiredMode = Schema.RequiredMode.REQUIRED)
        private String skuCode;

        @Schema(description = "sku名称(唯一)", example = "成人票【通用子产品】", requiredMode = Schema.RequiredMode.REQUIRED)
        private String skuName;

        @Schema(description = "商品名称(唯一)", example = "成人票【通用子产品】", requiredMode = Schema.RequiredMode.REQUIRED)
        private String productName;

        @Schema(description = "商品编码(唯一)", example = "T000000724", requiredMode = Schema.RequiredMode.REQUIRED)
        private String productCode;

        @Schema(description = "品牌编码", example = "DB001", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private String brandCode;

        @Schema(description = "规格", example = "散客票", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private String spec;

        @Schema(description = "单位", example = "张", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private String unit;

        @Schema(description = "成本价", example = "488.00", requiredMode = Schema.RequiredMode.REQUIRED)
        private BigDecimal csprc;

        @Schema(description = "标准售价", example = "438.00", requiredMode = Schema.RequiredMode.REQUIRED)
        private BigDecimal slprcStand;

        @Schema(description = "吊牌价", example = "438.00", requiredMode = Schema.RequiredMode.REQUIRED)
        private BigDecimal slprcLabel;

        @Schema(description = "是否套餐", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
        private Boolean isPackage;

        @Schema(description = "类别编码(唯一)", example = "A1", requiredMode = Schema.RequiredMode.REQUIRED)
        private String categoryCode;

        @Schema(description = "是否有效", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
        private Boolean isEnable;
    }
}