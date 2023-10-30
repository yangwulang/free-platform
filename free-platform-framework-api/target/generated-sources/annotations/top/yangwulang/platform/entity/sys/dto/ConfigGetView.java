package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import top.yangwulang.platform.entity.sys.Config;
import top.yangwulang.platform.entity.sys.ConfigDraft;
import top.yangwulang.platform.entity.sys.ConfigFetcher;
import top.yangwulang.platform.entity.sys.ConfigProps;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Config.dto"
)
@Data
public class ConfigGetView implements View<Config> {
    public static final ViewMetadata<Config, ConfigGetView> METADATA = 
        new ViewMetadata<Config, ConfigGetView>(
            ConfigFetcher.$
                .createBy()
                .createDate()
                .updateBy()
                .updateDate()
                .remarks()
                .configName()
                .configKey()
                .configValue(),
            ConfigGetView::new
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

    @Null
    private String remarks;

    @Schema(
            description = "配置名称"
    )
    @org.jetbrains.annotations.NotNull
    private String configName;

    @Schema(
            description = "参数键"
    )
    @org.jetbrains.annotations.NotNull
    private String configKey;

    @Schema(
            description = "参数值"
    )
    @Null
    private String configValue;

    public ConfigGetView() {
    }

    public ConfigGetView(@org.jetbrains.annotations.NotNull Config base) {
        ImmutableSpi spi = (ImmutableSpi)base;
        this.id = base.id();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = spi.__isLoaded(ConfigProps.REMARKS.unwrap().getId()) ? base.remarks() : null;
        this.configName = base.configName();
        this.configKey = base.configKey();
        this.configValue = spi.__isLoaded(ConfigProps.CONFIG_VALUE.unwrap().getId()) ? base.configValue() : null;
    }

    public static ConfigGetView of(@org.jetbrains.annotations.NotNull Config base) {
        return new ConfigGetView(base);
    }

    @Override
    public Config toEntity() {
        return ConfigDraft.$.produce(draft -> {
            draft.setId(id);
            draft.setCreateBy(createBy);
            draft.setCreateDate(createDate);
            draft.setUpdateBy(updateBy);
            draft.setUpdateDate(updateDate);
            draft.setRemarks(remarks);
            draft.setConfigName(configName);
            draft.setConfigKey(configKey);
            draft.setConfigValue(configValue);
        });
    }
}
