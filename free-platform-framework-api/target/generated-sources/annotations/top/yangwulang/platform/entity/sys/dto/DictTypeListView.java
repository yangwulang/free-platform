package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import java.util.Objects;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.entity.sys.DictTypeDraft;
import top.yangwulang.platform.entity.sys.DictTypeFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/DictType.dto"
)
public class DictTypeListView implements View<DictType> {
    public static final ViewMetadata<DictType, DictTypeListView> METADATA = 
        new ViewMetadata<DictType, DictTypeListView>(
            DictTypeFetcher.$
                .status()
                .createBy()
                .createDate()
                .updateBy()
                .updateDate()
                .remarks()
                .dictName()
                .dictType()
                .isSys(),
            DictTypeListView::new
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
            description = "字典名称"
    )
    @Nullable
    private String dictName;

    @Schema(
            description = "字典类型标签"
    )
    @NotNull
    private String dictType;

    @Schema(
            description = "是否系统自带"
    )
    @Nullable
    private Boolean isSys;

    public DictTypeListView() {
    }

    public DictTypeListView(@NotNull DictType base) {
        this.id = base.id();
        this.status = base.status();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
        this.dictName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_DICT_NAME)) ? base.dictName() : null;
        this.dictType = base.dictType();
        this.isSys = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_IS_SYS)) ? base.isSys() : null;
    }

    public static DictTypeListView of(@NotNull DictType base) {
        return new DictTypeListView(base);
    }

    /**
     * 字典类型编码
     * @return 主键值
     */
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

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
     * 字典名称
     * @return 字典名称
     */
    @Nullable
    public String getDictName() {
        return dictName;
    }

    public void setDictName(@Nullable String dictName) {
        this.dictName = dictName;
    }

    /**
     * 字典类型
     *
     * @return 字典类型
     */
    @NotNull
    public String getDictType() {
        return dictType;
    }

    public void setDictType(@NotNull String dictType) {
        this.dictType = dictType;
    }

    /**
     * 是否系统字典
     *
     * @return 是否系统字典
     */
    @Nullable
    public Boolean getIsSys() {
        return isSys;
    }

    public void setIsSys(@Nullable Boolean isSys) {
        this.isSys = isSys;
    }

    @Override
    public DictType toEntity() {
        return DictTypeDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setStatus(status);
            __draft.setCreateBy(createBy);
            __draft.setCreateDate(createDate);
            __draft.setUpdateBy(updateBy);
            __draft.setUpdateDate(updateDate);
            __draft.setRemarks(remarks);
            __draft.setDictName(dictName);
            __draft.setDictType(dictType);
            __draft.setIsSys(isSys);
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
        hash = hash * 31 + Objects.hashCode(dictName);
        hash = hash * 31 + Objects.hashCode(dictType);
        hash = hash * 31 + Objects.hashCode(isSys);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        DictTypeListView other = (DictTypeListView) o;
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
        if (!Objects.equals(dictName, other.dictName)) {
            return false;
        }
        if (!Objects.equals(dictType, other.dictType)) {
            return false;
        }
        if (!Objects.equals(isSys, other.isSys)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DictTypeListView").append('(');
        builder.append("id=").append(id);
        builder.append(", status=").append(status);
        builder.append(", createBy=").append(createBy);
        builder.append(", createDate=").append(createDate);
        builder.append(", updateBy=").append(updateBy);
        builder.append(", updateDate=").append(updateDate);
        builder.append(", remarks=").append(remarks);
        builder.append(", dictName=").append(dictName);
        builder.append(", dictType=").append(dictType);
        builder.append(", isSys=").append(isSys);
        builder.append(')');
        return builder.toString();
    }
}
