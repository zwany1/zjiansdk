package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "同步联系人请求参数")
public class CustomerContacterRequest {

    @Schema(description = "手机号", example = "18187819158", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String mobile;

    @Schema(description = "会员编号", example = "2507140000000849", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String customerNo;

    @Schema(description = "联系人手机号", example = "18187819150", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contacterMobile;

    @Schema(description = "联系人姓名", example = "张三", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contacterName;

    @Schema(description = "证件类型: 1-身份证, 2-军官证等", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer idType;

    @Schema(description = "联系人证件号", example = "430xxxxxxxxxxxxxxx", requiredMode = Schema.RequiredMode.REQUIRED)
    private String idNumber;
}