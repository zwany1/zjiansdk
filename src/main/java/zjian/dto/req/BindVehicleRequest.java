package zjian.dto.req;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BindVehicleRequest {
    /** 手机号（手机号或会员编号二选一必填） */
    private String mobile;
    
    /** 会员编号（手机号或会员编号二选一必填） */
    private String customerNo;
    
    /** 绑定的车牌号 (必填) */
    private String vehicleNo;
}