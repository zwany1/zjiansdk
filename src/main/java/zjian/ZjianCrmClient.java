package zjian;


import lombok.Getter;
import zjian.api.CouponApi;
import zjian.api.CustomerApi;
import zjian.api.DepositApi;
import zjian.api.ProductApi;
import zjian.config.CrmSdkConfig;
import zjian.core.InternalRequestExecutor;

public class ZjianCrmClient {

    @Getter
    private final CustomerApi customer;
    
    @Getter
    private final CouponApi coupon;
    
    @Getter
    private final DepositApi deposit;
    
    @Getter
    private final ProductApi product;

    /**
     * 配置对象初始化 SDK
     *
     */
    public ZjianCrmClient(CrmSdkConfig config) {
        InternalRequestExecutor executor = new InternalRequestExecutor(config);
        
        // 2. 实例化各个业务模块
        this.customer = new CustomerApi(executor);
        this.coupon = new CouponApi(executor);
        this.deposit = new DepositApi(executor);
        this.product = new ProductApi(executor);
    }

    /**
     * 快捷访问
     */
    public CustomerApi customer() { return customer; }
    public CouponApi coupon() { return coupon; }
    public DepositApi deposit() { return deposit; }
    public ProductApi product() { return product; }
}