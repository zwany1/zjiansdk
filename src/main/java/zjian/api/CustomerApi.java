package zjian.api;


import zjian.core.InternalRequestExecutor;
import zjian.dto.*;
import zjian.dto.req.CustomerCardRightRequest;
import zjian.dto.req.CustomerContacterRequest;
import zjian.dto.req.CustomerDeleteContacterRequest;
import zjian.dto.req.DynamicCodeRequest;
import zjian.dto.res.*;

import java.util.HashMap;

public class CustomerApi {
    private final InternalRequestExecutor executor;

    public CustomerApi(InternalRequestExecutor executor) {
        this.executor = executor;
    }

    /**
     * 查询会员信息
     */
    public CustomerInfoResponse getCustomerInfo(CustomerQueryRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.get", req, CustomerInfoResponse.class, "查询会员信息");
    }

    /**
     * 批量导入会员
     */
    public ApiResponse.ResponseData importCustomers(CustomerImportRequest req) {
        return executor.execute("/api/v3/zjian.crm.customers.post", req, ApiResponse.ResponseData.class, "批量导入会员");
    }

    /**
     * 更新会员信息
     */
    public void updateCustomer(CustomerUpdateRequest req) {
        executor.execute("/api/v3/zjian.crm.customer.update.post", req, Void.class, "更新会员信息");
    }

    /**
     * 积分变更
     */
    public PointChangeResponse changePoints(PointChangeRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.point.add", req, PointChangeResponse.class, "积分变更");
    }

    /**
     * 获取会员权益
     */
    public CustomerCardRightResponse getCustomerRights(CustomerCardRightRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.card.right", req, CustomerCardRightResponse.class, "获取会员权益");
    }

    /**
     * 获取会员等级列表
     */
    public CustomerLevelResponse getGradeList() {
        return executor.execute("/api/v3/zjian.crm.customer.grade.get", new HashMap<>(), CustomerLevelResponse.class, "获取会员等级列表");
    }

    /**
     * 获取会员动态码
     */
    public DynamicCodeResponse getDynamicCode(DynamicCodeRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.dycode.get", req, DynamicCodeResponse.class, "获取动态码");
    }

    /**
     * 同步联系人
     */
    public CustomerContacterResponse syncContacter(CustomerContacterRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.contacter.post", req, CustomerContacterResponse.class, "同步联系人");
    }

    /**
     * 删除联系人
     */
    public CustomerDeleteContacterResponse deleteContacter(CustomerDeleteContacterRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.contacter.delete", req, CustomerDeleteContacterResponse.class, "删除联系人");
    }
}