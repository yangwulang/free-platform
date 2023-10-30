package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.Input;
import org.jetbrains.annotations.NotNull;
import top.yangwulang.platform.entity.sys.Area;
import top.yangwulang.platform.entity.sys.AreaDraft;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Area.dto"
)
@Data
public class AreaListInput implements Input<Area> {
    @Schema(
            description = "父级id"
    )
    @Null
    private String parentId;

    @Schema(
            description = "区域名称"
    )
    @NotNull
    private String areaName;

    @Schema(
            description = "排序"
    )
    @Null
    private Long sort;

    @Schema(
            description = "地区类型(1：国家；2：省份、直辖市；3：地市；4：区县)"
    )
    @Null
    private String areaType;

    public AreaListInput() {
    }

    @Override
    public Area toEntity() {
        return AreaDraft.$.produce(draft -> {
            draft.setParentId(parentId);
            draft.setAreaName(areaName);
            draft.setSort(sort);
            draft.setAreaType(areaType);
        });
    }
}
