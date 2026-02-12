package zjian.dto.res;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
public class DepositTradeStatusResponse extends BaseCrmResponse {
    private String tradeCode;
    private String channelName;
    private String channelNo;
    private String customerName;
    private String customerNo;
    private String outTradeCode;
    private String depositType;
    private Long oriTradeId;
    private BigDecimal amount;
    /** 储值状态: 0:待支付, 1:已支付, 5:审核通过, 8:审核失败, 9:作废或取消 */
    private String status;
}