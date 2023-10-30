package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
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
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataDraft;
import top.yangwulang.platform.entity.sys.DictDataFetcher;
import top.yangwulang.platform.entity.sys.DictDataProps;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/DictData.dto"
)
@Data
public class DictDataGetView implements View<DictData> {
    public static final ViewMetadata<DictData, DictDataGetView> METADATA = 
        new ViewMetadata<DictData, DictDataGetView>(
            DictDataFetcher.$
                .createBy()
                .createDate()
                .updateBy()
                .updateDate()
                .remarks()
                .dictLabel()
                .dictValue()
                .isSys()
                .description()
                .cssStyle()
                .cssClass(),
            DictDataGetView::new
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

    public DictDataGetView() {
    }

    public DictDataGetView(@org.jetbrains.annotations.NotNull DictData base) {
        ImmutableSpi spi = (ImmutableSpi)base;
        this.id = base.id();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = spi.__isLoaded(DictDataProps.REMARKS.unwrap().getId()) ? base.remarks() : null;
        this.dictLabel = spi.__isLoaded(DictDataProps.DICT_LABEL.unwrap().getId()) ? base.dictLabel() : null;
        this.dictValue = spi.__isLoaded(DictDataProps.DICT_VALUE.unwrap().getId()) ? base.dictValue() : null;
        this.isSys = spi.__isLoaded(DictDataProps.IS_SYS.unwrap().getId()) ? base.isSys() : null;
        this.description = spi.__isLoaded(DictDataProps.DESCRIPTION.unwrap().getId()) ? base.description() : null;
        this.cssStyle = spi.__isLoaded(DictDataProps.CSS_STYLE.unwrap().getId()) ? base.cssStyle() : null;
        this.cssClass = spi.__isLoaded(DictDataProps.CSS_CLASS.unwrap().getId()) ? base.cssClass() : null;
    }

    public static DictDataGetView of(@org.jetbrains.annotations.NotNull DictData base) {
        return new DictDataGetView(base);
    }

    @Override
    public DictData toEntity() {
        return DictDataDraft.$.produce(draft -> {
            draft.setId(id);
            draft.setCreateBy(createBy);
            draft.setCreateDate(createDate);
            draft.setUpdateBy(updateBy);
            draft.setUpdateDate(updateDate);
            draft.setRemarks(remarks);
            draft.setDictLabel(dictLabel);
            draft.setDictValue(dictValue);
            draft.setIsSys(isSys);
            draft.setDescription(description);
            draft.setCssStyle(cssStyle);
            draft.setCssClass(cssClass);
        });
    }
}
