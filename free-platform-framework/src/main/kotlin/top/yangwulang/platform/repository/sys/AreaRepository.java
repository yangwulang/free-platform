package top.yangwulang.platform.repository.sys;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.Area;

/**
 * @author yangwulang
 */
@Repository
public interface AreaRepository extends JRepository<Area, String> {

}
