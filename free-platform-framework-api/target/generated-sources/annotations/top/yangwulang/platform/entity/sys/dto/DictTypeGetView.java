package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
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

/**
 *  字典类型表
 *  @author yangwulang
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/DictType.dto"
)
public class DictTypeGetView implements View<DictType> {
    public static final ViewMetadata<DictType, DictTypeGetView> METADATA = 
        new ViewMetadata<DictType, DictTypeGetView>(
            DictTypeFetcher.$
                .remarks()
                .dictName()
                .dictType()
                .isSys(),
            DictTypeGetView::new
    );

    @NotNull
    private String id;

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

    public DictTypeGetView() {
    }

    public DictTypeGetView(@NotNull DictType base) {
        this.id = base.id();
        this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
        this.dictName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_DICT_NAME)) ? base.dictName() : null;
        this.dictType = base.dictType();
        this.isSys = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_IS_SYS)) ? base.isSys() : null;
    }

    public static DictTypeGetView of(@NotNull DictType base) {
        return new DictTypeGetView(base);
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
     * 字典类型
     *
     * @return 字典类型
     */
    @NotNull
    @Schema(
            description = "字典类型标签"
    )
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
    @Schema(
            description = "是否系统自带"
    )
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
            __draft.setRemarks(remarks);
            __draft.setDictName(dictName);
            __draft.setDictType(dictType);
            __draft.setIsSys(isSys);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
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
        DictTypeGetView other = (DictTypeGetView) o;
        if (!Objects.equals(id, other.id)) {
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
        builder.append("DictTypeGetView").append('(');
        builder.append("id=").append(id);
        builder.append(", remarks=").append(remarks);
        builder.append(", dictName=").append(dictName);
        builder.append(", dictType=").append(dictType);
        builder.append(", isSys=").append(isSys);
        builder.append(')');
        return builder.toString();
    }
}
