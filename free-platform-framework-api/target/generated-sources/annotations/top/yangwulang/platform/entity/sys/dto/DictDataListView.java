package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.RecursiveFieldConfig;
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
public class DictDataListView implements View<DictData> {
    public static final ViewMetadata<DictData, DictDataListView> METADATA = 
        new ViewMetadata<DictData, DictDataListView>(
            DictDataFetcher.$
                .status()
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
                .cssClass()
                .children(TargetOf_children.METADATA.getFetcher(), RecursiveFieldConfig::recursive),
            DictDataListView::new
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

    @NotNull
    @Schema(
            description = "子集"
    )
    private List<TargetOf_children> children;

    public DictDataListView() {
    }

    public DictDataListView(@org.jetbrains.annotations.NotNull DictData base) {
        ImmutableSpi spi = (ImmutableSpi)base;
        this.id = base.id();
        this.status = base.status();
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
        this.children = spi.__isLoaded(DictDataProps.CHILDREN.unwrap().getId()) ? 
                    base.children().stream().map(TargetOf_children::new).collect(Collectors.toList()) : 
                    null;
    }

    public static DictDataListView of(@org.jetbrains.annotations.NotNull DictData base) {
        return new DictDataListView(base);
    }

    @Override
    public DictData toEntity() {
        return DictDataDraft.$.produce(draft -> {
            draft.setId(id);
            draft.setStatus(status);
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
            if (children != null) {
                if (children.isEmpty()) {
                    draft.setChildren(Collections.emptyList());
                } else {
                    for (TargetOf_children __e : children) {
                        draft.children(true).add((DictDataDraft)__e.toEntity());
                    }
                }
            } else {
                draft.setChildren(Collections.emptyList());
            }
        });
    }

    @Data
    public static class TargetOf_children implements View<DictData> {
        public static final ViewMetadata<DictData, TargetOf_children> METADATA = 
            new ViewMetadata<DictData, TargetOf_children>(
                DictDataFetcher.$
                    .status()
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
                TargetOf_children::new
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

        @NotNull
        @Schema(
                description = "子集"
        )
        private List<TargetOf_children> children;

        public TargetOf_children() {
        }

        public TargetOf_children(@org.jetbrains.annotations.NotNull DictData base) {
            ImmutableSpi spi = (ImmutableSpi)base;
            this.id = base.id();
            this.status = base.status();
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
            this.children = spi.__isLoaded(DictDataProps.CHILDREN.unwrap().getId()) ? 
                        base.children().stream().map(TargetOf_children::new).collect(Collectors.toList()) : 
                        null;
        }

        public static TargetOf_children of(@org.jetbrains.annotations.NotNull DictData base) {
            return new TargetOf_children(base);
        }

        @Override
        public DictData toEntity() {
            return DictDataDraft.$.produce(draft -> {
                draft.setId(id);
                draft.setStatus(status);
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
                if (children != null) {
                    if (children.isEmpty()) {
                        draft.setChildren(Collections.emptyList());
                    } else {
                        for (TargetOf_children __e : children) {
                            draft.children(true).add((DictDataDraft)__e.toEntity());
                        }
                    }
                } else {
                    draft.setChildren(Collections.emptyList());
                }
            });
        }
    }
}
