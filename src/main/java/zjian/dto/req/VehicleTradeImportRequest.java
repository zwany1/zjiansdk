package zjian.dto.req;

import lombok.Builder;
import lombok.Data;

/** 导入停车出入场记录请求参数 */
@Data
@Builder
public class VehicleTradeImportRequest {
    /** 入场车牌号 (必填) */
    private String vehicle_no;
    
    /** 入场时间 (格式: yyyy-MM-dd HH:mm:ss, 必填) */
    private String inTime;
    
    /** 出场时间 (格式: yyyy-MM-dd HH:mm:ss, 非必填) */
    private String outTime;
    
    /** 停车时长 (单位: 秒, 非必填) */
    private Integer duration;
    
    /** 产生费用 (停车费, 非必填) */
    private Double cost;
    
    /** 入场车型 (时租卡A/时租卡B, 非必填) */
    private String vehicleModel;
}