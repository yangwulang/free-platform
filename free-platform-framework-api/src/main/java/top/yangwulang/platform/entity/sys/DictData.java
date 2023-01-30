package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.Immutable;
import org.babyfish.jimmer.pojo.Static;
import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 字典数据
 *
 * @author yangwulang
 */
@Table(name = "sys_dict_data")
@Entity
@Immutable(value = Immutable.Nullity.NULLABLE)
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
    DictData parent();

    @OneToMany(mappedBy = "parent")
    @NotNull
    List<DictData> children();

    /**
     * 字典类型主键
     */
    @Key
    @ManyToOne
    @OnDissociate(DissociateAction.DELETE)
    DictType dictType();

    /**
     * 所有父级编号
     */
    String parentCodes();

    /**
     * 本级排序号（升序）
     */
    BigDecimal treeSort();

    /**
     * 所有级别排序号
     */
    String treeSorts();

    /**
     * 是否最末级
     */
    String treeLeaf();

    /**
     * 层次级别
     */
    BigDecimal treeLevel();

    /**
     * 全节点名
     */
    String treeNames();

    /**
     * 字典标签
     */
    String dictLabel();

    /**
     * 字典键值
     */
    String dictValue();

    /**
     * 系统内置（1是 0否）
     */
    @Column(name = "is_sys")
    boolean isSys();

    /**
     * 字典描述
     */
    String description();

    /**
     * css样式（如：color:red)
     */
    String cssStyle();

    /**
     * css类名（如：red）
     */
    String cssClass();

    /**
     * 租户代码
     */
    String corpCode();

    /**
     * 租户名称
     */
    String corpName();
}

