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
        type = DictType.class
)
public class DictTypeFetcher extends AbstractTypedFetcher<DictType, DictTypeFetcher> {
    public static final DictTypeFetcher $ = new DictTypeFetcher(null);

    private DictTypeFetcher(FetcherImpl<DictType> base) {
        super(DictType.class, base);
    }

    private DictTypeFetcher(DictTypeFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private DictTypeFetcher(DictTypeFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static DictTypeFetcher $from(Fetcher<DictType> base) {
        return base instanceof DictTypeFetcher ? 
        	(DictTypeFetcher)base : 
        	new DictTypeFetcher((FetcherImpl<DictType>)base);
    }

    @NewChain
    public DictTypeFetcher status() {
        return add("status");
    }

    @NewChain
    public DictTypeFetcher status(boolean enabled) {
        return enabled ? add("status") : remove("status");
    }

    @NewChain
    public DictTypeFetcher createBy() {
        return add("createBy");
    }

    @NewChain
    public DictTypeFetcher createBy(boolean enabled) {
        return enabled ? add("createBy") : remove("createBy");
    }

    @NewChain
    public DictTypeFetcher createDate() {
        return add("createDate");
    }

    @NewChain
    public DictTypeFetcher createDate(boolean enabled) {
        return enabled ? add("createDate") : remove("createDate");
    }

    @NewChain
    public DictTypeFetcher updateBy() {
        return add("updateBy");
    }

    @NewChain
    public DictTypeFetcher updateBy(boolean enabled) {
        return enabled ? add("updateBy") : remove("updateBy");
    }

    @NewChain
    public DictTypeFetcher updateDate() {
        return add("updateDate");
    }

    @NewChain
    public DictTypeFetcher updateDate(boolean enabled) {
        return enabled ? add("updateDate") : remove("updateDate");
    }

    @NewChain
    public DictTypeFetcher remarks() {
        return add("remarks");
    }

    @NewChain
    public DictTypeFetcher remarks(boolean enabled) {
        return enabled ? add("remarks") : remove("remarks");
    }

    @NewChain
    public DictTypeFetcher dictName() {
        return add("dictName");
    }

    @NewChain
    public DictTypeFetcher dictName(boolean enabled) {
        return enabled ? add("dictName") : remove("dictName");
    }

    @NewChain
    public DictTypeFetcher dictType() {
        return add("dictType");
    }

    @NewChain
    public DictTypeFetcher dictType(boolean enabled) {
        return enabled ? add("dictType") : remove("dictType");
    }

    @NewChain
    public DictTypeFetcher isSys() {
        return add("isSys");
    }

    @NewChain
    public DictTypeFetcher isSys(boolean enabled) {
        return enabled ? add("isSys") : remove("isSys");
    }

    @NewChain
    public DictTypeFetcher data() {
        return add("data");
    }

    @NewChain
    public DictTypeFetcher data(boolean enabled) {
        return enabled ? add("data") : remove("data");
    }

    @NewChain
    public DictTypeFetcher data(Fetcher<DictData> childFetcher) {
        return add("data", childFetcher);
    }

    @NewChain
    public DictTypeFetcher data(Fetcher<DictData> childFetcher,
            Consumer<ListFieldConfig<DictData, DictDataTable>> fieldConfig) {
        return add("data", childFetcher, fieldConfig);
    }

    @Override
    protected DictTypeFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new DictTypeFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected DictTypeFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new DictTypeFetcher(this, prop, fieldConfig);
    }
}
