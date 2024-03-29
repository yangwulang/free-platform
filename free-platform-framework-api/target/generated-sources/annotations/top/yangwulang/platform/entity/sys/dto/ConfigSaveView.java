package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import java.util.Objects;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Config;
import top.yangwulang.platform.entity.sys.ConfigDraft;
import top.yangwulang.platform.entity.sys.ConfigFetcher;

/**
 *  参数配置表
 *
 *  @author yangwulang
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Config.dto"
)
public class ConfigSaveView implements View<Config> {
    public static final ViewMetadata<Config, ConfigSaveView> METADATA = 
        new ViewMetadata<Config, ConfigSaveView>(
            ConfigFetcher.$
                .createBy()
                .createDate()
                .updateBy()
                .updateDate()
                .remarks()
                .configName()
                .configKey()
                .configValue(),
            ConfigSaveView::new
    );

    @NotNull
    private String id;

    @NotNull
    private String createBy;

    @NotNull
    private Date createDate;

    @NotNull
    private String updateBy;

    @NotNull
    private Date updateDate;

    @Nullable
    private String remarks;

    @Schema(
            description = "配置名称"
    )
    @NotNull
    private String configName;

    @Schema(
            description = "参数键"
    )
    @NotNull
    private String configKey;

    @Schema(
            description = "参数值"
    )
    @Nullable
    private String configValue;

    public ConfigSaveView() {
    }

    public ConfigSaveView(@NotNull Config base) {
        this.id = base.id();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(ConfigDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
        this.configName = base.configName();
        this.configKey = base.configKey();
        this.configValue = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(ConfigDraft.Producer.SLOT_CONFIG_VALUE)) ? base.configValue() : null;
    }

    public static ConfigSaveView of(@NotNull Config base) {
        return new ConfigSaveView(base);
    }

    /**
     * 字典类型编码
     * @return 主键值
     */
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

    /**
     * 创建者
     *
     * @return 创建者
     */
    @NotNull
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(@NotNull String createBy) {
        this.createBy = createBy;
    }

    /**
     * 创建时间
     *
     * @return 创建时间
     */
    @NotNull
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(@NotNull Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 更新者
     *
     * @return 更新者
     */
    @NotNull
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(@NotNull String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 更新时间
     *
     * @return 更新时间
     */
    @NotNull
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(@NotNull Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 备注信息
     *
     * @return 备注信息
     */
    @Nullable
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(@Nullable String remarks) {
        this.remarks = remarks;
    }

    /**
     * 名称
     *
     * @return 配置名称
     */
    @NotNull
    @Schema(
            description = "配置名称"
    )
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(@NotNull String configName) {
        this.configName = configName;
    }

    /**
     * 参数键
     *
     * @return 键
     */
    @NotNull
    @Schema(
            description = "参数键"
    )
    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(@NotNull String configKey) {
        this.configKey = configKey;
    }

    /**
     * 参数值
     *
     * @return 值
     */
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

    @Override
    public Config toEntity() {
        return ConfigDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setCreateBy(createBy);
            __draft.setCreateDate(createDate);
            __draft.setUpdateBy(updateBy);
            __draft.setUpdateDate(updateDate);
            __draft.setRemarks(remarks);
            __draft.setConfigName(configName);
            __draft.setConfigKey(configKey);
            __draft.setConfigValue(configValue);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(createBy);
        hash = hash * 31 + Objects.hashCode(createDate);
        hash = hash * 31 + Objects.hashCode(updateBy);
        hash = hash * 31 + Objects.hashCode(updateDate);
        hash = hash * 31 + Objects.hashCode(remarks);
        hash = hash * 31 + Objects.hashCode(configName);
        hash = hash * 31 + Objects.hashCode(configKey);
        hash = hash * 31 + Objects.hashCode(configValue);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        ConfigSaveView other = (ConfigSaveView) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(createBy, other.createBy)) {
            return false;
        }
        if (!Objects.equals(createDate, other.createDate)) {
            return false;
        }
        if (!Objects.equals(updateBy, other.updateBy)) {
            return false;
        }
        if (!Objects.equals(updateDate, other.updateDate)) {
            return false;
        }
        if (!Objects.equals(remarks, other.remarks)) {
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
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ConfigSaveView").append('(');
        builder.append("id=").append(id);
        builder.append(", createBy=").append(createBy);
        builder.append(", createDate=").append(createDate);
        builder.append(", updateBy=").append(updateBy);
        builder.append(", updateDate=").append(updateDate);
        builder.append(", remarks=").append(remarks);
        builder.append(", configName=").append(configName);
        builder.append(", configKey=").append(configKey);
        builder.append(", configValue=").append(configValue);
        builder.append(')');
        return builder.toString();
    }
}
