package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.Input;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataDraft;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/DictData.dto"
)
@Data
public class DictDataListInput implements Input<DictData> {
    @Schema(
            description = "字典类型id"
    )
    @Null
    private String dictTypeId;

    @Schema(
            description = "字典标签"
    )
    @Null
    private String dictLabel;

    @Schema(
            description = "字典键值"
    )
    @Null
    private String dictValue;

    @Schema(
            description = "字典描述"
    )
    @Null
    private String description;

    public DictDataListInput() {
    }

    @Override
    public DictData toEntity() {
        return DictDataDraft.$.produce(draft -> {
            draft.setDictTypeId(dictTypeId);
            draft.setDictLabel(dictLabel);
            draft.setDictValue(dictValue);
            draft.setDescription(description);
        });
    }
}
