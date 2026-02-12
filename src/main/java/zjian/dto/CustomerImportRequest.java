package zjian.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Schema(name = "CustomerImportRequest", description = "客户导入请求")
public class CustomerImportRequest {

    @Schema(description = "客户列表")
    @NotEmpty(message = "客户列表不能为空")
    private List<CustomerDTO> customerList;

    @Data
    @Schema(name = "CustomerDTO", description = "客户信息")
    public static class CustomerDTO {
        @Schema(description = "外部ID")
        @NotBlank(message = "外部ID不能为空")
        private String outId;

        @Schema(description = "渠道会员名")
        @NotBlank(message = "渠道会员名不能为空")
        private String customerName;

        @Schema(description = "会员手机号")
        @NotBlank(message = "手机号不能为空")
        private String mobile;

        @Schema(description = "微信OpenID")
        private String wxOpenid;

        @Schema(description = "微信UnionID")
        private String wxUnionid;

        @Schema(description = "微信AppID")
        private String wxAppid;

        @Schema(description = "客户性别[0:未知,1:男,2:女]")
        private Integer gender;

        @Schema(description = "生日")
        private String birthday;

        @Schema(description = "昵称")
        private String nickName;

        @Schema(description = "头像")
        private AvatarDTO avatar;

        @Schema(description = "会员证件类型[1 大陆身份证号码 2 港澳回乡证号码 3 台胞证号码]")
        private Integer idType;

        @Schema(description = "会员证件编码")
        private String idNumber;

        @Schema(description = "邮箱")
        private String email;

        @Schema(description = "省份")
        private String province;

        @Schema(description = "城市")
        private String city;

        @Schema(description = "地区")
        private String region;

        @Schema(description = "渠道代码")
        private String channelCode;
        @Schema(description = "平台")
        private Long platform;
    }
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