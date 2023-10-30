package top.yangwulang.platform.utils;

import cn.dev33.satoken.stp.StpUtil;
import com.alicp.jetcache.Cache;
import com.alicp.jetcache.RefreshPolicy;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.template.QuickConfig;
import top.yangwulang.platform.entity.sys.User;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**
 * @author yangwulang
 */
public class UserUtils {

    private static Cache<String, Object> Login_User_Cache;
    /**
     * 数字正则规则
     */
    public static final Pattern NUMBER_PATTERN = Pattern.compile(".*[0-9].*");
    /**
     * 字符正则规则
     */
    public static final Pattern LOW_CHAR_PATTERN = Pattern.compile(".*[a-z].*");

    public static final Pattern UP_CHAR_PATTERN = Pattern.compile(".*[A-z].*");

    public static Cache<String, Object> loginUserCache() {
        if (Login_User_Cache == null) {
            QuickConfig qc = QuickConfig.newBuilder("sysArea", "loginCache")
                    .cacheType(CacheType.BOTH)
                    .refreshPolicy(RefreshPolicy.newPolicy(10, TimeUnit.SECONDS))
                    .localExpire(Duration.ofSeconds(30))
                    .penetrationProtect(true)
                    .build();
            Login_User_Cache = CacheUtils.getCacheManager().getOrCreateCache(qc);
        }
        return Login_User_Cache;
    }

    /**
     * 获取当前登陆的用户
     *
     * @return 登陆的用户
     */
    public static User getCurrentUser() {
        try (Cache<String, Object> cache = UserUtils.loginUserCache()) {
            String loginId = (String) StpUtil.getTokenInfo().getLoginId();
            return (User) cache.get(loginId);
        }
    }


    /**
     * 获取密码等级,如果其中包含数字，则等级+1,包含格式化的英文字母，等级+1,包含大写英文字母,等级+1
     *
     * @param password 密码
     * @return 等级, 如果password为null或者传入空字符串为-1
     */
    public static int getPasswordLevel(String password) {
        if (password != null && !password.isEmpty()) {
            int level = 0;
            if (NUMBER_PATTERN.matcher(password).find()) {
                level += 1;
            }
            if (LOW_CHAR_PATTERN.matcher(password).find()) {
                level += 1;
            }
            if (UP_CHAR_PATTERN.matcher(password).find()) {
                level += 1;
            }
            return level;
        } else {
            return -1;
        }
    }

}
