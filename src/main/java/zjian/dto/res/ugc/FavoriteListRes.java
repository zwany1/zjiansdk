package zjian.dto.res.ugc;

import lombok.Data;
import java.util.List;

/** 会员收藏列表响应 */
@Data
public class FavoriteListRes {
    private Boolean success;
    private String message;
    private List<FavoritePostVo> favoriteList;


/** 收藏夹内的帖子简要信息 */
@Data
public static class FavoritePostVo {
    private Long subjectId;
    private String subjectName;
    private Long postId;
    private String postName;
    private String postContent;
    private String postImage;
    private Integer postLikeNum;
    private Integer postFavoriteNum;
    private Integer postShareNum;
    private String postCreateDate;
    private Integer status; // 状态(0:录入, 1:提交, 5:审核, 9:作废)
    private Long postCustomerId; // 发帖人ID
    private String postCustomerCode; // 发帖人编码
    private String postCustomerName; // 发帖人名称
    private String postCustomerAvatar; // 发帖人头像
}}