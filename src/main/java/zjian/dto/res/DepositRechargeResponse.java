package zjian.dto.res;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DepositRechargeResponse extends BaseCrmResponse{


    private String tradeCode;

    private BigDecimal amount;

    private BigDecimal amountGift;

}