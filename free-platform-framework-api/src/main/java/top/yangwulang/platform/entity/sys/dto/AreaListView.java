package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.babyfish.jimmer.View;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Area;
import top.yangwulang.platform.entity.sys.AreaDraft;
import top.yangwulang.platform.entity.sys.AreaFetcher;

/**
 * 区域表
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Area.dto"
)
public class AreaListView implements View<Area> {
    public static final ViewMetadata<Area, AreaListView> METADATA =
            new ViewMetadata<Area, AreaListView>(
                    AreaFetcher.$
                            .status()
                            .createBy()
                            .createDate()
                            .updateBy()
                            .updateDate()
                            .remarks()
                            .areaName()
                            .sort()
                            .areaType()
                            .recursiveChildren(it -> it.recursive(args ->
                                    !args.getEntity().areaType().equals(Area.AREA_TYPE_COUNTY)
                            )),
                    AreaListView::new
            );

    private static final DtoPropAccessor CHILDREN_ACCESSOR = new DtoPropAccessor(
            false,
            new int[]{AreaDraft.Producer.SLOT_CHILDREN},
            DtoPropAccessor.<Area, AreaListView>objectListGetter(AreaListView::new),
            DtoPropAccessor.objectListSetter(AreaListView::toEntity)
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
            description = "区域名称"
    )
    @NotNull
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

    @Schema(
            description = "子级区域"
    )
    @Nullable
    private List<AreaListView> children;

    public AreaListView() {
    }

    public AreaListView(@NotNull Area base) {
        this.id = base.id();
        this.status = base.status();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = ((ImmutableSpi) base).__isLoaded(PropId.byIndex(AreaDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
        this.areaName = base.areaName();
        this.sort = ((ImmutableSpi) base).__isLoaded(PropId.byIndex(AreaDraft.Producer.SLOT_SORT)) ? base.sort() : null;
        this.areaType = ((ImmutableSpi) base).__isLoaded(PropId.byIndex(AreaDraft.Producer.SLOT_AREA_TYPE)) ? base.areaType() : null;
        this.children = CHILDREN_ACCESSOR.get(base);
    }

    public static AreaListView of(@NotNull Area base) {
        return new AreaListView(base);
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
     * 名称
     */
    @NotNull
    @Schema(
            description = "区域名称"
    )
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(@NotNull String areaName) {
        this.areaName = areaName;
    }

    /**
     * 排序
     */
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

    /**
     * 区域类型
     */
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

    @Nullable
    @Schema(
            description = "子级区域"
    )
    public List<AreaListView> getChildren() {
        return children;
    }

    public void setChildren(@Nullable List<AreaListView> children) {
        this.children = children;
    }

    @Override
    public Area toEntity() {
        return AreaDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setStatus(status);
            __draft.setCreateBy(createBy);
            __draft.setCreateDate(createDate);
            __draft.setUpdateBy(updateBy);
            __draft.setUpdateDate(updateDate);
            __draft.setRemarks(remarks);
            __draft.setAreaName(areaName);
            __draft.setSort(sort);
            __draft.setAreaType(areaType);
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
        hash = hash * 31 + Objects.hashCode(areaName);
        hash = hash * 31 + Objects.hashCode(sort);
        hash = hash * 31 + Objects.hashCode(areaType);
        hash = hash * 31 + Objects.hashCode(children);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        AreaListView other = (AreaListView) o;
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
        if (!Objects.equals(areaName, other.areaName)) {
            return false;
        }
        if (!Objects.equals(sort, other.sort)) {
            return false;
        }
        if (!Objects.equals(areaType, other.areaType)) {
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
        builder.append("AreaListView").append('(');
        builder.append("id=").append(id);
        builder.append(", status=").append(status);
        builder.append(", createBy=").append(createBy);
        builder.append(", createDate=").append(createDate);
        builder.append(", updateBy=").append(updateBy);
        builder.append(", updateDate=").append(updateDate);
        builder.append(", remarks=").append(remarks);
        builder.append(", areaName=").append(areaName);
        builder.append(", sort=").append(sort);
        builder.append(", areaType=").append(areaType);
        builder.append(", children=").append(children);
        builder.append(')');
        return builder.toString();
    }
}
