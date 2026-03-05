package zjian.dto.res.ugc;

import lombok.Data;
import zjian.dto.res.BaseCrmResponse;

import java.util.List;

/** 会员点赞列表响应 */
@Data
public class LikeListRes extends BaseCrmResponse {

    private List<LikePostVo> postList; // 话题帖子内容

    @Data
    public static class LikePostVo {
        private Long subjectId;
        private String subjectName;
        private Long postId;
        private String postName;
        private String postContent;
        private String postImage;
        private Integer postLikeNum;
        private Integer postFavoriteNum;
        private Integer postShareNum;
        private String postCreateTime;
        private Integer status; // 状态[0:录入, 1:提交, 5:审核, 9:作废]
        private Long postCustomerId;
        private String postCustomerNo;
        private String postCustomerName;
        private String postCustomerAvatar;
    }
}