package zjian.dto.res.ugc;

import lombok.Data;
import zjian.dto.res.BaseCrmResponse;

import java.util.List;

/** 话题列表响应 */
@Data
public class SubjectListRes extends BaseCrmResponse {
    private List<SubjectInfo> talkList; // 话题列表

    @Data
    public static class SubjectInfo {
        private Long subjectId;
        private String subjectName;
        private String subjectImage;
        private String subjectContent;
        private Integer subjectProductId;
        private String subjectProductCode;
        private String subjectProductName;
        private String subjectProductImage;
        private String subjectProductDetail;
        private Integer subjectNum; // 话题数
        private Integer subjectShareNum; // 话题转发数
        private String subjectCoverImage;
        private String subjectLinkUrl1;
    }
}