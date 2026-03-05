package zjian.dto.req.ugc;

import lombok.Data;

/** 会员点赞列表请求参数 */
@Data
public class LikeListRequest {
    private Long customerId; // 会员id
    private Integer page;    // 当前页位置
    private Integer size;    // 每页显示记录数
}