package top.yangwulang.platform.entity.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
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
import org.babyfish.jimmer.sql.ManyToOne;
import org.babyfish.jimmer.sql.OneToMany;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.DataTypeBaseDraft;

@GeneratedBy(
        type = DictData.class
)
public interface DictDataDraft extends DictData, DataTypeBaseDraft {
    DictDataDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    DictDataDraft setId(String id);

    @OldChain
    DictDataDraft setStatus(int status);

    @OldChain
    DictDataDraft setCreateBy(String createBy);

    @OldChain
    DictDataDraft setCreateDate(Date createDate);

    @OldChain
    DictDataDraft setUpdateBy(String updateBy);

    @OldChain
    DictDataDraft setUpdateDate(Date updateDate);

    @OldChain
    DictDataDraft setRemarks(String remarks);

    @Nullable
    DictDataDraft parent();

    DictDataDraft parent(boolean autoCreate);

    @OldChain
    DictDataDraft setParent(DictData parent);

    @OldChain
    DictDataDraft applyParent(DraftConsumer<DictDataDraft> block);

    @OldChain
    DictDataDraft applyParent(DictData base, DraftConsumer<DictDataDraft> block);

    List<DictDataDraft> children(boolean autoCreate);

    @OldChain
    DictDataDraft setChildren(List<DictData> children);

    @OldChain
    DictDataDraft addIntoChildren(DraftConsumer<DictDataDraft> block);

    @OldChain
    DictDataDraft addIntoChildren(DictData base, DraftConsumer<DictDataDraft> block);

    @Nullable
    DictTypeDraft dictType();

    DictTypeDraft dictType(boolean autoCreate);

    @OldChain
    DictDataDraft setDictType(DictType dictType);

    @OldChain
    DictDataDraft applyDictType(DraftConsumer<DictTypeDraft> block);

    @OldChain
    DictDataDraft applyDictType(DictType base, DraftConsumer<DictTypeDraft> block);

    @OldChain
    DictDataDraft setParentId(String parentId);

    @OldChain
    DictDataDraft setDictTypeId(String dictTypeId);

    @OldChain
    DictDataDraft setDictLabel(String dictLabel);

    @OldChain
    DictDataDraft setDictValue(String dictValue);

    @OldChain
    DictDataDraft setIsSys(Boolean isSys);

    @OldChain
    DictDataDraft setDescription(String description);

    @OldChain
    DictDataDraft setCssStyle(String cssStyle);

    @OldChain
    DictDataDraft setCssClass(String cssClass);

    @OldChain
    DictDataDraft setCorpCode(String corpCode);

    @OldChain
    DictDataDraft setCorpName(String corpName);

    @GeneratedBy(
            type = DictData.class
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

        public static final int SLOT_PARENT = 7;

        public static final int SLOT_CHILDREN = 8;

        public static final int SLOT_DICT_TYPE = 9;

        public static final int SLOT_PARENT_ID = 10;

        public static final int SLOT_DICT_TYPE_ID = 11;

        public static final int SLOT_DICT_LABEL = 12;

        public static final int SLOT_DICT_VALUE = 13;

        public static final int SLOT_IS_SYS = 14;

        public static final int SLOT_DESCRIPTION = 15;

        public static final int SLOT_CSS_STYLE = 16;

        public static final int SLOT_CSS_CLASS = 17;

        public static final int SLOT_CORP_CODE = 18;

        public static final int SLOT_CORP_NAME = 19;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.184",
                DictData.class,
                Collections.singleton(DataTypeBaseDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (DictData)base)
            )
            .redefine("id", SLOT_ID)
            .redefine("status", SLOT_STATUS)
            .redefine("createBy", SLOT_CREATE_BY)
            .redefine("createDate", SLOT_CREATE_DATE)
            .redefine("updateBy", SLOT_UPDATE_BY)
            .redefine("updateDate", SLOT_UPDATE_DATE)
            .redefine("remarks", SLOT_REMARKS)
            .keyReference(SLOT_PARENT, "parent", ManyToOne.class, DictData.class, true)
            .add(SLOT_CHILDREN, "children", OneToMany.class, DictData.class, false)
            .keyReference(SLOT_DICT_TYPE, "dictType", ManyToOne.class, DictType.class, true)
            .add(SLOT_PARENT_ID, "parentId", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_DICT_TYPE_ID, "dictTypeId", ImmutablePropCategory.SCALAR, String.class, true)
            .key(SLOT_DICT_LABEL, "dictLabel", String.class, true)
            .key(SLOT_DICT_VALUE, "dictValue", String.class, true)
            .add(SLOT_IS_SYS, "isSys", ImmutablePropCategory.SCALAR, Boolean.class, true)
            .add(SLOT_DESCRIPTION, "description", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_CSS_STYLE, "cssStyle", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_CSS_CLASS, "cssClass", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_CORP_CODE, "corpCode", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_CORP_NAME, "corpName", ImmutablePropCategory.SCALAR, String.class, true)
            .build();

        private Producer() {
        }

        public DictData produce(DraftConsumer<DictDataDraft> block) {
            return produce(null, block);
        }

        public DictData produce(DictData base, DraftConsumer<DictDataDraft> block) {
            return (DictData)Internal.produce(TYPE, base, block);
        }

