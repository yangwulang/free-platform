package top.yangwulang.platform.services;

import top.yangwulang.platform.entity.sys.Config;
import top.yangwulang.platform.repository.sys.ConfigRepository;

/**
 * @author yangwulang
 */
public interface ConfigService extends BaseService<Config, String, ConfigRepository> {
    /**
     * 通过key查询config
     *
     * @param key key
     * @return 配置
     */
    Config findByKey(String key);
}
