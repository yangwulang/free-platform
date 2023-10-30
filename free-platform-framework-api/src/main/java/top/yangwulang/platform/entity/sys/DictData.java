package top.yangwulang.platform.entity.sys;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.*;
import top.yangwulang.platform.entity.DataTypeBase;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
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
    @Schema(description = "父级")
    @Null DictData parent();

    @OneToMany(mappedBy = "parent")
    @NotNull
    @Schema(description = "子集")
    List<DictData> children();

    /**
     * 字典类型主键
     */
    @Key
    @ManyToOne
    @OnDissociate(DissociateAction.DELETE)
    @Schema(description = "字典类型")
    @Null DictType dictType();

    @IdView
    @Schema(description = "父级id")
    @Null String parentId();

    @IdView
    @Schema(description = "字典类型id")
    @Null String dictTypeId();

    /**
     * 字典标签
     */
    @Key
    @Schema(description = "字典标签")
    @Null String dictLabel();

    /**
     * 字典键值
     */
    @Key
    @Schema(description = "字典键值")
    @Null String dictValue();

    /**
     * 系统内置（1是 0否）
     */
    @Column(name = "is_sys")
    @Schema(description = "系统内置（1是 0否）")
    Boolean isSys();

    /**
     * 字典描述
     */
    @Schema(description = "字典描述")
    @Null String description();

    /**
     * css样式（如：color:red)
     */
    @Schema(description = "css样式（如：color:red)")
    @Null String cssStyle();

    /**
     * css类名（如：red）
     */
    @Schema(description = "css类名（如：red）")
    @Null String cssClass();

    /**
     * 租户代码
     */
    @Schema(description = "租户代码")
    @Null String corpCode();

    /**
     * 租户名称
     */
    @Schema(description = "租户名称")
    @Null String corpName();
}

