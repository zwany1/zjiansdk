package zjian.dto.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;


@Data
@Schema(description = "会员等级查询响应")
public class CustomerLevelResponse {
    @Schema(description = "会员等级列表信息")
    private List<LevelItem> level_list;

    @Data
    @Schema(description = "等级明细项")
    public static class LevelItem {
        
        @Schema(description = "会员等级编码", example = "10")
        private String customer_level_no;

        @Schema(description = "会员等级名称", example = "普通会员")
        private String customer_level_name;

        @Schema(description = "等级优先级", example = "0")
        private Integer customer_level_priority;

        @Schema(description = "会员等级所需成长值", example = "100")
        private Integer customer_level_up_growth;

        @Schema(description = "会员等级所需减成长值", example = "100")
        private Integer customer_level_down_growth;

        @Schema(description = "会员等级过期扣减成长值", example = "100")
        private Integer customer_level_expire;

        @Schema(description = "会员等级有效天数", example = "30")
        private Integer customer_level_expire_days;

        @Schema(description = "会员等级卡面大图")
        private String customer_level_max_image;

        @Schema(description = "会员等级卡面小图")
        private String customer_level_min_image;

        @Schema(description = "会员等级字体颜色")
        private String customer_level_font_color;

        @Schema(description = "会员等级说明")
        private String customer_level_detail;

        @Schema(description = "会员积分倍率", example = "1.0")
        private Double customer_level_points_multiplier;
    }
}