package top.yangwulang.platform.utils;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.RefreshPolicy;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.template.QuickConfig;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

/**
 * @author yangwulang
 */
public class UserUtils {

    private static Cache<String, Object> Login_User_Cache;

    public static Cache<String, Object> loginUserCache() {
        if (Login_User_Cache == null) {
            QuickConfig qc = QuickConfig.newBuilder("sysArea", "loginCache")
                    .cacheType(CacheType.LOCAL)
                    .refreshPolicy(RefreshPolicy.newPolicy(10, TimeUnit.SECONDS))
                    .localExpire(Duration.ofSeconds(30))
                    .penetrationProtect(true)
                    .build();
            Login_User_Cache = CacheUtils.getCacheManager().getOrCreateCache(qc);
        }
        return Login_User_Cache;
    }

}
