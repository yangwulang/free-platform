package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.ViewableInput;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Area;
import top.yangwulang.platform.entity.sys.AreaDraft;
import top.yangwulang.platform.entity.sys.AreaFetcher;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Area.dto"
)
public class AreaListInput implements ViewableInput<Area> {
    public static final ViewMetadata<Area, AreaListInput> METADATA = 
        new ViewMetadata<Area, AreaListInput>(
            AreaFetcher.$
                .parentId()
                .areaName()
                .sort()
                .areaType(),
            AreaListInput::new
    );

    @Schema(
            description = "父级id"
    )
    @Null
    private String parentId;

    @Schema(
            description = "区域名称"
    )
    @NotNull
    private String areaName;

    @Schema(
            description = "排序"
    )
    @Null
    private Long sort;

    @Schema(
            description = "地区类型(1：国家；2：省份、直辖市；3：地市；4：区县)"
    )
    @Null
    private String areaType;

    public AreaListInput() {
    }

    public AreaListInput(@NotNull Area base) {
        this.parentId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(AreaDraft.Producer.SLOT_PARENT_ID)) ? base.parentId() : null;
        this.areaName = base.areaName();
        this.sort = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(AreaDraft.Producer.SLOT_SORT)) ? base.sort() : null;
        this.areaType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(AreaDraft.Producer.SLOT_AREA_TYPE)) ? base.areaType() : null;
    }

    public static AreaListInput of(@NotNull Area base) {
        return new AreaListInput(base);
    }

    @Nullable
    public String getParentId() {
        return parentId;
    }

    public void setParentId(@Nullable String parentId) {
        this.parentId = parentId;
    }

    @NotNull
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(@NotNull String areaName) {
        this.areaName = areaName;
    }

    @Nullable
    public Long getSort() {
        return sort;
    }

    public void setSort(@Nullable Long sort) {
        this.sort = sort;
    }

    @Nullable
    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(@Nullable String areaType) {
        this.areaType = areaType;
    }

    @Override
    public Area toEntity() {
        return AreaDraft.$.produce(__draft -> {
            __draft.setParentId(parentId);
            __draft.setAreaName(areaName);
            __draft.setSort(sort);
            __draft.setAreaType(areaType);
        });
    }

    public int hashCode() {
        int hash = Objects.hashCode(parentId);
        hash = hash * 31 + Objects.hashCode(areaName);
        hash = hash * 31 + Objects.hashCode(sort);
        hash = hash * 31 + Objects.hashCode(areaType);
        return hash;
    }

    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        AreaListInput other = (AreaListInput) o;
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

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AreaListInput").append('(');
        builder.append("parentId=").append(parentId);
        builder.append(", areaName=").append(areaName);
        builder.append(", sort=").append(sort);
        builder.append(", areaType=").append(areaType);
        builder.append(')');
        return builder.toString();
    }
}
