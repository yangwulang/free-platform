package top.yangwulang.platform.entity.sys.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.FixedInputField;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Config;
import top.yangwulang.platform.entity.sys.ConfigDraft;
import top.yangwulang.platform.entity.sys.ConfigFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Config.dto"
)
@JsonDeserialize(
        builder = ConfigSaveInput.Builder.class
)
public class ConfigSaveInput implements Input<Config> {
    public static final ViewMetadata<Config, ConfigSaveInput> METADATA = 
        new ViewMetadata<Config, ConfigSaveInput>(
            ConfigFetcher.$
                .configName()
                .configKey()
                .configValue()
                .remarks(),
            ConfigSaveInput::new
    );

    private static final DtoPropAccessor ID_ACCESSOR = new DtoPropAccessor(
        false,
        new int[] { ConfigDraft.Producer.SLOT_ID }
    );

    @Schema(
            description = "配置id"
    )
    private String id;

    @FixedInputField
    private String configName;

    @FixedInputField
    private String configKey;

    private String configValue;

    private String remarks;

    public ConfigSaveInput() {
    }

    public ConfigSaveInput(@NotNull Config base) {
        this.id = ID_ACCESSOR.get(base);
        this.configName = base.configName();
        this.configKey = base.configKey();
        this.configValue = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(ConfigDraft.Producer.SLOT_CONFIG_VALUE)) ? base.configValue() : null;
        this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(ConfigDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
    }

    @Nullable
    @Schema(
            description = "配置id"
    )
    public String getId() {
        return id;
    }

    public void setId(@Nullable String id) {
        this.id = id;
    }

    @NotNull
    @Schema(
            description = "配置名称"
    )
    public String getConfigName() {
        if (configName == null) {
            throw new IllegalStateException("The property \"configName\" is not specified");
        }
        return configName;
    }

    public void setConfigName(@NotNull String configName) {
        this.configName = configName;
    }

    @NotNull
    @Schema(
            description = "参数键"
    )
    public String getConfigKey() {
        if (configKey == null) {
            throw new IllegalStateException("The property \"configKey\" is not specified");
        }
        return configKey;
    }

    public void setConfigKey(@NotNull String configKey) {
        this.configKey = configKey;
    }

    @Nullable
    @Schema(
            description = "参数值"
    )
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
            ID_ACCESSOR.set(__draft, id);
            __draft.setConfigName(configName);
            __draft.setConfigKey(configKey);
            __draft.setConfigValue(configValue);
            __draft.setRemarks(remarks);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(configName);
        hash = hash * 31 + Objects.hashCode(configKey);
        hash = hash * 31 + Objects.hashCode(configValue);
        hash = hash * 31 + Objects.hashCode(remarks);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        ConfigSaveInput other = (ConfigSaveInput) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(configName, other.configName)) {
            return false;
        }
        if (!Objects.equals(configKey, other.configKey)) {
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
        builder.append("ConfigSaveInput").append('(');
        builder.append("id=").append(id);
        builder.append(", configName=").append(configName);
        builder.append(", configKey=").append(configKey);
        builder.append(", configValue=").append(configValue);
        builder.append(", remarks=").append(remarks);
        builder.append(')');
        return builder.toString();
    }

    @JsonPOJOBuilder(
            withPrefix = ""
    )
    public static class Builder {
        private String id;

        private String configName;

        private String configKey;

        private String configValue;

        private String remarks;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder configName(String configName) {
            this.configName = Objects.requireNonNull(configName, "The property \"configName\" cannot be null");
            return this;
        }

        public Builder configKey(String configKey) {
            this.configKey = Objects.requireNonNull(configKey, "The property \"configKey\" cannot be null");
            return this;
        }

        public Builder configValue(String configValue) {
            this.configValue = configValue;
            return this;
        }

        public Builder remarks(String remarks) {
            this.remarks = remarks;
            return this;
        }

        public ConfigSaveInput build() {
            ConfigSaveInput _input = new ConfigSaveInput();
            _input.setId(id);
            if (configName == null) {
                throw Input.unknownNonNullProperty(ConfigSaveInput.class, "configName");
            }
            _input.setConfigName(configName);
            if (configKey == null) {
                throw Input.unknownNonNullProperty(ConfigSaveInput.class, "configKey");
            }
            _input.setConfigKey(configKey);
            _input.setConfigValue(configValue);
            _input.setRemarks(remarks);
            return _input;
        }
    }
}
