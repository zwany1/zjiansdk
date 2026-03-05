package zjian.dto.req.ugc;

import lombok.Data;

/** 会员发帖请求参数 */
@Data
public class PostAddRequest {
    private Long customerId;   // 会员ID
    private Long subjectId;    // 话题ID
    private String postImage;  // 帖子图片url (填写图片上传接口返回的db_image_url内容)
    private String postName;   // 帖子名称
    private String postContent;// 帖子内容
}