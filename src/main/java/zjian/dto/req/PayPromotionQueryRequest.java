package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "充值活动列表查询请求")
public class PayPromotionQueryRequest {

    @Schema(description = "手机号 (与会员编号二选一)", example = "18187819158")
    private String mobile;

    @Schema(description = "会员编号 (全局唯一)", example = "2601130000156822")
    private String customerNo;

    @Schema(description = "当前页码", defaultValue = "1", example = "1")
    private Integer currentPage;

    @Schema(description = "每页记录数", example = "20")
    private Integer pageSize;
}