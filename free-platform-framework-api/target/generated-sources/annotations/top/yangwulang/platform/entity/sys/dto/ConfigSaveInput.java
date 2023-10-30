package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.Input;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Config;
import top.yangwulang.platform.entity.sys.ConfigDraft;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Config.dto"
)
@Data
public class ConfigSaveInput implements Input<Config> {
    @Schema(
            description = "配置id"
    )
    @Nullable
    private String id;

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
    @Null
    private String configValue;

    @Null
    private String remarks;

    public ConfigSaveInput() {
    }

    @Override
    public Config toEntity() {
        return ConfigDraft.$.produce(draft -> {
            if (id != null) {
                draft.setId(id);
            }
            draft.setConfigName(configName);
            draft.setConfigKey(configKey);
            draft.setConfigValue(configValue);
            draft.setRemarks(remarks);
        });
    }
}
