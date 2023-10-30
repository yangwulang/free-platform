package top.yangwulang.platform.entity.sys.dto;

import java.lang.Override;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import top.yangwulang.platform.entity.sys.Company;
import top.yangwulang.platform.entity.sys.CompanyDraft;
import top.yangwulang.platform.entity.sys.CompanyFetcher;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Company.dto"
)
@Data
public class CompanyListInput implements View<Company> {
    public static final ViewMetadata<Company, CompanyListInput> METADATA = 
        new ViewMetadata<Company, CompanyListInput>(
            CompanyFetcher.$,
            CompanyListInput::new
    );

    public CompanyListInput() {
    }

    public CompanyListInput(@NotNull Company base) {
    }

    public static CompanyListInput of(@NotNull Company base) {
        return new CompanyListInput(base);
    }

    @Override
    public Company toEntity() {
        return CompanyDraft.$.produce(draft -> {
        });
    }
}
