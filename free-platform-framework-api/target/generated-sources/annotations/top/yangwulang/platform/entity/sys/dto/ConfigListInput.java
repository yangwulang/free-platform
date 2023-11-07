package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.ViewableInput;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Config;
import top.yangwulang.platform.entity.sys.ConfigDraft;
import top.yangwulang.platform.entity.sys.ConfigFetcher;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Config.dto"
)
public class ConfigListInput implements ViewableInput<Config> {
    public static final ViewMetadata<Config, ConfigListInput> METADATA = 
        new ViewMetadata<Config, ConfigListInput>(
            ConfigFetcher.$
                .configKey()
                .configName()
                .configValue()
                .remarks(),
            ConfigListInput::new
    );

    private static final DtoPropAccessor CONFIG_KEY_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { ConfigDraft.Producer.SLOT_CONFIG_KEY }
    );

    private static final DtoPropAccessor CONFIG_NAME_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { ConfigDraft.Producer.SLOT_CONFIG_NAME }
    );

    @Schema(
            description = "参数键"
    )
    @Nullable
    private String configKey;

    @Schema(
            description = "配置名称"
    )
    @Nullable
    private String configName;

    @Schema(
            description = "参数值"
    )
    @Null
    private String configValue;

    @Null
    private String remarks;

    public ConfigListInput() {
    }

    public ConfigListInput(@NotNull Config base) {
        this.configKey = CONFIG_KEY_ACCESSOR.get(base);
        this.configName = CONFIG_NAME_ACCESSOR.get(base);
        this.configValue = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(ConfigDraft.Producer.SLOT_CONFIG_VALUE)) ? base.configValue() : null;
        this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(ConfigDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
    }

    public static ConfigListInput of(@NotNull Config base) {
        return new ConfigListInput(base);
    }

    @Nullable
    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(@Nullable String configKey) {
        this.configKey = configKey;
    }

    @Nullable
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(@Nullable String configName) {
        this.configName = configName;
    }

    @Nullable
    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(@Nullable String configValue) {
        this.configValue = configValue;
    }

    @Nullable
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(@Nullable String remarks) {
        this.remarks = remarks;
    }

    @Override
    public Config toEntity() {
        return ConfigDraft.$.produce(__draft -> {
            CONFIG_KEY_ACCESSOR.set(__draft, configKey);
            CONFIG_NAME_ACCESSOR.set(__draft, configName);
            __draft.setConfigValue(configValue);
            __draft.setRemarks(remarks);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(configKey);
        hash = hash * 31 + Objects.hashCode(configName);
        hash = hash * 31 + Objects.hashCode(configValue);
        hash = hash * 31 + Objects.hashCode(remarks);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        ConfigListInput other = (ConfigListInput) o;
        if (!Objects.equals(configKey, other.configKey)) {
            return false;
        }
        if (!Objects.equals(configName, other.configName)) {
            return false;
        }
        if (!Objects.equals(configValue, other.configValue)) {
            return false;
        }
        if (!Objects.equals(remarks, other.remarks)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ConfigListInput").append('(');
        builder.append("configKey=").append(configKey);
        builder.append(", configName=").append(configName);
        builder.append(", configValue=").append(configValue);
        builder.append(", remarks=").append(remarks);
        builder.append(')');
        return builder.toString();
    }
}
