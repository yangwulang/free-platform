package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.Input;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataDraft;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/DictData.dto"
)
@Data
public class DictDataSaveInput implements Input<DictData> {
    @NotNull
    private String id;

    @Schema(
            description = "父级id"
    )
    @Null
    private String parentId;

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
            description = "系统内置（1是 0否）"
    )
    @Nullable
    private Boolean isSys;

    @Schema(
            description = "字典描述"
    )
    @Null
    private String description;

    @Schema(
            description = "css样式（如：color:red)"
    )
    @Null
    private String cssStyle;

    @Schema(
            description = "css类名（如：red）"
    )
    @Null
    private String cssClass;

    public DictDataSaveInput() {
    }

    @Override
    public DictData toEntity() {
        return DictDataDraft.$.produce(draft -> {
            if (id != null) {
                draft.setId(id);
            }
            draft.setParentId(parentId);
            draft.setDictTypeId(dictTypeId);
            draft.setDictLabel(dictLabel);
            draft.setDictValue(dictValue);
            draft.setIsSys(isSys);
            draft.setDescription(description);
            draft.setCssStyle(cssStyle);
            draft.setCssClass(cssClass);
        });
    }
}
