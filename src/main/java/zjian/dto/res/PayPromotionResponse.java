package zjian.dto.res;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class PayPromotionResponse extends BaseCrmResponse{


    @JSONField(name = "total_num")
    private Long totalNum;

    @JSONField(name = "total_page")
    private Integer totalPage;

    @JSONField(name = "pay_promotion_dt_list")
    private List<PromotionDetail> promotionList;


    @Data
    public static class PromotionDetail {
        private Long promotionDtId;
        private String title; // 活动标题

        private String promotionDtRemark; // 活动明细备注

        private BigDecimal amount; // 活动明细金额 (充值金额)

        private BigDecimal amountGift; // 赠送金额

        private Integer pointsGift; // 赠送积分

        private String couponName; // 赠送券名称

        private String couponPackName; // 赠送券包名称

        private String remark;

        private String startDate;

        private String endDate;
    }
}