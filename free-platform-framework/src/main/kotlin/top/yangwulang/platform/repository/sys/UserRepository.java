package top.yangwulang.platform.repository.sys;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserTable;
import top.yangwulang.platform.entity.sys.input.UserInput;


/**
 * @author yangwulang
 */
@Repository
public interface UserRepository extends JRepository<User, String> {
    UserTable TABLE = UserTable.$;

    /**
     * 查询列表页数据
     *
     * @param pageable 分页数据
     * @param fetcher  f对象
     * @param user     入参对象
     * @return 分页数据
     */
    default Page<User> findAll(Pageable pageable, Fetcher<User> fetcher, UserInput user) {
        return pager(pageable.getPageNumber(), pageable.getPageSize()).execute(
                sql().createQuery(TABLE)
                        .whereIf(
                                user.getUserName() != null && !user.getUserName().isEmpty(),
                                TABLE.userName().ilike(user.getUserName())
                        )
                        .select(TABLE.fetch(fetcher))
        );
    }
}
