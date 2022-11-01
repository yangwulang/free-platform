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
public class L2CacheManager implements CacheManager {
    private final CacheChannel channel;
    private final CacheProviderHolder cacheProviderHolder;

    public L2CacheManager(CacheChannel channel, CacheProviderHolder cacheProviderHolder) {
        this.channel = channel;
        this.cacheProviderHolder = cacheProviderHolder;
    }

    @Override
    public synchronized <K, V> Cache<K, V> getCache(String cacheName) throws CacheException {
        return new L2Cache<>(cacheName, this.channel, this.cacheProviderHolder);
    }

    @Override
    public void clear(String cacheName) {
        this.channel.clear(cacheName);
        this.channel.removeRegion(cacheName);
    }

    @Override
    public Set<String> cacheNames() {
        return this.channel
                .regions()
                .stream()
                .map(CacheChannel.Region::getName)
                .collect(Collectors.toSet());
    }
}
