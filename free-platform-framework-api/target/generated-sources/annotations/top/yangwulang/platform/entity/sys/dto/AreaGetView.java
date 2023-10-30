package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Long;
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
import top.yangwulang.platform.entity.sys.Area;
import top.yangwulang.platform.entity.sys.AreaDraft;
import top.yangwulang.platform.entity.sys.AreaFetcher;
import top.yangwulang.platform.entity.sys.AreaProps;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/Area.dto"
)
@Data
public class AreaGetView implements View<Area> {
    public static final ViewMetadata<Area, AreaGetView> METADATA = 
        new ViewMetadata<Area, AreaGetView>(
            AreaFetcher.$
                .status()
                .createBy()
                .createDate()
                .updateBy()
                .updateDate()
                .remarks()
                .areaName()
                .sort()
                .areaType(),
            AreaGetView::new
    );

    @NotNull
    private String id;

    @Schema(
            description = "状态"
    )
    private int status;

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
            description = "区域名称"
    )
    @org.jetbrains.annotations.NotNull
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

    public AreaGetView() {
    }

    public AreaGetView(@org.jetbrains.annotations.NotNull Area base) {
        ImmutableSpi spi = (ImmutableSpi)base;
        this.id = base.id();
        this.status = base.status();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = spi.__isLoaded(AreaProps.REMARKS.unwrap().getId()) ? base.remarks() : null;
        this.areaName = base.areaName();
        this.sort = spi.__isLoaded(AreaProps.SORT.unwrap().getId()) ? base.sort() : null;
        this.areaType = spi.__isLoaded(AreaProps.AREA_TYPE.unwrap().getId()) ? base.areaType() : null;
    }

    public static AreaGetView of(@org.jetbrains.annotations.NotNull Area base) {
        return new AreaGetView(base);
    }

    @Override
    public Area toEntity() {
        return AreaDraft.$.produce(draft -> {
            draft.setId(id);
            draft.setStatus(status);
            draft.setCreateBy(createBy);
            draft.setCreateDate(createDate);
            draft.setUpdateBy(updateBy);
            draft.setUpdateDate(updateDate);
            draft.setRemarks(remarks);
            draft.setAreaName(areaName);
            draft.setSort(sort);
            draft.setAreaType(areaType);
        });
    }
}
