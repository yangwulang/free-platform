package top.yangwulang.platform.repository.sys;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.*;

/**
 * @author yangwulang
 */
@Repository
public interface DictDataRepository extends JRepository<DictData, String> {


}
