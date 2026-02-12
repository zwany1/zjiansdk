package zjian.dto.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema(description = "券详情响应数据")
public class CouponDetailResponse extends BaseCrmResponse{

    @JsonProperty("customer_id")
    private Long customerId;

    @JsonProperty("coupon_id")
    private Long couponId;

    @JsonProperty("coupon_name")
    private String couponName;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("end_date")
    private String endDate;

    @Schema(description = "销售金额")
    @JsonProperty("sale_amt")
    private BigDecimal saleAmt;

    @Schema(description = "消费门槛")
    @JsonProperty("min_amt")
    private BigDecimal minAmt;

    @Schema(description = "折扣值")
    @JsonProperty("dis_rate")
    private Double disRate;

    @Schema(description = "抵让金额")
    @JsonProperty("dis_amt")
    private BigDecimal disAmt;

    @Schema(description = "券状态 (50:正常 90:停用)")
    private Integer status;

    @JsonProperty("usage_rule")
    private String usageRule;

    @Schema(description = "券类型 [1:代金券, 2:折扣券...]")
    @JsonProperty("coupon_type")
    private String couponType;

    @JsonProperty("use_num")
    private Integer useNum;

    @JsonProperty("left_qty")
    private Integer leftQty;

    @JsonProperty("used_qty")
    private Integer usedQty;

    @JsonProperty("is_regift")
    private Boolean isRegift;

    @JsonProperty("is_stackable")
    private Boolean isStackable;

    private String platforms;


}