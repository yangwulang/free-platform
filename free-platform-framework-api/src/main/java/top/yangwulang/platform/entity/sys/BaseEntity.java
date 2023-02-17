package top.yangwulang.platform.entity.sys;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.MappedSuperclass;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author yangwulang
 */
@MappedSuperclass
public interface BaseEntity extends Serializable {
    /**
     * 状态（0正常 1删除 2停用）
     *
     * @return 状态
     */
    @NotNull
    @Schema(description = "状态")
    String status();

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
    LocalDateTime createDate();

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
    LocalDateTime updateDate();

    /**
     * 备注信息
     *
     * @return 备注信息
     */
    @Null
    @Schema(description = "备注")
    String remarks();
}
