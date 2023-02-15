package top.yangwulang.platform.repository.sys;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.Menu;

/**
 * @author yangwulang
 */
@Repository
public interface MenuRepository extends JRepository<Menu, String> {
}
