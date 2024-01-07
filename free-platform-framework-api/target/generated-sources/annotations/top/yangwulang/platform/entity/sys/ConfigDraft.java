package top.yangwulang.platform.entity.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.Collections;
import java.util.Date;
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
import org.babyfish.jimmer.runtime.Visibility;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.DataTypeBaseNoStatusDraft;

@GeneratedBy(
        type = Config.class
)
public interface ConfigDraft extends Config, DataTypeBaseNoStatusDraft {
    ConfigDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    ConfigDraft setId(String id);

    @OldChain
    ConfigDraft setCreateBy(String createBy);

    @OldChain
    ConfigDraft setCreateDate(Date createDate);

    @OldChain
    ConfigDraft setUpdateBy(String updateBy);

    @OldChain
    ConfigDraft setUpdateDate(Date updateDate);

    @OldChain
    ConfigDraft setRemarks(String remarks);

    @OldChain
    ConfigDraft setConfigName(String configName);

    @OldChain
    ConfigDraft setConfigKey(String configKey);

    @OldChain
    ConfigDraft setConfigValue(String configValue);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_CREATE_BY = 1;

        public static final int SLOT_CREATE_DATE = 2;

        public static final int SLOT_UPDATE_BY = 3;

        public static final int SLOT_UPDATE_DATE = 4;

        public static final int SLOT_REMARKS = 5;

        public static final int SLOT_CONFIG_NAME = 6;

        public static final int SLOT_CONFIG_KEY = 7;

