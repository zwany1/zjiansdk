package zjian.api;


import zjian.core.InternalRequestExecutor;
import zjian.dto.req.*;
import zjian.dto.res.*;

public class CouponApi {
    private final InternalRequestExecutor executor;

    public CouponApi(InternalRequestExecutor executor) {
        this.executor = executor;
    }

    /**
     * 查询会员拥有券列表
     */
    public RemoteResponse getCustomerCoupons(QueryRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.coupons.get", req, RemoteResponse.class, "查询会员拥有券列表");
    }

    /**
     * 查询可用券
     */
    public UsefulCouponResponse getUsefulCoupons(UsefulCouponRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.useful.coupons.get", req, UsefulCouponResponse.class, "查询可用券");
    }

    /**
     * 券详情查询
     */
    public CouponDetailResponse getCouponDetail(CouponQueryRequest req) {
        return executor.execute("/api/v3/zjian.crm.coupon.customer.query", req, CouponDetailResponse.class, "券详情查询");
    }

    /**
     * 用券检查
     */
    public CouponCheckResponse checkCouponAvailability(CouponCheckRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.coupon.check", req, CouponCheckResponse.class, "用券检查");
    }

    /**
     * 核销优惠券
     */
    public CouponUseResponse useCoupon(CouponUseRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.coupons.use", req, CouponUseResponse.class, "核销优惠券");
    }

    /**
     * 单张券冲正
     */
    public CouponCancelResponse cancelCoupon(CouponCancelRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.coupon.cancel", req, CouponCancelResponse.class, "单张券冲正");
    }

    /**
     * 批量券冲正
     */
    public CouponCancelResponse cancelCouponList(CouponCancelListRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.coupon.cancel.list", req, CouponCancelResponse.class, "批量券冲正");
    }

    /**
     * 获取券规则列表
     */
    public CouponInfoResponse getCouponRules(CouponInfoRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.coupon.info", req, CouponInfoResponse.class, "获取券规则列表");
    }

    /**
     * 获取会员券包列表
     */
    public CustomerCouponPackResponse getCustomerCouponPacks(CustomerCouponPackRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.couponpack.get", req, CustomerCouponPackResponse.class, "获取会员券包列表");
    }

    /**
     * 获取券包动态码
     */
    public CouponPackDyCodeResponse getCouponPackDyCode(CouponPackDyCodeRequest req) {
        return executor.execute("/api/v3/zjian.crm.couponpack.dycode.get", req, CouponPackDyCodeResponse.class, "获取券包动态码");
    }
}