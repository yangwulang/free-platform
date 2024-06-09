package top.yangwulang.platform.entity.sys.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.internal.FixedInputField;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Area;
import top.yangwulang.platform.entity.sys.AreaDraft;
import top.yangwulang.platform.entity.sys.AreaFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Area.dto"
)
@JsonDeserialize(
        builder = AreaSaveInput.Builder.class
)
@Schema(
        description = "区域实体"
)
public class AreaSaveInput implements Input<Area> {
    public static final ViewMetadata<Area, AreaSaveInput> METADATA = 
        new ViewMetadata<Area, AreaSaveInput>(
            AreaFetcher.$
                .parentId()
                .areaName()
                .sort()
                .areaType(),
            AreaSaveInput::new
    );

    @FixedInputField
    private String id;

    private String parentId;

    @FixedInputField
    private String areaName;

    private Long sort;

    private String areaType;

    public AreaSaveInput() {
    }

    public AreaSaveInput(@NotNull Area base) {
        this.id = base.id();
        this.parentId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(AreaDraft.Producer.SLOT_PARENT_ID)) ? base.parentId() : null;
        this.areaName = base.areaName();
        this.sort = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(AreaDraft.Producer.SLOT_SORT)) ? base.sort() : null;
        this.areaType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(AreaDraft.Producer.SLOT_AREA_TYPE)) ? base.areaType() : null;
    }

    @NotNull
    public String getId() {
        if (id == null) {
            throw new IllegalStateException("The property \"id\" is not specified");
        }
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

    @Nullable
    @Schema(
            description = "父级id"
    )
    public String getParentId() {
        return parentId;
    }

    public void setParentId(@Nullable String parentId) {
        this.parentId = parentId;
    }

    @NotNull
    @Schema(
            description = "区域名称"
    )
    public String getAreaName() {
        if (areaName == null) {
            throw new IllegalStateException("The property \"areaName\" is not specified");
        }
        return areaName;
    }

    public void setAreaName(@NotNull String areaName) {
        this.areaName = areaName;
    }

    @Nullable
    @Schema(
            description = "排序"
    )
    public Long getSort() {
        return sort;
    }

    public void setSort(@Nullable Long sort) {
        this.sort = sort;
    }

    @Nullable
    @Schema(
            description = "地区类型(1：省份、直辖市；2：地市；3：区县)"
    )
    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(@Nullable String areaType) {
        this.areaType = areaType;
    }

    @Override
    public Area toEntity() {
        return AreaDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setParentId(parentId);
            __draft.setAreaName(areaName);
            __draft.setSort(sort);
            __draft.setAreaType(areaType);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(parentId);
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
        AreaSaveInput other = (AreaSaveInput) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
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
        builder.append("AreaSaveInput").append('(');
        builder.append("id=").append(id);
        builder.append(", parentId=").append(parentId);
        builder.append(", areaName=").append(areaName);
        builder.append(", sort=").append(sort);
        builder.append(", areaType=").append(areaType);
        builder.append(')');
        return builder.toString();
    }

    @JsonPOJOBuilder(
            withPrefix = ""
    )
    public static class Builder {
        private String id;

        private String parentId;

        private String areaName;

        private Long sort;

        private String areaType;

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id, "The property \"id\" cannot be null");
            return this;
        }

        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder areaName(String areaName) {
            this.areaName = Objects.requireNonNull(areaName, "The property \"areaName\" cannot be null");
            return this;
        }

        public Builder sort(Long sort) {
            this.sort = sort;
            return this;
        }

        public Builder areaType(String areaType) {
            this.areaType = areaType;
            return this;
        }

        public AreaSaveInput build() {
            AreaSaveInput _input = new AreaSaveInput();
            if (id == null) {
                throw Input.unknownNonNullProperty(AreaSaveInput.class, "id");
            }
            _input.setId(id);
            _input.setParentId(parentId);
            if (areaName == null) {
                throw Input.unknownNonNullProperty(AreaSaveInput.class, "areaName");
            }
            _input.setAreaName(areaName);
            _input.setSort(sort);
            _input.setAreaType(areaType);
            return _input;
        }
    }
}
