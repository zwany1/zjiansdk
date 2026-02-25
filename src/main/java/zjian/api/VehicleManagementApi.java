package zjian.api;

import zjian.core.InternalRequestExecutor;
import zjian.dto.req.BindVehicleRequest;
import zjian.dto.req.QueryCustomerVehicle;
import zjian.dto.res.BindVehicleResponse;
import zjian.dto.res.QueryCustomerVehicleVo;

public class VehicleManagementApi {
    private final InternalRequestExecutor executor;

    public VehicleManagementApi(InternalRequestExecutor executor) {
        this.executor = executor;
    }

    /**
     * 绑定车辆
     */
    public BindVehicleResponse bindVehicle(BindVehicleRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.vehicle.bind", req, BindVehicleResponse.class, "绑定车辆");
    }

    /**
     * 会员拥有车牌
     */
    public QueryCustomerVehicleVo getCustomerVehicles(QueryCustomerVehicle req) {
        return executor.execute("/api/v3/zjian.crm.customer.vehicle.get", req, QueryCustomerVehicleVo.class, "查询会员车牌");
    }
}
