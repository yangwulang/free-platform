package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(
        description = "公司实体"
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

    private String id;

    private String companyCode;

    private String companyName;

    private String companyFullName;

    private String corpCode;

    private String corpName;

    private String parentId;

    public CompanyGetView() {
    }

    public CompanyGetView(@NotNull Company base) {
        this.id = base.id();
        this.companyCode = base.companyCode();
        this.companyName = base.companyName();
        this.companyFullName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_COMPANY_FULL_NAME)) ? base.companyFullName() : null;
        this.corpCode = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_CORP_CODE)) ? base.corpCode() : null;
        this.corpName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_CORP_NAME)) ? base.corpName() : null;
        this.parentId = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_PARENT_ID)) ? base.parentId() : null;
    }

    /**
     * 字典类型编码
     * @return 主键值
     */
    @NotNull
    public String getId() {
        if (id == null) {
            throw new IllegalStateException("The property \"id\" is not specified");
        }
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
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