        public static final int SLOT_CONFIG_VALUE = 8;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.69",
                Config.class,
                Collections.singleton(DataTypeBaseNoStatusDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (Config)base)
            )
            .redefine("id", SLOT_ID)
            .redefine("createBy", SLOT_CREATE_BY)
            .redefine("createDate", SLOT_CREATE_DATE)
            .redefine("updateBy", SLOT_UPDATE_BY)
            .redefine("updateDate", SLOT_UPDATE_DATE)
            .redefine("remarks", SLOT_REMARKS)
            .add(SLOT_CONFIG_NAME, "configName", ImmutablePropCategory.SCALAR, String.class, false)
            .key(SLOT_CONFIG_KEY, "configKey", String.class, false)
            .add(SLOT_CONFIG_VALUE, "configValue", ImmutablePropCategory.SCALAR, String.class, true)
            .build();

        private Producer() {
        }

        public Config produce(DraftConsumer<ConfigDraft> block) {
            return produce(null, block);
        }

        public Config produce(Config base, DraftConsumer<ConfigDraft> block) {
            return (Config)Internal.produce(TYPE, base, block);
        }

        public abstract interface Implementor extends Config, ImmutableSpi {
            @Override
            default Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_ID:
                    		return id();
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
                    case SLOT_CONFIG_NAME:
                    		return configName();
                    case SLOT_CONFIG_KEY:
                    		return configKey();
                    case SLOT_CONFIG_VALUE:
                    		return configValue();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Config\": \"" + prop + "\"");
                }
            }

            @Override
            default Object __get(String prop) {
                switch (prop) {
                    case "id":
                    		return id();
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
                    case "configName":
                    		return configName();
                    case "configKey":
                    		return configKey();
                    case "configValue":
                    		return configValue();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Config\": \"" + prop + "\"");
                }
            }

            @JsonIgnore
            default String getId() {
                return id();
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
            default String getConfigName() {
                return configName();
            }

            @JsonIgnore
            default String getConfigKey() {
                return configKey();
            }

            @JsonIgnore
            default String getConfigValue() {
                return configValue();
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

            String __createByValue;

            Date __createDateValue;

            String __updateByValue;

            Date __updateDateValue;

            String __remarksValue;

            boolean __remarksLoaded = false;

            String __configNameValue;

            String __configKeyValue;

            String __configValueValue;

            boolean __configValueLoaded = false;

            @Override
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(Config.class, "id");
                }
                return __idValue;
            }

            @Override
            public String createBy() {
                if (__createByValue == null) {
                    throw new UnloadedException(Config.class, "createBy");
                }
                return __createByValue;
            }

            @Override
            public Date createDate() {
                if (__createDateValue == null) {
                    throw new UnloadedException(Config.class, "createDate");
                }
                return __createDateValue;
            }

            @Override
            public String updateBy() {
                if (__updateByValue == null) {
                    throw new UnloadedException(Config.class, "updateBy");
                }
                return __updateByValue;
            }

            @Override
            public Date updateDate() {
                if (__updateDateValue == null) {
                    throw new UnloadedException(Config.class, "updateDate");
                }
                return __updateDateValue;
            }

            @Override
            @Nullable
            public String remarks() {
                if (!__remarksLoaded) {
                    throw new UnloadedException(Config.class, "remarks");
                }
                return __remarksValue;
            }

            @Override
            public String configName() {
                if (__configNameValue == null) {
                    throw new UnloadedException(Config.class, "configName");
                }
                return __configNameValue;
            }

            @Override
            public String configKey() {
                if (__configKeyValue == null) {
                    throw new UnloadedException(Config.class, "configKey");
                }
                return __configKeyValue;
            }

            @Override
            @Nullable
            public String configValue() {
                if (!__configValueLoaded) {
                    throw new UnloadedException(Config.class, "configValue");
                }
                return __configValueValue;
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
                    case SLOT_CONFIG_NAME:
                    		return __configNameValue != null;
                    case SLOT_CONFIG_KEY:
                    		return __configKeyValue != null;
                    case SLOT_CONFIG_VALUE:
                    		return __configValueLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Config\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id":
                    		return __idValue != null;
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
                    case "configName":
                    		return __configNameValue != null;
                    case "configKey":
                    		return __configKeyValue != null;
                    case "configValue":
                    		return __configValueLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Config\": \"" + prop + "\"");
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
                    case SLOT_CONFIG_NAME:
                    		return __visibility.visible(SLOT_CONFIG_NAME);
                    case SLOT_CONFIG_KEY:
                    		return __visibility.visible(SLOT_CONFIG_KEY);
                    case SLOT_CONFIG_VALUE:
                    		return __visibility.visible(SLOT_CONFIG_VALUE);
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
                    case "configName":
                    		return __visibility.visible(SLOT_CONFIG_NAME);
                    case "configKey":
                    		return __visibility.visible(SLOT_CONFIG_KEY);
                    case "configValue":
                    		return __visibility.visible(SLOT_CONFIG_VALUE);
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
                if (__configNameValue != null) {
                    hash = 31 * hash + __configNameValue.hashCode();
                }
                if (__configKeyValue != null) {
                    hash = 31 * hash + __configKeyValue.hashCode();
                }
                if (__configValueLoaded && __configValueValue != null) {
                    hash = 31 * hash + __configValueValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + System.identityHashCode(__idValue);
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
                if (__configNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__configNameValue);
                }
                if (__configKeyValue != null) {
                    hash = 31 * hash + System.identityHashCode(__configKeyValue);
                }
                if (__configValueLoaded) {
                    hash = 31 * hash + System.identityHashCode(__configValueValue);
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
                if (__isVisible(PropId.byIndex(SLOT_CONFIG_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_CONFIG_NAME))) {
                    return false;
                }
                boolean __configNameLoaded = __configNameValue != null;
                if (__configNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CONFIG_NAME))) {
                    return false;
                }
                if (__configNameLoaded && !Objects.equals(__configNameValue, __other.configName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CONFIG_KEY)) != __other.__isVisible(PropId.byIndex(SLOT_CONFIG_KEY))) {
                    return false;
                }
                boolean __configKeyLoaded = __configKeyValue != null;
                if (__configKeyLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CONFIG_KEY))) {
                    return false;
                }
                if (__configKeyLoaded && !Objects.equals(__configKeyValue, __other.configKey())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CONFIG_VALUE)) != __other.__isVisible(PropId.byIndex(SLOT_CONFIG_VALUE))) {
                    return false;
                }
                boolean __configValueLoaded = this.__configValueLoaded;
                if (__configValueLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CONFIG_VALUE))) {
                    return false;
                }
                if (__configValueLoaded && !Objects.equals(__configValueValue, __other.configValue())) {
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
                if (__isVisible(PropId.byIndex(SLOT_CONFIG_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_CONFIG_NAME))) {
                    return false;
                }
                boolean __configNameLoaded = __configNameValue != null;
                if (__configNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CONFIG_NAME))) {
                    return false;
                }
                if (__configNameLoaded && __configNameValue != __other.configName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CONFIG_KEY)) != __other.__isVisible(PropId.byIndex(SLOT_CONFIG_KEY))) {
                    return false;
                }
                boolean __configKeyLoaded = __configKeyValue != null;
                if (__configKeyLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CONFIG_KEY))) {
                    return false;
                }
                if (__configKeyLoaded && __configKeyValue != __other.configKey()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CONFIG_VALUE)) != __other.__isVisible(PropId.byIndex(SLOT_CONFIG_VALUE))) {
                    return false;
                }
                boolean __configValueLoaded = this.__configValueLoaded;
                if (__configValueLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CONFIG_VALUE))) {
                    return false;
                }
                if (__configValueLoaded && __configValueValue != __other.configValue()) {
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

        private static class DraftImpl implements Implementor, DraftSpi, ConfigDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, Config base) {
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
            public ConfigDraft setId(String id) {
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
            public String createBy() {
                return (__modified!= null ? __modified : __base).createBy();
            }

            @Override
            public ConfigDraft setCreateBy(String createBy) {
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
            public ConfigDraft setCreateDate(Date createDate) {
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
            public ConfigDraft setUpdateBy(String updateBy) {
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
            public ConfigDraft setUpdateDate(Date updateDate) {
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
            public ConfigDraft setRemarks(String remarks) {
                Impl __tmpModified = __modified();
                __tmpModified.__remarksValue = remarks;
                __tmpModified.__remarksLoaded = true;
                return this;
            }

            @Override
            public String configName() {
                return (__modified!= null ? __modified : __base).configName();
            }

            @Override
            public ConfigDraft setConfigName(String configName) {
                if (configName == null) {
                    throw new IllegalArgumentException(
                        "'configName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__configNameValue = configName;
                return this;
            }

            @Override
            public String configKey() {
                return (__modified!= null ? __modified : __base).configKey();
            }

            @Override
            public ConfigDraft setConfigKey(String configKey) {
                if (configKey == null) {
                    throw new IllegalArgumentException(
                        "'configKey' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__configKeyValue = configKey;
                return this;
            }

            @Override
            @Nullable
            public String configValue() {
                return (__modified!= null ? __modified : __base).configValue();
            }

            @Override
            public ConfigDraft setConfigValue(String configValue) {
                Impl __tmpModified = __modified();
                __tmpModified.__configValueValue = configValue;
                __tmpModified.__configValueLoaded = true;
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
                    case SLOT_CONFIG_NAME:
                    		setConfigName((String)value);break;
                    case SLOT_CONFIG_KEY:
                    		setConfigKey((String)value);break;
                    case SLOT_CONFIG_VALUE:
                    		setConfigValue((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.Config\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id":
                    		setId((String)value);break;
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
                    case "configName":
                    		setConfigName((String)value);break;
                    case "configKey":
                    		setConfigKey((String)value);break;
                    case "configValue":
                    		setConfigValue((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Config\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(9);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_ID:
                    		__visibility.show(SLOT_ID, visible);break;
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
                    case SLOT_CONFIG_NAME:
                    		__visibility.show(SLOT_CONFIG_NAME, visible);break;
                    case SLOT_CONFIG_KEY:
                    		__visibility.show(SLOT_CONFIG_KEY, visible);break;
                    case SLOT_CONFIG_VALUE:
                    		__visibility.show(SLOT_CONFIG_VALUE, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.sys.Config\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(9);
                }
                switch (prop) {
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
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
                    case "configName":
                    		__visibility.show(SLOT_CONFIG_NAME, visible);break;
                    case "configKey":
                    		__visibility.show(SLOT_CONFIG_KEY, visible);break;
                    case "configValue":
                    		__visibility.show(SLOT_CONFIG_VALUE, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.sys.Config\": \"" + 
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
                    case SLOT_CONFIG_NAME:
                    		__modified().__configNameValue = null;break;
                    case SLOT_CONFIG_KEY:
                    		__modified().__configKeyValue = null;break;
                    case SLOT_CONFIG_VALUE:
                    		__modified().__configValueLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.Config\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "id":
                    		__modified().__idValue = null;break;
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
                    case "configName":
                    		__modified().__configNameValue = null;break;
                    case "configKey":
                    		__modified().__configKeyValue = null;break;
                    case "configValue":
                    		__modified().__configValueLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.Config\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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

        private String createBy;

        private Date createDate;

        private String updateBy;

        private Date updateDate;

        private boolean __remarksLoaded;

        private String remarks;

        private String configName;

        private String configKey;

        private boolean __configValueLoaded;

        private String configValue;

        public MapStruct id(String id) {
            this.id = id;
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

        public MapStruct configName(String configName) {
            this.configName = configName;
            return this;
        }

        public MapStruct configKey(String configKey) {
            this.configKey = configKey;
            return this;
        }

        public MapStruct configValue(String configValue) {
            this.__configValueLoaded = true;
            this.configValue = configValue;
            return this;
        }

        public Config build() {
            return ConfigDraft.$.produce(draft -> {
                if (id != null) {
                    draft.setId(id);
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
                if (configName != null) {
                    draft.setConfigName(configName);
                }
                if (configKey != null) {
                    draft.setConfigKey(configKey);
                }
                if (__configValueLoaded) {
                    draft.setConfigValue(configValue);
                }
            });
        }
    }
}
