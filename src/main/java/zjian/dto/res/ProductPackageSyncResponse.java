package zjian.dto.res;

import lombok.Data;

import java.util.List;

@Data
public class ProductPackageSyncResponse {
    /** 成功集合 */
    private List<PackageSyncResult> synResponse;
    /** 失败集合 */
    private List<PackageSyncResult> errorResponse;

    @Data
    public static class PackageSyncResult {
        private Integer index;
        private String subCode;
        private String subDesc;
        private String productCode;
    }
}