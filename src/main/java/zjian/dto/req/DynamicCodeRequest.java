package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Schema(description = "获取会员动态二维码请求")
public class DynamicCodeRequest {
    @NotBlank(message = "会员编码不能为空")
    @Schema(description = "会员编码", required = true)
    private String customerNo;
}