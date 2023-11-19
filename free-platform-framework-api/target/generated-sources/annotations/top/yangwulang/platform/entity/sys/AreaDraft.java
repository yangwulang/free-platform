package top.yangwulang.platform.entity.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Long;
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
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
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
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.DataTypeBaseDraft;

@GeneratedBy(
        type = Area.class
)
public interface AreaDraft extends Area, DataTypeBaseDraft {
    AreaDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    AreaDraft setId(String id);

    @OldChain
    AreaDraft setStatus(int status);

    @OldChain
    AreaDraft setCreateBy(String createBy);

    @OldChain
    AreaDraft setCreateDate(Date createDate);

    @OldChain
    AreaDraft setUpdateBy(String updateBy);

    @OldChain
    AreaDraft setUpdateDate(Date updateDate);

    @OldChain
    AreaDraft setRemarks(String remarks);

    @Nullable
    AreaDraft parent();

    AreaDraft parent(boolean autoCreate);

    @OldChain
    AreaDraft setParent(Area parent);

    @OldChain
    AreaDraft applyParent(DraftConsumer<AreaDraft> block);

    @OldChain
    AreaDraft applyParent(Area base, DraftConsumer<AreaDraft> block);

    @OldChain
    AreaDraft setParentId(String parentId);

    List<AreaDraft> children(boolean autoCreate);

    @OldChain
    AreaDraft setChildren(List<Area> children);

    @OldChain
    AreaDraft addIntoChildren(DraftConsumer<AreaDraft> block);

    @OldChain
    AreaDraft addIntoChildren(Area base, DraftConsumer<AreaDraft> block);

    @OldChain
    AreaDraft setAreaName(String areaName);

    @OldChain
    AreaDraft setSort(Long sort);

    @OldChain
    AreaDraft setAreaType(String areaType);

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

        public static final int SLOT_PARENT_ID = 8;

        public static final int SLOT_CHILDREN = 9;

        public static final int SLOT_AREA_NAME = 10;

        public static final int SLOT_SORT = 11;

