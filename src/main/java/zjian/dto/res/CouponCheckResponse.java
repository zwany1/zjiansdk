package zjian.dto.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import zjian.dto.req.CouponCheckRequest;

import java.util.List;

@Data
@Schema(name = "CouponCheckResponse", description = "会员用券检查响应数据")
public class CouponCheckResponse extends BaseCrmResponse {
    private List<CouponCheckRequest.ProductItem> product_items;
    private List<CouponCheckRequest.CouponItem> coupon_items;
    private List<CouponCheckRequest.ProductCouponItem> product_coupon_items;
}