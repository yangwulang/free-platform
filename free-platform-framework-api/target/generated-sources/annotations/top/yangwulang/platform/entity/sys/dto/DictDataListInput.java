package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
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
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataDraft;
import top.yangwulang.platform.entity.sys.DictDataFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/DictData.dto"
)
public class DictDataListInput implements ViewableInput<DictData> {
    public static final ViewMetadata<DictData, DictDataListInput> METADATA = 
        new ViewMetadata<DictData, DictDataListInput>(
            DictDataFetcher.$
                .dictTypeId()
                .dictLabel()
                .dictValue()
                .description(),
            DictDataListInput::new
    );

    @Schema(
            description = "字典类型id"
    )
    @Null
    private String dictTypeId;

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
            description = "字典描述"
    )
    @Null
    private String description;

    public DictDataListInput() {
    }

    public DictDataListInput(@NotNull DictData base) {
        this.dictTypeId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DICT_TYPE_ID)) ? base.dictTypeId() : null;
        this.dictLabel = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DICT_LABEL)) ? base.dictLabel() : null;
        this.dictValue = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DICT_VALUE)) ? base.dictValue() : null;
        this.description = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DESCRIPTION)) ? base.description() : null;
    }

    public static DictDataListInput of(@NotNull DictData base) {
        return new DictDataListInput(base);
    }

    @Nullable
    public String getDictTypeId() {
        return dictTypeId;
    }

    public void setDictTypeId(@Nullable String dictTypeId) {
        this.dictTypeId = dictTypeId;
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
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }

    @Override
    public DictData toEntity() {
        return DictDataDraft.$.produce(__draft -> {
            __draft.setDictTypeId(dictTypeId);
            __draft.setDictLabel(dictLabel);
            __draft.setDictValue(dictValue);
            __draft.setDescription(description);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(dictTypeId);
        hash = hash * 31 + Objects.hashCode(dictLabel);
        hash = hash * 31 + Objects.hashCode(dictValue);
        hash = hash * 31 + Objects.hashCode(description);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        DictDataListInput other = (DictDataListInput) o;
        if (!Objects.equals(dictTypeId, other.dictTypeId)) {
            return false;
        }
        if (!Objects.equals(dictLabel, other.dictLabel)) {
            return false;
        }
        if (!Objects.equals(dictValue, other.dictValue)) {
            return false;
        }
        if (!Objects.equals(description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DictDataListInput").append('(');
        builder.append("dictTypeId=").append(dictTypeId);
        builder.append(", dictLabel=").append(dictLabel);
        builder.append(", dictValue=").append(dictValue);
        builder.append(", description=").append(description);
        builder.append(')');
        return builder.toString();
    }
}
