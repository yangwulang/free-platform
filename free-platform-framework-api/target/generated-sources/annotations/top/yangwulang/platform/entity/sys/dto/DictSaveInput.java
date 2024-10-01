package top.yangwulang.platform.entity.sys.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.internal.FixedInputField;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.entity.sys.DictTypeDraft;
import top.yangwulang.platform.entity.sys.DictTypeFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/DictType.dto"
)
@JsonDeserialize(
        builder = DictSaveInput.Builder.class
)
@Schema(
        description = "字典类型标签"
)
public class DictSaveInput implements Input<DictType> {
    public static final DtoMetadata<DictType, DictSaveInput> METADATA = 
        new DtoMetadata<DictType, DictSaveInput>(
            DictTypeFetcher.$
                .dictType()
                .dictName()
                .isSys()
                .remarks(),
            DictSaveInput::new
    );

    @FixedInputField
    @NotEmpty(
            message = "字典类型不能为空"
    )
    private String dictType;

    @NotEmpty(
            message = "字典名称不能为空"
    )
    private String dictName;

    private Boolean isSys;

    private String remarks;

    public DictSaveInput() {
    }

    public DictSaveInput(@NotNull DictType base) {
        this.dictType = base.dictType();
        this.dictName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_DICT_NAME)) ? base.dictName() : null;
        this.isSys = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_IS_SYS)) ? base.isSys() : null;
        this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
    }

    @NotNull
    @Schema(
            description = "字典类型标签"
    )
    @NotEmpty(
            message = "字典类型不能为空"
    )
    public String getDictType() {
        if (dictType == null) {
            throw new IllegalStateException("The property \"dictType\" is not specified");
        }
        return dictType;
    }

    public void setDictType(@NotNull String dictType) {
        this.dictType = dictType;
    }

    @Nullable
    @Schema(
            description = "字典名称"
    )
    @NotEmpty(
            message = "字典名称不能为空"
    )
    public String getDictName() {
        return dictName;
    }

    public void setDictName(@Nullable String dictName) {
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

    @JsonPOJOBuilder(
            withPrefix = ""
    )
    public static class Builder {
        private String dictType;

        private String dictName;

        private Boolean isSys;

        private String remarks;

        public Builder dictType(String dictType) {
            this.dictType = Objects.requireNonNull(dictType, "The property \"dictType\" cannot be null");
            return this;
        }

        public Builder dictName(String dictName) {
            this.dictName = dictName;
            return this;
        }

        public Builder isSys(Boolean isSys) {
            this.isSys = isSys;
            return this;
        }

        public Builder remarks(String remarks) {
            this.remarks = remarks;
            return this;
        }

        public DictSaveInput build() {
            DictSaveInput _input = new DictSaveInput();
            if (dictType == null) {
                throw Input.unknownNonNullProperty(DictSaveInput.class, "dictType");
            }
            _input.setDictType(dictType);
            _input.setDictName(dictName);
            _input.setIsSys(isSys);
            _input.setRemarks(remarks);
            return _input;
        }
    }
}
