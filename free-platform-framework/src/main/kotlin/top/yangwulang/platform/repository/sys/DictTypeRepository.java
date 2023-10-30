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
}
