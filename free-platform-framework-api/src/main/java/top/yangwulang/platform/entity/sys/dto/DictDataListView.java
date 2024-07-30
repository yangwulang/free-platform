package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.View;
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
import top.yangwulang.platform.entity.sys.DictDataProps;

/**
 * 字典数据
 *
 * @author yangwulang
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/DictData.dto"
)
public class DictDataListView implements View<DictData> {
    public static final DtoMetadata<DictData, DictDataListView> METADATA =
            new DtoMetadata<DictData, DictDataListView>(
                    DictDataFetcher.$
                            .status()
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
                            .cssClass()
                            .recursiveChildren(it -> it.recursive(args ->
                                    // 当字典数的子级没有时返回null
                                    ImmutableObjects.isLoaded(args.getEntity(), DictDataProps.CHILDREN) &&
                                            !args.getEntity().children().isEmpty()
                            )),
                    DictDataListView::new
            );

    private static final DtoPropAccessor CHILDREN_ACCESSOR = new DtoPropAccessor(
            false,
            new int[]{DictDataDraft.Producer.SLOT_CHILDREN},
            DtoPropAccessor.<DictData, DictDataListView>objectListGetter(DictDataListView::new),
            DtoPropAccessor.objectListSetter(DictDataListView::toEntity)
    );

    @NotNull
    private String id;

    @Schema(
            description = "状态"
    )
    private int status;

    @NotNull
    private String createBy;

    @NotNull
    private Date createDate;

    @NotNull
    private String updateBy;

    @NotNull
    private Date updateDate;

    @Nullable
    private String remarks;

    @Schema(
            description = "字典标签"
    )
    @Nullable
    private String dictLabel;

    @Schema(
            description = "字典键值"
    )
    @Nullable
    private String dictValue;

    @Schema(
            description = "系统内置（1是 0否）"
    )
    @Nullable
    private Boolean isSys;

    @Schema(
            description = "字典描述"
    )
    @Nullable
    private String description;

    @Schema(
            description = "css样式（如：color:red)"
    )
    @Nullable
    private String cssStyle;

    @Schema(
            description = "css类名（如：red）"
    )
    @Nullable
    private String cssClass;

    @Schema(
            description = "子集"
    )
    @Nullable
    private List<DictDataListView> children;

    public DictDataListView() {
    }

    public DictDataListView(@NotNull DictData base) {
        this.id = base.id();
        this.status = base.status();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = ((ImmutableSpi) base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
        this.dictLabel = ((ImmutableSpi) base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DICT_LABEL)) ? base.dictLabel() : null;
        this.dictValue = ((ImmutableSpi) base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DICT_VALUE)) ? base.dictValue() : null;
        this.isSys = ((ImmutableSpi) base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_IS_SYS)) ? base.isSys() : null;
        this.description = ((ImmutableSpi) base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DESCRIPTION)) ? base.description() : null;
        this.cssStyle = ((ImmutableSpi) base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_CSS_STYLE)) ? base.cssStyle() : null;
        this.cssClass = ((ImmutableSpi) base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_CSS_CLASS)) ? base.cssClass() : null;
        this.children = CHILDREN_ACCESSOR.get(base);
    }

    public static DictDataListView of(@NotNull DictData base) {
        return new DictDataListView(base);
    }

    /**
     * 字典类型编码
     *
     * @return 主键值
     */
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

    @Schema(
            description = "状态"
    )
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * 创建者
     *
     * @return 创建者
     */
    @NotNull
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(@NotNull String createBy) {
        this.createBy = createBy;
    }

    /**
     * 创建时间
     *
     * @return 创建时间
     */
    @NotNull
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(@NotNull Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 更新者
     *
     * @return 更新者
     */
    @NotNull
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(@NotNull String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 更新时间
     *
     * @return 更新时间
     */
    @NotNull
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(@NotNull Date updateDate) {
        this.updateDate = updateDate;
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

    @Nullable
    @Schema(
            description = "子集"
    )
    public List<DictDataListView> getChildren() {
        return children;
    }

    public void setChildren(@Nullable List<DictDataListView> children) {
        this.children = children;
    }

    @Override
    public DictData toEntity() {
        return DictDataDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setStatus(status);
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
            CHILDREN_ACCESSOR.set(__draft, children != null ? children : Collections.emptyList());
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Integer.hashCode(status);
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
        hash = hash * 31 + Objects.hashCode(children);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        DictDataListView other = (DictDataListView) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (status != other.status) {
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
        if (!Objects.equals(children, other.children)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DictDataListView").append('(');
        builder.append("id=").append(id);
        builder.append(", status=").append(status);
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
        builder.append(", children=").append(children);
        builder.append(')');
        return builder.toString();
    }
}
