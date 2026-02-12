package zjian.dto.res;

import lombok.Data;

import java.util.List;

@Data
public class ProductSkuSyncResponse {
    
    /** 成功集合 */
    private List<SyncResultItem> synResponse;
    
    /** 失败集合 */
    private List<SyncResultItem> errorResponse;

    @Data
    public static class SyncResultItem {
        private Integer index;
        private String subCode;
        private String subDesc;
        private String productCode;
    }
}