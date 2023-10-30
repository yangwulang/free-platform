package top.yangwulang.platform.repository.sys;

import org.apache.commons.lang3.StringUtils;
import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.Config;
import top.yangwulang.platform.entity.sys.ConfigTable;

/**
 * @author yangwulang
 */
@Repository
public interface ConfigRepository extends JRepository<Config, String> {

    /**
     * 通过配置key查询配置
     *
     * @param key key
     * @return 配置对象
     */
    Config findByConfigKey(String key);
}
