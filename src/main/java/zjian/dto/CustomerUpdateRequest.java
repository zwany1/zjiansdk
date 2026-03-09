package zjian.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "更新会员请求参数")
public class CustomerUpdateRequest {
    @Schema(description = "手机号（二选一必填）")
    private String mobile;
    
    @Schema(description = "会员编号（二选一必填）")
    private String customerNo;
    
    @Schema(description = "性别[0:未知,1:男,2:女]")
    private String gender;
    
    @Schema(description = "生日(yyyy-MM-dd)")
    private String birthday;
    
    @Schema(description = "会员名称")
    private String customerName;

    @Schema(description = "会员昵称")
    private String nickname;
    
    private AvatarDTO avatar;

    @Schema(description = "邮箱")
    private String email;
    
    @Schema(description = "证件类型")
    private Integer idType;
    
    @Schema(description = "证件编号")
    private String idNumber;

    @Data
    public static class AvatarDTO {
        @Schema(description = "文件id")
        private Integer i; // 文件id
        @Schema(description = "文件名称")
        private String n;  // 文件名称
        @Schema(description = "是否下载")
        private Integer t; // 是否下载
    }
}