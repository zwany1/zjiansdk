package zjian.dto.res;

import lombok.Data;
import java.math.BigDecimal;

/** 车牌号查询会员信息响应 */
@Data
public class VehicleQueryResponse {
    private Integer tenid;                  // 租户ID
    private Long customerId;                // 会员ID
    private String customerNo;              // 会员编码
    private Integer gender;                 // 会员性别(0:未知 1:男 2:女)
    private String customerName;            // 会员名称
    private String customerNickname;        // 会员昵称
    private String mobile;                  // 会员绑定电话
    private String birthday;                // 会员生日
    private String avatar;                  // 会员头像url
    private String customerEmail;           // 会员邮箱
    private Integer customerIdType;         // 会员证件类型
    private String customerIdNumber;       // 会员证件确认
    private String customerLevelNo;         // 会员等级编码
    private String customerNextLevelNo;     // 会员下一等级编码
    private String customerLevelName;       // 会员等级名称
    private String customerNextLevelName;   // 会员下一等级名称
    private Long customerLevelGrowth;       // 当前会员等级成长值
    private Integer customerLevelNextUpGrowth; // 会员升级所需成长值
    private String customerLevelExpireDate; // 会员等级有效期
    private String customerLevelMaxImage;   // 会员等级卡面大图
    private String customerLevelMinImage;   // 会员等级卡面小图
    private String customerLevelFontColor;  // 会员等级字体颜色
    private String customerLevelDetail;     // 会员等级说明
    private Integer customerLevelGrowthExpireDays; // 会员等级有效期天数
    private Long pointsBalance;             // 会员积分账户余额(可用)
    private Long pointsAccumulate;          // 会员积分累积积分
    private Long pointsFrozen;              // 会员积分冻结积分
    private Long pointsExpirePast;          // 会员积分已过期积分
    private Long pointsExpireSoon;          // 会员积分即将过期积分
    private String updateDate;              // 会员积分账户最后变动时间
    private BigDecimal depositBalance;      // 会员储值余额
    private String mdate;                   // 储值信息最后变动时间
    private Boolean isPassword;             // 会员是否设置密码
    private Integer status;                 // 状态(1:顾客 5:会员 8:冻结 9:作废)
}