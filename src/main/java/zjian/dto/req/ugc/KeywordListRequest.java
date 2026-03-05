package zjian.dto.req.ugc;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/** 搜索关键字列表请求参数 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeywordListRequest {
    private Long customerId; // 会员id
    private Integer page;    // 当前页码
    private Integer size;    // 每页条数
}