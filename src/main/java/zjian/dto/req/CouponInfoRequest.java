package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Schema(name = "CouponInfoRequest", description = "获取券规则列表请求参数")
public class CouponInfoRequest {

    @Schema(description = "所属平台", example = "1900", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "所属平台不能为空")
    private String platform;

    @Schema(description = "券 ID (传 0 或不传获取全量)", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private Long couponId;
}