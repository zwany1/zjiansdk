package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Schema(description = "同步商品SKU套餐请求参数")
public class ProductPackageSyncRequest {

    @Schema(description = "套餐信息列表", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<ProductPackageItem> productPackageList;

    @Data
    public static class ProductPackageItem {
        @Schema(description = "套餐商品SKU编码", example = "P000001939", requiredMode = Schema.RequiredMode.REQUIRED)
        private String packageCode;

        @Schema(description = "套餐包含的商品SKU编码", example = "T000000724", requiredMode = Schema.RequiredMode.REQUIRED)
        private String skuCode;

        @Schema(description = "数量", example = "3", requiredMode = Schema.RequiredMode.REQUIRED)
        private Integer num;

        @Schema(description = "最大数量", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private Integer maxNum;

        @Schema(description = "最小数量", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private Integer minNum;

        @Schema(description = "子商品售价", example = "168.00", requiredMode = Schema.RequiredMode.REQUIRED)
        private BigDecimal slprc;

        @Schema(description = "排序号", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        private Integer sno;
    }
}