package zjian.dto.res.ugc;

import lombok.Data;
import zjian.dto.res.BaseCrmResponse;

import java.math.BigDecimal;
import java.util.List;

/** 话题帖子列表响应 */
@Data
public class SubjectPostListRes extends BaseCrmResponse {
    private List<PostInfoVo> postList;


/** 帖子详细信息 */
@Data
public static class PostInfoVo {
    private Long postId;
    private Long subjectId;
    private String subjectName;
    private String postName;
    private String postContent;
    private String postImage;
    private String postVideo;
    private String postCustomerName;
    private String postCustomerAvatar;
    private String postCustomerLevelName;
    private Integer postLikeNum;
    private Integer postFavoriteNum;
    private Integer postShareNum;
    private String postCreateDate;
    private Boolean postIsFavorite;
    private Boolean postIsLike;
    private String location;
    private String address;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private List<PostUserInfoVo> postFavoriteCustomer; // 收藏该帖子的用户信息
    private List<PostUserInfoVo> postLikeCustomer;     // 点赞该帖子的用户信息


    /**
     * 帖子交互用户信息 (点赞/收藏人)
     */
    @Data
    public static class PostUserInfoVo {
        private Long customerId;
        private String customerCode;
        private String customerName;
        private String customerAvatar;
        private String createDate;
    }
}
}