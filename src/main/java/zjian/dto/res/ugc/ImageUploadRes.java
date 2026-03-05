package zjian.dto.res.ugc;

import lombok.Data;
import java.util.List;

/** 会员发帖图片上传响应 */
@Data
public class ImageUploadRes {
    private Boolean success;
    private String message;
    private String imageUrl; // 用于前端展示的图片地址
    private List<DbImageInfo> dbImageUrl; // 填写进数据库的图片json数据
    
    @Data
    public static class DbImageInfo {
        private Long i; // 图片id
        private String n; // 图片名称
        private Integer t; // 类型
    }
}