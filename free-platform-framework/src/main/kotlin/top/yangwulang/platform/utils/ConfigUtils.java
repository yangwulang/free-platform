package top.yangwulang.platform.utils;

import cn.hutool.extra.spring.SpringUtil;
import com.alicp.jetcache.Cache;
import com.alicp.jetcache.RefreshPolicy;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.template.QuickConfig;
import top.yangwulang.platform.entity.sys.Config;
import top.yangwulang.platform.entity.sys.ConfigDraft;
import top.yangwulang.platform.entity.sys.ConfigFetcher;
import top.yangwulang.platform.services.ConfigService;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @author yangwulang
 */
public class ConfigUtils {
    private static final Cache<String, Config> CONFIG_CACHE = CacheUtils.getCacheManager()
            .getOrCreateCache(
                    QuickConfig.newBuilder("sysArea", "configCache")
                            .cacheType(CacheType.BOTH)
                            .refreshPolicy(RefreshPolicy.newPolicy(10, TimeUnit.SECONDS))
                            .build()
            );

    /**
     * 初始化缓存
     */
    public static void initCache() {
        Static.CONFIG_SERVICE
                .findAll(ConfigFetcher.$.allScalarFields())
                .forEach(c -> CONFIG_CACHE.put(c.configKey(), c));
    }


    private static class Static {
        private static final ConfigService CONFIG_SERVICE = SpringUtil.getBean(ConfigService.class);
    }

    /**
     * 通过key获取配置对象
     *
     * @param key key
     * @return 配置对象，此对象可能为null
     */
    public static Config getConfig(String key) {
        Config cacheConfig = CONFIG_CACHE.get(key);
        if (cacheConfig == null) {
            Config byKey = Static.CONFIG_SERVICE.findByKey(key);
            CONFIG_CACHE.put(key, byKey);
            return byKey;
        }
        return cacheConfig;
    }

    public static void putConfig(Config config) {
        CONFIG_CACHE.put(config.configKey(), config);
    }

    /**
     * 通过配置key获取配置值
     *
     * @param key 配置的key
     * @return 值，此值可能为null
     */
    public static String getConfigValue(String key) {
        return Optional.ofNullable(getConfig(key))
                .orElse(ConfigDraft.$.produce(b -> b.setConfigValue(null)))
                .configValue();
    }

    /**
     * 通过配置key获取配置值
     *
     * @param key          配置的key
     * @param defaultValue 默认值，如果通过key没有获取到配置，则返回默认值
     * @return 值，此值可能为null
     */
    public static String getConfigValue(String key, String defaultValue) {
        return Optional.ofNullable(getConfig(key))
                .orElse(ConfigDraft.$.produce(b -> b.setConfigValue(defaultValue)))
                .configValue();
    }

    /**
     * 获取boolean类型的配置值
     *
     * @param key 配置key
     * @return 值
     */
    public static boolean getConfigValueBoolean(String key) {
        return Boolean.parseBoolean(getConfigValue(key, "false"));
    }

}
