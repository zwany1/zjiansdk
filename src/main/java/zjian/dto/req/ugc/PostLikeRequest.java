package zjian.dto.req.ugc;

import lombok.Data;

/** 帖子点赞/取消点赞请求参数 */
@Data
public class PostLikeRequest {
    private Long customerId; // 会员id
    private Long postId;     // 帖子id
    private Boolean isEnable; // 点赞为true, 取消点赞为false
}