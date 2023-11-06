package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.ViewableInput;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Company;
import top.yangwulang.platform.entity.sys.CompanyDraft;
import top.yangwulang.platform.entity.sys.CompanyFetcher;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Company.dto"
)
public class CompanyListInput implements ViewableInput<Company> {
    public static final ViewMetadata<Company, CompanyListInput> METADATA = 
        new ViewMetadata<Company, CompanyListInput>(
            CompanyFetcher.$
                .companyName(),
            CompanyListInput::new
    );

    private static final DtoPropAccessor COMPANY_NAME_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { CompanyDraft.Producer.SLOT_COMPANY_NAME }
    );

    @Schema(
            description = "公司名称"
    )
    @Nullable
    private String companyName;

    public CompanyListInput() {
    }

    public CompanyListInput(@NotNull Company base) {
        this.companyName = COMPANY_NAME_ACCESSOR.get(base);
    }

    public static CompanyListInput of(@NotNull Company base) {
        return new CompanyListInput(base);
    }

    @Nullable
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

    public int hashCode() {
        int hash = Objects.hashCode(companyName);
        return hash;
    }

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

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CompanyListInput").append('(');
        builder.append("companyName=").append(companyName);
        builder.append(')');
        return builder.toString();
    }
}
