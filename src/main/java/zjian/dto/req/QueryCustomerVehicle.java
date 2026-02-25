package zjian.dto.req;

import lombok.Builder;
import lombok.Data;
/** 查询会员车牌*/
@Data
@Builder
public class QueryCustomerVehicle {
    private String mobile;      // 手机号
    private String customerNo; // 会员编号
}