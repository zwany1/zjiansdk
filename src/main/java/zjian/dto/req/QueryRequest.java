package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 会员券列表查询请求
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueryRequest {
    @Schema( description = "手机号")
    private String mobile;
    @Schema( description = "会员编号")
    private String customerNo;
    @Schema( description = "所属平台")
    private String platform;
}