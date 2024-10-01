package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.query.specification.JSpecification;
import org.babyfish.jimmer.sql.ast.query.specification.PredicateApplier;
import org.babyfish.jimmer.sql.ast.query.specification.SpecificationArgs;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.entity.sys.DictTypeProps;
import top.yangwulang.platform.entity.sys.DictTypeTable;

/**
 * 字典类型表
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/DictType.dto"
)
@Schema(
        description = "字典类型标签"
)
public class DictTypeListSpecification implements JSpecification<DictType, DictTypeTable> {
    private String dictType;

    private String dictName;

    private Boolean isSys;

    private String remarks;

    public DictTypeListSpecification() {
    }

    /**
     * 字典类型
     *
     * @return 字典类型
     */
    @Nullable
    @Schema(
            description = "字典类型标签"
    )
    public String getDictType() {
        return dictType;
    }

    public void setDictType(@Nullable String dictType) {
        this.dictType = dictType;
    }

    /**
     * 字典名称
     * @return 字典名称
     */
    @Nullable
    @Schema(
            description = "字典名称"
    )
    public String getDictName() {
        return dictName;
    }

    public void setDictName(@Nullable String dictName) {
        this.dictName = dictName;
    }

    /**
     * 是否系统字典
     *
     * @return 是否系统字典
     */
    @Nullable
    @Schema(
            description = "是否系统自带"
    )
    public Boolean getIsSys() {
        return isSys;
    }

    public void setIsSys(@Nullable Boolean isSys) {
        this.isSys = isSys;
    }

    /**
     * 备注信息
     *
     * @return 备注信息
     */
    @Nullable
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(@Nullable String remarks) {
        this.remarks = remarks;
    }

    @Override
    public Class<DictType> entityType() {
        return DictType.class;
    }

    @Override
    public void applyTo(SpecificationArgs<DictType, DictTypeTable> args) {
        PredicateApplier __applier = args.getApplier();
        __applier.like(new ImmutableProp[] { DictTypeProps.DICT_TYPE.unwrap() }, this.dictType, false, false, false);
        __applier.like(new ImmutableProp[] { DictTypeProps.DICT_NAME.unwrap() }, this.dictName, false, false, false);
        __applier.eq(new ImmutableProp[] { DictTypeProps.IS_SYS.unwrap() }, this.isSys);
        __applier.like(new ImmutableProp[] { DictTypeProps.REMARKS.unwrap() }, this.remarks, false, false, false);
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(dictType);
        hash = hash * 31 + Objects.hashCode(dictName);
        hash = hash * 31 + Objects.hashCode(isSys);
        hash = hash * 31 + Objects.hashCode(remarks);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        DictTypeListSpecification other = (DictTypeListSpecification) o;
        if (!Objects.equals(dictType, other.dictType)) {
            return false;
        }
        if (!Objects.equals(dictName, other.dictName)) {
            return false;
        }
        if (!Objects.equals(isSys, other.isSys)) {
            return false;
        }
        if (!Objects.equals(remarks, other.remarks)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DictTypeListSpecification").append('(');
        builder.append("dictType=").append(dictType);
        builder.append(", dictName=").append(dictName);
        builder.append(", isSys=").append(isSys);
        builder.append(", remarks=").append(remarks);
        builder.append(')');
        return builder.toString();
    }
}
