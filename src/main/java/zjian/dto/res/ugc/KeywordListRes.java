package zjian.dto.res.ugc;

import lombok.Data;
import zjian.dto.res.BaseCrmResponse;

import java.util.List;

/** 搜索关键字列表响应 */
@Data
public class KeywordListRes extends BaseCrmResponse {
    private List<KeywordInfo> keywords; // 关键字列表

    @Data
    public static class KeywordInfo {
        private String keyword; // 关键词内容
    }
}