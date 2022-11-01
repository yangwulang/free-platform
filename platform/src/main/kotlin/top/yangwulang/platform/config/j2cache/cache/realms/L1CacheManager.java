package top.yangwulang.platform.config.j2cache.cache.realms;

import net.oschina.j2cache.CacheChannel;
import net.oschina.j2cache.CacheException;
import net.oschina.j2cache.CacheProviderHolder;
import top.yangwulang.platform.config.j2cache.cache.realms.core.Cache;
import top.yangwulang.platform.config.j2cache.cache.realms.core.CacheManager;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author yangwulang
 */
public class L1CacheManager implements CacheManager {
    private final CacheProviderHolder cacheProviderHolder;
    private final CacheChannel channel;

    public L1CacheManager(CacheProviderHolder cacheProviderHolder, CacheChannel channel) {
        this.cacheProviderHolder = cacheProviderHolder;
        this.channel = channel;
    }

    @Override
    public synchronized  <K, V> Cache<K, V> getCache(String cacheName) throws CacheException {
        return new L1Cache<>(cacheName, this.channel, this.cacheProviderHolder);
    }

    @Override
    public void clear(String cacheName) {
        this.cacheProviderHolder.getLevel1Cache(cacheName).clear();
        this.cacheProviderHolder.getL1Provider().removeCache(cacheName);
    }

    @Override
    public Set<String> cacheNames() {
        return this.cacheProviderHolder
                .getL1Provider()
                .regions()
                .stream()
                .map(CacheChannel.Region::getName)
                .collect(Collectors.toSet());
    }
}
