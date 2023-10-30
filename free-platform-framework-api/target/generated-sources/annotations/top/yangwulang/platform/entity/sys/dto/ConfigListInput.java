package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.Input;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.Config;
import top.yangwulang.platform.entity.sys.ConfigDraft;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Config.dto"
)
@Data
public class ConfigListInput implements Input<Config> {
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

    @Override
    public Config toEntity() {
        return ConfigDraft.$.produce(draft -> {
            if (configKey != null) {
                draft.setConfigKey(configKey);
            }
            if (configName != null) {
                draft.setConfigName(configName);
            }
            draft.setConfigValue(configValue);
            draft.setRemarks(remarks);
        });
    }
}
