package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Schema(description = "当前会员权益查询")
public class CustomerCardRightRequest {

    @Schema(description = "手机号（手机号或者会员编号二选一必填一个，全局唯一）", example = "18187819158", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String mobile;

    @Schema(description = "会员编号", example = "2023030700013541", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String customerNo;
}