package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.validation.constraints.NotEmpty;
import org.babyfish.jimmer.Input;
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
public class DictSaveInput implements Input<DictType> {
    public static final ViewMetadata<DictType, DictSaveInput> METADATA = 
        new ViewMetadata<DictType, DictSaveInput>(
            DictTypeFetcher.$
                .dictType()
                .dictName()
                .isSys()
                .remarks(),
            DictSaveInput::new
    );

    @Schema(
            description = "字典类型标签"
    )
    @NotEmpty(
            message = "字典类型不能为空"
    )
    @NotNull
    private String dictType;

    @Schema(
            description = "字典名称"
    )
    @NotEmpty(
            message = "字典名称不能为空"
    )
    @NotNull
    private String dictName;

    @Schema(
            description = "是否系统自带"
    )
    @Nullable
    private Boolean isSys;

    @Nullable
    private String remarks;

    public DictSaveInput() {
    }

    public DictSaveInput(@NotNull DictType base) {
        this.dictType = base.dictType();
        this.dictName = base.dictName();
        this.isSys = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_IS_SYS)) ? base.isSys() : null;
        this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
    }

    public static DictSaveInput of(@NotNull DictType base) {
        return new DictSaveInput(base);
    }

    @NotNull
    @Schema(
            description = "字典类型标签"
    )
    @NotEmpty(
            message = "字典类型不能为空"
    )
    public String getDictType() {
        return dictType;
    }

    public void setDictType(@NotNull String dictType) {
        this.dictType = dictType;
    }

    @NotNull
    @Schema(
            description = "字典名称"
    )
    @NotEmpty(
            message = "字典名称不能为空"
    )
    public String getDictName() {
        return dictName;
    }

    public void setDictName(@NotNull String dictName) {
        this.dictName = dictName;
    }

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

    @Nullable
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(@Nullable String remarks) {
        this.remarks = remarks;
    }

    @Override
    public DictType toEntity() {
        return DictTypeDraft.$.produce(__draft -> {
            __draft.setDictType(dictType);
            __draft.setDictName(dictName);
            __draft.setIsSys(isSys);
            __draft.setRemarks(remarks);
        });
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
        DictSaveInput other = (DictSaveInput) o;
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
        builder.append("DictSaveInput").append('(');
        builder.append("dictType=").append(dictType);
        builder.append(", dictName=").append(dictName);
        builder.append(", isSys=").append(isSys);
        builder.append(", remarks=").append(remarks);
        builder.append(')');
        return builder.toString();
    }
}
