package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import top.yangwulang.platform.entity.sys.Company;
import top.yangwulang.platform.entity.sys.CompanyDraft;
import top.yangwulang.platform.entity.sys.CompanyFetcher;
import top.yangwulang.platform.entity.sys.CompanyProps;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Company.dto"
)
@Data
public class CompanyGetView implements View<Company> {
    public static final ViewMetadata<Company, CompanyGetView> METADATA = 
        new ViewMetadata<Company, CompanyGetView>(
            CompanyFetcher.$
                .companyCode()
                .companyName()
                .companyFullName()
                .corpCode()
                .corpName(),
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

    public CompanyGetView() {
    }

    public CompanyGetView(@org.jetbrains.annotations.NotNull Company base) {
        ImmutableSpi spi = (ImmutableSpi)base;
        this.id = base.id();
        this.companyCode = base.companyCode();
        this.companyName = base.companyName();
        this.companyFullName = spi.__isLoaded(CompanyProps.COMPANY_FULL_NAME.unwrap().getId()) ? base.companyFullName() : null;
        this.corpCode = spi.__isLoaded(CompanyProps.CORP_CODE.unwrap().getId()) ? base.corpCode() : null;
        this.corpName = spi.__isLoaded(CompanyProps.CORP_NAME.unwrap().getId()) ? base.corpName() : null;
    }

    public static CompanyGetView of(@org.jetbrains.annotations.NotNull Company base) {
        return new CompanyGetView(base);
    }

    @Override
    public Company toEntity() {
        return CompanyDraft.$.produce(draft -> {
            draft.setId(id);
            draft.setCompanyCode(companyCode);
            draft.setCompanyName(companyName);
            draft.setCompanyFullName(companyFullName);
            draft.setCorpCode(corpCode);
            draft.setCorpName(corpName);
        });
    }
}
