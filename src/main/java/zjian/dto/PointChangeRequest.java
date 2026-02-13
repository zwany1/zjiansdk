package zjian.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "积分变动请求参数")
public class PointChangeRequest {

    @Schema(description = "手机号 (二选一)")
    private String mobile;

    @Schema(description = "会员编号 (二选一)")
    private String customerNo;

    @Schema(description = "渠道编码", required = true)
    private String channelNo;

    @Schema(description = "类型[1:增加, 2:使用]", required = true)
    private Integer type;

    @Schema(description = "业态(2:门票，2：消费券，2：年卡，1：酒店，3：餐食，3：酒店餐饮，3：乐园餐饮，0：套餐，4：商亭，4：零售，5：储物柜，6：乐园停车场,6：酒店停车场。)", required = true)
    private Integer businessForms;

    @Schema(description = "来源流水: 27:积分支付, 28:积分抵现", required = true)
    private Integer sourceId;

    @Schema(description = "来源单号(订单编号)")
    private String sourceNo;

    @Schema(description = "\t积分（类型：【1：增加】，冲正时points为负值、【 2：使用】，冲正时 points为正值）", required = true)
    private Integer points;

    @Schema(description = "外部唯一ID ()", required = true)
    private String outId;
}