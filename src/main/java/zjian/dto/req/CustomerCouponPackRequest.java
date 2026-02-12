package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "CustomerCouponPackRequest", description = "会员券包列表")
public class CustomerCouponPackRequest {

    @Schema(description = "手机号 (手机号或会员编号二选一必填)", example = "18187819158", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String mobile;

    @Schema(description = "会员编号 (全局唯一)", example = "2601130000156822", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String customerNo;
}