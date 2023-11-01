package top.yangwulang.platform.entity.sys.dto;

import java.lang.Override;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.Input;
import top.yangwulang.platform.entity.sys.Company;
import top.yangwulang.platform.entity.sys.CompanyDraft;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Company.dto"
)
@Data
public class CompanySaveInput implements Input<Company> {
    public CompanySaveInput() {
    }

    @Override
    public Company toEntity() {
        return CompanyDraft.$.produce(draft -> {
        });
    }
}
