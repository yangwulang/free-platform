package top.yangwulang.platform.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * @author 10214
 */
@ConfigurationProperties("spring.datasource")
public class DynamicDataSourceProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private List<String> dataSourceNames;
    private Map<String, String> properties;
    private Boolean distributed = false;
    private String dbType;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getDataSourceNames() {
        return dataSourceNames;
    }

    public void setDataSourceNames(List<String> dataSourceNames) {
        this.dataSourceNames = dataSourceNames;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public Boolean getDistributed() {
        return distributed;
    }

    public void setDistributed(Boolean distributed) {
        this.distributed = distributed;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }
}
