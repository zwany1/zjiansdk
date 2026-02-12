package zjian.dto.req;

import lombok.Data;

@Data
public class DepositTradeStatusRequest {
    /** 储值单号 */
    private String tradeCode;
    /** 外部单号 */
    private String outTradeCode;
}