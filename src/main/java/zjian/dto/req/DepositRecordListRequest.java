package zjian.dto.req;

import lombok.Data;

@Data
public class DepositRecordListRequest {
    private String mobile;
    private String customerNo;
    /** 储值类型: 10:充值, 20:退款, 30:扣款, 40:冲正 */
    private Integer depositType;
    /** 是否可用: 0:否, 1:是 */
    private Integer available;
    private Integer currentPage;
    private Integer pageSize;
}