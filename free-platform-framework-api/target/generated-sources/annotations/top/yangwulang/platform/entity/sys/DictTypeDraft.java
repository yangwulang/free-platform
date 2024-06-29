package top.yangwulang.platform.entity.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.babyfish.jimmer.CircularReferenceException;
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.jackson.ImmutableModuleRequiredException;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.DraftContext;
import org.babyfish.jimmer.runtime.DraftSpi;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.runtime.Internal;
import org.babyfish.jimmer.runtime.NonSharedList;
import org.babyfish.jimmer.runtime.Visibility;
import org.babyfish.jimmer.sql.OneToMany;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.DataTypeBaseDraft;

@GeneratedBy(
        type = DictType.class
)
public interface DictTypeDraft extends DictType, DataTypeBaseDraft {
    DictTypeDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    DictTypeDraft setId(String id);

    @OldChain
    DictTypeDraft setStatus(int status);

    @OldChain
    DictTypeDraft setCreateBy(String createBy);

    @OldChain
    DictTypeDraft setCreateDate(Date createDate);

    @OldChain
    DictTypeDraft setUpdateBy(String updateBy);

    @OldChain
    DictTypeDraft setUpdateDate(Date updateDate);

    @OldChain
    DictTypeDraft setRemarks(String remarks);

    @OldChain
    DictTypeDraft setDictName(String dictName);

    @OldChain
    DictTypeDraft setDictType(String dictType);

    @OldChain
    DictTypeDraft setIsSys(Boolean isSys);

    List<DictDataDraft> data(boolean autoCreate);

    @OldChain
    DictTypeDraft setData(List<DictData> data);

    @OldChain
    DictTypeDraft addIntoData(DraftConsumer<DictDataDraft> block);

    @OldChain
    DictTypeDraft addIntoData(DictData base, DraftConsumer<DictDataDraft> block);

    @GeneratedBy(
            type = DictType.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_STATUS = 1;

        public static final int SLOT_CREATE_BY = 2;

        public static final int SLOT_CREATE_DATE = 3;

        public static final int SLOT_UPDATE_BY = 4;

        public static final int SLOT_UPDATE_DATE = 5;

        public static final int SLOT_REMARKS = 6;

        public static final int SLOT_DICT_NAME = 7;

        public static final int SLOT_DICT_TYPE = 8;

        public static final int SLOT_IS_SYS = 9;

        public static final int SLOT_DATA = 10;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.134",
                DictType.class,
                Collections.singleton(DataTypeBaseDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (DictType)base)
            )
            .redefine("id", SLOT_ID)
            .redefine("status", SLOT_STATUS)
            .redefine("createBy", SLOT_CREATE_BY)
            .redefine("createDate", SLOT_CREATE_DATE)
            .redefine("updateBy", SLOT_UPDATE_BY)
            .redefine("updateDate", SLOT_UPDATE_DATE)
            .redefine("remarks", SLOT_REMARKS)
            .add(SLOT_DICT_NAME, "dictName", ImmutablePropCategory.SCALAR, String.class, true)
            .key(SLOT_DICT_TYPE, "dictType", String.class, false)
            .add(SLOT_IS_SYS, "isSys", ImmutablePropCategory.SCALAR, Boolean.class, true)
            .add(SLOT_DATA, "data", OneToMany.class, DictData.class, false)
            .build();

        private Producer() {
        }

        public DictType produce(DraftConsumer<DictTypeDraft> block) {
            return produce(null, block);
        }

        public DictType produce(DictType base, DraftConsumer<DictTypeDraft> block) {
            return (DictType)Internal.produce(TYPE, base, block);
        }

