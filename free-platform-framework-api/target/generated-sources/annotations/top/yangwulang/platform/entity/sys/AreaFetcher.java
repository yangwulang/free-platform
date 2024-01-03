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
import org.babyfish.jimmer.sql.fetcher.RecursiveFieldConfig;
import org.babyfish.jimmer.sql.fetcher.RecursiveListFieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = Area.class
)
public class AreaFetcher extends AbstractTypedFetcher<Area, AreaFetcher> {
    public static final AreaFetcher $ = new AreaFetcher(null);

    private AreaFetcher(FetcherImpl<Area> base) {
        super(Area.class, base);
    }

    private AreaFetcher(AreaFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private AreaFetcher(AreaFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static AreaFetcher $from(Fetcher<Area> base) {
        return base instanceof AreaFetcher ? 
        	(AreaFetcher)base : 
        	new AreaFetcher((FetcherImpl<Area>)base);
    }

    @NewChain
    public AreaFetcher status() {
        return add("status");
    }

    @NewChain
    public AreaFetcher status(boolean enabled) {
        return enabled ? add("status") : remove("status");
    }

    @NewChain
    public AreaFetcher createBy() {
        return add("createBy");
    }

    @NewChain
    public AreaFetcher createBy(boolean enabled) {
        return enabled ? add("createBy") : remove("createBy");
    }

    @NewChain
    public AreaFetcher createDate() {
        return add("createDate");
    }

    @NewChain
    public AreaFetcher createDate(boolean enabled) {
        return enabled ? add("createDate") : remove("createDate");
    }

    @NewChain
    public AreaFetcher updateBy() {
        return add("updateBy");
    }

    @NewChain
    public AreaFetcher updateBy(boolean enabled) {
        return enabled ? add("updateBy") : remove("updateBy");
    }

    @NewChain
    public AreaFetcher updateDate() {
        return add("updateDate");
    }

    @NewChain
    public AreaFetcher updateDate(boolean enabled) {
        return enabled ? add("updateDate") : remove("updateDate");
    }

    @NewChain
    public AreaFetcher remarks() {
        return add("remarks");
    }

    @NewChain
    public AreaFetcher remarks(boolean enabled) {
        return enabled ? add("remarks") : remove("remarks");
    }

    @NewChain
    public AreaFetcher parent() {
        return add("parent");
    }

    @NewChain
    public AreaFetcher parent(boolean enabled) {
        return enabled ? add("parent") : remove("parent");
    }

    @NewChain
    public AreaFetcher parent(Fetcher<Area> childFetcher) {
        return add("parent", childFetcher);
    }

    @NewChain
    public AreaFetcher parent(Fetcher<Area> childFetcher,
            Consumer<RecursiveFieldConfig<Area, AreaTable>> fieldConfig) {
        return add("parent", childFetcher, fieldConfig);
    }

    @NewChain
    public AreaFetcher parent(IdOnlyFetchType idOnlyFetchType) {
        return add("parent", idOnlyFetchType);
    }

    @NewChain
    public AreaFetcher parentId() {
        return add("parentId");
    }

    @NewChain
    public AreaFetcher parentId(boolean enabled) {
        return enabled ? add("parentId") : remove("parentId");
    }

    @NewChain
    public AreaFetcher parentId(IdOnlyFetchType idOnlyFetchType) {
        return add("parentId", idOnlyFetchType);
    }

    @NewChain
    public AreaFetcher children() {
        return add("children");
    }

    @NewChain
    public AreaFetcher children(boolean enabled) {
        return enabled ? add("children") : remove("children");
    }

    @NewChain
    public AreaFetcher children(Fetcher<Area> childFetcher) {
        return add("children", childFetcher);
    }

    @NewChain
    public AreaFetcher children(Fetcher<Area> childFetcher,
            Consumer<RecursiveListFieldConfig<Area, AreaTable>> fieldConfig) {
        return add("children", childFetcher, fieldConfig);
    }

    @NewChain
    public AreaFetcher areaName() {
        return add("areaName");
    }

    @NewChain
    public AreaFetcher areaName(boolean enabled) {
        return enabled ? add("areaName") : remove("areaName");
    }

    @NewChain
    public AreaFetcher sort() {
        return add("sort");
    }

    @NewChain
    public AreaFetcher sort(boolean enabled) {
        return enabled ? add("sort") : remove("sort");
    }

    @NewChain
    public AreaFetcher areaType() {
        return add("areaType");
    }

    @NewChain
    public AreaFetcher areaType(boolean enabled) {
        return enabled ? add("areaType") : remove("areaType");
    }

    @Override
    protected AreaFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new AreaFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected AreaFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new AreaFetcher(this, prop, fieldConfig);
    }
}
