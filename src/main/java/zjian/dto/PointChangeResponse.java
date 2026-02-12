package zjian.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import zjian.dto.res.BaseCrmResponse;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "积分变动响应结果")
public class PointChangeResponse  extends BaseCrmResponse {

    @Schema(description = "生成的流水号ID")
    private Long logId;

}