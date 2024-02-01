package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Class;
import java.lang.Long;
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
import top.yangwulang.platform.entity.sys.Area;
import top.yangwulang.platform.entity.sys.AreaProps;
import top.yangwulang.platform.entity.sys.AreaTable;

/**
 * 区域表
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Area.dto"
)
public class AreaListSpecification implements JSpecification<Area, AreaTable> {
    @Schema(
            description = "父级id"
    )
    @Nullable
    private String parentId;

    @Schema(
            description = "区域名称"
    )
    @Nullable
    private String areaName;

    @Schema(
            description = "排序"
    )
    @Nullable
    private Long sort;

    @Schema(
            description = "地区类型(1：省份、直辖市；2：地市；3：区县)"
    )
    @Nullable
    private String areaType;

    public AreaListSpecification() {
    }

    /**
     * 父级编号
     */
    @Nullable
    public String getParentId() {
        return parentId;
    }

    public void setParentId(@Nullable String parentId) {
        this.parentId = parentId;
    }

    /**
     * 名称
     */
    @Nullable
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(@Nullable String areaName) {
        this.areaName = areaName;
    }

    /**
     * 排序
     */
    @Nullable
    public Long getSort() {
        return sort;
    }

    public void setSort(@Nullable Long sort) {
        this.sort = sort;
    }

    /**
     * 区域类型
     */
    @Nullable
    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(@Nullable String areaType) {
        this.areaType = areaType;
    }

    @Override
    public Class<Area> entityType() {
        return Area.class;
    }

    @Override
    public void applyTo(SpecificationArgs<Area, AreaTable> args) {
        PredicateApplier __applier = args.getApplier();
        __applier.eq(new ImmutableProp[] { AreaProps.PARENT_ID.unwrap() }, this.parentId);
        __applier.eq(new ImmutableProp[] { AreaProps.AREA_NAME.unwrap() }, this.areaName);
        __applier.eq(new ImmutableProp[] { AreaProps.SORT.unwrap() }, this.sort);
        __applier.eq(new ImmutableProp[] { AreaProps.AREA_TYPE.unwrap() }, this.areaType);
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(parentId);
        hash = hash * 31 + Objects.hashCode(areaName);
        hash = hash * 31 + Objects.hashCode(sort);
        hash = hash * 31 + Objects.hashCode(areaType);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        AreaListSpecification other = (AreaListSpecification) o;
        if (!Objects.equals(parentId, other.parentId)) {
            return false;
        }
        if (!Objects.equals(areaName, other.areaName)) {
            return false;
        }
        if (!Objects.equals(sort, other.sort)) {
            return false;
        }
        if (!Objects.equals(areaType, other.areaType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AreaListSpecification").append('(');
        builder.append("parentId=").append(parentId);
        builder.append(", areaName=").append(areaName);
        builder.append(", sort=").append(sort);
        builder.append(", areaType=").append(areaType);
        builder.append(')');
        return builder.toString();
    }
}
