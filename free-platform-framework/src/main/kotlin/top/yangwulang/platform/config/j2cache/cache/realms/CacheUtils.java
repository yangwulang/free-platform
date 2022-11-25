package top.yangwulang.platform.config.j2cache.cache.realms;
/*

import cn.hutool.extra.spring.SpringUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.yangwulang.platform.config.j2cache.cache.J2CacheProperties;
import top.yangwulang.platform.config.j2cache.cache.realms.core.Cache;
import top.yangwulang.platform.config.j2cache.cache.realms.core.CacheManager;

import java.util.HashSet;
import java.util.Set;

*/
/**
 * @author yangwulang
 *//*

public class CacheUtils {
    private static final Logger logger = LoggerFactory.getLogger(CacheUtils.class);

    public static Set<String> getCacheNames() {
        return getManager().cacheNames();
    }

    public static void clearCache(String cacheName) {
        try {
            getCache(cacheName).clear();
            logger.info("clear: {}", cacheName);
        } catch (Exception e) {
            logger.error("缓存异常", e);
        }
    }

    public static void removeByKeyPrefix(String cacheName, String... keyPrefixes) {
        try {
            if (keyPrefixes != null) {
                Set<String> set = new HashSet<>();
                Cache<String, Object> cache = getCache(cacheName);
                Set<String> keys = cache.keys();
                for (String key : keys) {
                    for (String keyPrefix : keyPrefixes) {
                        if (!StringUtils.isBlank(keyPrefix) && StringUtils.startsWith(key, keyPrefix)) {
                            cache.remove(key);
                            set.add(key);
                        }
                    }
                }
                logger.info("removeByKeyPrefix: {} => {}", cacheName, set);
            }
        } catch (Exception e) {
            logger.error("缓存异常", e);
        }
    }

    public static <V> V get(String cacheName, String key, V defaultValue) {
        V a = get(cacheName, key);
        return a != null ? a : defaultValue;
    }

    public static <V> V get(String cacheName, String key) {
        try {
            Cache<String, V> cache = getCache(cacheName);
            return StringUtils.isBlank(key) ? null : cache.get(key);
        } catch (Exception e) {
            logger.error("缓存异常", e);
            return null;
        }
    }

    public static void remove(String cacheName, String key) {
        if (!StringUtils.isBlank(key)) {
            try {
                getCache(cacheName).remove(key);
            } catch (Exception e) {
                logger.error("缓存异常", e);
            }
        }
    }

    public static <V> void put(String cacheName, String key, V value) {
        if (!StringUtils.isBlank(key) && value != null) {
            try {
                getCache(cacheName).put(key, value);
            } catch (Exception e) {
                logger.error("缓存异常", e);
            }
        }
    }

    public static <V> void put(String cacheName, String key, V value, long timeOut) {
        if (!StringUtils.isBlank(key) && value != null) {
            try {
                getCache(cacheName).put(key, value, timeOut);
            } catch (Exception e) {
                logger.error("缓存异常", e);
            }
        }
    }

    public static <K, V> Cache<K, V> getCache(String cacheName) {
        Cache<K, V> cache = null;
        try {
            cache = getManager().getCache(cacheName);
        } catch (Exception e) {
            logger.error("获取缓存异常", e);
        }
        if (cache != null) {
            return cache;
        } else {
            throw new RuntimeException("当前系统中没有定义“" + cacheName + "”这个缓存。");
        }
    }


    public static void clearCache() {
        J2CacheProperties bean = SpringUtil.getBean(J2CacheProperties.class);
        String config = bean.getClearNames();
        if (!StringUtils.isBlank(config)) {
            String[] split = config.split(",");
            for (String s : split) {
                removeCache(s);
            }
        }
    }

    public static void removeCache(String cacheName) {

    }

    public static CacheManager getManager() {
        return SpringUtil.getBean(CacheManager.class);
    }
}
*/
