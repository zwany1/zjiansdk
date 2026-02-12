package zjian.dto.res;

import lombok.Data;

import java.util.List;

@Data
public class RemoteResponse extends BaseCrmResponse{
    private List<CouponDTO> customer_coupon_list;
    private Integer couponNum;


    @Data
    public static class CouponDTO {
        private Long customer_id;
        private Long coupon_id;
        private String coupon_no;
        private String coupon_name;
        private String start_date;
        private String end_date;
        private Double sale_amt;
        private Double min_amt;
        private Double dis_rate;
        private Double dis_amt;
        private Integer status;
        private String usage_rule;
        private String coupon_type;
        private Integer total_num;
        private Integer left_num;
        private Integer used_num;
        private Boolean is_regift;
        private String platforms;
    }
}