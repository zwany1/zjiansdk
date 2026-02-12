package zjian.api;


import zjian.core.InternalRequestExecutor;
import zjian.dto.req.ProductPackageSyncRequest;
import zjian.dto.req.ProductSkuSyncRequest;
import zjian.dto.res.ProductPackageSyncResponse;
import zjian.dto.res.ProductSkuSyncResponse;

public class ProductApi {
    private final InternalRequestExecutor executor;

    public ProductApi(InternalRequestExecutor executor) {
        this.executor = executor;
    }

    /** 同步商品SKU */
    public ProductSkuSyncResponse syncSku(ProductSkuSyncRequest req) {
        return executor.execute("/api/v3/zjian.crm.sku.post", req, ProductSkuSyncResponse.class, "同步商品SKU");
    }

    /** 同步商品SKU套餐 */
    public ProductPackageSyncResponse syncPackage(ProductPackageSyncRequest req) {
        return executor.execute("/api/v3/zjian.crm.sku.package.post", req, ProductPackageSyncResponse.class, "同步商品SKU套餐");
    }
}