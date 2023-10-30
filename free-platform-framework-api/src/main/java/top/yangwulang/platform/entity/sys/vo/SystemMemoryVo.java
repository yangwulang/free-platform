package top.yangwulang.platform.entity.sys.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author yangwulang
 */
@Schema(description = "系统内存")
@Data
public class SystemMemoryVo {
    @Schema(description = "最大内存")
    private String maxMemory;
    @Schema(description = "释放内存")
    private String freeMemory;
    @Schema(description = "使用内存")
    private String usableMemory;
}
