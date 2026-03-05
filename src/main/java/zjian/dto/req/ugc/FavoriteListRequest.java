    package zjian.dto.req.ugc;

import lombok.Builder;
import lombok.Data;

/** 会员收藏列表请求参数 */
@Data
public class FavoriteListRequest {
    private Long customerId; // 会员ID (必填)
    private Integer page;    // 当前页码
    private Integer size;    // 每页显示记录数
}