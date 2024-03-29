package top.yangwulang.platform.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.LogicalDeleted;
import org.babyfish.jimmer.sql.MappedSuperclass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author yangwulang
 */
@MappedSuperclass
public interface BaseEntity extends Serializable {
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

    /**
     * 停用
     */
    String STATUS_DISABLE = "2";
    /**
     * 状态（0正常 1删除 2停用）
     *
     * @return 状态
     */
    @NotNull
    @Schema(description = "状态")
    @LogicalDeleted(value = STATUS_DELETE)
    int status();

    /**
     * 创建者
     *
     * @return 创建者
     */
    @NotNull
//    @OnDissociate(DissociateAction.SET_NULL)
    @Schema(description = "创建人")
    String createBy();

    /**
     * 创建时间
     *
     * @return 创建时间
     */
    @NotNull
    @Schema(description = "创建时间")
    Date createDate();

    /**
     * 更新者
     *
     * @return 更新者
     */
    @NotNull
//    @OnDissociate(DissociateAction.SET_NULL)
    @Schema(description = "修改者")
    String updateBy();

    /**
     * 更新时间
     *
     * @return 更新时间
     */
    @NotNull
    @Schema(description = "修改时间")
    Date updateDate();

    /**
     * 备注信息
     *
     * @return 备注信息
     */
    @Nullable
    @Schema(description = "备注")
    String remarks();
}
