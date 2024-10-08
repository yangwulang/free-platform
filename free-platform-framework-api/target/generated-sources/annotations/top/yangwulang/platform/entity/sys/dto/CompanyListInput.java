package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Company;
import top.yangwulang.platform.entity.sys.CompanyDraft;
import top.yangwulang.platform.entity.sys.CompanyFetcher;

/**
 * 公司
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Company.dto"
)
@Schema(
        description = "公司实体"
)
public class CompanyListInput implements Input<Company> {
    public static final DtoMetadata<Company, CompanyListInput> METADATA = 
        new DtoMetadata<Company, CompanyListInput>(
            CompanyFetcher.$
                .companyName(),
            CompanyListInput::new
    );

    private static final DtoPropAccessor COMPANY_NAME_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { CompanyDraft.Producer.SLOT_COMPANY_NAME }
    );

    private String companyName;

    public CompanyListInput() {
    }

    public CompanyListInput(@NotNull Company base) {
        this.companyName = COMPANY_NAME_ACCESSOR.get(base);
    }

    /**
     * 公司名称
     */
    @Nullable
    @Schema(
            description = "公司名称"
    )
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(@Nullable String companyName) {
        this.companyName = companyName;
    }

    @Override
    public Company toEntity() {
        return CompanyDraft.$.produce(__draft -> {
            COMPANY_NAME_ACCESSOR.set(__draft, companyName);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(companyName);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        CompanyListInput other = (CompanyListInput) o;
        if (!Objects.equals(companyName, other.companyName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CompanyListInput").append('(');
        builder.append("companyName=").append(companyName);
        builder.append(')');
        return builder.toString();
    }
}
