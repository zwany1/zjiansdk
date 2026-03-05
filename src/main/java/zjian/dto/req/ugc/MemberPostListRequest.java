package zjian.dto.req.ugc;

import lombok.Data;

/** 当前会员发帖列表请求参数 */
@Data
public class MemberPostListRequest {
    private Long customerId;   // 用户ID
    private Integer page;       // 当前页起始位置
    private Integer size;       // 每页显示记录数
    private Integer postStatus; // 帖子状态 (0:提交, 5:已审核, 6:审核失败)
}