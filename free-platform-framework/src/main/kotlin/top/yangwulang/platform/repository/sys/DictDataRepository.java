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


}
