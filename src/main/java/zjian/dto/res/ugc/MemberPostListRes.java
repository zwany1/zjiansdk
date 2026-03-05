package zjian.dto.res.ugc;

import lombok.Data;
import zjian.dto.res.BaseCrmResponse;

import java.util.List;

/**
 * 当前会员发帖列表响应
 */
@Data
public class MemberPostListRes extends BaseCrmResponse {
    private List<MemberPostVo> post_list; // 发帖列表

    @Data
    public static class MemberPostVo {
        private Long postId;
        private Long subjectId;
        private String subjectName;
        private String postName;
        private String postContent;
        private String postImage;
        private Integer postLikeNum;     // 点赞数量
        private Integer postFavoriteNum; // 收藏数量
        private Integer postShareNum;    // 分享数量
        private String postCreateDate;   // 发布时间
    }
}