package top.yangwulang.platform.entity.sys;

import java.lang.Override;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = Config.class
)
public class ConfigFetcher extends AbstractTypedFetcher<Config, ConfigFetcher> {
    public static final ConfigFetcher $ = new ConfigFetcher(null);

    private ConfigFetcher(FetcherImpl<Config> base) {
        super(Config.class, base);
    }

    private ConfigFetcher(ConfigFetcher prev, ImmutableProp prop, boolean negative) {
        super(prev, prop, negative);
    }

    private ConfigFetcher(ConfigFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static ConfigFetcher $from(Fetcher<Config> base) {
        return base instanceof ConfigFetcher ? 
        	(ConfigFetcher)base : 
        	new ConfigFetcher((FetcherImpl<Config>)base);
    }

    @NewChain
    public ConfigFetcher createBy() {
        return add("createBy");
    }

    @NewChain
    public ConfigFetcher createBy(boolean enabled) {
        return enabled ? add("createBy") : remove("createBy");
    }

    @NewChain
    public ConfigFetcher createDate() {
        return add("createDate");
    }

    @NewChain
    public ConfigFetcher createDate(boolean enabled) {
        return enabled ? add("createDate") : remove("createDate");
    }

    @NewChain
    public ConfigFetcher updateBy() {
        return add("updateBy");
    }

    @NewChain
    public ConfigFetcher updateBy(boolean enabled) {
        return enabled ? add("updateBy") : remove("updateBy");
    }

    @NewChain
    public ConfigFetcher updateDate() {
        return add("updateDate");
    }

    @NewChain
    public ConfigFetcher updateDate(boolean enabled) {
        return enabled ? add("updateDate") : remove("updateDate");
    }

    @NewChain
    public ConfigFetcher remarks() {
        return add("remarks");
    }

    @NewChain
    public ConfigFetcher remarks(boolean enabled) {
        return enabled ? add("remarks") : remove("remarks");
    }

    @NewChain
    public ConfigFetcher configName() {
        return add("configName");
    }

    @NewChain
    public ConfigFetcher configName(boolean enabled) {
        return enabled ? add("configName") : remove("configName");
    }

    @NewChain
    public ConfigFetcher configKey() {
        return add("configKey");
    }

    @NewChain
    public ConfigFetcher configKey(boolean enabled) {
        return enabled ? add("configKey") : remove("configKey");
    }

    @NewChain
    public ConfigFetcher configValue() {
        return add("configValue");
    }

    @NewChain
    public ConfigFetcher configValue(boolean enabled) {
        return enabled ? add("configValue") : remove("configValue");
    }

    @Override
    protected ConfigFetcher createFetcher(ImmutableProp prop, boolean negative) {
        return new ConfigFetcher(this, prop, negative);
    }

    @Override
    protected ConfigFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new ConfigFetcher(this, prop, fieldConfig);
    }
}
