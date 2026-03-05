package zjian.dto.req.ugc;

import lombok.Data;

/** 话题列表请求参数 */
@Data
public class SubjectListRequest {
    private Integer page; // 当前页码
    private Integer size; // 每页条数
}