        /**
         * Class, not interface, for free-marker
         */
        @GeneratedBy(
                type = DictData.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "id", "status", "createBy", "createDate", "updateBy", "updateDate", "remarks", "parent", "children", "dictType", "parentId", "dictTypeId", "dictLabel", "dictValue", "isSys", "description", "cssStyle", "cssClass", "corpCode", "corpName"})
        public abstract static class Implementor implements DictData, ImmutableSpi {
            @Override
            public final Object __get(PropId prop) {
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
                    case SLOT_PARENT:
                    		return parent();
                    case SLOT_CHILDREN:
                    		return children();
                    case SLOT_DICT_TYPE:
                    		return dictType();
                    case SLOT_PARENT_ID:
                    		return parentId();
                    case SLOT_DICT_TYPE_ID:
                    		return dictTypeId();
                    case SLOT_DICT_LABEL:
                    		return dictLabel();
                    case SLOT_DICT_VALUE:
                    		return dictValue();
                    case SLOT_IS_SYS:
                    		return isSys();
                    case SLOT_DESCRIPTION:
                    		return description();
                    case SLOT_CSS_STYLE:
                    		return cssStyle();
                    case SLOT_CSS_CLASS:
                    		return cssClass();
                    case SLOT_CORP_CODE:
                    		return corpCode();
                    case SLOT_CORP_NAME:
                    		return corpName();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.DictData\": \"" + prop + "\"");
                }
            }

            @Override
            public final Object __get(String prop) {
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
                    case "parent":
                    		return parent();
                    case "children":
                    		return children();
                    case "dictType":
                    		return dictType();
                    case "parentId":
                    		return parentId();
                    case "dictTypeId":
                    		return dictTypeId();
                    case "dictLabel":
                    		return dictLabel();
                    case "dictValue":
                    		return dictValue();
                    case "isSys":
                    		return isSys();
                    case "description":
                    		return description();
                    case "cssStyle":
                    		return cssStyle();
                    case "cssClass":
                    		return cssClass();
                    case "corpCode":
                    		return corpCode();
                    case "corpName":
                    		return corpName();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.DictData\": \"" + prop + "\"");
                }
            }

            @NotNull
            public final String getId() {
                return id();
            }

            @Schema(
                    description = "状态"
            )
            public final int getStatus() {
                return status();
            }

            @NotNull
            public final String getCreateBy() {
                return createBy();
            }

            @NotNull
            public final Date getCreateDate() {
                return createDate();
            }

            @NotNull
            public final String getUpdateBy() {
                return updateBy();
            }

            @NotNull
            public final Date getUpdateDate() {
                return updateDate();
            }

            @Nullable
            public final String getRemarks() {
                return remarks();
            }

            @Schema(
                    description = "父级"
            )
            @jakarta.annotation.Nullable
            public final DictData getParent() {
                return parent();
            }

            @NotNull
            @Schema(
                    description = "子集"
            )
            public final List<DictData> getChildren() {
                return children();
            }

            @Schema(
                    description = "字典类型"
            )
            @jakarta.annotation.Nullable
            public final DictType getDictType() {
                return dictType();
            }

            @Schema(
                    description = "父级id"
            )
            @jakarta.annotation.Nullable
            public final String getParentId() {
                return parentId();
            }

            @Schema(
                    description = "字典类型id"
            )
            @jakarta.annotation.Nullable
            public final String getDictTypeId() {
                return dictTypeId();
            }

            @Schema(
                    description = "字典标签"
            )
            @jakarta.annotation.Nullable
            public final String getDictLabel() {
                return dictLabel();
            }

            @Schema(
                    description = "字典键值"
            )
            @jakarta.annotation.Nullable
            public final String getDictValue() {
                return dictValue();
            }

            @Schema(
                    description = "系统内置（1是 0否）"
            )
            public final Boolean getIsSys() {
                return isSys();
            }

            @Schema(
                    description = "字典描述"
            )
            @jakarta.annotation.Nullable
            public final String getDescription() {
                return description();
            }

            @Schema(
                    description = "css样式（如：color:red)"
            )
            @jakarta.annotation.Nullable
            public final String getCssStyle() {
                return cssStyle();
            }

            @Schema(
                    description = "css类名（如：red）"
            )
            @jakarta.annotation.Nullable
            public final String getCssClass() {
                return cssClass();
            }

            @Schema(
                    description = "租户代码"
            )
            @jakarta.annotation.Nullable
            public final String getCorpCode() {
                return corpCode();
            }

            @Schema(
                    description = "租户名称"
            )
            @jakarta.annotation.Nullable
            public final String getCorpName() {
                return corpName();
            }

            @Override
            public final ImmutableType __type() {
                return TYPE;
            }

            public final int getDummyPropForJacksonError__() {
                throw new ImmutableModuleRequiredException();
            }
        }

        @GeneratedBy(
                type = DictData.class
        )
        private static class Impl extends Implementor implements Cloneable, Serializable {
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

            DictData __parentValue;

            boolean __parentLoaded = false;

            NonSharedList<DictData> __childrenValue;

            DictType __dictTypeValue;

            boolean __dictTypeLoaded = false;

            String __dictLabelValue;

            boolean __dictLabelLoaded = false;

            String __dictValueValue;

            boolean __dictValueLoaded = false;

            Boolean __isSysValue;

            boolean __isSysLoaded = false;

            String __descriptionValue;

            boolean __descriptionLoaded = false;

            String __cssStyleValue;

            boolean __cssStyleLoaded = false;

            String __cssClassValue;

            boolean __cssClassLoaded = false;

            String __corpCodeValue;

            boolean __corpCodeLoaded = false;

            String __corpNameValue;

            boolean __corpNameLoaded = false;

            Impl() {
                __visibility = Visibility.of(20);
                __visibility.show(SLOT_PARENT_ID, false);
                __visibility.show(SLOT_DICT_TYPE_ID, false);
            }

            @Override
            @JsonIgnore
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(DictData.class, "id");
                }
                return __idValue;
            }

            @Override
            @JsonIgnore
            public int status() {
                if (!__statusLoaded) {
                    throw new UnloadedException(DictData.class, "status");
                }
                return __statusValue;
            }

            @Override
            @JsonIgnore
            public String createBy() {
                if (__createByValue == null) {
                    throw new UnloadedException(DictData.class, "createBy");
                }
                return __createByValue;
            }

            @Override
            @JsonIgnore
            public Date createDate() {
                if (__createDateValue == null) {
                    throw new UnloadedException(DictData.class, "createDate");
                }
                return __createDateValue;
            }

            @Override
            @JsonIgnore
            public String updateBy() {
                if (__updateByValue == null) {
                    throw new UnloadedException(DictData.class, "updateBy");
                }
                return __updateByValue;
            }

            @Override
            @JsonIgnore
            public Date updateDate() {
                if (__updateDateValue == null) {
                    throw new UnloadedException(DictData.class, "updateDate");
                }
                return __updateDateValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String remarks() {
                if (!__remarksLoaded) {
                    throw new UnloadedException(DictData.class, "remarks");
                }
                return __remarksValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public DictData parent() {
                if (!__parentLoaded) {
                    throw new UnloadedException(DictData.class, "parent");
                }
                return __parentValue;
            }

            @Override
            @JsonIgnore
            public List<DictData> children() {
                if (__childrenValue == null) {
                    throw new UnloadedException(DictData.class, "children");
                }
                return __childrenValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public DictType dictType() {
                if (!__dictTypeLoaded) {
                    throw new UnloadedException(DictData.class, "dictType");
                }
                return __dictTypeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String parentId() {
                DictData __target = parent();
                return __target != null ? __target.id() : null;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String dictTypeId() {
                DictType __target = dictType();
                return __target != null ? __target.id() : null;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String dictLabel() {
                if (!__dictLabelLoaded) {
                    throw new UnloadedException(DictData.class, "dictLabel");
                }
                return __dictLabelValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String dictValue() {
                if (!__dictValueLoaded) {
                    throw new UnloadedException(DictData.class, "dictValue");
                }
                return __dictValueValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Boolean isSys() {
                if (!__isSysLoaded) {
                    throw new UnloadedException(DictData.class, "isSys");
                }
                return __isSysValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String description() {
                if (!__descriptionLoaded) {
                    throw new UnloadedException(DictData.class, "description");
                }
                return __descriptionValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String cssStyle() {
                if (!__cssStyleLoaded) {
                    throw new UnloadedException(DictData.class, "cssStyle");
                }
                return __cssStyleValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String cssClass() {
                if (!__cssClassLoaded) {
                    throw new UnloadedException(DictData.class, "cssClass");
                }
                return __cssClassValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String corpCode() {
                if (!__corpCodeLoaded) {
                    throw new UnloadedException(DictData.class, "corpCode");
                }
                return __corpCodeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String corpName() {
                if (!__corpNameLoaded) {
                    throw new UnloadedException(DictData.class, "corpName");
                }
                return __corpNameValue;
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
                    case SLOT_PARENT:
                    		return __parentLoaded;
                    case SLOT_CHILDREN:
                    		return __childrenValue != null;
                    case SLOT_DICT_TYPE:
                    		return __dictTypeLoaded;
                    case SLOT_PARENT_ID:
                    		return __isLoaded(PropId.byIndex(SLOT_PARENT)) && (parent() == null || 
                            	((ImmutableSpi)parent()).__isLoaded(PropId.byIndex(Producer.SLOT_ID)));
                    case SLOT_DICT_TYPE_ID:
                    		return __isLoaded(PropId.byIndex(SLOT_DICT_TYPE)) && (dictType() == null || 
                            	((ImmutableSpi)dictType()).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_ID)));
                    case SLOT_DICT_LABEL:
                    		return __dictLabelLoaded;
                    case SLOT_DICT_VALUE:
                    		return __dictValueLoaded;
                    case SLOT_IS_SYS:
                    		return __isSysLoaded;
                    case SLOT_DESCRIPTION:
                    		return __descriptionLoaded;
                    case SLOT_CSS_STYLE:
                    		return __cssStyleLoaded;
                    case SLOT_CSS_CLASS:
                    		return __cssClassLoaded;
                    case SLOT_CORP_CODE:
                    		return __corpCodeLoaded;
                    case SLOT_CORP_NAME:
                    		return __corpNameLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.DictData\": \"" + prop + "\"");
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
                    case "parent":
                    		return __parentLoaded;
                    case "children":
                    		return __childrenValue != null;
                    case "dictType":
                    		return __dictTypeLoaded;
                    case "parentId":
                    		return __isLoaded(PropId.byIndex(SLOT_PARENT)) && (parent() == null || 
                            	((ImmutableSpi)parent()).__isLoaded(PropId.byIndex(Producer.SLOT_ID)));
                    case "dictTypeId":
                    		return __isLoaded(PropId.byIndex(SLOT_DICT_TYPE)) && (dictType() == null || 
                            	((ImmutableSpi)dictType()).__isLoaded(PropId.byIndex(DictTypeDraft.Producer.SLOT_ID)));
                    case "dictLabel":
                    		return __dictLabelLoaded;
                    case "dictValue":
                    		return __dictValueLoaded;
                    case "isSys":
                    		return __isSysLoaded;
                    case "description":
                    		return __descriptionLoaded;
                    case "cssStyle":
                    		return __cssStyleLoaded;
                    case "cssClass":
                    		return __cssClassLoaded;
                    case "corpCode":
                    		return __corpCodeLoaded;
                    case "corpName":
                    		return __corpNameLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.DictData\": \"" + prop + "\"");
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
                    case SLOT_PARENT:
                    		return __visibility.visible(SLOT_PARENT);
                    case SLOT_CHILDREN:
                    		return __visibility.visible(SLOT_CHILDREN);
                    case SLOT_DICT_TYPE:
                    		return __visibility.visible(SLOT_DICT_TYPE);
                    case SLOT_PARENT_ID:
                    		return __visibility.visible(SLOT_PARENT_ID);
                    case SLOT_DICT_TYPE_ID:
                    		return __visibility.visible(SLOT_DICT_TYPE_ID);
                    case SLOT_DICT_LABEL:
                    		return __visibility.visible(SLOT_DICT_LABEL);
                    case SLOT_DICT_VALUE:
                    		return __visibility.visible(SLOT_DICT_VALUE);
                    case SLOT_IS_SYS:
                    		return __visibility.visible(SLOT_IS_SYS);
                    case SLOT_DESCRIPTION:
                    		return __visibility.visible(SLOT_DESCRIPTION);
                    case SLOT_CSS_STYLE:
                    		return __visibility.visible(SLOT_CSS_STYLE);
                    case SLOT_CSS_CLASS:
                    		return __visibility.visible(SLOT_CSS_CLASS);
                    case SLOT_CORP_CODE:
                    		return __visibility.visible(SLOT_CORP_CODE);
                    case SLOT_CORP_NAME:
                    		return __visibility.visible(SLOT_CORP_NAME);
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
                    case "parent":
                    		return __visibility.visible(SLOT_PARENT);
                    case "children":
                    		return __visibility.visible(SLOT_CHILDREN);
                    case "dictType":
                    		return __visibility.visible(SLOT_DICT_TYPE);
                    case "parentId":
                    		return __visibility.visible(SLOT_PARENT_ID);
                    case "dictTypeId":
                    		return __visibility.visible(SLOT_DICT_TYPE_ID);
                    case "dictLabel":
                    		return __visibility.visible(SLOT_DICT_LABEL);
                    case "dictValue":
                    		return __visibility.visible(SLOT_DICT_VALUE);
                    case "isSys":
                    		return __visibility.visible(SLOT_IS_SYS);
                    case "description":
                    		return __visibility.visible(SLOT_DESCRIPTION);
                    case "cssStyle":
                    		return __visibility.visible(SLOT_CSS_STYLE);
                    case "cssClass":
                    		return __visibility.visible(SLOT_CSS_CLASS);
                    case "corpCode":
                    		return __visibility.visible(SLOT_CORP_CODE);
                    case "corpName":
                    		return __visibility.visible(SLOT_CORP_NAME);
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
                if (__parentLoaded && __parentValue != null) {
                    hash = 31 * hash + __parentValue.hashCode();
                }
                if (__childrenValue != null) {
                    hash = 31 * hash + __childrenValue.hashCode();
                }
                if (__dictTypeLoaded && __dictTypeValue != null) {
                    hash = 31 * hash + __dictTypeValue.hashCode();
                }
                if (__dictLabelLoaded && __dictLabelValue != null) {
                    hash = 31 * hash + __dictLabelValue.hashCode();
                }
                if (__dictValueLoaded && __dictValueValue != null) {
                    hash = 31 * hash + __dictValueValue.hashCode();
                }
                if (__isSysLoaded && __isSysValue != null) {
                    hash = 31 * hash + __isSysValue.hashCode();
                }
                if (__descriptionLoaded && __descriptionValue != null) {
                    hash = 31 * hash + __descriptionValue.hashCode();
                }
                if (__cssStyleLoaded && __cssStyleValue != null) {
                    hash = 31 * hash + __cssStyleValue.hashCode();
                }
                if (__cssClassLoaded && __cssClassValue != null) {
                    hash = 31 * hash + __cssClassValue.hashCode();
                }
                if (__corpCodeLoaded && __corpCodeValue != null) {
                    hash = 31 * hash + __corpCodeValue.hashCode();
                }
                if (__corpNameLoaded && __corpNameValue != null) {
                    hash = 31 * hash + __corpNameValue.hashCode();
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
                if (__parentLoaded) {
                    hash = 31 * hash + System.identityHashCode(__parentValue);
                }
                if (__childrenValue != null) {
                    hash = 31 * hash + System.identityHashCode(__childrenValue);
                }
                if (__dictTypeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__dictTypeValue);
                }
                if (__dictLabelLoaded) {
                    hash = 31 * hash + System.identityHashCode(__dictLabelValue);
                }
                if (__dictValueLoaded) {
                    hash = 31 * hash + System.identityHashCode(__dictValueValue);
                }
                if (__isSysLoaded) {
                    hash = 31 * hash + System.identityHashCode(__isSysValue);
                }
                if (__descriptionLoaded) {
                    hash = 31 * hash + System.identityHashCode(__descriptionValue);
                }
                if (__cssStyleLoaded) {
                    hash = 31 * hash + System.identityHashCode(__cssStyleValue);
                }
                if (__cssClassLoaded) {
                    hash = 31 * hash + System.identityHashCode(__cssClassValue);
                }
                if (__corpCodeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__corpCodeValue);
                }
                if (__corpNameLoaded) {
                    hash = 31 * hash + System.identityHashCode(__corpNameValue);
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
                if (__isVisible(PropId.byIndex(SLOT_PARENT)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT))) {
                    return false;
                }
                boolean __parentLoaded = this.__parentLoaded;
                if (__parentLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PARENT))) {
                    return false;
                }
                if (__parentLoaded && !Objects.equals(__parentValue, __other.parent())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CHILDREN)) != __other.__isVisible(PropId.byIndex(SLOT_CHILDREN))) {
                    return false;
                }
                boolean __childrenLoaded = __childrenValue != null;
                if (__childrenLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CHILDREN))) {
                    return false;
                }
                if (__childrenLoaded && !Objects.equals(__childrenValue, __other.children())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_TYPE))) {
                    return false;
                }
                boolean __dictTypeLoaded = this.__dictTypeLoaded;
                if (__dictTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_TYPE))) {
                    return false;
                }
                if (__dictTypeLoaded && !Objects.equals(__dictTypeValue, __other.dictType())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PARENT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT_ID))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_TYPE_ID)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_TYPE_ID))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_LABEL)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_LABEL))) {
                    return false;
                }
                boolean __dictLabelLoaded = this.__dictLabelLoaded;
                if (__dictLabelLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_LABEL))) {
                    return false;
                }
                if (__dictLabelLoaded && !Objects.equals(__dictLabelValue, __other.dictLabel())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_VALUE)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_VALUE))) {
                    return false;
                }
                boolean __dictValueLoaded = this.__dictValueLoaded;
                if (__dictValueLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_VALUE))) {
                    return false;
                }
                if (__dictValueLoaded && !Objects.equals(__dictValueValue, __other.dictValue())) {
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
                if (__isVisible(PropId.byIndex(SLOT_DESCRIPTION)) != __other.__isVisible(PropId.byIndex(SLOT_DESCRIPTION))) {
                    return false;
                }
                boolean __descriptionLoaded = this.__descriptionLoaded;
                if (__descriptionLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DESCRIPTION))) {
                    return false;
                }
                if (__descriptionLoaded && !Objects.equals(__descriptionValue, __other.description())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CSS_STYLE)) != __other.__isVisible(PropId.byIndex(SLOT_CSS_STYLE))) {
                    return false;
                }
                boolean __cssStyleLoaded = this.__cssStyleLoaded;
                if (__cssStyleLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CSS_STYLE))) {
                    return false;
                }
                if (__cssStyleLoaded && !Objects.equals(__cssStyleValue, __other.cssStyle())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CSS_CLASS)) != __other.__isVisible(PropId.byIndex(SLOT_CSS_CLASS))) {
                    return false;
                }
                boolean __cssClassLoaded = this.__cssClassLoaded;
                if (__cssClassLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CSS_CLASS))) {
                    return false;
                }
                if (__cssClassLoaded && !Objects.equals(__cssClassValue, __other.cssClass())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CORP_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_CORP_CODE))) {
                    return false;
                }
                boolean __corpCodeLoaded = this.__corpCodeLoaded;
                if (__corpCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CORP_CODE))) {
                    return false;
                }
                if (__corpCodeLoaded && !Objects.equals(__corpCodeValue, __other.corpCode())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CORP_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_CORP_NAME))) {
                    return false;
                }
                boolean __corpNameLoaded = this.__corpNameLoaded;
                if (__corpNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CORP_NAME))) {
                    return false;
                }
                if (__corpNameLoaded && !Objects.equals(__corpNameValue, __other.corpName())) {
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
                if (__isVisible(PropId.byIndex(SLOT_PARENT)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT))) {
                    return false;
                }
                boolean __parentLoaded = this.__parentLoaded;
                if (__parentLoaded != __other.__isLoaded(PropId.byIndex(SLOT_PARENT))) {
                    return false;
                }
                if (__parentLoaded && __parentValue != __other.parent()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CHILDREN)) != __other.__isVisible(PropId.byIndex(SLOT_CHILDREN))) {
                    return false;
                }
                boolean __childrenLoaded = __childrenValue != null;
                if (__childrenLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CHILDREN))) {
                    return false;
                }
                if (__childrenLoaded && __childrenValue != __other.children()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_TYPE))) {
                    return false;
                }
                boolean __dictTypeLoaded = this.__dictTypeLoaded;
                if (__dictTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_TYPE))) {
                    return false;
                }
                if (__dictTypeLoaded && __dictTypeValue != __other.dictType()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_PARENT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT_ID))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_TYPE_ID)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_TYPE_ID))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_LABEL)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_LABEL))) {
                    return false;
                }
                boolean __dictLabelLoaded = this.__dictLabelLoaded;
                if (__dictLabelLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_LABEL))) {
                    return false;
                }
                if (__dictLabelLoaded && __dictLabelValue != __other.dictLabel()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_DICT_VALUE)) != __other.__isVisible(PropId.byIndex(SLOT_DICT_VALUE))) {
                    return false;
                }
                boolean __dictValueLoaded = this.__dictValueLoaded;
                if (__dictValueLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DICT_VALUE))) {
                    return false;
                }
                if (__dictValueLoaded && __dictValueValue != __other.dictValue()) {
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
                if (__isVisible(PropId.byIndex(SLOT_DESCRIPTION)) != __other.__isVisible(PropId.byIndex(SLOT_DESCRIPTION))) {
                    return false;
                }
                boolean __descriptionLoaded = this.__descriptionLoaded;
                if (__descriptionLoaded != __other.__isLoaded(PropId.byIndex(SLOT_DESCRIPTION))) {
                    return false;
                }
                if (__descriptionLoaded && __descriptionValue != __other.description()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CSS_STYLE)) != __other.__isVisible(PropId.byIndex(SLOT_CSS_STYLE))) {
                    return false;
                }
                boolean __cssStyleLoaded = this.__cssStyleLoaded;
                if (__cssStyleLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CSS_STYLE))) {
                    return false;
                }
                if (__cssStyleLoaded && __cssStyleValue != __other.cssStyle()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CSS_CLASS)) != __other.__isVisible(PropId.byIndex(SLOT_CSS_CLASS))) {
                    return false;
                }
                boolean __cssClassLoaded = this.__cssClassLoaded;
                if (__cssClassLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CSS_CLASS))) {
                    return false;
                }
                if (__cssClassLoaded && __cssClassValue != __other.cssClass()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CORP_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_CORP_CODE))) {
                    return false;
                }
                boolean __corpCodeLoaded = this.__corpCodeLoaded;
                if (__corpCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CORP_CODE))) {
                    return false;
                }
                if (__corpCodeLoaded && __corpCodeValue != __other.corpCode()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CORP_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_CORP_NAME))) {
                    return false;
                }
                boolean __corpNameLoaded = this.__corpNameLoaded;
                if (__corpNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CORP_NAME))) {
                    return false;
                }
                if (__corpNameLoaded && __corpNameValue != __other.corpName()) {
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
                type = DictData.class
        )
        private static class DraftImpl extends Implementor implements DraftSpi, DictDataDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            private DictData __resolved;

            DraftImpl(DraftContext ctx, DictData base) {
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
                return ImmutableObjects.toString(this);
            }

            @Override
            @JsonIgnore
            public String id() {
                return (__modified!= null ? __modified : __base).id();
            }

            @Override
            public DictDataDraft setId(String id) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
            public DictDataDraft setStatus(int status) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
            public DictDataDraft setCreateBy(String createBy) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
            public DictDataDraft setCreateDate(Date createDate) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
            public DictDataDraft setUpdateBy(String updateBy) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
            public DictDataDraft setUpdateDate(Date updateDate) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
            public DictDataDraft setRemarks(String remarks) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__remarksValue = remarks;
                __tmpModified.__remarksLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public DictDataDraft parent() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).parent());
            }

            @Override
            public DictDataDraft parent(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_PARENT)) || parent() == null)) {
                    setParent(DictDataDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).parent());
            }

            @Override
            public DictDataDraft setParent(DictData parent) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__parentValue = parent;
                __tmpModified.__parentLoaded = true;
                return this;
            }

            @Override
            public DictDataDraft applyParent(DraftConsumer<DictDataDraft> block) {
                applyParent(null, block);
                return this;
            }

            @Override
            public DictDataDraft applyParent(DictData base, DraftConsumer<DictDataDraft> block) {
                setParent(DictDataDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            public List<DictData> children() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).children(), DictData.class, true);
            }

            @Override
            public List<DictDataDraft> children(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_CHILDREN)))) {
                    setChildren(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).children(), DictData.class, true);
            }

            @Override
            public DictDataDraft setChildren(List<DictData> children) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (children == null) {
                    throw new IllegalArgumentException(
                        "'children' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__childrenValue = NonSharedList.of(__tmpModified.__childrenValue, children);
                return this;
            }

            @Override
            public DictDataDraft addIntoChildren(DraftConsumer<DictDataDraft> block) {
                addIntoChildren(null, block);
                return this;
            }

            @Override
            public DictDataDraft addIntoChildren(DictData base,
                    DraftConsumer<DictDataDraft> block) {
                children(true).add((DictDataDraft)DictDataDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public DictTypeDraft dictType() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).dictType());
            }

            @Override
            public DictTypeDraft dictType(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_DICT_TYPE)) || dictType() == null)) {
                    setDictType(DictTypeDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).dictType());
            }

            @Override
            public DictDataDraft setDictType(DictType dictType) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__dictTypeValue = dictType;
                __tmpModified.__dictTypeLoaded = true;
                return this;
            }

            @Override
            public DictDataDraft applyDictType(DraftConsumer<DictTypeDraft> block) {
                applyDictType(null, block);
                return this;
            }

            @Override
            public DictDataDraft applyDictType(DictType base, DraftConsumer<DictTypeDraft> block) {
                setDictType(DictTypeDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String parentId() {
                DictData __target = parent();
                return __target != null ? __target.id() : null;
            }

            @Override
            public DictDataDraft setParentId(String parentId) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (parentId != null) {
                    setParent(ImmutableObjects.makeIdOnly(DictData.class, parentId));
                } else {
                    setParent(null);
                }
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String dictTypeId() {
                DictType __target = dictType();
                return __target != null ? __target.id() : null;
            }

            @Override
            public DictDataDraft setDictTypeId(String dictTypeId) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (dictTypeId != null) {
                    setDictType(ImmutableObjects.makeIdOnly(DictType.class, dictTypeId));
                } else {
                    setDictType(null);
                }
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String dictLabel() {
                return (__modified!= null ? __modified : __base).dictLabel();
            }

            @Override
            public DictDataDraft setDictLabel(String dictLabel) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__dictLabelValue = dictLabel;
                __tmpModified.__dictLabelLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String dictValue() {
                return (__modified!= null ? __modified : __base).dictValue();
            }

            @Override
            public DictDataDraft setDictValue(String dictValue) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__dictValueValue = dictValue;
                __tmpModified.__dictValueLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Boolean isSys() {
                return (__modified!= null ? __modified : __base).isSys();
            }

            @Override
            public DictDataDraft setIsSys(Boolean isSys) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__isSysValue = isSys;
                __tmpModified.__isSysLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String description() {
                return (__modified!= null ? __modified : __base).description();
            }

            @Override
            public DictDataDraft setDescription(String description) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__descriptionValue = description;
                __tmpModified.__descriptionLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String cssStyle() {
                return (__modified!= null ? __modified : __base).cssStyle();
            }

            @Override
            public DictDataDraft setCssStyle(String cssStyle) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__cssStyleValue = cssStyle;
                __tmpModified.__cssStyleLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String cssClass() {
                return (__modified!= null ? __modified : __base).cssClass();
            }

            @Override
            public DictDataDraft setCssClass(String cssClass) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__cssClassValue = cssClass;
                __tmpModified.__cssClassLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String corpCode() {
                return (__modified!= null ? __modified : __base).corpCode();
            }

            @Override
            public DictDataDraft setCorpCode(String corpCode) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__corpCodeValue = corpCode;
                __tmpModified.__corpCodeLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String corpName() {
                return (__modified!= null ? __modified : __base).corpName();
            }

            @Override
            public DictDataDraft setCorpName(String corpName) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__corpNameValue = corpName;
                __tmpModified.__corpNameLoaded = true;
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
                    case SLOT_PARENT:
                    		setParent((DictData)value);break;
                    case SLOT_CHILDREN:
                    		setChildren((List<DictData>)value);break;
                    case SLOT_DICT_TYPE:
                    		setDictType((DictType)value);break;
                    case SLOT_PARENT_ID:
                    		setParentId((String)value);break;
                    case SLOT_DICT_TYPE_ID:
                    		setDictTypeId((String)value);break;
                    case SLOT_DICT_LABEL:
                    		setDictLabel((String)value);break;
                    case SLOT_DICT_VALUE:
                    		setDictValue((String)value);break;
                    case SLOT_IS_SYS:
                    		setIsSys((Boolean)value);break;
                    case SLOT_DESCRIPTION:
                    		setDescription((String)value);break;
                    case SLOT_CSS_STYLE:
                    		setCssStyle((String)value);break;
                    case SLOT_CSS_CLASS:
                    		setCssClass((String)value);break;
                    case SLOT_CORP_CODE:
                    		setCorpCode((String)value);break;
                    case SLOT_CORP_NAME:
                    		setCorpName((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.DictData\": \"" + prop + "\"");
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
                    case "parent":
                    		setParent((DictData)value);break;
                    case "children":
                    		setChildren((List<DictData>)value);break;
                    case "dictType":
                    		setDictType((DictType)value);break;
                    case "parentId":
                    		setParentId((String)value);break;
                    case "dictTypeId":
                    		setDictTypeId((String)value);break;
                    case "dictLabel":
                    		setDictLabel((String)value);break;
                    case "dictValue":
                    		setDictValue((String)value);break;
                    case "isSys":
                    		setIsSys((Boolean)value);break;
                    case "description":
                    		setDescription((String)value);break;
                    case "cssStyle":
                    		setCssStyle((String)value);break;
                    case "cssClass":
                    		setCssClass((String)value);break;
                    case "corpCode":
                    		setCorpCode((String)value);break;
                    case "corpName":
                    		setCorpName((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.DictData\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(20);
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
                    case SLOT_PARENT:
                    		__visibility.show(SLOT_PARENT, visible);break;
                    case SLOT_CHILDREN:
                    		__visibility.show(SLOT_CHILDREN, visible);break;
                    case SLOT_DICT_TYPE:
                    		__visibility.show(SLOT_DICT_TYPE, visible);break;
                    case SLOT_PARENT_ID:
                    		__visibility.show(SLOT_PARENT_ID, visible);break;
                    case SLOT_DICT_TYPE_ID:
                    		__visibility.show(SLOT_DICT_TYPE_ID, visible);break;
                    case SLOT_DICT_LABEL:
                    		__visibility.show(SLOT_DICT_LABEL, visible);break;
                    case SLOT_DICT_VALUE:
                    		__visibility.show(SLOT_DICT_VALUE, visible);break;
                    case SLOT_IS_SYS:
                    		__visibility.show(SLOT_IS_SYS, visible);break;
                    case SLOT_DESCRIPTION:
                    		__visibility.show(SLOT_DESCRIPTION, visible);break;
                    case SLOT_CSS_STYLE:
                    		__visibility.show(SLOT_CSS_STYLE, visible);break;
                    case SLOT_CSS_CLASS:
                    		__visibility.show(SLOT_CSS_CLASS, visible);break;
                    case SLOT_CORP_CODE:
                    		__visibility.show(SLOT_CORP_CODE, visible);break;
                    case SLOT_CORP_NAME:
                    		__visibility.show(SLOT_CORP_NAME, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.sys.DictData\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __show(String prop, boolean visible) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(20);
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
                    case "parent":
                    		__visibility.show(SLOT_PARENT, visible);break;
                    case "children":
                    		__visibility.show(SLOT_CHILDREN, visible);break;
                    case "dictType":
                    		__visibility.show(SLOT_DICT_TYPE, visible);break;
                    case "parentId":
                    		__visibility.show(SLOT_PARENT_ID, visible);break;
                    case "dictTypeId":
                    		__visibility.show(SLOT_DICT_TYPE_ID, visible);break;
                    case "dictLabel":
                    		__visibility.show(SLOT_DICT_LABEL, visible);break;
                    case "dictValue":
                    		__visibility.show(SLOT_DICT_VALUE, visible);break;
                    case "isSys":
                    		__visibility.show(SLOT_IS_SYS, visible);break;
                    case "description":
                    		__visibility.show(SLOT_DESCRIPTION, visible);break;
                    case "cssStyle":
                    		__visibility.show(SLOT_CSS_STYLE, visible);break;
                    case "cssClass":
                    		__visibility.show(SLOT_CSS_CLASS, visible);break;
                    case "corpCode":
                    		__visibility.show(SLOT_CORP_CODE, visible);break;
                    case "corpName":
                    		__visibility.show(SLOT_CORP_NAME, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.sys.DictData\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __unload(PropId prop) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
                    case SLOT_PARENT:
                    		__modified().__parentLoaded = false;break;
                    case SLOT_CHILDREN:
                    		__modified().__childrenValue = null;break;
                    case SLOT_DICT_TYPE:
                    		__modified().__dictTypeLoaded = false;break;
                    case SLOT_PARENT_ID:
                    		__unload(PropId.byIndex(SLOT_PARENT));break;
                    case SLOT_DICT_TYPE_ID:
                    		__unload(PropId.byIndex(SLOT_DICT_TYPE));break;
                    case SLOT_DICT_LABEL:
                    		__modified().__dictLabelLoaded = false;break;
                    case SLOT_DICT_VALUE:
                    		__modified().__dictValueLoaded = false;break;
                    case SLOT_IS_SYS:
                    		__modified().__isSysLoaded = false;break;
                    case SLOT_DESCRIPTION:
                    		__modified().__descriptionLoaded = false;break;
                    case SLOT_CSS_STYLE:
                    		__modified().__cssStyleLoaded = false;break;
                    case SLOT_CSS_CLASS:
                    		__modified().__cssClassLoaded = false;break;
                    case SLOT_CORP_CODE:
                    		__modified().__corpCodeLoaded = false;break;
                    case SLOT_CORP_NAME:
                    		__modified().__corpNameLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.DictData\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
                    case "parent":
                    		__modified().__parentLoaded = false;break;
                    case "children":
                    		__modified().__childrenValue = null;break;
                    case "dictType":
                    		__modified().__dictTypeLoaded = false;break;
                    case "parentId":
                    		__unload(PropId.byIndex(SLOT_PARENT));break;
                    case "dictTypeId":
                    		__unload(PropId.byIndex(SLOT_DICT_TYPE));break;
                    case "dictLabel":
                    		__modified().__dictLabelLoaded = false;break;
                    case "dictValue":
                    		__modified().__dictValueLoaded = false;break;
                    case "isSys":
                    		__modified().__isSysLoaded = false;break;
                    case "description":
                    		__modified().__descriptionLoaded = false;break;
                    case "cssStyle":
                    		__modified().__cssStyleLoaded = false;break;
                    case "cssClass":
                    		__modified().__cssClassLoaded = false;break;
                    case "corpCode":
                    		__modified().__corpCodeLoaded = false;break;
                    case "corpName":
                    		__modified().__corpNameLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.DictData\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public DraftContext __draftContext() {
                return __ctx;
            }

            @Override
            public Object __resolve() {
                if (__resolved != null) {
                    return __resolved;
                }
                if (__resolving) {
                    throw new CircularReferenceException();
                }
                __resolving = true;
                try {
                    Implementor base = __base;
                    Impl __tmpModified = __modified;
                    if (__tmpModified == null) {
                        if (base.__isLoaded(PropId.byIndex(SLOT_PARENT))) {
                            DictData oldValue = base.parent();
                            DictData newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setParent(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_CHILDREN))) {
                            List<DictData> oldValue = base.children();
                            List<DictData> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setChildren(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_DICT_TYPE))) {
                            DictType oldValue = base.dictType();
                            DictType newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setDictType(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__parentValue = __ctx.resolveObject(__tmpModified.__parentValue);
                        __tmpModified.__childrenValue = NonSharedList.of(__tmpModified.__childrenValue, __ctx.resolveList(__tmpModified.__childrenValue));
                        __tmpModified.__dictTypeValue = __ctx.resolveObject(__tmpModified.__dictTypeValue);
                    }
                    if (__base != null && __tmpModified == null) {
                        this.__resolved = base;
                        return base;
                    }
                    this.__resolved = __tmpModified;
                    return __tmpModified;
                }
                finally {
                    __resolving = false;
                }
            }

            @Override
            public boolean __isResolved() {
                return __resolved != null;
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
            type = DictData.class
    )
    class Builder {
        private final Producer.DraftImpl __draft;

        public Builder() {
            __draft = new Producer.DraftImpl(null, null);
            __draft.__show(PropId.byIndex(Producer.SLOT_PARENT), false);
            __draft.__show(PropId.byIndex(Producer.SLOT_DICT_TYPE), false);
            __draft.__show(PropId.byIndex(Producer.SLOT_PARENT_ID), false);
            __draft.__show(PropId.byIndex(Producer.SLOT_DICT_TYPE_ID), false);
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
                description = "父级"
        )
        @jakarta.annotation.Nullable
        public Builder parent(DictData parent) {
            __draft.setParent(parent);
            __draft.__show(PropId.byIndex(Producer.SLOT_PARENT), true);
            return this;
        }

        @NotNull
        @Schema(
                description = "子集"
        )
        public Builder children(List<DictData> children) {
            if (children != null) {
                __draft.setChildren(children);
            }
            return this;
        }

        @Schema(
                description = "字典类型"
        )
        @jakarta.annotation.Nullable
        public Builder dictType(DictType dictType) {
            __draft.setDictType(dictType);
            __draft.__show(PropId.byIndex(Producer.SLOT_DICT_TYPE), true);
            return this;
        }

        @Schema(
                description = "父级id"
        )
        @jakarta.annotation.Nullable
        public Builder parentId(String parentId) {
            __draft.setParentId(parentId);
            __draft.__show(PropId.byIndex(Producer.SLOT_PARENT_ID), true);
            return this;
        }

        @Schema(
                description = "字典类型id"
        )
        @jakarta.annotation.Nullable
        public Builder dictTypeId(String dictTypeId) {
            __draft.setDictTypeId(dictTypeId);
            __draft.__show(PropId.byIndex(Producer.SLOT_DICT_TYPE_ID), true);
            return this;
        }

        @Schema(
                description = "字典标签"
        )
        @jakarta.annotation.Nullable
        public Builder dictLabel(String dictLabel) {
            __draft.setDictLabel(dictLabel);
            return this;
        }

        @Schema(
                description = "字典键值"
        )
        @jakarta.annotation.Nullable
        public Builder dictValue(String dictValue) {
            __draft.setDictValue(dictValue);
            return this;
        }

        @Schema(
                description = "系统内置（1是 0否）"
        )
        public Builder isSys(Boolean isSys) {
            __draft.setIsSys(isSys);
            return this;
        }

        @Schema(
                description = "字典描述"
        )
        @jakarta.annotation.Nullable
        public Builder description(String description) {
            __draft.setDescription(description);
            return this;
        }

        @Schema(
                description = "css样式（如：color:red)"
        )
        @jakarta.annotation.Nullable
        public Builder cssStyle(String cssStyle) {
            __draft.setCssStyle(cssStyle);
            return this;
        }

        @Schema(
                description = "css类名（如：red）"
        )
        @jakarta.annotation.Nullable
        public Builder cssClass(String cssClass) {
            __draft.setCssClass(cssClass);
            return this;
        }

        @Schema(
                description = "租户代码"
        )
        @jakarta.annotation.Nullable
        public Builder corpCode(String corpCode) {
            __draft.setCorpCode(corpCode);
            return this;
        }

        @Schema(
                description = "租户名称"
        )
        @jakarta.annotation.Nullable
        public Builder corpName(String corpName) {
            __draft.setCorpName(corpName);
            return this;
        }

        public DictData build() {
            return (DictData)__draft.__modified();
        }
    }
}
