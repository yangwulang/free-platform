package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Company;
import top.yangwulang.platform.entity.sys.CompanyDraft;
import top.yangwulang.platform.entity.sys.CompanyFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Company.dto"
)
public class CompanyGetView implements View<Company> {
    public static final ViewMetadata<Company, CompanyGetView> METADATA = 
        new ViewMetadata<Company, CompanyGetView>(
            CompanyFetcher.$
                .companyCode()
                .companyName()
                .companyFullName()
                .corpCode()
                .corpName()
                .parentId(),
            CompanyGetView::new
    );

    @NotNull
    private String id;

    @Schema(
            description = "公司编码"
    )
    @org.jetbrains.annotations.NotNull
    private String companyCode;

    @Schema(
            description = "公司名称"
    )
    @org.jetbrains.annotations.NotNull
    private String companyName;

    @Schema(
            description = "公司全名"
    )
    @Null
    private String companyFullName;

    @Null
    private String corpCode;

    @Null
    private String corpName;

    @Schema(
            description = "父级id"
    )
    @Null
    private String parentId;

    public CompanyGetView() {
    }

    public CompanyGetView(@org.jetbrains.annotations.NotNull Company base) {
        this.id = base.id();
        this.companyCode = base.companyCode();
        this.companyName = base.companyName();
        this.companyFullName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_COMPANY_FULL_NAME)) ? base.companyFullName() : null;
        this.corpCode = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_CORP_CODE)) ? base.corpCode() : null;
        this.corpName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_CORP_NAME)) ? base.corpName() : null;
        this.parentId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_PARENT_ID)) ? base.parentId() : null;
    }

    public static CompanyGetView of(@org.jetbrains.annotations.NotNull Company base) {
        return new CompanyGetView(base);
    }

    @org.jetbrains.annotations.NotNull
    public String getId() {
        return id;
    }

    public void setId(@org.jetbrains.annotations.NotNull String id) {
        this.id = id;
    }

    @org.jetbrains.annotations.NotNull
    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(@org.jetbrains.annotations.NotNull String companyCode) {
        this.companyCode = companyCode;
    }

    @org.jetbrains.annotations.NotNull
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(@org.jetbrains.annotations.NotNull String companyName) {
        this.companyName = companyName;
    }

    @Nullable
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

    @Nullable
    public String getParentId() {
        return parentId;
    }

    public void setParentId(@Nullable String parentId) {
        this.parentId = parentId;
    }

    @Override
    public Company toEntity() {
        return CompanyDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setCompanyCode(companyCode);
            __draft.setCompanyName(companyName);
            __draft.setCompanyFullName(companyFullName);
            __draft.setCorpCode(corpCode);
            __draft.setCorpName(corpName);
            __draft.setParentId(parentId);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(companyCode);
        hash = hash * 31 + Objects.hashCode(companyName);
        hash = hash * 31 + Objects.hashCode(companyFullName);
        hash = hash * 31 + Objects.hashCode(corpCode);
        hash = hash * 31 + Objects.hashCode(corpName);
        hash = hash * 31 + Objects.hashCode(parentId);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        CompanyGetView other = (CompanyGetView) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
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
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CompanyGetView").append('(');
        builder.append("id=").append(id);
        builder.append(", companyCode=").append(companyCode);
        builder.append(", companyName=").append(companyName);
        builder.append(", companyFullName=").append(companyFullName);
        builder.append(", corpCode=").append(corpCode);
        builder.append(", corpName=").append(corpName);
        builder.append(", parentId=").append(parentId);
        builder.append(')');
        return builder.toString();
    }
}
