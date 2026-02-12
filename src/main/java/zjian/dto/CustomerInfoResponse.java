package zjian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "会员详细信息响应")
public class CustomerInfoResponse {

    @Schema(description = "租户ID")
    private Integer tenid;

    @Schema(description = "会员ID")
    @JsonProperty("customer_id")
    private Long customerId;

    @Schema(description = "会员编号")
    @JsonProperty("customer_no")
    private String customerNo;

    @Schema(description = "性别 0:未知 1:男 2:女")
    private Integer gender;

    @Schema(description = "会员名称")
    @JsonProperty("customer_name")
    private String customerName;

    @Schema(description = "会员昵称")
    @JsonProperty("customer_nickname")
    private String customerNickname;

    @Schema(description = "手机号")
    private String mobile;

    @Schema(description = "生日 yyyy-MM-dd")
    private String birthday;

    @Schema(description = "头像地址")
    private String avatar;

    @Schema(description = "邮箱")
    @JsonProperty("customer_email")
    private String customerEmail;

    @Schema(description = "证件类型 1:身份证 2:回乡证 3:台胞证")
    @JsonProperty("customer_id_type")
    private Integer customerIdType;

    @Schema(description = "证件号码")
    @JsonProperty("customer_id_number")
    private String customerIdNumber;

    // --- 等级相关信息 ---
    @Schema(description = "当前等级编号")
    @JsonProperty("customer_level_no")
    private String customerLevelNo;

    @Schema(description = "下一等级编号")
    @JsonProperty("customer_next_level_no")
    private String customerNextLevelNo;

    @Schema(description = "当前等级名称")
    @JsonProperty("customer_level_name")
    private String customerLevelName;

    @Schema(description = "下一等级名称")
    @JsonProperty("customer_next_level_name")
    private String customerNextLevelName;

    @Schema(description = "当前成长值")
    @JsonProperty("customer_level_growth")
    private Integer customerLevelGrowth;

    @Schema(description = "升级所需成长值")
    @JsonProperty("customer_level_next_growth")
    private Integer customerLevelNextGrowth;

    @Schema(description = "等级有效期")
    @JsonProperty("customer_level_expire_date")
    private String customerLevelExpireDate;

    @Schema(description = "等级大图")
    @JsonProperty("customer_level_max_image")
    private String customerLevelMaxImage;

    @Schema(description = "等级小图标")
    @JsonProperty("customer_level_min_image")
    private String customerLevelMinImage;

    @Schema(description = "等级字体颜色")
    @JsonProperty("customer_level_font_color")
    private String customerLevelFontColor;
    
    @Schema(description = "等级详情描述")
    @JsonProperty("customer_level_detail")
    private String customerLevelDetail;

    @Schema(description = "可用积分余额")
    @JsonProperty("points_balance")
    private Integer pointsBalance;

    @Schema(description = "累计获取积分")
    @JsonProperty("points_accumulate")
    private Integer pointsAccumulate;

    @Schema(description = "冻结积分")
    @JsonProperty("points_frozen")
    private Integer pointsFrozen;

    @Schema(description = "已过期积分")
    @JsonProperty("points_expire_past")
    private Integer pointsExpirePast;

    @Schema(description = "即将过期积分")
    @JsonProperty("points_expire_soon")
    private Integer pointsExpireSoon;

    @Schema(description = "储值余额")
    @JsonProperty("deposit_balance")
    private BigDecimal depositBalance;

    @Schema(description = "是否设置了支付密码")
    @JsonProperty("is_password")
    private Boolean isPassword;

    @Schema(description = "会员状态 1:正常 5:挂失 8:冻结 9:作废")
    private Integer status;

    @Schema(description = "更新时间")
    @JsonProperty("update_date")
    private String updateDate;
    
    @Schema(description = "注册时间/操作时间")
    private String mdate;
}