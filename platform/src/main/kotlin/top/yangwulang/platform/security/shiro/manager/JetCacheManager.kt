package top.yangwulang.platform.security.shiro.manager

import org.apache.shiro.cache.AbstractCacheManager
import org.apache.shiro.cache.Cache

class JetCacheManager : AbstractCacheManager() {

    override fun createCache(cacheName: String): Cache<*, *> {
        return JetCache(cacheName)
    }
}