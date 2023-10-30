package top.yangwulang.platform.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.yangwulang.platform.entity.sys.Config;
import top.yangwulang.platform.repository.sys.ConfigRepository;
import top.yangwulang.platform.services.ConfigService;

/**
 * @author yangwulang
 */
@Service
@Transactional(rollbackFor = {Throwable.class})
public class ConfigServiceImpl extends BaseServiceImpl<Config, String, ConfigRepository> implements ConfigService {
    public ConfigServiceImpl(@Autowired ConfigRepository repository) {
        super(repository);
    }

    @Override
    public Config findByKey(String key) {
        return repository.findByConfigKey(key);
    }
}
