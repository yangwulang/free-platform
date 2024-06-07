package top.yangwulang.platform.entity.sys.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.FixedInputField;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Company;
import top.yangwulang.platform.entity.sys.CompanyDraft;
import top.yangwulang.platform.entity.sys.CompanyFetcher;

/**
 *  公司
 *  @author yangwulang
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Company.dto"
)
@JsonDeserialize(
        builder = CompanySaveInput.Builder.class
)
@Schema(
        description = "公司实体"
)
public class CompanySaveInput implements Input<Company> {
    public static final ViewMetadata<Company, CompanySaveInput> METADATA = 
        new ViewMetadata<Company, CompanySaveInput>(
            CompanyFetcher.$
                .companyCode()
                .companyName()
                .companyFullName()
                .corpCode()
                .corpName()
                .parentId(),
            CompanySaveInput::new
    );

    private static final DtoPropAccessor ID_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { CompanyDraft.Producer.SLOT_ID }
    );

    @FixedInputField
    private String companyCode;

    @FixedInputField
    private String companyName;

    private String companyFullName;

    private String corpCode;

    private String corpName;

    private String parentId;

    private String id;

    public CompanySaveInput() {
    }

    public CompanySaveInput(@NotNull Company base) {
        this.companyCode = base.companyCode();
        this.companyName = base.companyName();
        this.companyFullName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_COMPANY_FULL_NAME)) ? base.companyFullName() : null;
        this.corpCode = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_CORP_CODE)) ? base.corpCode() : null;
        this.corpName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_CORP_NAME)) ? base.corpName() : null;
        this.parentId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_PARENT_ID)) ? base.parentId() : null;
        this.id = ID_ACCESSOR.get(base);
    }

    /**
     * 公司编码
     */
    @NotNull
    @Schema(
            description = "公司编码"
    )
    public String getCompanyCode() {
        if (companyCode == null) {
            throw new IllegalStateException("The property \"companyCode\" is not specified");
        }
        return companyCode;
    }

    public void setCompanyCode(@NotNull String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * 公司名称
     */
    @NotNull
    @Schema(
            description = "公司名称"
    )
    public String getCompanyName() {
        if (companyName == null) {
            throw new IllegalStateException("The property \"companyName\" is not specified");
        }
        return companyName;
    }

    public void setCompanyName(@NotNull String companyName) {
        this.companyName = companyName;
    }

    /**
     * 公司全名
     */
    @Nullable
    @Schema(
            description = "公司全名"
    )
    public String getCompanyFullName() {
        return companyFullName;
    }

    public void setCompanyFullName(@Nullable String companyFullName) {
        this.companyFullName = companyFullName;
    }

    @Nullable
    public String getCorpCode() {
        return corpCode;
    }

    public void setCorpCode(@Nullable String corpCode) {
        this.corpCode = corpCode;
    }

    @Nullable
    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(@Nullable String corpName) {
        this.corpName = corpName;
    }

    /**
     * 父级编号
     */
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

    @Override
    public Company toEntity() {
        return CompanyDraft.$.produce(__draft -> {
            __draft.setCompanyCode(companyCode);
            __draft.setCompanyName(companyName);
            __draft.setCompanyFullName(companyFullName);
            __draft.setCorpCode(corpCode);
            __draft.setCorpName(corpName);
            __draft.setParentId(parentId);
            ID_ACCESSOR.set(__draft, id);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(companyCode);
        hash = hash * 31 + Objects.hashCode(companyName);
        hash = hash * 31 + Objects.hashCode(companyFullName);
        hash = hash * 31 + Objects.hashCode(corpCode);
        hash = hash * 31 + Objects.hashCode(corpName);
        hash = hash * 31 + Objects.hashCode(parentId);
        hash = hash * 31 + Objects.hashCode(id);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        CompanySaveInput other = (CompanySaveInput) o;
        if (!Objects.equals(companyCode, other.companyCode)) {
            return false;
        }
        if (!Objects.equals(companyName, other.companyName)) {
            return false;
        }
        if (!Objects.equals(companyFullName, other.companyFullName)) {
            return false;
        }
        if (!Objects.equals(corpCode, other.corpCode)) {
            return false;
        }
        if (!Objects.equals(corpName, other.corpName)) {
            return false;
        }
        if (!Objects.equals(parentId, other.parentId)) {
            return false;
        }
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CompanySaveInput").append('(');
        builder.append("companyCode=").append(companyCode);
        builder.append(", companyName=").append(companyName);
        builder.append(", companyFullName=").append(companyFullName);
        builder.append(", corpCode=").append(corpCode);
        builder.append(", corpName=").append(corpName);
        builder.append(", parentId=").append(parentId);
        builder.append(", id=").append(id);
        builder.append(')');
        return builder.toString();
    }

    @JsonPOJOBuilder(
            withPrefix = ""
    )
    public static class Builder {
        private String companyCode;

        private String companyName;

        private String companyFullName;

        private String corpCode;

        private String corpName;

        private String parentId;

        private String id;

        public Builder companyCode(String companyCode) {
            this.companyCode = Objects.requireNonNull(companyCode, "The property \"companyCode\" cannot be null");
            return this;
        }

        public Builder companyName(String companyName) {
            this.companyName = Objects.requireNonNull(companyName, "The property \"companyName\" cannot be null");
            return this;
        }

        public Builder companyFullName(String companyFullName) {
            this.companyFullName = companyFullName;
            return this;
        }

        public Builder corpCode(String corpCode) {
            this.corpCode = corpCode;
            return this;
        }

        public Builder corpName(String corpName) {
            this.corpName = corpName;
            return this;
        }

        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public CompanySaveInput build() {
            CompanySaveInput _input = new CompanySaveInput();
            if (companyCode == null) {
                throw Input.unknownNonNullProperty(CompanySaveInput.class, "companyCode");
            }
            _input.setCompanyCode(companyCode);
            if (companyName == null) {
                throw Input.unknownNonNullProperty(CompanySaveInput.class, "companyName");
            }
            _input.setCompanyName(companyName);
            _input.setCompanyFullName(companyFullName);
            _input.setCorpCode(corpCode);
            _input.setCorpName(corpName);
            _input.setParentId(parentId);
            _input.setId(id);
            return _input;
        }
    }
}
