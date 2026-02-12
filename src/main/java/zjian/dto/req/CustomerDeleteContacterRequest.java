package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "删除联系人请求参数")
public class CustomerDeleteContacterRequest {

    @Schema(description = "手机号", example = "18187819158")
    private String mobile;

    @Schema(description = "会员编号", example = "2507140000000849")
    private String customerNo;

    @Schema(description = "联系人手机号", example = "18187819150", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contacterMobile;
}