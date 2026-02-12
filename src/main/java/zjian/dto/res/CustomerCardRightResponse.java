package zjian.dto.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "当前会员权益")
public class CustomerCardRightResponse {

    @Schema(description = "会员拥有卡列表")
    private List<CustomerCardDTO> customer_card_list;

    @Schema(description = "会员拥有卡记录")
    private List<CardHistoryDTO> customer_having_card_history;

    @Data
    @Schema(description = "会员拥有卡明细")
    public static class CustomerCardDTO {
        @Schema(description = "会员的会员卡id")
        private Long customer_card_id;

        @Schema(description = "会员的会员卡编码")
        private String customer_card_no;

        @Schema(description = "会员的会员卡名称")
        private String customer_card_name;

        @Schema(description = "会员等级名称")
        private String customer_level_name;

        @Schema(description = "会员卡是否跟随等级")
        private Boolean customer_card_is_follow_level;

        @Schema(description = "会员卡是否员工")
        private Boolean customer_card_is_employee;

        @Schema(description = "会员卡是否有效")
        private Boolean customer_card_is_enable;

        @Schema(description = "会员过期时间")
        private String customer_card_expire_date;

        @Schema(description = "会员卡权益信息")
        private List<CardRightDTO> customer_card_right_own;
    }

    @Data
    @Schema(description = "权益明细")
    public static class CardRightDTO {
        @Schema(description = "会员的会员卡权益编码")
        private String customer_card_right_code;

        @Schema(description = "会员的会员卡权益值")
        private Double customer_card_right_value;

        @Schema(description = "会员的会员卡权益说明")
        private String customer_card_right_detail;

        @Schema(description = "会员的会员卡权益类型[1消费权益 2入住游玩权益]")
        private Integer customer_card_right_type;

        @Schema(description = "会员的会员卡权益大图")
        private String customer_card_right_max_image;

        @Schema(description = "会员的会员卡权益小图")
        private String customer_card_right_min_image;
    }

    @Data
    @Schema(description = "持卡历史")
    public static class CardHistoryDTO {
        @Schema(description = "会员昵称")
        private String customer_card_owner_name;

        @Schema(description = "会员拥有的卡id")
        private Long customer_card_id;

        @Schema(description = "会员有卡开始日期")
        private String customer_card_start_date;

        @Schema(description = "会员有卡过期日期")
        private String customer_card_expire_date;
    }
}