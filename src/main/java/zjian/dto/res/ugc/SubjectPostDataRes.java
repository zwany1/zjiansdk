package zjian.dto.res.ugc;

import lombok.Data;
import zjian.dto.res.BaseCrmResponse;

import java.util.List;

/** 当前会员发帖数据响应 */
@Data
public class SubjectPostDataRes extends BaseCrmResponse {
    private List<PostSummaryData> postData; // 发帖统计数据列表

    @Data
    public static class PostSummaryData {
        private String likeNum;      // 点赞数量
        private Integer validing_num; // 审核中数量
        private Integer valid_num;    // 审核通过数量
        private Integer fail_num;     // 审核失败数量
        private String favorite_num; // 收藏数量
    }
}