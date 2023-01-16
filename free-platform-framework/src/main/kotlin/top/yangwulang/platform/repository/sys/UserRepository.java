package top.yangwulang.platform.repository.sys;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.User;


/**
 * @author yangwulang
 */
@Component
public interface UserRepository extends JRepository<User, String> {
}
