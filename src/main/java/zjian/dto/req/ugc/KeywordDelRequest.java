package zjian.dto.req.ugc;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/** 清空搜索关键字请求参数 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeywordDelRequest {
    /** 会员id (必填) */
    private Long customerId;
}