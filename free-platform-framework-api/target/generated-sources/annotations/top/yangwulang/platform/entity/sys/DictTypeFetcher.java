package top.yangwulang.platform.entity.sys;

import java.lang.Override;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

public class DictTypeFetcher extends AbstractTypedFetcher<DictType, DictTypeFetcher> {
    public static final DictTypeFetcher $ = new DictTypeFetcher(null);

    private DictTypeFetcher(FetcherImpl<DictType> base) {
        super(DictType.class, base);
    }

    private DictTypeFetcher(DictTypeFetcher prev, ImmutableProp prop, boolean negative) {
        super(prev, prop, negative);
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
    public DictTypeFetcher sys() {
        return add("sys");
    }

    @NewChain
    public DictTypeFetcher sys(boolean enabled) {
        return enabled ? add("sys") : remove("sys");
    }

    @Override
    protected DictTypeFetcher createChildFetcher(ImmutableProp prop, boolean negative) {
        return new DictTypeFetcher(this, prop, negative);
    }

    @Override
    protected DictTypeFetcher createChildFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new DictTypeFetcher(this, prop, fieldConfig);
    }
}
