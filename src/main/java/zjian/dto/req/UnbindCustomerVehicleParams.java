package zjian.dto.req;

import lombok.Builder;
import lombok.Data;

/** 车辆解绑请求参数 */
@Data
public class UnbindCustomerVehicleParams {
    /** 手机号（手机号或会员编号二选一必填） */
    private String mobile;
    
    /** 会员编号（手机号或会员编号二选一必填） */
    private String customer_no;
    
    /** 要解绑的车牌号 (必填) */
    private String vehicle_no;
}