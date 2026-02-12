package zjian.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "根据券ID查询券详情请求")
public class CouponQueryRequest {

    @Schema(description = "券id", required = true)
    private Long couponId;
}