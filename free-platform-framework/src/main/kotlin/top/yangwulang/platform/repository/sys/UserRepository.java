package top.yangwulang.platform.repository.sys;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.*;

import javax.validation.constraints.NotNull;


/**
 * @author yangwulang
 */
@Repository
public interface UserRepository extends JRepository<User, String> {
    UserTable TABLE = UserTable.$;

    /**
     * 通过登录编号和密码查询用户信息
     *
     * @param loginCode 登录编码
     * @param password  密码
     * @return 用户信息
     */
    default User findByLoginAndPassword(@NotNull String loginCode, @NotNull String password) {
        return sql().createQuery(TABLE)
                .where(Predicate.and(
                        TABLE.loginCode().eq(loginCode),
                        TABLE.password().eq(password)
                ))
                .select(
                        TABLE.fetch(
                                UserFetcher.$
                                        .allScalarFields()
                                        .password(false)
                        )
                ).fetchOneOrNull();
    }

    boolean existsByLoginCode(String s);

}
