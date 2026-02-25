package zjian.dto.res;

import lombok.Data;

import java.util.List;

/** 查询会员车牌返回数据 */
@Data
public class QueryCustomerVehicleVo extends BaseCrmResponse{
    private List<BasCustomerVehicleVo> customerVehicleList;


/** 会员车牌明细 */
@Data
public static class BasCustomerVehicleVo {
    private Long customerId;    // 会员id
    private String numberPlate; // 车牌号
    private String createDate;  // 创建日期
}
}