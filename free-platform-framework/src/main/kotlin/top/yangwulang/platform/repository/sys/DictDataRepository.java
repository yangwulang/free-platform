package top.yangwulang.platform.repository.sys;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.*;
import top.yangwulang.platform.entity.sys.input.DictDataInput;

import java.math.BigDecimal;

/**
 * @author yangwulang
 */
@Repository
public interface DictDataRepository extends JRepository<DictData, String> {
    DictDataTable TABLE = DictDataTable.$;

    DictData ROOT = DictDataDraft.$.produce(m -> {
        m.setId("0");
        m.setTreeSort(BigDecimal.valueOf(0));
        m.setTreeNames("");
        m.setTreeSorts("0");
    });

    default Page<DictData> findAll(Pageable pageable, Fetcher<DictData> fetcher, DictDataInput dictDataInput) {
        return pager(pageable).execute(
                sql().createQuery(TABLE)
                        .select(TABLE.fetch(fetcher))
        );
    }

}
