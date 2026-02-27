package zjian.dto.req;

import lombok.Builder;
import lombok.Data;

/** 根据车牌号查询会员信息入参 */
@Data
@Builder
public class VehicleQueryCustomerRequest {
    /** 入场车牌号 (必填) */
    private String vehicleNo;
}