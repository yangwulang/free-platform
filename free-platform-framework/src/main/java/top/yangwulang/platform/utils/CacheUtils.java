package top.yangwulang.platform.utils;

import cn.hutool.extra.spring.SpringUtil;
import com.alicp.jetcache.Cache;
import com.alicp.jetcache.CacheManager;
import com.alicp.jetcache.template.QuickConfig;

import java.io.Serializable;

/**
 * @author yangwulang
 */
public class CacheUtils {
    private static CacheManager cacheManager;
    private static Cache<String, Object> SYSTEM_CACHE;


    public static CacheManager getCacheManager() {
        if (cacheManager == null) {
            cacheManager = SpringUtil.getBean(CacheManager.class);
        }
        return cacheManager;
    }

    public static Cache<String, Object> sysCache() {
        if (SYSTEM_CACHE == null) {
            QuickConfig qc = QuickConfig.newBuilder("sysArea", "userCache")
                    .penetrationProtect(true)
                    .build();
            SYSTEM_CACHE = getCacheManager().getOrCreateCache(qc);
        }
        return SYSTEM_CACHE;
    }

}
