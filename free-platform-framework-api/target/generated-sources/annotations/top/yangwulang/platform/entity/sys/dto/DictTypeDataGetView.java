package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataDraft;
import top.yangwulang.platform.entity.sys.DictDataFetcher;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.entity.sys.DictTypeDraft;
import top.yangwulang.platform.entity.sys.DictTypeFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/DictType.dto"
)
@Schema(
        description = "字典类型标签"
)
public class DictTypeDataGetView implements View<DictType> {
    public static final DtoMetadata<DictType, DictTypeDataGetView> METADATA = 
        new DtoMetadata<DictType, DictTypeDataGetView>(
            DictTypeFetcher.$
                .remarks()
                .dictName()
                .dictType()
                .isSys()
                .data(TargetOf_data.METADATA.getFetcher()),
            DictTypeDataGetView::new
    );

    private static final DtoPropAccessor DATA_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] { DictTypeDraft.Producer.SLOT_DATA },
        DtoPropAccessor.<DictData, TargetOf_data>objectListGetter(TargetOf_data::new),
        DtoPropAccessor.objectListSetter(TargetOf_data::toEntity)
    );

    private String id;

    private String remarks;

    private String dictName;

    private String dictType;

    private Boolean isSys;

    private List<TargetOf_data> data;

    public DictTypeDataGetView() {
    }

    public DictTypeDataGetView(@NotNull DictType base) {
        this.id = base.id();
        this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
        this.dictName = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_DICT_NAME)) ? base.dictName() : null;
        this.dictType = base.dictType();
        this.isSys = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_IS_SYS)) ? base.isSys() : null;
        this.data = DATA_ACCESSOR.get(base);
    }

    @NotNull
    public String getId() {
        if (id == null) {
            throw new IllegalStateException("The property \"id\" is not specified");
        }
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

    @Nullable
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(@Nullable String remarks) {
        this.remarks = remarks;
    }

    @Nullable
    @Schema(
            description = "字典名称"
    )
    public String getDictName() {
        return dictName;
    }

    public void setDictName(@Nullable String dictName) {
        this.dictName = dictName;
    }

    @NotNull
    @Schema(
            description = "字典类型标签"
    )
    public String getDictType() {
        if (dictType == null) {
            throw new IllegalStateException("The property \"dictType\" is not specified");
        }
        return dictType;
    }

    public void setDictType(@NotNull String dictType) {
        this.dictType = dictType;
    }

    @Nullable
    @Schema(
            description = "是否系统自带"
    )
    public Boolean getIsSys() {
        return isSys;
    }

    public void setIsSys(@Nullable Boolean isSys) {
        this.isSys = isSys;
    }

    @NotNull
    @Schema(
            description = "字典数据"
    )
    public List<TargetOf_data> getData() {
        if (data == null) {
            throw new IllegalStateException("The property \"data\" is not specified");
        }
        return data;
    }

    public void setData(@NotNull List<TargetOf_data> data) {
        this.data = data;
    }

    @Override
    public DictType toEntity() {
        return DictTypeDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setRemarks(remarks);
            __draft.setDictName(dictName);
            __draft.setDictType(dictType);
            __draft.setIsSys(isSys);
            DATA_ACCESSOR.set(__draft, data != null ? data : Collections.emptyList());
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(remarks);
        hash = hash * 31 + Objects.hashCode(dictName);
        hash = hash * 31 + Objects.hashCode(dictType);
        hash = hash * 31 + Objects.hashCode(isSys);
        hash = hash * 31 + Objects.hashCode(data);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        DictTypeDataGetView other = (DictTypeDataGetView) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(remarks, other.remarks)) {
            return false;
        }
        if (!Objects.equals(dictName, other.dictName)) {
            return false;
        }
        if (!Objects.equals(dictType, other.dictType)) {
            return false;
        }
        if (!Objects.equals(isSys, other.isSys)) {
            return false;
        }
        if (!Objects.equals(data, other.data)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DictTypeDataGetView").append('(');
        builder.append("id=").append(id);
        builder.append(", remarks=").append(remarks);
        builder.append(", dictName=").append(dictName);
        builder.append(", dictType=").append(dictType);
        builder.append(", isSys=").append(isSys);
        builder.append(", data=").append(data);
        builder.append(')');
        return builder.toString();
    }

    @GeneratedBy
    public static class TargetOf_data implements View<DictData> {
        public static final DtoMetadata<DictData, TargetOf_data> METADATA = 
            new DtoMetadata<DictData, TargetOf_data>(
                DictDataFetcher.$
                    .dictLabel()
                    .dictValue(),
                TargetOf_data::new
        );

        private String dictLabel;

        private String dictValue;

        public TargetOf_data() {
        }

        public TargetOf_data(@NotNull DictData base) {
            this.dictLabel = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DICT_LABEL)) ? base.dictLabel() : null;
            this.dictValue = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(DictDataDraft.Producer.SLOT_DICT_VALUE)) ? base.dictValue() : null;
        }

        @Nullable
        @Schema(
                description = "字典标签"
        )
        public String getDictLabel() {
            return dictLabel;
        }

        public void setDictLabel(@Nullable String dictLabel) {
            this.dictLabel = dictLabel;
        }

        @Nullable
        @Schema(
                description = "字典键值"
        )
        public String getDictValue() {
            return dictValue;
        }

        public void setDictValue(@Nullable String dictValue) {
            this.dictValue = dictValue;
        }

        @Override
        public DictData toEntity() {
            return DictDataDraft.$.produce(__draft -> {
                __draft.setDictLabel(dictLabel);
                __draft.setDictValue(dictValue);
            });
        }

        @Override
        public int hashCode() {
            int hash = Objects.hashCode(dictLabel);
            hash = hash * 31 + Objects.hashCode(dictValue);
            return hash;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            TargetOf_data other = (TargetOf_data) o;
            if (!Objects.equals(dictLabel, other.dictLabel)) {
                return false;
            }
            if (!Objects.equals(dictValue, other.dictValue)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("DictTypeDataGetView.TargetOf_data").append('(');
            builder.append("dictLabel=").append(dictLabel);
            builder.append(", dictValue=").append(dictValue);
            builder.append(')');
            return builder.toString();
        }
    }
}
