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
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.entity.sys.DictTypeDraft;
import top.yangwulang.platform.entity.sys.DictTypeFetcher;
import top.yangwulang.platform.entity.sys.DictTypeProps;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/sys/DictType.dto"
)
@Data
public class DictTypeListView implements View<DictType> {
    public static final ViewMetadata<DictType, DictTypeListView> METADATA = 
        new ViewMetadata<DictType, DictTypeListView>(
            DictTypeFetcher.$
                .status()
                .createBy()
                .createDate()
                .updateBy()
                .updateDate()
                .remarks()
                .dictName()
                .dictType()
                .isSys(),
            DictTypeListView::new
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
            description = "字典名称"
    )
    @Null
    private String dictName;

    @Schema(
            description = "字典类型标签"
    )
    @org.jetbrains.annotations.NotNull
    private String dictType;

    @Schema(
            description = "是否系统自带"
    )
    @Nullable
    private Boolean isSys;

    public DictTypeListView() {
    }

    public DictTypeListView(@org.jetbrains.annotations.NotNull DictType base) {
        ImmutableSpi spi = (ImmutableSpi)base;
        this.id = base.id();
        this.status = base.status();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = spi.__isLoaded(DictTypeProps.REMARKS.unwrap().getId()) ? base.remarks() : null;
        this.dictName = spi.__isLoaded(DictTypeProps.DICT_NAME.unwrap().getId()) ? base.dictName() : null;
        this.dictType = base.dictType();
        this.isSys = spi.__isLoaded(DictTypeProps.IS_SYS.unwrap().getId()) ? base.isSys() : null;
    }

    public static DictTypeListView of(@org.jetbrains.annotations.NotNull DictType base) {
        return new DictTypeListView(base);
    }

    @Override
    public DictType toEntity() {
        return DictTypeDraft.$.produce(draft -> {
            draft.setId(id);
            draft.setStatus(status);
            draft.setCreateBy(createBy);
            draft.setCreateDate(createDate);
            draft.setUpdateBy(updateBy);
            draft.setUpdateDate(updateDate);
            draft.setRemarks(remarks);
            draft.setDictName(dictName);
            draft.setDictType(dictType);
            draft.setIsSys(isSys);
        });
    }
}
