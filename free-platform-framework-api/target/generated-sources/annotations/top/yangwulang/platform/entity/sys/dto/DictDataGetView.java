package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataDraft;
import top.yangwulang.platform.entity.sys.DictDataFetcher;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/DictData.dto"
)
public class DictDataGetView implements View<DictData> {
    public static final ViewMetadata<DictData, DictDataGetView> METADATA = 
        new ViewMetadata<DictData, DictDataGetView>(
            DictDataFetcher.$
                .createBy()
                .createDate()
                .updateBy()
                .updateDate()
                .remarks()
                .dictLabel()
                .dictValue()
                .isSys()
                .description()
                .cssStyle()
                .cssClass(),
            DictDataGetView::new
    );

    @NotNull
    private String id;

    @NotNull
    private String createBy;

    @NotNull
    private Date createDate;

    @NotNull
    private String updateBy;

    @NotNull
    private Date updateDate;

    @Null
    private String remarks;

    @Schema(
            description = "字典标签"
    )
    @Null
    private String dictLabel;

    @Schema(
            description = "字典键值"
    )
    @Null
    private String dictValue;

    @Schema(
            description = "系统内置（1是 0否）"
    )
    @Nullable
    private Boolean isSys;

    @Schema(
            description = "字典描述"
    )
    @Null
    private String description;

    @Schema(
            description = "css样式（如：color:red)"
    )
    @Null
    private String cssStyle;

    @Schema(
            description = "css类名（如：red）"
    )
    @Null
    private String cssClass;

    public DictDataGetView() {
    }

    public DictDataGetView(@org.jetbrains.annotations.NotNull DictData base) {
        this.id = base.id();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
        this.dictLabel = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DICT_LABEL)) ? base.dictLabel() : null;
        this.dictValue = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DICT_VALUE)) ? base.dictValue() : null;
        this.isSys = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_IS_SYS)) ? base.isSys() : null;
        this.description = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DESCRIPTION)) ? base.description() : null;
        this.cssStyle = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_CSS_STYLE)) ? base.cssStyle() : null;
        this.cssClass = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_CSS_CLASS)) ? base.cssClass() : null;
    }

    public static DictDataGetView of(@org.jetbrains.annotations.NotNull DictData base) {
        return new DictDataGetView(base);
    }

    @org.jetbrains.annotations.NotNull
    public String getId() {
        return id;
    }

    public void setId(@org.jetbrains.annotations.NotNull String id) {
        this.id = id;
    }

    @org.jetbrains.annotations.NotNull
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(@org.jetbrains.annotations.NotNull String createBy) {
        this.createBy = createBy;
    }

    @org.jetbrains.annotations.NotNull
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(@org.jetbrains.annotations.NotNull Date createDate) {
        this.createDate = createDate;
    }

    @org.jetbrains.annotations.NotNull
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(@org.jetbrains.annotations.NotNull String updateBy) {
        this.updateBy = updateBy;
    }

    @org.jetbrains.annotations.NotNull
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(@org.jetbrains.annotations.NotNull Date updateDate) {
        this.updateDate = updateDate;
    }

    @Nullable
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(@Nullable String remarks) {
        this.remarks = remarks;
    }

    @Nullable
    public String getDictLabel() {
        return dictLabel;
    }

    public void setDictLabel(@Nullable String dictLabel) {
        this.dictLabel = dictLabel;
    }

    @Nullable
    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(@Nullable String dictValue) {
        this.dictValue = dictValue;
    }

    @Nullable
    public Boolean getIsSys() {
        return isSys;
    }

    public void setIsSys(@Nullable Boolean isSys) {
        this.isSys = isSys;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }

    @Nullable
    public String getCssStyle() {
        return cssStyle;
    }

    public void setCssStyle(@Nullable String cssStyle) {
        this.cssStyle = cssStyle;
    }

    @Nullable
    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(@Nullable String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public DictData toEntity() {
        return DictDataDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setCreateBy(createBy);
            __draft.setCreateDate(createDate);
            __draft.setUpdateBy(updateBy);
            __draft.setUpdateDate(updateDate);
            __draft.setRemarks(remarks);
            __draft.setDictLabel(dictLabel);
            __draft.setDictValue(dictValue);
            __draft.setIsSys(isSys);
            __draft.setDescription(description);
            __draft.setCssStyle(cssStyle);
            __draft.setCssClass(cssClass);
        });
    }

    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(createBy);
        hash = hash * 31 + Objects.hashCode(createDate);
        hash = hash * 31 + Objects.hashCode(updateBy);
        hash = hash * 31 + Objects.hashCode(updateDate);
        hash = hash * 31 + Objects.hashCode(remarks);
        hash = hash * 31 + Objects.hashCode(dictLabel);
        hash = hash * 31 + Objects.hashCode(dictValue);
        hash = hash * 31 + Objects.hashCode(isSys);
        hash = hash * 31 + Objects.hashCode(description);
        hash = hash * 31 + Objects.hashCode(cssStyle);
        hash = hash * 31 + Objects.hashCode(cssClass);
        return hash;
    }

    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        DictDataGetView other = (DictDataGetView) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(createBy, other.createBy)) {
            return false;
        }
        if (!Objects.equals(createDate, other.createDate)) {
            return false;
        }
        if (!Objects.equals(updateBy, other.updateBy)) {
            return false;
        }
        if (!Objects.equals(updateDate, other.updateDate)) {
            return false;
        }
        if (!Objects.equals(remarks, other.remarks)) {
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

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DictDataGetView").append('(');
        builder.append("id=").append(id);
        builder.append(", createBy=").append(createBy);
        builder.append(", createDate=").append(createDate);
        builder.append(", updateBy=").append(updateBy);
        builder.append(", updateDate=").append(updateDate);
        builder.append(", remarks=").append(remarks);
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
