package zjian.dto.req.ugc;

import lombok.Builder;
import lombok.Data;

/** 话题帖子列表请求参数 */
@Data
public class SubjectPostListRequest {
    private Long customerId;  // 会员ID (非必填，传入后可返回当前会员是否点赞/收藏)
    private Integer postType; // 帖子类型 (1:话题, 2:普通)
    private Integer page;     // 页码
    private Integer size;     // 每页条数
}