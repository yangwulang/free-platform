package top.yangwulang.platform.entity.sys;

import java.lang.Override;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

public class UserFetcher extends AbstractTypedFetcher<User, UserFetcher> {
    public static final UserFetcher $ = new UserFetcher(null);

    private UserFetcher(FetcherImpl<User> base) {
        super(User.class, base);
    }

    private UserFetcher(UserFetcher prev, ImmutableProp prop, boolean negative) {
        super(prev, prop, negative);
    }

    private UserFetcher(UserFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static UserFetcher $from(Fetcher<User> base) {
        return base instanceof UserFetcher ? 
        	(UserFetcher)base : 
        	new UserFetcher((FetcherImpl<User>)base);
    }

    @NewChain
    public UserFetcher loginCode() {
        return add("loginCode");
    }

    @NewChain
    public UserFetcher loginCode(boolean enabled) {
        return enabled ? add("loginCode") : remove("loginCode");
    }

    @NewChain
    public UserFetcher userName() {
        return add("userName");
    }

    @NewChain
    public UserFetcher userName(boolean enabled) {
        return enabled ? add("userName") : remove("userName");
    }

    @NewChain
    public UserFetcher password() {
        return add("password");
    }

    @NewChain
    public UserFetcher password(boolean enabled) {
        return enabled ? add("password") : remove("password");
    }

    @NewChain
    public UserFetcher email() {
        return add("email");
    }

    @NewChain
    public UserFetcher email(boolean enabled) {
        return enabled ? add("email") : remove("email");
    }

    @NewChain
    public UserFetcher mobile() {
        return add("mobile");
    }

    @NewChain
    public UserFetcher mobile(boolean enabled) {
        return enabled ? add("mobile") : remove("mobile");
    }

    @NewChain
    public UserFetcher phone() {
        return add("phone");
    }

    @NewChain
    public UserFetcher phone(boolean enabled) {
        return enabled ? add("phone") : remove("phone");
    }

    @NewChain
    public UserFetcher sex() {
        return add("sex");
    }

    @NewChain
    public UserFetcher sex(boolean enabled) {
        return enabled ? add("sex") : remove("sex");
    }

    @NewChain
    public UserFetcher avatar() {
        return add("avatar");
    }

    @NewChain
    public UserFetcher avatar(boolean enabled) {
        return enabled ? add("avatar") : remove("avatar");
    }

    @NewChain
    public UserFetcher sign() {
        return add("sign");
    }

    @NewChain
    public UserFetcher sign(boolean enabled) {
        return enabled ? add("sign") : remove("sign");
    }

    @NewChain
    public UserFetcher wxOpenId() {
        return add("wxOpenId");
    }

    @NewChain
    public UserFetcher wxOpenId(boolean enabled) {
        return enabled ? add("wxOpenId") : remove("wxOpenId");
    }

    @NewChain
    public UserFetcher mobileImei() {
        return add("mobileImei");
    }

    @NewChain
    public UserFetcher mobileImei(boolean enabled) {
        return enabled ? add("mobileImei") : remove("mobileImei");
    }

    @NewChain
    public UserFetcher userType() {
        return add("userType");
    }

    @NewChain
    public UserFetcher userType(boolean enabled) {
        return enabled ? add("userType") : remove("userType");
    }

    @NewChain
    public UserFetcher refCode() {
        return add("refCode");
    }

    @NewChain
    public UserFetcher refCode(boolean enabled) {
        return enabled ? add("refCode") : remove("refCode");
    }

    @NewChain
    public UserFetcher refName() {
        return add("refName");
    }

    @NewChain
    public UserFetcher refName(boolean enabled) {
        return enabled ? add("refName") : remove("refName");
    }

    @NewChain
    public UserFetcher mgrType() {
        return add("mgrType");
    }

    @NewChain
    public UserFetcher mgrType(boolean enabled) {
        return enabled ? add("mgrType") : remove("mgrType");
    }

    @NewChain
    public UserFetcher pwdSecurityLevel() {
        return add("pwdSecurityLevel");
    }

    @NewChain
    public UserFetcher pwdSecurityLevel(boolean enabled) {
        return enabled ? add("pwdSecurityLevel") : remove("pwdSecurityLevel");
    }

    @NewChain
    public UserFetcher userWeight() {
        return add("userWeight");
    }

    @NewChain
    public UserFetcher userWeight(boolean enabled) {
        return enabled ? add("userWeight") : remove("userWeight");
    }

    @NewChain
    public UserFetcher status() {
        return add("status");
    }

    @NewChain
    public UserFetcher status(boolean enabled) {
        return enabled ? add("status") : remove("status");
    }

    @NewChain
    public UserFetcher createBy() {
        return add("createBy");
    }

    @NewChain
    public UserFetcher createBy(boolean enabled) {
        return enabled ? add("createBy") : remove("createBy");
    }

    @NewChain
    public UserFetcher createDate() {
        return add("createDate");
    }

    @NewChain
    public UserFetcher createDate(boolean enabled) {
        return enabled ? add("createDate") : remove("createDate");
    }

    @NewChain
    public UserFetcher updateBy() {
        return add("updateBy");
    }

    @NewChain
    public UserFetcher updateBy(boolean enabled) {
        return enabled ? add("updateBy") : remove("updateBy");
    }

    @NewChain
    public UserFetcher updateDate() {
        return add("updateDate");
    }

    @NewChain
    public UserFetcher updateDate(boolean enabled) {
        return enabled ? add("updateDate") : remove("updateDate");
    }

    @NewChain
    public UserFetcher remarks() {
        return add("remarks");
    }

    @NewChain
    public UserFetcher remarks(boolean enabled) {
        return enabled ? add("remarks") : remove("remarks");
    }

    @Override
    protected UserFetcher createChildFetcher(ImmutableProp prop, boolean negative) {
        return new UserFetcher(this, prop, negative);
    }

    @Override
    protected UserFetcher createChildFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new UserFetcher(this, prop, fieldConfig);
    }
}
