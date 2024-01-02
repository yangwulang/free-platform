package top.yangwulang.platform.entity.sys;

import java.lang.Override;
import java.util.function.Consumer;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType;
import org.babyfish.jimmer.sql.fetcher.ListFieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = Role.class
)
public class RoleFetcher extends AbstractTypedFetcher<Role, RoleFetcher> {
    public static final RoleFetcher $ = new RoleFetcher(null);

    private RoleFetcher(FetcherImpl<Role> base) {
        super(Role.class, base);
    }

    private RoleFetcher(RoleFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private RoleFetcher(RoleFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static RoleFetcher $from(Fetcher<Role> base) {
        return base instanceof RoleFetcher ? 
        	(RoleFetcher)base : 
        	new RoleFetcher((FetcherImpl<Role>)base);
    }

    @NewChain
    public RoleFetcher status() {
        return add("status");
    }

    @NewChain
    public RoleFetcher status(boolean enabled) {
        return enabled ? add("status") : remove("status");
    }

    @NewChain
    public RoleFetcher createBy() {
        return add("createBy");
    }

    @NewChain
    public RoleFetcher createBy(boolean enabled) {
        return enabled ? add("createBy") : remove("createBy");
    }

    @NewChain
    public RoleFetcher createDate() {
        return add("createDate");
    }

    @NewChain
    public RoleFetcher createDate(boolean enabled) {
        return enabled ? add("createDate") : remove("createDate");
    }

    @NewChain
    public RoleFetcher updateBy() {
        return add("updateBy");
    }

    @NewChain
    public RoleFetcher updateBy(boolean enabled) {
        return enabled ? add("updateBy") : remove("updateBy");
    }

    @NewChain
    public RoleFetcher updateDate() {
        return add("updateDate");
    }

    @NewChain
    public RoleFetcher updateDate(boolean enabled) {
        return enabled ? add("updateDate") : remove("updateDate");
    }

    @NewChain
    public RoleFetcher remarks() {
        return add("remarks");
    }

    @NewChain
    public RoleFetcher remarks(boolean enabled) {
        return enabled ? add("remarks") : remove("remarks");
    }

    @NewChain
    public RoleFetcher roleCode() {
        return add("roleCode");
    }

    @NewChain
    public RoleFetcher roleCode(boolean enabled) {
        return enabled ? add("roleCode") : remove("roleCode");
    }

    @NewChain
    public RoleFetcher roleName() {
        return add("roleName");
    }

    @NewChain
    public RoleFetcher roleName(boolean enabled) {
        return enabled ? add("roleName") : remove("roleName");
    }

    @NewChain
    public RoleFetcher roleType() {
        return add("roleType");
    }

    @NewChain
    public RoleFetcher roleType(boolean enabled) {
        return enabled ? add("roleType") : remove("roleType");
    }

    @NewChain
    public RoleFetcher roleSort() {
        return add("roleSort");
    }

    @NewChain
    public RoleFetcher roleSort(boolean enabled) {
        return enabled ? add("roleSort") : remove("roleSort");
    }

    @NewChain
    public RoleFetcher isSys() {
        return add("isSys");
    }

    @NewChain
    public RoleFetcher isSys(boolean enabled) {
        return enabled ? add("isSys") : remove("isSys");
    }

    @NewChain
    public RoleFetcher userType() {
        return add("userType");
    }

    @NewChain
    public RoleFetcher userType(boolean enabled) {
        return enabled ? add("userType") : remove("userType");
    }

    @NewChain
    public RoleFetcher dataScope() {
        return add("dataScope");
    }

    @NewChain
    public RoleFetcher dataScope(boolean enabled) {
        return enabled ? add("dataScope") : remove("dataScope");
    }

    @NewChain
    public RoleFetcher bizScope() {
        return add("bizScope");
    }

    @NewChain
    public RoleFetcher bizScope(boolean enabled) {
        return enabled ? add("bizScope") : remove("bizScope");
    }

    @NewChain
    public RoleFetcher corpCode() {
        return add("corpCode");
    }

    @NewChain
    public RoleFetcher corpCode(boolean enabled) {
        return enabled ? add("corpCode") : remove("corpCode");
    }

    @NewChain
    public RoleFetcher corpName() {
        return add("corpName");
    }

    @NewChain
    public RoleFetcher corpName(boolean enabled) {
        return enabled ? add("corpName") : remove("corpName");
    }

    @NewChain
    public RoleFetcher menus() {
        return add("menus");
    }

    @NewChain
    public RoleFetcher menus(boolean enabled) {
        return enabled ? add("menus") : remove("menus");
    }

    @NewChain
    public RoleFetcher menus(Fetcher<Menu> childFetcher) {
        return add("menus", childFetcher);
    }

    @NewChain
    public RoleFetcher menus(Fetcher<Menu> childFetcher,
            Consumer<ListFieldConfig<Menu, MenuTable>> fieldConfig) {
        return add("menus", childFetcher, fieldConfig);
    }

    @NewChain
    public RoleFetcher menus(IdOnlyFetchType idOnlyFetchType) {
        return add("menus", idOnlyFetchType);
    }

    @NewChain
    public RoleFetcher users() {
        return add("users");
    }

    @NewChain
    public RoleFetcher users(boolean enabled) {
        return enabled ? add("users") : remove("users");
    }

    @NewChain
    public RoleFetcher users(Fetcher<User> childFetcher) {
        return add("users", childFetcher);
    }

    @NewChain
    public RoleFetcher users(Fetcher<User> childFetcher,
            Consumer<ListFieldConfig<User, UserTable>> fieldConfig) {
        return add("users", childFetcher, fieldConfig);
    }

    @NewChain
    public RoleFetcher users(IdOnlyFetchType idOnlyFetchType) {
        return add("users", idOnlyFetchType);
    }

    @Override
    protected RoleFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new RoleFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected RoleFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new RoleFetcher(this, prop, fieldConfig);
    }
}
