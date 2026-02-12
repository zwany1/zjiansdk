package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Schema(name = "CouponPackDyCodeRequest", description = "获取券包动态二维码")
public class CouponPackDyCodeRequest {

    @Schema(description = "券包编码", example = "2023030700013541", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "券包编码不能为空")
    private String couponpackCode;

    @Schema(description = "会员编号，全局唯一", example = "2023030700013541", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "会员编号不能为空")
    private String customerNo;
}