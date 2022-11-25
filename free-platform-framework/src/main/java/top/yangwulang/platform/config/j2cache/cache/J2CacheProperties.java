package top.yangwulang.platform.config.j2cache.cache;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author yangwulang
 */
@ConfigurationProperties(
        prefix = "spring.cache"
)
public class J2CacheProperties {
    private boolean isClusterMode;
    private String clearNames;

    public boolean isClusterMode() {
        return isClusterMode;
    }

    public void setClusterMode(boolean clusterMode) {
        isClusterMode = clusterMode;
    }

    public String getClearNames() {
        return clearNames;
    }

    public void setClearNames(String clearNames) {
        this.clearNames = clearNames;
    }
}
