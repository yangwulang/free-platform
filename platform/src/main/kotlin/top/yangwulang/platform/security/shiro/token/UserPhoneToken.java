package top.yangwulang.platform.security.shiro.token;

import org.apache.shiro.authc.HostAuthenticationToken;
import org.apache.shiro.authc.RememberMeAuthenticationToken;

public class UserPhoneToken implements HostAuthenticationToken, RememberMeAuthenticationToken {
    private final String userPhone;

    private final String host;

    private final boolean isRememberMe;

    public UserPhoneToken(String userPhone) {
        this(userPhone, null, false);
    }

    public UserPhoneToken(String userPhone, boolean isRememberMe) {
        this(userPhone, null, isRememberMe);
    }

    public UserPhoneToken(String userPhone, String host, boolean isRememberMe) {
        this.userPhone = userPhone;
        this.host = host;
        this.isRememberMe = isRememberMe;
    }

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public boolean isRememberMe() {
        return isRememberMe;
    }

    @Override
    public Object getPrincipal() {
        return userPhone;
    }

    @Override
    public Object getCredentials() {
        return userPhone;
    }
}
