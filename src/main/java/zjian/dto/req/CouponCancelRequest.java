package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Schema(name = "CouponCancelRequest", description = "单张券冲正")
public class CouponCancelRequest {

    @Schema(description = "手机号", example = "18187819158", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String mobile;

    @Schema(description = "会员编号", example = "2507140000000849", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String customerNo;

    @Schema(description = "会员券编码", example = "666", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "券编码不能为空")
    private String couponNo;

    @Schema(description = "冲正次数(不得超过核销次数)", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "冲正次数不能为空")
    private Integer couponNum;

    @Schema(description = "来源编号(订单编号)", example = "2025111200001", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "来源订单号不能为空")
    private String sourceNo;

    @Schema(description = "所属平台", example = "1900", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotBlank(message = "所属平台不能为空")
    private String platform;
}