package top.yangwulang.platform.config.j2cache.cache.support.caffeine;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.RemovalCause;
import net.oschina.j2cache.Cache;
import net.oschina.j2cache.CacheChannel.Region;
import net.oschina.j2cache.CacheException;
import net.oschina.j2cache.CacheExpiredListener;
import net.oschina.j2cache.CacheProvider;
import net.oschina.j2cache.caffeine.CaffeineCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author yangwulang
 */
public class CaffeineProvider implements CacheProvider {
    private final ConcurrentHashMap<String, CacheConfig> cacheConfigs = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, CaffeineCache> caches = new ConcurrentHashMap<>();
    private static final Logger log = LoggerFactory.getLogger(CaffeineProvider.class);
    private static final String DEFAULT_REGION = "default";
    private static final String PREFIX_REGION = "region.";

    @Override
    public void stop() {
        this.caches.clear();
        this.cacheConfigs.clear();
    }

    @Override
    public String name() {
        return "caffeine";
    }

    @Override
    public int level() {
        return 1;
    }

    @Override
    public void removeCache(String region) {
        this.caches.remove(region);
    }

    @Override
    public void start(Properties props) {
        Set<String> strings = props.stringPropertyNames();
        for (String string : strings) {
            if (string.startsWith(PREFIX_REGION)) {
                String trim = props.getProperty(string).trim();
                this.putCaffeineEntity(string.substring(PREFIX_REGION.length()), trim);
            }
        }
        String propertiesPath = props.getProperty("properties");
        if (propertiesPath != null && propertiesPath.trim().length() > 0) {
            InputStream inputStream = this.getClass().getResourceAsStream(propertiesPath);
            try {
                if (inputStream == null) {
                    inputStream = this.getClass().getClassLoader().getResourceAsStream(propertiesPath);
                }

                Properties properties = new Properties();
                properties.load(inputStream);

                for (String name : properties.stringPropertyNames()) {
                    String nameValue = properties.getProperty(name).trim();
                    this.putCaffeineEntity(name, nameValue);
                }
            } catch (IOException e) {
                log.error("Failed to load caffeine regions define {}", propertiesPath, e);
            } finally {
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException var15) {
                    var15.printStackTrace();
                }

            }

        }
    }


    private void putCaffeineEntity(String name, String nameValue) {
        CacheConfig cacheConfig = CacheConfig.build(nameValue);
        if (cacheConfig == null) {
            log.warn("Illegal caffeine cache config [{}={}]", name, nameValue);
        } else {
            this.cacheConfigs.put(name, cacheConfig);
        }
    }

    @Override
    public Cache buildCache(String region, CacheExpiredListener listener) {
        return this.caches.computeIfAbsent(region, (a3) -> {
            CacheConfig axxx = this.cacheConfigs.get(region);
            if (axxx == null) {
                axxx = this.cacheConfigs.get(DEFAULT_REGION);
                if (axxx == null) {
                    throw new CacheException("Undefined [default] caffeine cache");
                }

                log.warn("Caffeine cache [{}] not defined, using default.", region);
            }

            return this.buildCache(region, CacheConfig.getSize(axxx), CacheConfig.getExpire(axxx), listener);
        });
    }

    private CaffeineCache buildCache(String region, long size, long expire, CacheExpiredListener cacheExpiredListener) {
        Caffeine<String, Object> var7 = Caffeine.newBuilder().maximumSize(size).removalListener((String key, Object value, RemovalCause cause) -> {
            if (cause != RemovalCause.EXPLICIT && cause != RemovalCause.REPLACED && cause != RemovalCause.SIZE) {
                cacheExpiredListener.notifyElementExpired(region, key);
            }
        });
        if (expire > 0) {
            var7.expireAfterWrite(expire, TimeUnit.SECONDS);
        }
        return new CaffeineCache(var7.build(), size, expire);
    }

    @Override
    public Collection<Region> regions() {
        Collection<Region> collection = new ArrayList<>();
        this.caches.forEach((ax, axx) -> collection.add(new Region(ax, axx.size(), axx.ttl())));
        return collection;
    }


    @Override
    public Cache buildCache(String region, long timeToLiveInSeconds, CacheExpiredListener listener) {
        CaffeineCache caffeineCache = this.caches.computeIfAbsent(region, (a4) -> {
            CacheConfig ax = this.cacheConfigs.get(region);
            if (ax != null && CacheConfig.getExpire(ax) != timeToLiveInSeconds) {
                throw new IllegalArgumentException(String.format("Region [%s] TTL %d not match with %d", region, CacheConfig.getExpire(ax), timeToLiveInSeconds));
            } else if (ax == null && (ax = this.cacheConfigs.get(DEFAULT_REGION)) == null) {
                throw new CacheException(String.format("Undefined caffeine cache region name = %s", region));
            } else {
                log.info("Started caffeine region [{}] with TTL: {}", region, timeToLiveInSeconds);
                return this.buildCache(region, CacheConfig.getSize(ax), timeToLiveInSeconds, listener);
            }
        });
        if (caffeineCache.ttl() != timeToLiveInSeconds) {
            throw new IllegalArgumentException(String.format("Region [%s] TTL %d not match with %d", region, caffeineCache.ttl(), timeToLiveInSeconds));
        } else {
            return caffeineCache;
        }
    }
}