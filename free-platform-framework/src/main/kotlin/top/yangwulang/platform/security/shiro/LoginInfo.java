package top.yangwulang.platform.security.shiro;

import lombok.Data;
import top.yangwulang.platform.entity.sys.SysUser;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class LoginInfo implements Serializable {
    private String id;
    private String name;
    private Map<String, Object> params;

    public LoginInfo(SysUser sysUser, Map<String, Object> params) {
        this.id = sysUser.getId();
        this.name = sysUser.getUserName();
        this.params = params;
    }

    public Object getParam(String key, Object defaultValue) {
        Object value = this.getParam(key);
        return value != null ? value : defaultValue;
    }

    public Object getParam(String key) {
        Object value;
        return this.params != null && (value = params.get(key)) != null ? value : null;
    }

    public void setParam(String key, Object value) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        this.params.put(key, value);
    }

    public LoginInfo() {
    }
}
