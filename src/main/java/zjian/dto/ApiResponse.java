package zjian.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Schema(name = "ApiResponse", description = "API响应结果")
public class ApiResponse {
    @Schema(description = "响应码", example = "0")
    private String code;
    @Schema(description = "响应描述", example = "成功")
    private String desc;
    @Schema(description = "响应数据")
    private ResponseData data;

    @Data
    @NoArgsConstructor
    @Schema(name = "ResponseData", description = "响应数据")
    public static class ResponseData {
        @Schema(description = "同步成功的结果列表")
        private List<ProcessResult> syn_response;
        @Schema(description = "同步失败的结果列表")
        private List<ProcessResult> error_response;
    }

    @Data
    @NoArgsConstructor
    @Schema(name = "ProcessResult", description = "处理结果")
    public static class ProcessResult {
        @Schema(description = "索引")
        private Integer index;
        @Schema(description = "子响应码")
        private String sub_code;
        @Schema(description = "子响应描述")
        private String sub_desc;
        @Schema(description = "手机号码")
        private String mobile;
        @Schema(description = "会员ID")
        private Long customer_id;
        @Schema(description = "会员编号")
        private String customer_no;
    }
}