package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.DissociateAction;
import org.babyfish.jimmer.sql.MappedSuperclass;
import org.babyfish.jimmer.sql.OnDissociate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.time.LocalDateTime;

/**
 * @author yangwulang
 */
@MappedSuperclass
public interface DataTypeBase extends TypeBase{

    /**
     * 状态（0正常 1删除 2停用）
     *
     * @return 状态
     */
    @NotNull
    String status();

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
    LocalDateTime createDate();

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
    LocalDateTime updateDate();

    /**
     * 备注信息
     *
     * @return 备注信息
     */
    @Null
    String remarks();
}
