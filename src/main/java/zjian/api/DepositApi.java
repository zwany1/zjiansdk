package zjian.api;


import zjian.core.InternalRequestExecutor;
import zjian.dto.req.*;
import zjian.dto.res.*;

public class DepositApi {
    private final InternalRequestExecutor executor;

    public DepositApi(InternalRequestExecutor executor) {
        this.executor = executor;
    }

    /**
     * 获取充值活动列表
     */
    public PayPromotionResponse getPromotionList(PayPromotionQueryRequest req) {
        return executor.execute("/api/v3/zjian.crm.pay.promotion.get", req, PayPromotionResponse.class, "获取充值活动列表");
    }

    /**
     * 会员储值充值
     */
    public DepositRechargeResponse recharge(DepositRechargeRequest req) {
        return executor.execute("/api/v3/action.deposit.recharge", req, DepositRechargeResponse.class, "会员储值充值");
    }

    /**
     * 储值退款
     */
    public DepositRefundResponse refund(DepositRefundRequest req) {
        return executor.execute("/api/v3/action.deposit.refund", req, DepositRefundResponse.class, "储值退款");
    }

    /**
     * 储值付款
     */
    public DepositPayResponse pay(DepositPayRequest req) {
        return executor.execute("/api/v3/action.deposit.pay", req, DepositPayResponse.class, "储值付款");
    }

    /**
     * 储值审核
     */
    public DepositValidResponse validate(DepositValidRequest req) {
        return executor.execute("/api/v3/action.deposit.valid", req, DepositValidResponse.class, "储值审核");
    }

    /**
     * 获取储值付款动态二维码
     */
    public DepositDyCodeResponse getPayDyCode(DepositDyCodeRequest req) {
        return executor.execute("/api/v3/action.deposit.dycode.get", req, DepositDyCodeResponse.class, "获取储值付款动态二维码");
    }

    /**
     * 储值付款冲正
     */
    public DepositPayRefundResponse payRefund(DepositPayRefundRequest req) {
        return executor.execute("/api/v3/action.deposit.pay.refund", req, DepositPayRefundResponse.class, "储值付款冲正");
    }

    /**
     * 获取储值流水列表
     */
    public DepositRecordListResponse getRecords(DepositRecordListRequest req) {
        return executor.execute("/api/v3/zjian.crm.pay.deposit.get", req, DepositRecordListResponse.class, "获取储值流水列表");
    }

    /**
     * 查询储值支付订单状态
     */
    public DepositTradeStatusResponse getTradeStatus(DepositTradeStatusRequest req) {
        return executor.execute("/api/v3/action.deposit.pay.trade.status", req, DepositTradeStatusResponse.class, "查询储值支付订单状态");
    }
}