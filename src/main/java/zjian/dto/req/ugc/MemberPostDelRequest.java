package zjian.dto.req.ugc;

import lombok.Data;

/** 会员帖子删除请求参数 */
@Data
public class MemberPostDelRequest {
    private Long postId;     // 帖子id
    private Long customerId; // 会员id
}