        @GeneratedBy(
                type = DictType.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "id", "status", "createBy", "createDate", "updateBy", "updateDate", "remarks", "dictName", "dictType", "isSys", "data"})
        public abstract interface Implementor extends DictType, ImmutableSpi {
            @Override
            default Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_ID:
                    		return id();
                    case SLOT_STATUS:
                    		return (Integer)status();
                    case SLOT_CREATE_BY:
                    		return createBy();
                    case SLOT_CREATE_DATE:
                    		return createDate();
                    case SLOT_UPDATE_BY:
                    		return updateBy();
                    case SLOT_UPDATE_DATE:
                    		return updateDate();
                    case SLOT_REMARKS:
                    		return remarks();
                    case SLOT_DICT_NAME:
                    		return dictName();
                    case SLOT_DICT_TYPE:
                    		return dictType();
                    case SLOT_IS_SYS:
                    		return isSys();
                    case SLOT_DATA:
                    		return data();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.DictType\": \"" + prop + "\"");
                }
            }

            @Override
            default Object __get(String prop) {
                switch (prop) {
                    case "id":
                    		return id();
                    case "status":
                    		return (Integer)status();
                    case "createBy":
                    		return createBy();
                    case "createDate":
                    		return createDate();
                    case "updateBy":
                    		return updateBy();
                    case "updateDate":
                    		return updateDate();
                    case "remarks":
                    		return remarks();
                    case "dictName":
                    		return dictName();
                    case "dictType":
                    		return dictType();
                    case "isSys":
                    		return isSys();
                    case "data":
                    		return data();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.DictType\": \"" + prop + "\"");
                }
            }

            @NotNull
            default String getId() {
                return id();
            }

            @Schema(
                    description = "状态"
            )
            default int getStatus() {
                return status();
            }

            @NotNull
            default String getCreateBy() {
                return createBy();
            }

            @NotNull
            default Date getCreateDate() {
                return createDate();
            }

            @NotNull
            default String getUpdateBy() {
                return updateBy();
            }

            @NotNull
            default Date getUpdateDate() {
                return updateDate();
            }

            @Nullable
            default String getRemarks() {
                return remarks();
            }

            @Schema(
                    description = "字典名称"
            )
            @jakarta.annotation.Nullable
            default String getDictName() {
                return dictName();
            }

            @Schema(
                    description = "字典类型标签"
            )
            default String getDictType() {
                return dictType();
            }

            @Schema(
                    description = "是否系统自带"
            )
            default Boolean getIsSys() {
                return isSys();
            }

            @Schema(
                    description = "字典数据"
            )
            default List<DictData> getData() {
                return data();
            }

            @Override
            default ImmutableType __type() {
                return TYPE;
            }

            default int getDummyPropForJacksonError__() {
                throw new ImmutableModuleRequiredException();
            }
        }

        @GeneratedBy(
                type = DictType.class
        )
        private static class Impl implements Implementor, Cloneable, Serializable {
            private Visibility __visibility;

            String __idValue;

            int __statusValue;

            boolean __statusLoaded = false;

            String __createByValue;

            Date __createDateValue;

            String __updateByValue;

            Date __updateDateValue;

            String __remarksValue;

            boolean __remarksLoaded = false;

            String __dictNameValue;

            boolean __dictNameLoaded = false;

            String __dictTypeValue;

            Boolean __isSysValue;

            boolean __isSysLoaded = false;

            NonSharedList<DictData> __dataValue;

            @Override
            @JsonIgnore
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(DictType.class, "id");
                }
                return __idValue;
            }

            @Override
            @JsonIgnore
            public int status() {
                if (!__statusLoaded) {
                    throw new UnloadedException(DictType.class, "status");
                }
                return __statusValue;
            }

            @Override
            @JsonIgnore
            public String createBy() {
                if (__createByValue == null) {
                    throw new UnloadedException(DictType.class, "createBy");
                }
                return __createByValue;
            }

            @Override
            @JsonIgnore
            public Date createDate() {
                if (__createDateValue == null) {
                    throw new UnloadedException(DictType.class, "createDate");
                }
                return __createDateValue;
            }

            @Override
            @JsonIgnore
            public String updateBy() {
                if (__updateByValue == null) {
                    throw new UnloadedException(DictType.class, "updateBy");
                }
                return __updateByValue;
            }

            @Override
            @JsonIgnore
            public Date updateDate() {
                if (__updateDateValue == null) {
                    throw new UnloadedException(DictType.class, "updateDate");
                }
                return __updateDateValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String remarks() {
                if (!__remarksLoaded) {
                    throw new UnloadedException(DictType.class, "remarks");
                }
                return __remarksValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String dictName() {
                if (!__dictNameLoaded) {
                    throw new UnloadedException(DictType.class, "dictName");
                }
                return __dictNameValue;
            }

            @Override
            @JsonIgnore
            public String dictType() {
                if (__dictTypeValue == null) {
                    throw new UnloadedException(DictType.class, "dictType");
                }
                return __dictTypeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Boolean isSys() {
                if (!__isSysLoaded) {
                    throw new UnloadedException(DictType.class, "isSys");
                }
                return __isSysValue;
            }

            @Override
            @JsonIgnore
            public List<DictData> data() {
                if (__dataValue == null) {
                    throw new UnloadedException(DictType.class, "data");
                }
                return __dataValue;
            }

            @Override
            public Impl clone() {
                try {
                    return (Impl)super.clone();
                } catch(CloneNotSupportedException ex) {
                    throw new AssertionError(ex);
                }
            }

            @Override
            public boolean __isLoaded(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __isLoaded(prop.asName());
                    case SLOT_ID:
                    		return __idValue != null;
                    case SLOT_STATUS:
                    		return __statusLoaded;
                    case SLOT_CREATE_BY:
                    		return __createByValue != null;
                    case SLOT_CREATE_DATE:
                    		return __createDateValue != null;
                    case SLOT_UPDATE_BY:
                    		return __updateByValue != null;
                    case SLOT_UPDATE_DATE:
                    		return __updateDateValue != null;
                    case SLOT_REMARKS:
                    		return __remarksLoaded;
                    case SLOT_DICT_NAME:
                    		return __dictNameLoaded;
                    case SLOT_DICT_TYPE:
                    		return __dictTypeValue != null;
                    case SLOT_IS_SYS:
                    		return __isSysLoaded;
                    case SLOT_DATA:
                    		return __dataValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.DictType\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id":
                    		return __idValue != null;
                    case "status":
                    		return __statusLoaded;
                    case "createBy":
                    		return __createByValue != null;
                    case "createDate":
                    		return __createDateValue != null;
                    case "updateBy":
                    		return __updateByValue != null;
                    case "updateDate":
                    		return __updateDateValue != null;
                    case "remarks":
                    		return __remarksLoaded;
                    case "dictName":
                    		return __dictNameLoaded;
                    case "dictType":
                    		return __dictTypeValue != null;
                    case "isSys":
                    		return __isSysLoaded;
                    case "data":
                    		return __dataValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.DictType\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isVisible(PropId prop) {
                if (__visibility == null) {
                    return true;
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __isVisible(prop.asName());
                    case SLOT_ID:
                    		return __visibility.visible(SLOT_ID);
                    case SLOT_STATUS:
                    		return __visibility.visible(SLOT_STATUS);
                    case SLOT_CREATE_BY:
                    		return __visibility.visible(SLOT_CREATE_BY);
                    case SLOT_CREATE_DATE:
                    		return __visibility.visible(SLOT_CREATE_DATE);
                    case SLOT_UPDATE_BY:
                    		return __visibility.visible(SLOT_UPDATE_BY);
                    case SLOT_UPDATE_DATE:
                    		return __visibility.visible(SLOT_UPDATE_DATE);
                    case SLOT_REMARKS:
                    		return __visibility.visible(SLOT_REMARKS);
                    case SLOT_DICT_NAME:
                    		return __visibility.visible(SLOT_DICT_NAME);
                    case SLOT_DICT_TYPE:
                    		return __visibility.visible(SLOT_DICT_TYPE);
                    case SLOT_IS_SYS:
                    		return __visibility.visible(SLOT_IS_SYS);
                    case SLOT_DATA:
                    		return __visibility.visible(SLOT_DATA);
                    default: return true;
                }
            }

            @Override
            public boolean __isVisible(String prop) {
                if (__visibility == null) {
                    return true;
                }
                switch (prop) {
                    case "id":
                    		return __visibility.visible(SLOT_ID);
                    case "status":
                    		return __visibility.visible(SLOT_STATUS);
                    case "createBy":
                    		return __visibility.visible(SLOT_CREATE_BY);
                    case "createDate":
                    		return __visibility.visible(SLOT_CREATE_DATE);
                    case "updateBy":
                    		return __visibility.visible(SLOT_UPDATE_BY);
                    case "updateDate":
                    		return __visibility.visible(SLOT_UPDATE_DATE);
                    case "remarks":
                    		return __visibility.visible(SLOT_REMARKS);
                    case "dictName":
                    		return __visibility.visible(SLOT_DICT_NAME);
                    case "dictType":
                    		return __visibility.visible(SLOT_DICT_TYPE);
                    case "isSys":
                    		return __visibility.visible(SLOT_IS_SYS);
                    case "data":
                    		return __visibility.visible(SLOT_DATA);
                    default: return true;
                }
            }

            @Override
            public int hashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + __idValue.hashCode();
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (__statusLoaded) {
                    hash = 31 * hash + Integer.hashCode(__statusValue);
                }
                if (__createByValue != null) {
                    hash = 31 * hash + __createByValue.hashCode();
                }
                if (__createDateValue != null) {
                    hash = 31 * hash + __createDateValue.hashCode();
                }
                if (__updateByValue != null) {
                    hash = 31 * hash + __updateByValue.hashCode();
                }
                if (__updateDateValue != null) {
                    hash = 31 * hash + __updateDateValue.hashCode();
                }
                if (__remarksLoaded && __remarksValue != null) {
                    hash = 31 * hash + __remarksValue.hashCode();
                }
                if (__dictNameLoaded && __dictNameValue != null) {
                    hash = 31 * hash + __dictNameValue.hashCode();
                }
                if (__dictTypeValue != null) {
                    hash = 31 * hash + __dictTypeValue.hashCode();
                }
                if (__isSysLoaded && __isSysValue != null) {
                    hash = 31 * hash + __isSysValue.hashCode();
                }
                if (__dataValue != null) {
                    hash = 31 * hash + __dataValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + System.identityHashCode(__idValue);
                }
                if (__statusLoaded) {
                    hash = 31 * hash + Integer.hashCode(__statusValue);
                }
                if (__createByValue != null) {
                    hash = 31 * hash + System.identityHashCode(__createByValue);
                }
                if (__createDateValue != null) {
                    hash = 31 * hash + System.identityHashCode(__createDateValue);
                }
                if (__updateByValue != null) {
                    hash = 31 * hash + System.identityHashCode(__updateByValue);
                }
                if (__updateDateValue != null) {
                    hash = 31 * hash + System.identityHashCode(__updateDateValue);
                }
                if (__remarksLoaded) {
                    hash = 31 * hash + System.identityHashCode(__remarksValue);
                }
                if (__dictNameLoaded) {
                    hash = 31 * hash + System.identityHashCode(__dictNameValue);
                }
                if (__dictTypeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__dictTypeValue);
                }
                if (__isSysLoaded) {
                    hash = 31 * hash + System.identityHashCode(__isSysValue);
                }
                if (__dataValue != null) {
                    hash = 31 * hash + System.identityHashCode(__dataValue);
                }
                return hash;
            }

            @Override
            public int __hashCode(boolean shallow) {
                return shallow ? __shallowHashCode() : hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                boolean __idLoaded = __idValue != null;
                if (__idLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                if (__idLoaded) {
                    // If entity-id is loaded, return directly
                    return Objects.equals(__idValue, __other.id());
                }
                if (__isVisible(PropId.byIndex(SLOT_STATUS)) != __other.__isVisible(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                boolean __statusLoaded = this.__statusLoaded;
                if (__statusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                if (__statusLoaded && __statusValue != __other.status()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                boolean __createByLoaded = __createByValue != null;
                if (__createByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                if (__createByLoaded && !Objects.equals(__createByValue, __other.createBy())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                boolean __createDateLoaded = __createDateValue != null;
                if (__createDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                if (__createDateLoaded && !Objects.equals(__createDateValue, __other.createDate())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                boolean __updateByLoaded = __updateByValue != null;
                if (__updateByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                if (__updateByLoaded && !Objects.equals(__updateByValue, __other.updateBy())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                boolean __updateDateLoaded = __updateDateValue != null;
                if (__updateDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                if (__updateDateLoaded && !Objects.equals(__updateDateValue, __other.updateDate())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REMARKS)) != __other.__isVisible(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                boolean __remarksLoaded = this.__remarksLoaded;
                if (__remarksLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                if (__remarksLoaded && !Objects.equals(__remarksValue, __other.remarks())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_NAME))) {
                    return false;
                }
                boolean __dictNameLoaded = this.__dictNameLoaded;
                if (__dictNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_NAME))) {
                    return false;
                }
                if (__dictNameLoaded && !Objects.equals(__dictNameValue, __other.dictName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_TYPE))) {
                    return false;
                }
                boolean __dictTypeLoaded = __dictTypeValue != null;
                if (__dictTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_TYPE))) {
                    return false;
                }
                if (__dictTypeLoaded && !Objects.equals(__dictTypeValue, __other.dictType())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_IS_SYS)) != __other.__isVisible(PropId.byIndex(SLOT_IS_SYS))) {
                    return false;
                }
                boolean __isSysLoaded = this.__isSysLoaded;
                if (__isSysLoaded != __other.__isLoaded(PropId.byIndex(SLOT_IS_SYS))) {
                    return false;
                }
                if (__isSysLoaded && !Objects.equals(__isSysValue, __other.isSys())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DATA)) != __other.__isVisible(PropId.byIndex(SLOT_DATA))) {
                    return false;
                }
                boolean __dataLoaded = __dataValue != null;
                if (__dataLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DATA))) {
                    return false;
                }
                if (__dataLoaded && !Objects.equals(__dataValue, __other.data())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                boolean __idLoaded = __idValue != null;
                if (__idLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                if (__idLoaded && __idValue != __other.id()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_STATUS)) != __other.__isVisible(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                boolean __statusLoaded = this.__statusLoaded;
                if (__statusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                if (__statusLoaded && __statusValue != __other.status()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                boolean __createByLoaded = __createByValue != null;
                if (__createByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                if (__createByLoaded && __createByValue != __other.createBy()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                boolean __createDateLoaded = __createDateValue != null;
                if (__createDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                if (__createDateLoaded && __createDateValue != __other.createDate()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                boolean __updateByLoaded = __updateByValue != null;
                if (__updateByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                if (__updateByLoaded && __updateByValue != __other.updateBy()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                boolean __updateDateLoaded = __updateDateValue != null;
                if (__updateDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                if (__updateDateLoaded && __updateDateValue != __other.updateDate()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REMARKS)) != __other.__isVisible(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                boolean __remarksLoaded = this.__remarksLoaded;
                if (__remarksLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                if (__remarksLoaded && __remarksValue != __other.remarks()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_NAME))) {
                    return false;
                }
                boolean __dictNameLoaded = this.__dictNameLoaded;
                if (__dictNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_NAME))) {
                    return false;
                }
                if (__dictNameLoaded && __dictNameValue != __other.dictName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_TYPE))) {
                    return false;
                }
                boolean __dictTypeLoaded = __dictTypeValue != null;
                if (__dictTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_TYPE))) {
                    return false;
                }
                if (__dictTypeLoaded && __dictTypeValue != __other.dictType()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_IS_SYS)) != __other.__isVisible(PropId.byIndex(SLOT_IS_SYS))) {
                    return false;
                }
                boolean __isSysLoaded = this.__isSysLoaded;
                if (__isSysLoaded != __other.__isLoaded(PropId.byIndex(SLOT_IS_SYS))) {
                    return false;
                }
                if (__isSysLoaded && __isSysValue != __other.isSys()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DATA)) != __other.__isVisible(PropId.byIndex(SLOT_DATA))) {
                    return false;
                }
                boolean __dataLoaded = __dataValue != null;
                if (__dataLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DATA))) {
                    return false;
                }
                if (__dataLoaded && __dataValue != __other.data()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString(this);
            }
        }

        @GeneratedBy(
                type = DictType.class
        )
        private static class DraftImpl implements Implementor, DraftSpi, DictTypeDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, DictType base) {
                __ctx = ctx;
                if (base != null) {
                    __base = (Impl)base;
                }
                else {
                    __modified = new Impl();
                }
            }

            @Override
            public boolean __isLoaded(PropId prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isLoaded(String prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isVisible(PropId prop) {
                return (__modified!= null ? __modified : __base).__isVisible(prop);
            }

            @Override
            public boolean __isVisible(String prop) {
                return (__modified!= null ? __modified : __base).__isVisible(prop);
            }

            @Override
            public int hashCode() {
                return (__modified!= null ? __modified : __base).hashCode();
            }

            @Override
            public int __hashCode(boolean shallow) {
                return (__modified!= null ? __modified : __base).__hashCode(shallow);
            }

            @Override
            public boolean equals(Object obj) {
                return (__modified!= null ? __modified : __base).equals(obj);
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return (__modified!= null ? __modified : __base).__equals(obj, shallow);
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString((__modified!= null ? __modified : __base));
            }

            @Override
            @JsonIgnore
            public String id() {
                return (__modified!= null ? __modified : __base).id();
            }

            @Override
            public DictTypeDraft setId(String id) {
                if (id == null) {
                    throw new IllegalArgumentException(
                        "'id' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__idValue = id;
                return this;
            }

            @Override
            @JsonIgnore
            public int status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public DictTypeDraft setStatus(int status) {
                Impl __tmpModified = __modified();
                __tmpModified.__statusValue = status;
                __tmpModified.__statusLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public String createBy() {
                return (__modified!= null ? __modified : __base).createBy();
            }

            @Override
            public DictTypeDraft setCreateBy(String createBy) {
                if (createBy == null) {
                    throw new IllegalArgumentException(
                        "'createBy' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__createByValue = createBy;
                return this;
            }

            @Override
            @JsonIgnore
            public Date createDate() {
                return (__modified!= null ? __modified : __base).createDate();
            }

            @Override
            public DictTypeDraft setCreateDate(Date createDate) {
                if (createDate == null) {
                    throw new IllegalArgumentException(
                        "'createDate' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__createDateValue = createDate;
                return this;
            }

            @Override
            @JsonIgnore
            public String updateBy() {
                return (__modified!= null ? __modified : __base).updateBy();
            }

            @Override
            public DictTypeDraft setUpdateBy(String updateBy) {
                if (updateBy == null) {
                    throw new IllegalArgumentException(
                        "'updateBy' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__updateByValue = updateBy;
                return this;
            }

            @Override
            @JsonIgnore
            public Date updateDate() {
                return (__modified!= null ? __modified : __base).updateDate();
            }

            @Override
            public DictTypeDraft setUpdateDate(Date updateDate) {
                if (updateDate == null) {
                    throw new IllegalArgumentException(
                        "'updateDate' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__updateDateValue = updateDate;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String remarks() {
                return (__modified!= null ? __modified : __base).remarks();
            }

            @Override
            public DictTypeDraft setRemarks(String remarks) {
                Impl __tmpModified = __modified();
                __tmpModified.__remarksValue = remarks;
                __tmpModified.__remarksLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String dictName() {
                return (__modified!= null ? __modified : __base).dictName();
            }

            @Override
            public DictTypeDraft setDictName(String dictName) {
                Impl __tmpModified = __modified();
                __tmpModified.__dictNameValue = dictName;
                __tmpModified.__dictNameLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public String dictType() {
                return (__modified!= null ? __modified : __base).dictType();
            }

            @Override
            public DictTypeDraft setDictType(String dictType) {
                if (dictType == null) {
                    throw new IllegalArgumentException(
                        "'dictType' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__dictTypeValue = dictType;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Boolean isSys() {
                return (__modified!= null ? __modified : __base).isSys();
            }

            @Override
            public DictTypeDraft setIsSys(Boolean isSys) {
                Impl __tmpModified = __modified();
                __tmpModified.__isSysValue = isSys;
                __tmpModified.__isSysLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public List<DictData> data() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).data(), DictData.class, true);
            }

            @Override
            public List<DictDataDraft> data(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_DATA)))) {
                    setData(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).data(), DictData.class, true);
            }

            @Override
            public DictTypeDraft setData(List<DictData> data) {
                if (data == null) {
                    throw new IllegalArgumentException(
                        "'data' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__dataValue = NonSharedList.of(__tmpModified.__dataValue, data);
                return this;
            }

            @Override
            public DictTypeDraft addIntoData(DraftConsumer<DictDataDraft> block) {
                addIntoData(null, block);
                return this;
            }

            @Override
            public DictTypeDraft addIntoData(DictData base, DraftConsumer<DictDataDraft> block) {
                data(true).add((DictDataDraft)DictDataDraft.$.produce(base, block));
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(PropId prop, Object value) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__set(prop.asName(), value);
                    return;
                    case SLOT_ID:
                    		setId((String)value);break;
                    case SLOT_STATUS:
                    		if (value == null) throw new IllegalArgumentException("'status' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setStatus((Integer)value);
                            break;
                    case SLOT_CREATE_BY:
                    		setCreateBy((String)value);break;
                    case SLOT_CREATE_DATE:
                    		setCreateDate((Date)value);break;
                    case SLOT_UPDATE_BY:
                    		setUpdateBy((String)value);break;
                    case SLOT_UPDATE_DATE:
                    		setUpdateDate((Date)value);break;
                    case SLOT_REMARKS:
                    		setRemarks((String)value);break;
                    case SLOT_DICT_NAME:
                    		setDictName((String)value);break;
                    case SLOT_DICT_TYPE:
                    		setDictType((String)value);break;
                    case SLOT_IS_SYS:
                    		setIsSys((Boolean)value);break;
                    case SLOT_DATA:
                    		setData((List<DictData>)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.DictType\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id":
                    		setId((String)value);break;
                    case "status":
                    		if (value == null) throw new IllegalArgumentException("'status' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setStatus((Integer)value);
                            break;
                    case "createBy":
                    		setCreateBy((String)value);break;
                    case "createDate":
                    		setCreateDate((Date)value);break;
                    case "updateBy":
                    		setUpdateBy((String)value);break;
                    case "updateDate":
                    		setUpdateDate((Date)value);break;
                    case "remarks":
                    		setRemarks((String)value);break;
                    case "dictName":
                    		setDictName((String)value);break;
                    case "dictType":
                    		setDictType((String)value);break;
                    case "isSys":
                    		setIsSys((Boolean)value);break;
                    case "data":
                    		setData((List<DictData>)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.DictType\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(11);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_ID:
                    		__visibility.show(SLOT_ID, visible);break;
                    case SLOT_STATUS:
                    		__visibility.show(SLOT_STATUS, visible);break;
                    case SLOT_CREATE_BY:
                    		__visibility.show(SLOT_CREATE_BY, visible);break;
                    case SLOT_CREATE_DATE:
                    		__visibility.show(SLOT_CREATE_DATE, visible);break;
                    case SLOT_UPDATE_BY:
                    		__visibility.show(SLOT_UPDATE_BY, visible);break;
                    case SLOT_UPDATE_DATE:
                    		__visibility.show(SLOT_UPDATE_DATE, visible);break;
                    case SLOT_REMARKS:
                    		__visibility.show(SLOT_REMARKS, visible);break;
                    case SLOT_DICT_NAME:
                    		__visibility.show(SLOT_DICT_NAME, visible);break;
                    case SLOT_DICT_TYPE:
                    		__visibility.show(SLOT_DICT_TYPE, visible);break;
                    case SLOT_IS_SYS:
                    		__visibility.show(SLOT_IS_SYS, visible);break;
                    case SLOT_DATA:
                    		__visibility.show(SLOT_DATA, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.sys.DictType\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __show(String prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(11);
                }
                switch (prop) {
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
                    case "status":
                    		__visibility.show(SLOT_STATUS, visible);break;
                    case "createBy":
                    		__visibility.show(SLOT_CREATE_BY, visible);break;
                    case "createDate":
                    		__visibility.show(SLOT_CREATE_DATE, visible);break;
                    case "updateBy":
                    		__visibility.show(SLOT_UPDATE_BY, visible);break;
                    case "updateDate":
                    		__visibility.show(SLOT_UPDATE_DATE, visible);break;
                    case "remarks":
                    		__visibility.show(SLOT_REMARKS, visible);break;
                    case "dictName":
                    		__visibility.show(SLOT_DICT_NAME, visible);break;
                    case "dictType":
                    		__visibility.show(SLOT_DICT_TYPE, visible);break;
                    case "isSys":
                    		__visibility.show(SLOT_IS_SYS, visible);break;
                    case "data":
                    		__visibility.show(SLOT_DATA, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.sys.DictType\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __unload(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__unload(prop.asName());
                    return;
                    case SLOT_ID:
                    		__modified().__idValue = null;break;
                    case SLOT_STATUS:
                    		__modified().__statusLoaded = false;break;
                    case SLOT_CREATE_BY:
                    		__modified().__createByValue = null;break;
                    case SLOT_CREATE_DATE:
                    		__modified().__createDateValue = null;break;
                    case SLOT_UPDATE_BY:
                    		__modified().__updateByValue = null;break;
                    case SLOT_UPDATE_DATE:
                    		__modified().__updateDateValue = null;break;
                    case SLOT_REMARKS:
                    		__modified().__remarksLoaded = false;break;
                    case SLOT_DICT_NAME:
                    		__modified().__dictNameLoaded = false;break;
                    case SLOT_DICT_TYPE:
                    		__modified().__dictTypeValue = null;break;
                    case SLOT_IS_SYS:
                    		__modified().__isSysLoaded = false;break;
                    case SLOT_DATA:
                    		__modified().__dataValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.DictType\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "id":
                    		__modified().__idValue = null;break;
                    case "status":
                    		__modified().__statusLoaded = false;break;
                    case "createBy":
                    		__modified().__createByValue = null;break;
                    case "createDate":
                    		__modified().__createDateValue = null;break;
                    case "updateBy":
                    		__modified().__updateByValue = null;break;
                    case "updateDate":
                    		__modified().__updateDateValue = null;break;
                    case "remarks":
                    		__modified().__remarksLoaded = false;break;
                    case "dictName":
                    		__modified().__dictNameLoaded = false;break;
                    case "dictType":
                    		__modified().__dictTypeValue = null;break;
                    case "isSys":
                    		__modified().__isSysLoaded = false;break;
                    case "data":
                    		__modified().__dataValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.DictType\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public DraftContext __draftContext() {
                return __ctx;
            }

            @Override
            public Object __resolve() {
                if (__resolving) {
                    throw new CircularReferenceException();
                }
                __resolving = true;
                try {
                    Implementor base = __base;
                    Impl __tmpModified = __modified;
                    if (__tmpModified == null) {
                        if (base.__isLoaded(PropId.byIndex(SLOT_DATA))) {
                            List<DictData> oldValue = base.data();
                            List<DictData> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setData(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__dataValue = NonSharedList.of(__tmpModified.__dataValue, __ctx.resolveList(__tmpModified.__dataValue));
                    }
                    if (__base != null && __tmpModified == null) {
                        return base;
                    }
                    return __tmpModified;
                }
                finally {
                    __resolving = false;
                }
            }

            Impl __modified() {
                Impl __tmpModified = __modified;
                if (__tmpModified == null) {
                    __tmpModified = __base.clone();
                    __modified = __tmpModified;
                }
                return __tmpModified;
            }
        }
    }

    @GeneratedBy(
            type = DictType.class
    )
    class Builder {
        private final Producer.DraftImpl __draft;

        public Builder() {
            __draft = new Producer.DraftImpl(null, null);
        }

        @NotNull
        public Builder id(String id) {
            if (id != null) {
                __draft.setId(id);
            }
            return this;
        }

        @Schema(
                description = "状态"
        )
        public Builder status(Integer status) {
            if (status != null) {
                __draft.setStatus(status);
            }
            return this;
        }

        @NotNull
        public Builder createBy(String createBy) {
            if (createBy != null) {
                __draft.setCreateBy(createBy);
            }
            return this;
        }

        @NotNull
        public Builder createDate(Date createDate) {
            if (createDate != null) {
                __draft.setCreateDate(createDate);
            }
            return this;
        }

        @NotNull
        public Builder updateBy(String updateBy) {
            if (updateBy != null) {
                __draft.setUpdateBy(updateBy);
            }
            return this;
        }

        @NotNull
        public Builder updateDate(Date updateDate) {
            if (updateDate != null) {
                __draft.setUpdateDate(updateDate);
            }
            return this;
        }

        @Nullable
        public Builder remarks(String remarks) {
            __draft.setRemarks(remarks);
            return this;
        }

        @Schema(
                description = "字典名称"
        )
        @jakarta.annotation.Nullable
        public Builder dictName(String dictName) {
            __draft.setDictName(dictName);
            return this;
        }

        @Schema(
                description = "字典类型标签"
        )
        public Builder dictType(String dictType) {
            if (dictType != null) {
                __draft.setDictType(dictType);
            }
            return this;
        }

        @Schema(
                description = "是否系统自带"
        )
        public Builder isSys(Boolean isSys) {
            __draft.setIsSys(isSys);
            return this;
        }

        @Schema(
                description = "字典数据"
        )
        public Builder data(List<DictData> data) {
            if (data != null) {
                __draft.setData(data);
            }
            return this;
        }

        public DictType build() {
            return (DictType)__draft.__modified();
        }
    }
}
