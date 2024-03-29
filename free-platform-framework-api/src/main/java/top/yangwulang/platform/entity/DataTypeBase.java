package top.yangwulang.platform.entity;

import org.babyfish.jimmer.sql.LogicalDeleted;
import org.babyfish.jimmer.sql.MappedSuperclass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


import java.util.Date;

/**
 * @author yangwulang
 */
@MappedSuperclass
public interface DataTypeBase extends TypeBase, StatusTypeBase {

    /**
     * 创建者
     *
     * @return 创建者
     */
    @NotNull
//    @OnDissociate(DissociateAction.SET_NULL)
    String createBy();

    /**
     * 创建时间
     *
     * @return 创建时间
     */
    @NotNull
    Date createDate();

    /**
     * 更新者
     *
     * @return 更新者
     */
    @NotNull
//    @OnDissociate(DissociateAction.SET_NULL)
    String updateBy();

    /**
     * 更新时间
     *
     * @return 更新时间
     */
    @NotNull
    Date updateDate();

    /**
     * 备注信息
     *
     * @return 备注信息
     */
    @Nullable
    String remarks();
}
