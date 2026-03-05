package zjian.dto.req.ugc;

import lombok.Data;

/** 当前会员发帖数据请求参数 */
@Data
public class SubjectPostDataRequest {
    private Long customerId; // 会员id
}