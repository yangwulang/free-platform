package top.yangwulang.platform.entity.sys;

import java.lang.Override;
import java.util.function.Consumer;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = OptionAnalysis.class
)
public class OptionAnalysisFetcher extends AbstractTypedFetcher<OptionAnalysis, OptionAnalysisFetcher> {
    public static final OptionAnalysisFetcher $ = new OptionAnalysisFetcher(null);

    private OptionAnalysisFetcher(FetcherImpl<OptionAnalysis> base) {
        super(OptionAnalysis.class, base);
    }

    private OptionAnalysisFetcher(OptionAnalysisFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private OptionAnalysisFetcher(OptionAnalysisFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static OptionAnalysisFetcher $from(Fetcher<OptionAnalysis> base) {
        return base instanceof OptionAnalysisFetcher ? 
        	(OptionAnalysisFetcher)base : 
        	new OptionAnalysisFetcher((FetcherImpl<OptionAnalysis>)base);
    }

    @NewChain
    public OptionAnalysisFetcher eventName() {
        return add("eventName");
    }

    @NewChain
    public OptionAnalysisFetcher eventName(boolean enabled) {
        return enabled ? add("eventName") : remove("eventName");
    }

    @NewChain
    public OptionAnalysisFetcher eventCode() {
        return add("eventCode");
    }

    @NewChain
    public OptionAnalysisFetcher eventCode(boolean enabled) {
        return enabled ? add("eventCode") : remove("eventCode");
    }

    @NewChain
    public OptionAnalysisFetcher optionUser() {
        return add("optionUser");
    }

    @NewChain
    public OptionAnalysisFetcher optionUser(boolean enabled) {
        return enabled ? add("optionUser") : remove("optionUser");
    }

    @NewChain
    public OptionAnalysisFetcher optionUser(Fetcher<User> childFetcher) {
        return add("optionUser", childFetcher);
    }

    @NewChain
    public OptionAnalysisFetcher optionUser(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("optionUser", childFetcher, fieldConfig);
    }

    @NewChain
    public OptionAnalysisFetcher optionUser(IdOnlyFetchType idOnlyFetchType) {
        return add("optionUser", idOnlyFetchType);
    }

    @NewChain
    public OptionAnalysisFetcher ipAddress() {
        return add("ipAddress");
    }

    @NewChain
    public OptionAnalysisFetcher ipAddress(boolean enabled) {
        return enabled ? add("ipAddress") : remove("ipAddress");
    }

    @NewChain
    public OptionAnalysisFetcher createDate() {
        return add("createDate");
    }

    @NewChain
    public OptionAnalysisFetcher createDate(boolean enabled) {
        return enabled ? add("createDate") : remove("createDate");
    }

    @NewChain
    public OptionAnalysisFetcher meta() {
        return add("meta");
    }

    @NewChain
    public OptionAnalysisFetcher meta(boolean enabled) {
        return enabled ? add("meta") : remove("meta");
    }

    @Override
    protected OptionAnalysisFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new OptionAnalysisFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected OptionAnalysisFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new OptionAnalysisFetcher(this, prop, fieldConfig);
    }
}
