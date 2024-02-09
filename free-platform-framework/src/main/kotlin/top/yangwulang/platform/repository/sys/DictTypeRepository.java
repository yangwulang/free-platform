package top.yangwulang.platform.repository.sys;


import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.DictType;

/**
 * @author yangwulang
 */
@Repository
public interface DictTypeRepository extends JRepository<DictType, String> {
}
