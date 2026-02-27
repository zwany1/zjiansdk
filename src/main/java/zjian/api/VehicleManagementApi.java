package zjian.api;

import zjian.core.InternalRequestExecutor;
import zjian.dto.req.BindVehicleRequest;
import zjian.dto.req.QueryCustomerVehicle;
import zjian.dto.req.VehicleQueryCustomerRequest;
import zjian.dto.req.VehicleTradeImportRequest;
import zjian.dto.res.BindVehicleResponse;
import zjian.dto.res.QueryCustomerVehicleVo;
import zjian.dto.res.VehicleQueryResponse;
import zjian.dto.res.VehicleTradeResponse;

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

    /**
     * 通过车牌号查询会员信息
     */
    public VehicleQueryResponse queryCustomerByVehicle(VehicleQueryCustomerRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.vehicle.query", req, VehicleQueryResponse.class, "通过车牌号查询会员");
    }
    /**
     * 导入停车出入场记录
     */
    public VehicleTradeResponse importVehicleTrade(VehicleTradeImportRequest req) {
        return executor.execute("/api/v3/zjian.crm.customer.vehicle.trade", req, VehicleTradeResponse.class, "导入停车记录");
    }
}