        public static final int SLOT_AREA_TYPE = 12;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.42",
                Area.class,
                Collections.singleton(DataTypeBaseDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (Area)base)
            )
            .redefine("id", SLOT_ID)
            .redefine("status", SLOT_STATUS)
            .redefine("createBy", SLOT_CREATE_BY)
            .redefine("createDate", SLOT_CREATE_DATE)
            .redefine("updateBy", SLOT_UPDATE_BY)
            .redefine("updateDate", SLOT_UPDATE_DATE)
            .redefine("remarks", SLOT_REMARKS)
            .keyReference(SLOT_PARENT, "parent", ManyToOne.class, Area.class, true)
            .add(SLOT_PARENT_ID, "parentId", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_CHILDREN, "children", OneToMany.class, Area.class, false)
            .add(SLOT_AREA_NAME, "areaName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_SORT, "sort", ImmutablePropCategory.SCALAR, Long.class, true)
            .add(SLOT_AREA_TYPE, "areaType", ImmutablePropCategory.SCALAR, String.class, true)
            .build();

        private Producer() {
        }

        public Area produce(DraftConsumer<AreaDraft> block) {
            return produce(null, block);
        }

        public Area produce(Area base, DraftConsumer<AreaDraft> block) {
            return (Area)Internal.produce(TYPE, base, block);
        }

        public abstract interface Implementor extends Area, ImmutableSpi {
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
                    case SLOT_PARENT:
                    		return parent();
                    case SLOT_PARENT_ID:
                    		return parentId();
                    case SLOT_CHILDREN:
                    		return children();
                    case SLOT_AREA_NAME:
                    		return areaName();
                    case SLOT_SORT:
                    		return sort();
                    case SLOT_AREA_TYPE:
                    		return areaType();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Area\": \"" + prop + "\"");
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
                    case "parent":
                    		return parent();
                    case "parentId":
                    		return parentId();
                    case "children":
                    		return children();
                    case "areaName":
                    		return areaName();
                    case "sort":
                    		return sort();
                    case "areaType":
                    		return areaType();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Area\": \"" + prop + "\"");
                }
            }

            @JsonIgnore
            default String getId() {
                return id();
            }

            @JsonIgnore
            default int getStatus() {
                return status();
            }

            @JsonIgnore
            default String getCreateBy() {
                return createBy();
            }

            @JsonIgnore
            default Date getCreateDate() {
                return createDate();
            }

            @JsonIgnore
            default String getUpdateBy() {
                return updateBy();
            }

            @JsonIgnore
            default Date getUpdateDate() {
                return updateDate();
            }

            @JsonIgnore
            default String getRemarks() {
                return remarks();
            }

            @JsonIgnore
            default Area getParent() {
                return parent();
            }

            @JsonIgnore
            default String getParentId() {
                return parentId();
            }

            @JsonIgnore
            default List<Area> getChildren() {
                return children();
            }

            @JsonIgnore
            default String getAreaName() {
                return areaName();
            }

            @JsonIgnore
            default Long getSort() {
                return sort();
            }

            @JsonIgnore
            default String getAreaType() {
                return areaType();
            }

            @Override
            default ImmutableType __type() {
                return TYPE;
            }

            default int getDummyPropForJacksonError__() {
                throw new ImmutableModuleRequiredException();
            }
        }

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

            Area __parentValue;

            boolean __parentLoaded = false;

            NonSharedList<Area> __childrenValue;

            String __areaNameValue;

            Long __sortValue;

            boolean __sortLoaded = false;

            String __areaTypeValue;

            boolean __areaTypeLoaded = false;

            Impl() {
                __visibility = Visibility.of(13);
                __visibility.show(SLOT_PARENT_ID, false);
            }

            @Override
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(Area.class, "id");
                }
                return __idValue;
            }

            @Override
            public int status() {
                if (!__statusLoaded) {
                    throw new UnloadedException(Area.class, "status");
                }
                return __statusValue;
            }

            @Override
            public String createBy() {
                if (__createByValue == null) {
                    throw new UnloadedException(Area.class, "createBy");
                }
                return __createByValue;
            }

            @Override
            public Date createDate() {
                if (__createDateValue == null) {
                    throw new UnloadedException(Area.class, "createDate");
                }
                return __createDateValue;
            }

            @Override
            public String updateBy() {
                if (__updateByValue == null) {
                    throw new UnloadedException(Area.class, "updateBy");
                }
                return __updateByValue;
            }

            @Override
            public Date updateDate() {
                if (__updateDateValue == null) {
                    throw new UnloadedException(Area.class, "updateDate");
                }
                return __updateDateValue;
            }

            @Override
            @Nullable
            public String remarks() {
                if (!__remarksLoaded) {
                    throw new UnloadedException(Area.class, "remarks");
                }
                return __remarksValue;
            }

            @Override
            @Nullable
            public Area parent() {
                if (!__parentLoaded) {
                    throw new UnloadedException(Area.class, "parent");
                }
                return __parentValue;
            }

            @Override
            @Nullable
            public String parentId() {
                Area __target = parent();
                return __target != null ? __target.id() : null;
            }

            @Override
            public List<Area> children() {
                if (__childrenValue == null) {
                    throw new UnloadedException(Area.class, "children");
                }
                return __childrenValue;
            }

            @Override
            public String areaName() {
                if (__areaNameValue == null) {
                    throw new UnloadedException(Area.class, "areaName");
                }
                return __areaNameValue;
            }

            @Override
            @Nullable
            public Long sort() {
                if (!__sortLoaded) {
                    throw new UnloadedException(Area.class, "sort");
                }
                return __sortValue;
            }

            @Override
            @Nullable
            public String areaType() {
                if (!__areaTypeLoaded) {
                    throw new UnloadedException(Area.class, "areaType");
                }
                return __areaTypeValue;
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
                    case SLOT_PARENT_ID:
                    		return __isLoaded(PropId.byIndex(SLOT_PARENT)) && (parent() == null || 
                            	((ImmutableSpi)parent()).__isLoaded(PropId.byIndex(Producer.SLOT_ID)));
                    case SLOT_CHILDREN:
                    		return __childrenValue != null;
                    case SLOT_AREA_NAME:
                    		return __areaNameValue != null;
                    case SLOT_SORT:
                    		return __sortLoaded;
                    case SLOT_AREA_TYPE:
                    		return __areaTypeLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Area\": \"" + prop + "\"");
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
                    case "parentId":
                    		return __isLoaded(PropId.byIndex(SLOT_PARENT)) && (parent() == null || 
                            	((ImmutableSpi)parent()).__isLoaded(PropId.byIndex(Producer.SLOT_ID)));
                    case "children":
                    		return __childrenValue != null;
                    case "areaName":
                    		return __areaNameValue != null;
                    case "sort":
                    		return __sortLoaded;
                    case "areaType":
                    		return __areaTypeLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Area\": \"" + prop + "\"");
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
                    case SLOT_PARENT_ID:
                    		return __visibility.visible(SLOT_PARENT_ID);
                    case SLOT_CHILDREN:
                    		return __visibility.visible(SLOT_CHILDREN);
                    case SLOT_AREA_NAME:
                    		return __visibility.visible(SLOT_AREA_NAME);
                    case SLOT_SORT:
                    		return __visibility.visible(SLOT_SORT);
                    case SLOT_AREA_TYPE:
                    		return __visibility.visible(SLOT_AREA_TYPE);
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
                    case "parentId":
                    		return __visibility.visible(SLOT_PARENT_ID);
                    case "children":
                    		return __visibility.visible(SLOT_CHILDREN);
                    case "areaName":
                    		return __visibility.visible(SLOT_AREA_NAME);
                    case "sort":
                    		return __visibility.visible(SLOT_SORT);
                    case "areaType":
                    		return __visibility.visible(SLOT_AREA_TYPE);
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
                if (__areaNameValue != null) {
                    hash = 31 * hash + __areaNameValue.hashCode();
                }
                if (__sortLoaded && __sortValue != null) {
                    hash = 31 * hash + __sortValue.hashCode();
                }
                if (__areaTypeLoaded && __areaTypeValue != null) {
                    hash = 31 * hash + __areaTypeValue.hashCode();
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
                if (__areaNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__areaNameValue);
                }
                if (__sortLoaded) {
                    hash = 31 * hash + System.identityHashCode(__sortValue);
                }
                if (__areaTypeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__areaTypeValue);
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
                if (__isVisible(PropId.byIndex(SLOT_PARENT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT_ID))) {
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
                if (__isVisible(PropId.byIndex(SLOT_AREA_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_AREA_NAME))) {
                    return false;
                }
                boolean __areaNameLoaded = __areaNameValue != null;
                if (__areaNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_AREA_NAME))) {
                    return false;
                }
                if (__areaNameLoaded && !Objects.equals(__areaNameValue, __other.areaName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_SORT)) != __other.__isVisible(PropId.byIndex(SLOT_SORT))) {
                    return false;
                }
                boolean __sortLoaded = this.__sortLoaded;
                if (__sortLoaded != __other.__isLoaded(PropId.byIndex(SLOT_SORT))) {
                    return false;
                }
                if (__sortLoaded && !Objects.equals(__sortValue, __other.sort())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_AREA_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_AREA_TYPE))) {
                    return false;
                }
                boolean __areaTypeLoaded = this.__areaTypeLoaded;
                if (__areaTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_AREA_TYPE))) {
                    return false;
                }
                if (__areaTypeLoaded && !Objects.equals(__areaTypeValue, __other.areaType())) {
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
                if (__isVisible(PropId.byIndex(SLOT_PARENT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_PARENT_ID))) {
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
                if (__isVisible(PropId.byIndex(SLOT_AREA_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_AREA_NAME))) {
                    return false;
                }
                boolean __areaNameLoaded = __areaNameValue != null;
                if (__areaNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_AREA_NAME))) {
                    return false;
                }
                if (__areaNameLoaded && __areaNameValue != __other.areaName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_SORT)) != __other.__isVisible(PropId.byIndex(SLOT_SORT))) {
                    return false;
                }
                boolean __sortLoaded = this.__sortLoaded;
                if (__sortLoaded != __other.__isLoaded(PropId.byIndex(SLOT_SORT))) {
                    return false;
                }
                if (__sortLoaded && __sortValue != __other.sort()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_AREA_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_AREA_TYPE))) {
                    return false;
                }
                boolean __areaTypeLoaded = this.__areaTypeLoaded;
                if (__areaTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_AREA_TYPE))) {
                    return false;
                }
                if (__areaTypeLoaded && __areaTypeValue != __other.areaType()) {
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

        private static class DraftImpl implements Implementor, DraftSpi, AreaDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, Area base) {
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
            public String id() {
                return (__modified!= null ? __modified : __base).id();
            }

            @Override
            public AreaDraft setId(String id) {
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
            public int status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public AreaDraft setStatus(int status) {
                Impl __tmpModified = __modified();
                __tmpModified.__statusValue = status;
                __tmpModified.__statusLoaded = true;
                return this;
            }

            @Override
            public String createBy() {
                return (__modified!= null ? __modified : __base).createBy();
            }

            @Override
            public AreaDraft setCreateBy(String createBy) {
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
            public Date createDate() {
                return (__modified!= null ? __modified : __base).createDate();
            }

            @Override
            public AreaDraft setCreateDate(Date createDate) {
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
            public String updateBy() {
                return (__modified!= null ? __modified : __base).updateBy();
            }

            @Override
            public AreaDraft setUpdateBy(String updateBy) {
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
            public Date updateDate() {
                return (__modified!= null ? __modified : __base).updateDate();
            }

            @Override
            public AreaDraft setUpdateDate(Date updateDate) {
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
            @Nullable
            public String remarks() {
                return (__modified!= null ? __modified : __base).remarks();
            }

            @Override
            public AreaDraft setRemarks(String remarks) {
                Impl __tmpModified = __modified();
                __tmpModified.__remarksValue = remarks;
                __tmpModified.__remarksLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public AreaDraft parent() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).parent());
            }

            @Override
            public AreaDraft parent(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_PARENT)) || parent() == null)) {
                    setParent(AreaDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).parent());
            }

            @Override
            public AreaDraft setParent(Area parent) {
                Impl __tmpModified = __modified();
                __tmpModified.__parentValue = parent;
                __tmpModified.__parentLoaded = true;
                return this;
            }

            @Override
            public AreaDraft applyParent(DraftConsumer<AreaDraft> block) {
                applyParent(null, block);
                return this;
            }

            @Override
            public AreaDraft applyParent(Area base, DraftConsumer<AreaDraft> block) {
                setParent(AreaDraft.$.produce(base, block));
                return this;
            }

            @Override
            @Nullable
            public String parentId() {
                Area __target = parent();
                return __target != null ? __target.id() : null;
            }

            @Override
            public AreaDraft setParentId(String parentId) {
                if (parentId != null) {
                    setParent(ImmutableObjects.makeIdOnly(Area.class, parentId));
                } else {
                    setParent(null);
                }
                return this;
            }

            @Override
            public List<Area> children() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).children(), Area.class, true);
            }

            @Override
            public List<AreaDraft> children(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_CHILDREN)))) {
                    setChildren(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).children(), Area.class, true);
            }

            @Override
            public AreaDraft setChildren(List<Area> children) {
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
            public AreaDraft addIntoChildren(DraftConsumer<AreaDraft> block) {
                addIntoChildren(null, block);
                return this;
            }

            @Override
            public AreaDraft addIntoChildren(Area base, DraftConsumer<AreaDraft> block) {
                children(true).add((AreaDraft)AreaDraft.$.produce(base, block));
                return this;
            }

            @Override
            public String areaName() {
                return (__modified!= null ? __modified : __base).areaName();
            }

            @Override
            public AreaDraft setAreaName(String areaName) {
                if (areaName == null) {
                    throw new IllegalArgumentException(
                        "'areaName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__areaNameValue = areaName;
                return this;
            }

            @Override
            @Nullable
            public Long sort() {
                return (__modified!= null ? __modified : __base).sort();
            }

            @Override
            public AreaDraft setSort(Long sort) {
                Impl __tmpModified = __modified();
                __tmpModified.__sortValue = sort;
                __tmpModified.__sortLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String areaType() {
                return (__modified!= null ? __modified : __base).areaType();
            }

            @Override
            public AreaDraft setAreaType(String areaType) {
                Impl __tmpModified = __modified();
                __tmpModified.__areaTypeValue = areaType;
                __tmpModified.__areaTypeLoaded = true;
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
                    		if (value == null) throw new IllegalArgumentException("'status' cannot be null");
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
                    		setParent((Area)value);break;
                    case SLOT_PARENT_ID:
                    		setParentId((String)value);break;
                    case SLOT_CHILDREN:
                    		setChildren((List<Area>)value);break;
                    case SLOT_AREA_NAME:
                    		setAreaName((String)value);break;
                    case SLOT_SORT:
                    		setSort((Long)value);break;
                    case SLOT_AREA_TYPE:
                    		setAreaType((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.Area\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id":
                    		setId((String)value);break;
                    case "status":
                    		if (value == null) throw new IllegalArgumentException("'status' cannot be null");
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
                    		setParent((Area)value);break;
                    case "parentId":
                    		setParentId((String)value);break;
                    case "children":
                    		setChildren((List<Area>)value);break;
                    case "areaName":
                    		setAreaName((String)value);break;
                    case "sort":
                    		setSort((Long)value);break;
                    case "areaType":
                    		setAreaType((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Area\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(13);
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
                    case SLOT_PARENT_ID:
                    		__visibility.show(SLOT_PARENT_ID, visible);break;
                    case SLOT_CHILDREN:
                    		__visibility.show(SLOT_CHILDREN, visible);break;
                    case SLOT_AREA_NAME:
                    		__visibility.show(SLOT_AREA_NAME, visible);break;
                    case SLOT_SORT:
                    		__visibility.show(SLOT_SORT, visible);break;
                    case SLOT_AREA_TYPE:
                    		__visibility.show(SLOT_AREA_TYPE, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.sys.Area\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(13);
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
                    case "parentId":
                    		__visibility.show(SLOT_PARENT_ID, visible);break;
                    case "children":
                    		__visibility.show(SLOT_CHILDREN, visible);break;
                    case "areaName":
                    		__visibility.show(SLOT_AREA_NAME, visible);break;
                    case "sort":
                    		__visibility.show(SLOT_SORT, visible);break;
                    case "areaType":
                    		__visibility.show(SLOT_AREA_TYPE, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.sys.Area\": \"" + 
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
                    case SLOT_PARENT:
                    		__modified().__parentLoaded = false;break;
                    case SLOT_PARENT_ID:
                    		__unload(PropId.byIndex(SLOT_PARENT));break;
                    case SLOT_CHILDREN:
                    		__modified().__childrenValue = null;break;
                    case SLOT_AREA_NAME:
                    		__modified().__areaNameValue = null;break;
                    case SLOT_SORT:
                    		__modified().__sortLoaded = false;break;
                    case SLOT_AREA_TYPE:
                    		__modified().__areaTypeLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.Area\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                    case "parent":
                    		__modified().__parentLoaded = false;break;
                    case "parentId":
                    		__unload(PropId.byIndex(SLOT_PARENT));break;
                    case "children":
                    		__modified().__childrenValue = null;break;
                    case "areaName":
                    		__modified().__areaNameValue = null;break;
                    case "sort":
                    		__modified().__sortLoaded = false;break;
                    case "areaType":
                    		__modified().__areaTypeLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Area\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                        if (base.__isLoaded(PropId.byIndex(SLOT_PARENT))) {
                            Area oldValue = base.parent();
                            Area newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setParent(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_CHILDREN))) {
                            List<Area> oldValue = base.children();
                            List<Area> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setChildren(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__parentValue = __ctx.resolveObject(__tmpModified.__parentValue);
                        __tmpModified.__childrenValue = NonSharedList.of(__tmpModified.__childrenValue, __ctx.resolveList(__tmpModified.__childrenValue));
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

            private Impl __modified() {
                Impl __tmpModified = __modified;
                if (__tmpModified == null) {
                    __tmpModified = __base.clone();
                    __modified = __tmpModified;
                }
                return __tmpModified;
            }
        }
    }

    class MapStruct {
        private String id;

        private Integer status;

        private String createBy;

        private Date createDate;

        private String updateBy;

        private Date updateDate;

        private boolean __remarksLoaded;

        private String remarks;

        private boolean __parentLoaded;

        private Area parent;

        private List<Area> children;

        private String areaName;

        private boolean __sortLoaded;

        private Long sort;

        private boolean __areaTypeLoaded;

        private String areaType;

        public MapStruct id(String id) {
            this.id = id;
            return this;
        }

        public MapStruct status(Integer status) {
            this.status = status;
            return this;
        }

        public MapStruct createBy(String createBy) {
            this.createBy = createBy;
            return this;
        }

        public MapStruct createDate(Date createDate) {
            this.createDate = createDate;
            return this;
        }

        public MapStruct updateBy(String updateBy) {
            this.updateBy = updateBy;
            return this;
        }

        public MapStruct updateDate(Date updateDate) {
            this.updateDate = updateDate;
            return this;
        }

        public MapStruct remarks(String remarks) {
            this.__remarksLoaded = true;
            this.remarks = remarks;
            return this;
        }

        public MapStruct parent(Area parent) {
            this.__parentLoaded = true;
            this.parent = parent;
            return this;
        }

        public MapStruct parentId(String parentId) {
            this.__parentLoaded = true;
            if (parentId == null) {
                this.parent = null;
            } else {
                this.parent = ImmutableObjects.makeIdOnly(Area.class, parentId);
            }
            return this;
        }

        public MapStruct children(List<Area> children) {
            this.children = children != null ? children : Collections.emptyList();
            return this;
        }

        public MapStruct areaName(String areaName) {
            this.areaName = areaName;
            return this;
        }

        public MapStruct sort(Long sort) {
            this.__sortLoaded = true;
            this.sort = sort;
            return this;
        }

        public MapStruct areaType(String areaType) {
            this.__areaTypeLoaded = true;
            this.areaType = areaType;
            return this;
        }

        public Area build() {
            return AreaDraft.$.produce(draft -> {
                if (id != null) {
                    draft.setId(id);
                }
                if (status != null) {
                    draft.setStatus(status);
                }
                if (createBy != null) {
                    draft.setCreateBy(createBy);
                }
                if (createDate != null) {
                    draft.setCreateDate(createDate);
                }
                if (updateBy != null) {
                    draft.setUpdateBy(updateBy);
                }
                if (updateDate != null) {
                    draft.setUpdateDate(updateDate);
                }
                if (__remarksLoaded) {
                    draft.setRemarks(remarks);
                }
                if (__parentLoaded) {
                    draft.setParent(parent);
                }
                if (children != null) {
                    draft.setChildren(children);
                }
                if (areaName != null) {
                    draft.setAreaName(areaName);
                }
                if (__sortLoaded) {
                    draft.setSort(sort);
                }
                if (__areaTypeLoaded) {
                    draft.setAreaType(areaType);
                }
            });
        }
    }
}
