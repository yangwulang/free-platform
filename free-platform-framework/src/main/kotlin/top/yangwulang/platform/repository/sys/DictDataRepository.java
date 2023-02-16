package top.yangwulang.platform.repository.sys;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataTable;
import top.yangwulang.platform.entity.sys.input.DictDataInput;

/**
 * @author yangwulang
 */
@Repository
public interface DictDataRepository extends JRepository<DictData, String> {
    DictDataTable TABLE = DictDataTable.$;

    default Page<DictData> findAll(Pageable pageable, Fetcher<DictData> fetcher, DictDataInput dictDataInput) {
        return pager(pageable).execute(
                sql().createQuery(TABLE)
                        .select(TABLE.fetch(fetcher))
        );
    }

}
