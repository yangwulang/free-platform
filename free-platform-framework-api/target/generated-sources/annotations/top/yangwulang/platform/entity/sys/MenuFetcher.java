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
import org.babyfish.jimmer.sql.fetcher.RecursiveFieldConfig;
import org.babyfish.jimmer.sql.fetcher.RecursiveListFieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = Menu.class
)
public class MenuFetcher extends AbstractTypedFetcher<Menu, MenuFetcher> {
    public static final MenuFetcher $ = new MenuFetcher(null);

    private MenuFetcher(FetcherImpl<Menu> base) {
        super(Menu.class, base);
    }

    private MenuFetcher(MenuFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private MenuFetcher(MenuFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static MenuFetcher $from(Fetcher<Menu> base) {
        return base instanceof MenuFetcher ? 
        	(MenuFetcher)base : 
        	new MenuFetcher((FetcherImpl<Menu>)base);
    }

    @NewChain
    public MenuFetcher status() {
        return add("status");
    }

    @NewChain
    public MenuFetcher status(boolean enabled) {
        return enabled ? add("status") : remove("status");
    }

    @NewChain
    public MenuFetcher createBy() {
        return add("createBy");
    }

    @NewChain
    public MenuFetcher createBy(boolean enabled) {
        return enabled ? add("createBy") : remove("createBy");
    }

    @NewChain
    public MenuFetcher createDate() {
        return add("createDate");
    }

    @NewChain
    public MenuFetcher createDate(boolean enabled) {
        return enabled ? add("createDate") : remove("createDate");
    }

    @NewChain
    public MenuFetcher updateBy() {
        return add("updateBy");
    }

    @NewChain
    public MenuFetcher updateBy(boolean enabled) {
        return enabled ? add("updateBy") : remove("updateBy");
    }

    @NewChain
    public MenuFetcher updateDate() {
        return add("updateDate");
    }

    @NewChain
    public MenuFetcher updateDate(boolean enabled) {
        return enabled ? add("updateDate") : remove("updateDate");
    }

    @NewChain
    public MenuFetcher remarks() {
        return add("remarks");
    }

    @NewChain
    public MenuFetcher remarks(boolean enabled) {
        return enabled ? add("remarks") : remove("remarks");
    }

    @NewChain
    public MenuFetcher parent() {
        return add("parent");
    }

    @NewChain
    public MenuFetcher parent(boolean enabled) {
        return enabled ? add("parent") : remove("parent");
    }

    @NewChain
    public MenuFetcher parent(Fetcher<Menu> childFetcher) {
        return add("parent", childFetcher);
    }

    @NewChain
    public MenuFetcher parent(Fetcher<Menu> childFetcher,
            Consumer<FieldConfig<Menu, MenuTable>> fieldConfig) {
        return add("parent", childFetcher, fieldConfig);
    }

    @NewChain
    public MenuFetcher recursiveParent() {
        return addRecursion("parent", null);
    }

    @NewChain
    public MenuFetcher recursiveParent(
            Consumer<RecursiveFieldConfig<Menu, MenuTable>> fieldConfig) {
        return addRecursion("parent", fieldConfig);
    }

    @NewChain
    public MenuFetcher parent(IdOnlyFetchType idOnlyFetchType) {
        return add("parent", idOnlyFetchType);
    }

    @NewChain
    public MenuFetcher parentId() {
        return add("parentId");
    }

    @NewChain
    public MenuFetcher parentId(boolean enabled) {
        return enabled ? add("parentId") : remove("parentId");
    }

    @NewChain
    public MenuFetcher parentId(IdOnlyFetchType idOnlyFetchType) {
        return add("parentId", idOnlyFetchType);
    }

    @NewChain
    public MenuFetcher children() {
        return add("children");
    }

    @NewChain
    public MenuFetcher children(boolean enabled) {
        return enabled ? add("children") : remove("children");
    }

    @NewChain
    public MenuFetcher children(Fetcher<Menu> childFetcher) {
        return add("children", childFetcher);
    }

    @NewChain
    public MenuFetcher children(Fetcher<Menu> childFetcher,
            Consumer<ListFieldConfig<Menu, MenuTable>> fieldConfig) {
        return add("children", childFetcher, fieldConfig);
    }

    @NewChain
    public MenuFetcher recursiveChildren() {
        return addRecursion("children", null);
    }

    @NewChain
    public MenuFetcher recursiveChildren(
            Consumer<RecursiveListFieldConfig<Menu, MenuTable>> fieldConfig) {
        return addRecursion("children", fieldConfig);
    }

    @NewChain
    public MenuFetcher meta() {
        return add("meta");
    }

    @NewChain
    public MenuFetcher meta(boolean enabled) {
        return enabled ? add("meta") : remove("meta");
    }

    @NewChain
    public MenuFetcher menuName() {
        return add("menuName");
    }

    @NewChain
    public MenuFetcher menuName(boolean enabled) {
        return enabled ? add("menuName") : remove("menuName");
    }

    @NewChain
    public MenuFetcher menuPath() {
        return add("menuPath");
    }

    @NewChain
    public MenuFetcher menuPath(boolean enabled) {
        return enabled ? add("menuPath") : remove("menuPath");
    }

    @NewChain
    public MenuFetcher redirect() {
        return add("redirect");
    }

    @NewChain
    public MenuFetcher redirect(boolean enabled) {
        return enabled ? add("redirect") : remove("redirect");
    }

    @NewChain
    public MenuFetcher menuType() {
        return add("menuType");
    }

    @NewChain
    public MenuFetcher menuType(boolean enabled) {
        return enabled ? add("menuType") : remove("menuType");
    }

    @NewChain
    public MenuFetcher menuComponent() {
        return add("menuComponent");
    }

    @NewChain
    public MenuFetcher menuComponent(boolean enabled) {
        return enabled ? add("menuComponent") : remove("menuComponent");
    }

    @NewChain
    public MenuFetcher menuTarget() {
        return add("menuTarget");
    }

    @NewChain
    public MenuFetcher menuTarget(boolean enabled) {
        return enabled ? add("menuTarget") : remove("menuTarget");
    }

    @NewChain
    public MenuFetcher permission() {
        return add("permission");
    }

    @NewChain
    public MenuFetcher permission(boolean enabled) {
        return enabled ? add("permission") : remove("permission");
    }

    @NewChain
    public MenuFetcher weight() {
        return add("weight");
    }

    @NewChain
    public MenuFetcher weight(boolean enabled) {
        return enabled ? add("weight") : remove("weight");
    }

    @NewChain
    public MenuFetcher sysCode() {
        return add("sysCode");
    }

    @NewChain
    public MenuFetcher sysCode(boolean enabled) {
        return enabled ? add("sysCode") : remove("sysCode");
    }

    @NewChain
    public MenuFetcher roles() {
        return add("roles");
    }

    @NewChain
    public MenuFetcher roles(boolean enabled) {
        return enabled ? add("roles") : remove("roles");
    }

    @NewChain
    public MenuFetcher roles(Fetcher<Role> childFetcher) {
        return add("roles", childFetcher);
    }

    @NewChain
    public MenuFetcher roles(Fetcher<Role> childFetcher,
            Consumer<ListFieldConfig<Role, RoleTable>> fieldConfig) {
        return add("roles", childFetcher, fieldConfig);
    }

    @NewChain
    public MenuFetcher roles(IdOnlyFetchType idOnlyFetchType) {
        return add("roles", idOnlyFetchType);
    }

    @Override
    protected MenuFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new MenuFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected MenuFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new MenuFetcher(this, prop, fieldConfig);
    }
}
