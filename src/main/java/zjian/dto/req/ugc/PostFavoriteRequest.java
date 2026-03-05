package zjian.dto.req.ugc;

import lombok.Data;

/** 帖子收藏/取消收藏请求参数 */
@Data
public class PostFavoriteRequest {
    private Long customerOd; // 会员id
    private Long postOd;     // 帖子id
    private Boolean isEnable; // 确定收藏为true, 取消收藏为false
}