package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.math.BigDecimal;
import java.util.List;

/**
 * 字典数据
 *
 * @author yangwulang
 */
@Table(name = "sys_dict_data")
@Entity
public interface DictData extends DataTypeBase {

    /**
     * 父级编号
     *
     * @return 父级
     */
    @Key
    @ManyToOne
    @JoinColumn(name = "pid")
    @OnDissociate(DissociateAction.DELETE)
    @Null DictData parent();

    @OneToMany(mappedBy = "parent")
    @NotNull
    List<DictData> children();

    /**
     * 字典类型主键
     */
    @Key
    @ManyToOne
    @OnDissociate(DissociateAction.DELETE)
    @Null DictType dictType();

    /**
     * 所有父级编号
     */
    @Null String parentCodes();

    /**
     * 本级排序号（升序）
     */
    @Null BigDecimal treeSort();

    /**
     * 所有级别排序号
     */
    @Null String treeSorts();

    /**
     * 是否最末级
     */
    @Null String treeLeaf();

    /**
     * 层次级别
     */
    @Null BigDecimal treeLevel();

    /**
     * 全节点名
     */
    @Null String treeNames();

    /**
     * 字典标签
     */
    @Null String dictLabel();

    /**
     * 字典键值
     */
    @Null String dictValue();

    /**
     * 系统内置（1是 0否）
     */
    @Column(name = "is_sys")
    @Null boolean isSys();

    /**
     * 字典描述
     */
    @Null String description();

    /**
     * css样式（如：color:red)
     */
    @Null String cssStyle();

    /**
     * css类名（如：red）
     */
    @Null String cssClass();

    /**
     * 租户代码
     */
    @Null String corpCode();

    /**
     * 租户名称
     */
    @Null String corpName();
}

