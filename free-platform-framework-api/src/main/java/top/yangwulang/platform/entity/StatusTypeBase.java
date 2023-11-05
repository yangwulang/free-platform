package top.yangwulang.platform.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.LogicalDeleted;
import org.babyfish.jimmer.sql.MappedSuperclass;

@MappedSuperclass
public interface StatusTypeBase {
    /**
     * 正常
     */
    String STATUS_NORMAL = "0";
    /**
     * 删除
     */
    String STATUS_DELETE = "1";
    /**
     * 草稿
     */
    String STATUS_DAFT = "9";
    /**
     * 审批中
     */
    String STATUS_APPROVE_ING = "10";

    @LogicalDeleted(value = STATUS_DELETE)
    @Schema(description = "状态")
    int status();
}
