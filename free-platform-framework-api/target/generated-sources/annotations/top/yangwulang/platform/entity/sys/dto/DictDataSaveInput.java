package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataDraft;
import top.yangwulang.platform.entity.sys.DictDataFetcher;

/**
 * 字典数据
 *
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/DictData.dto"
)
public class DictDataSaveInput implements Input<DictData> {
    public static final DtoMetadata<DictData, DictDataSaveInput> METADATA = 
        new DtoMetadata<DictData, DictDataSaveInput>(
            DictDataFetcher.$
                .parentId()
                .dictTypeId()
                .dictLabel()
                .dictValue()
                .isSys()
                .description()
                .cssStyle()
                .cssClass(),
            DictDataSaveInput::new
    );

    private static final DtoPropAccessor ID_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { DictDataDraft.Producer.SLOT_ID }
    );

    private String id;

    private String parentId;

    private String dictTypeId;

    private String dictLabel;

    private String dictValue;

    private Boolean isSys;

    private String description;

    private String cssStyle;

    private String cssClass;

    public DictDataSaveInput() {
    }

    public DictDataSaveInput(@NotNull DictData base) {
        this.id = ID_ACCESSOR.get(base);
        this.parentId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_PARENT_ID)) ? base.parentId() : null;
        this.dictTypeId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DICT_TYPE_ID)) ? base.dictTypeId() : null;
        this.dictLabel = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DICT_LABEL)) ? base.dictLabel() : null;
        this.dictValue = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DICT_VALUE)) ? base.dictValue() : null;
        this.isSys = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_IS_SYS)) ? base.isSys() : null;
        this.description = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DESCRIPTION)) ? base.description() : null;
        this.cssStyle = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_CSS_STYLE)) ? base.cssStyle() : null;
        this.cssClass = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_CSS_CLASS)) ? base.cssClass() : null;
    }

    /**
     * 字典类型编码
     * @return 主键值
     */
    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
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

    @Nullable
    @Schema(
            description = "字典类型id"
    )
    public String getDictTypeId() {
        return dictTypeId;
    }

    public void setDictTypeId(@Nullable String dictTypeId) {
        this.dictTypeId = dictTypeId;
    }

    /**
     * 字典标签
     */
    @Nullable
    @Schema(
            description = "字典标签"
    )
    public String getDictLabel() {
        return dictLabel;
    }

    public void setDictLabel(@Nullable String dictLabel) {
        this.dictLabel = dictLabel;
    }

    /**
     * 字典键值
     */
    @Nullable
    @Schema(
            description = "字典键值"
    )
    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(@Nullable String dictValue) {
        this.dictValue = dictValue;
    }

    /**
     * 系统内置（1是 0否）
     */
    @Nullable
    @Schema(
            description = "系统内置（1是 0否）"
    )
    public Boolean getIsSys() {
        return isSys;
    }

    public void setIsSys(@Nullable Boolean isSys) {
        this.isSys = isSys;
    }

    /**
     * 字典描述
     */
    @Nullable
    @Schema(
            description = "字典描述"
    )
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }

    /**
     * css样式（如：color:red)
     */
    @Nullable
    @Schema(
            description = "css样式（如：color:red)"
    )
    public String getCssStyle() {
        return cssStyle;
    }

    public void setCssStyle(@Nullable String cssStyle) {
        this.cssStyle = cssStyle;
    }

    /**
     * css类名（如：red）
     */
    @Nullable
    @Schema(
            description = "css类名（如：red）"
    )
    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(@Nullable String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public DictData toEntity() {
        return DictDataDraft.$.produce(__draft -> {
            ID_ACCESSOR.set(__draft, id);
            __draft.setParentId(parentId);
            __draft.setDictTypeId(dictTypeId);
            __draft.setDictLabel(dictLabel);
            __draft.setDictValue(dictValue);
            __draft.setIsSys(isSys);
            __draft.setDescription(description);
            __draft.setCssStyle(cssStyle);
            __draft.setCssClass(cssClass);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(parentId);
        hash = hash * 31 + Objects.hashCode(dictTypeId);
        hash = hash * 31 + Objects.hashCode(dictLabel);
        hash = hash * 31 + Objects.hashCode(dictValue);
        hash = hash * 31 + Objects.hashCode(isSys);
        hash = hash * 31 + Objects.hashCode(description);
        hash = hash * 31 + Objects.hashCode(cssStyle);
        hash = hash * 31 + Objects.hashCode(cssClass);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        DictDataSaveInput other = (DictDataSaveInput) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(parentId, other.parentId)) {
            return false;
        }
        if (!Objects.equals(dictTypeId, other.dictTypeId)) {
            return false;
        }
        if (!Objects.equals(dictLabel, other.dictLabel)) {
            return false;
        }
        if (!Objects.equals(dictValue, other.dictValue)) {
            return false;
        }
        if (!Objects.equals(isSys, other.isSys)) {
            return false;
        }
        if (!Objects.equals(description, other.description)) {
            return false;
        }
        if (!Objects.equals(cssStyle, other.cssStyle)) {
            return false;
        }
        if (!Objects.equals(cssClass, other.cssClass)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DictDataSaveInput").append('(');
        builder.append("id=").append(id);
        builder.append(", parentId=").append(parentId);
        builder.append(", dictTypeId=").append(dictTypeId);
        builder.append(", dictLabel=").append(dictLabel);
        builder.append(", dictValue=").append(dictValue);
        builder.append(", isSys=").append(isSys);
        builder.append(", description=").append(description);
        builder.append(", cssStyle=").append(cssStyle);
        builder.append(", cssClass=").append(cssClass);
        builder.append(')');
        return builder.toString();
    }
}
