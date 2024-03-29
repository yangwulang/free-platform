package top.yangwulang.platform.entity.sys;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.*;
import top.yangwulang.platform.entity.DataTypeBase;

import org.jetbrains.annotations.NotNull;;
import jakarta.annotation.Nullable;
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
    @Nullable DictData parent();

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
    @Nullable DictType dictType();

    @IdView
    @Schema(description = "父级id")
    @Nullable String parentId();

    @IdView
    @Schema(description = "字典类型id")
    @Nullable String dictTypeId();

    /**
     * 字典标签
     */
    @Key
    @Schema(description = "字典标签")
    @Nullable String dictLabel();

    /**
     * 字典键值
     */
    @Key
    @Schema(description = "字典键值")
    @Nullable String dictValue();

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
    @Nullable String description();

    /**
     * css样式（如：color:red)
     */
    @Schema(description = "css样式（如：color:red)")
    @Nullable String cssStyle();

    /**
     * css类名（如：red）
     */
    @Schema(description = "css类名（如：red）")
    @Nullable String cssClass();

    /**
     * 租户代码
     */
    @Schema(description = "租户代码")
    @Nullable String corpCode();

    /**
     * 租户名称
     */
    @Schema(description = "租户名称")
    @Nullable String corpName();
}

