package top.yangwulang.platform.entity.sys;

import java.lang.Override;
import java.util.function.Consumer;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.ListFieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

public class RoleFetcher extends AbstractTypedFetcher<Role, RoleFetcher> {
    public static final RoleFetcher $ = new RoleFetcher(null);

    private RoleFetcher(FetcherImpl<Role> base) {
        super(Role.class, base);
    }

    private RoleFetcher(RoleFetcher prev, ImmutableProp prop, boolean negative) {
        super(prev, prop, negative);
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
    public RoleFetcher sys() {
        return add("sys");
    }

    @NewChain
    public RoleFetcher sys(boolean enabled) {
        return enabled ? add("sys") : remove("sys");
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

    @Override
    protected RoleFetcher createChildFetcher(ImmutableProp prop, boolean negative) {
        return new RoleFetcher(this, prop, negative);
    }

    @Override
    protected RoleFetcher createChildFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new RoleFetcher(this, prop, fieldConfig);
    }
}
