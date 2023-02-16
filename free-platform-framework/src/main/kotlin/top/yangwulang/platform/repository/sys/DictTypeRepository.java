package top.yangwulang.platform.repository.sys;


import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.entity.sys.DictTypeTable;
import top.yangwulang.platform.entity.sys.input.DictTypeInput;

/**
 * @author yangwulang
 */
@Repository
public interface DictTypeRepository extends JRepository<DictType, String> {
    DictTypeTable TABLE = DictTypeTable.$;

    /**
     * 查询列表页数据
     *
     * @param pageable      分页数据
     * @param fetcher       f对象
     * @param dictTypeInput 入参对象
     * @return 分页数据
     */
    default Page<DictType> findAll(Pageable pageable, Fetcher<DictType> fetcher, DictTypeInput dictTypeInput) {
        return pager(pageable)
                .execute(
                        sql().createQuery(TABLE)
                                .whereIf(!ObjectUtils.isEmpty(dictTypeInput.getDictType()), TABLE.dictType().like(dictTypeInput.getDictType()))
                                .whereIf(!ObjectUtils.isEmpty(dictTypeInput.getDictName()), TABLE.dictName().like(dictTypeInput.getDictName()))
                                .select(TABLE.fetch(fetcher))
                );
    }
}
