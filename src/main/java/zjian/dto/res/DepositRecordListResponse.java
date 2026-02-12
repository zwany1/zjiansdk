package zjian.dto.res;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class DepositRecordListResponse extends BaseCrmResponse {
    private List<PayDepositRecord> payDepositRecordList;
    private Integer totalNum;
    private Integer totalPage;
    private Integer currentPage;
    private Integer pageSize;

    @Data
    public static class PayDepositRecord {
        private Long tradeId;
        private String tradeCode;
        private Double amount;
        private Double amountBalance;
        private String outTradeCode;
        private String channelCode;
        private String channelName;
        private String createDate;
        private Boolean isFrozen;
        /** 储值状态: 0:待支付, 1:已支付, 5:审核通过, 8:审核失败, 9:作废或取消 */
        private Integer status;
        private Integer depositType;
    }
}