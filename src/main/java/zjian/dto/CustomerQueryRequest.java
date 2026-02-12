package zjian.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "会员查询请求参数")
public class CustomerQueryRequest {

    @Schema(description = "会员编号")
    private String customerNo;

    @Schema(description = "手机号码")
    private String mobile;

    @Schema(description = "会员动态码(抖音)")
    private String customerDyCode;

    @Schema(description = "微信openid")
    private String wxOpenid;

    @Schema(description = "微信unionid")
    private String wxUnionid;

    @Schema(description = "微信appid (配合openid使用)")
    private String wxAppid;
}