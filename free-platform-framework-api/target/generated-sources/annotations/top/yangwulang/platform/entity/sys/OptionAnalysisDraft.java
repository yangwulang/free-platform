package top.yangwulang.platform.entity.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalStateException;
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
import org.babyfish.jimmer.sql.ManyToOne;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.TypeBaseDraft;

@GeneratedBy(
        type = OptionAnalysis.class
)
public interface OptionAnalysisDraft extends OptionAnalysis, TypeBaseDraft {
    OptionAnalysisDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    OptionAnalysisDraft setId(String id);

    @OldChain
    OptionAnalysisDraft setEventName(String eventName);

    @OldChain
    OptionAnalysisDraft setEventCode(String eventCode);

    @Nullable
    UserDraft optionUser();

    UserDraft optionUser(boolean autoCreate);

    @OldChain
    OptionAnalysisDraft setOptionUser(User optionUser);

    @Nullable
    String optionUserId();

    @OldChain
    OptionAnalysisDraft setOptionUserId(@Nullable String optionUserId);

    @OldChain
    OptionAnalysisDraft applyOptionUser(DraftConsumer<UserDraft> block);

    @OldChain
    OptionAnalysisDraft applyOptionUser(User base, DraftConsumer<UserDraft> block);

    @OldChain
    OptionAnalysisDraft setIpAddress(String ipAddress);

    @OldChain
    OptionAnalysisDraft setCreateDate(Date createDate);

    @OldChain
    OptionAnalysisDraft setMeta(String meta);

    @GeneratedBy(
            type = OptionAnalysis.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_EVENT_NAME = 1;

        public static final int SLOT_EVENT_CODE = 2;

        public static final int SLOT_OPTION_USER = 3;

        public static final int SLOT_IP_ADDRESS = 4;

        public static final int SLOT_CREATE_DATE = 5;

        public static final int SLOT_META = 6;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.184",
                OptionAnalysis.class,
                Collections.singleton(TypeBaseDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (OptionAnalysis)base)
            )
            .redefine("id", SLOT_ID)
            .add(SLOT_EVENT_NAME, "eventName", ImmutablePropCategory.SCALAR, String.class, false)
            .key(SLOT_EVENT_CODE, "eventCode", String.class, false)
            .keyReference(SLOT_OPTION_USER, "optionUser", ManyToOne.class, User.class, true)
            .add(SLOT_IP_ADDRESS, "ipAddress", ImmutablePropCategory.SCALAR, String.class, false)
            .key(SLOT_CREATE_DATE, "createDate", Date.class, false)
            .add(SLOT_META, "meta", ImmutablePropCategory.SCALAR, String.class, true)
            .build();

        private Producer() {
        }

        public OptionAnalysis produce(DraftConsumer<OptionAnalysisDraft> block) {
            return produce(null, block);
        }

        public OptionAnalysis produce(OptionAnalysis base,
                DraftConsumer<OptionAnalysisDraft> block) {
            return (OptionAnalysis)Internal.produce(TYPE, base, block);
        }

        /**
         * Class, not interface, for free-marker
         */
        @GeneratedBy(
                type = OptionAnalysis.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "id", "eventName", "eventCode", "optionUser", "ipAddress", "createDate", "meta"})
        public abstract static class Implementor implements OptionAnalysis, ImmutableSpi {
            @Override
            public final Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_ID:
                    		return id();
                    case SLOT_EVENT_NAME:
                    		return eventName();
                    case SLOT_EVENT_CODE:
                    		return eventCode();
                    case SLOT_OPTION_USER:
                    		return optionUser();
                    case SLOT_IP_ADDRESS:
                    		return ipAddress();
                    case SLOT_CREATE_DATE:
                    		return createDate();
                    case SLOT_META:
                    		return meta();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.OptionAnalysis\": \"" + prop + "\"");
                }
            }

            @Override
            public final Object __get(String prop) {
                switch (prop) {
                    case "id":
                    		return id();
                    case "eventName":
                    		return eventName();
                    case "eventCode":
                    		return eventCode();
                    case "optionUser":
                    		return optionUser();
                    case "ipAddress":
                    		return ipAddress();
                    case "createDate":
                    		return createDate();
                    case "meta":
                    		return meta();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.OptionAnalysis\": \"" + prop + "\"");
                }
            }

            @NotNull
            public final String getId() {
                return id();
            }

            @Schema(
                    description = "事件名称"
            )
            public final String getEventName() {
                return eventName();
            }

            @Schema(
                    description = "事件编码"
            )
            public final String getEventCode() {
                return eventCode();
            }

            @Schema(
                    description = "操作人，如果没有就是游客"
            )
            @jakarta.annotation.Nullable
            public final User getOptionUser() {
                return optionUser();
            }

            @Schema(
                    description = "ip地址"
            )
            public final String getIpAddress() {
                return ipAddress();
            }

            @Schema(
                    description = "创建时间"
            )
            public final Date getCreateDate() {
                return createDate();
            }

            @Schema(
                    description = "元数据存取某些相关分析数据json"
            )
            @jakarta.annotation.Nullable
            public final String getMeta() {
                return meta();
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
                type = OptionAnalysis.class
        )
        private static class Impl extends Implementor implements Cloneable, Serializable {
            private Visibility __visibility;

            String __idValue;

            String __eventNameValue;

            String __eventCodeValue;

            User __optionUserValue;

            boolean __optionUserLoaded = false;

            String __ipAddressValue;

            Date __createDateValue;

            String __metaValue;

            boolean __metaLoaded = false;

            @Override
            @JsonIgnore
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(OptionAnalysis.class, "id");
                }
                return __idValue;
            }

            @Override
            @JsonIgnore
            public String eventName() {
                if (__eventNameValue == null) {
                    throw new UnloadedException(OptionAnalysis.class, "eventName");
                }
                return __eventNameValue;
            }

            @Override
            @JsonIgnore
            public String eventCode() {
                if (__eventCodeValue == null) {
                    throw new UnloadedException(OptionAnalysis.class, "eventCode");
                }
                return __eventCodeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public User optionUser() {
                if (!__optionUserLoaded) {
                    throw new UnloadedException(OptionAnalysis.class, "optionUser");
                }
                return __optionUserValue;
            }

            @Override
            @JsonIgnore
            public String ipAddress() {
                if (__ipAddressValue == null) {
                    throw new UnloadedException(OptionAnalysis.class, "ipAddress");
                }
                return __ipAddressValue;
            }

            @Override
            @JsonIgnore
            public Date createDate() {
                if (__createDateValue == null) {
                    throw new UnloadedException(OptionAnalysis.class, "createDate");
                }
                return __createDateValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String meta() {
                if (!__metaLoaded) {
                    throw new UnloadedException(OptionAnalysis.class, "meta");
                }
                return __metaValue;
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
                    case SLOT_EVENT_NAME:
                    		return __eventNameValue != null;
                    case SLOT_EVENT_CODE:
                    		return __eventCodeValue != null;
                    case SLOT_OPTION_USER:
                    		return __optionUserLoaded;
                    case SLOT_IP_ADDRESS:
                    		return __ipAddressValue != null;
                    case SLOT_CREATE_DATE:
                    		return __createDateValue != null;
                    case SLOT_META:
                    		return __metaLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.OptionAnalysis\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id":
                    		return __idValue != null;
                    case "eventName":
                    		return __eventNameValue != null;
                    case "eventCode":
                    		return __eventCodeValue != null;
                    case "optionUser":
                    		return __optionUserLoaded;
                    case "ipAddress":
                    		return __ipAddressValue != null;
                    case "createDate":
                    		return __createDateValue != null;
                    case "meta":
                    		return __metaLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.OptionAnalysis\": \"" + prop + "\"");
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
                    case SLOT_EVENT_NAME:
                    		return __visibility.visible(SLOT_EVENT_NAME);
                    case SLOT_EVENT_CODE:
                    		return __visibility.visible(SLOT_EVENT_CODE);
                    case SLOT_OPTION_USER:
                    		return __visibility.visible(SLOT_OPTION_USER);
                    case SLOT_IP_ADDRESS:
                    		return __visibility.visible(SLOT_IP_ADDRESS);
                    case SLOT_CREATE_DATE:
                    		return __visibility.visible(SLOT_CREATE_DATE);
                    case SLOT_META:
                    		return __visibility.visible(SLOT_META);
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
                    case "eventName":
                    		return __visibility.visible(SLOT_EVENT_NAME);
                    case "eventCode":
                    		return __visibility.visible(SLOT_EVENT_CODE);
                    case "optionUser":
                    		return __visibility.visible(SLOT_OPTION_USER);
                    case "ipAddress":
                    		return __visibility.visible(SLOT_IP_ADDRESS);
                    case "createDate":
                    		return __visibility.visible(SLOT_CREATE_DATE);
                    case "meta":
                    		return __visibility.visible(SLOT_META);
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
                if (__eventNameValue != null) {
                    hash = 31 * hash + __eventNameValue.hashCode();
                }
                if (__eventCodeValue != null) {
                    hash = 31 * hash + __eventCodeValue.hashCode();
                }
                if (__optionUserLoaded && __optionUserValue != null) {
                    hash = 31 * hash + __optionUserValue.hashCode();
                }
                if (__ipAddressValue != null) {
                    hash = 31 * hash + __ipAddressValue.hashCode();
                }
                if (__createDateValue != null) {
                    hash = 31 * hash + __createDateValue.hashCode();
                }
                if (__metaLoaded && __metaValue != null) {
                    hash = 31 * hash + __metaValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + System.identityHashCode(__idValue);
                }
                if (__eventNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__eventNameValue);
                }
                if (__eventCodeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__eventCodeValue);
                }
                if (__optionUserLoaded) {
                    hash = 31 * hash + System.identityHashCode(__optionUserValue);
                }
                if (__ipAddressValue != null) {
                    hash = 31 * hash + System.identityHashCode(__ipAddressValue);
                }
                if (__createDateValue != null) {
                    hash = 31 * hash + System.identityHashCode(__createDateValue);
                }
                if (__metaLoaded) {
                    hash = 31 * hash + System.identityHashCode(__metaValue);
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
                if (__isVisible(PropId.byIndex(SLOT_EVENT_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_EVENT_NAME))) {
                    return false;
                }
                boolean __eventNameLoaded = __eventNameValue != null;
                if (__eventNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EVENT_NAME))) {
                    return false;
                }
                if (__eventNameLoaded && !Objects.equals(__eventNameValue, __other.eventName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EVENT_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_EVENT_CODE))) {
                    return false;
                }
                boolean __eventCodeLoaded = __eventCodeValue != null;
                if (__eventCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EVENT_CODE))) {
                    return false;
                }
                if (__eventCodeLoaded && !Objects.equals(__eventCodeValue, __other.eventCode())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_OPTION_USER)) != __other.__isVisible(PropId.byIndex(SLOT_OPTION_USER))) {
                    return false;
                }
                boolean __optionUserLoaded = this.__optionUserLoaded;
                if (__optionUserLoaded != __other.__isLoaded(PropId.byIndex(SLOT_OPTION_USER))) {
                    return false;
                }
                if (__optionUserLoaded && !Objects.equals(__optionUserValue, __other.optionUser())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_IP_ADDRESS)) != __other.__isVisible(PropId.byIndex(SLOT_IP_ADDRESS))) {
                    return false;
                }
                boolean __ipAddressLoaded = __ipAddressValue != null;
                if (__ipAddressLoaded != __other.__isLoaded(PropId.byIndex(SLOT_IP_ADDRESS))) {
                    return false;
                }
                if (__ipAddressLoaded && !Objects.equals(__ipAddressValue, __other.ipAddress())) {
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
                if (__isVisible(PropId.byIndex(SLOT_META)) != __other.__isVisible(PropId.byIndex(SLOT_META))) {
                    return false;
                }
                boolean __metaLoaded = this.__metaLoaded;
                if (__metaLoaded != __other.__isLoaded(PropId.byIndex(SLOT_META))) {
                    return false;
                }
                if (__metaLoaded && !Objects.equals(__metaValue, __other.meta())) {
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
                if (__isVisible(PropId.byIndex(SLOT_EVENT_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_EVENT_NAME))) {
                    return false;
                }
                boolean __eventNameLoaded = __eventNameValue != null;
                if (__eventNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EVENT_NAME))) {
                    return false;
                }
                if (__eventNameLoaded && __eventNameValue != __other.eventName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_EVENT_CODE)) != __other.__isVisible(PropId.byIndex(SLOT_EVENT_CODE))) {
                    return false;
                }
                boolean __eventCodeLoaded = __eventCodeValue != null;
                if (__eventCodeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_EVENT_CODE))) {
                    return false;
                }
                if (__eventCodeLoaded && __eventCodeValue != __other.eventCode()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_OPTION_USER)) != __other.__isVisible(PropId.byIndex(SLOT_OPTION_USER))) {
                    return false;
                }
                boolean __optionUserLoaded = this.__optionUserLoaded;
                if (__optionUserLoaded != __other.__isLoaded(PropId.byIndex(SLOT_OPTION_USER))) {
                    return false;
                }
                if (__optionUserLoaded && __optionUserValue != __other.optionUser()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_IP_ADDRESS)) != __other.__isVisible(PropId.byIndex(SLOT_IP_ADDRESS))) {
                    return false;
                }
                boolean __ipAddressLoaded = __ipAddressValue != null;
                if (__ipAddressLoaded != __other.__isLoaded(PropId.byIndex(SLOT_IP_ADDRESS))) {
                    return false;
                }
                if (__ipAddressLoaded && __ipAddressValue != __other.ipAddress()) {
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
                if (__isVisible(PropId.byIndex(SLOT_META)) != __other.__isVisible(PropId.byIndex(SLOT_META))) {
                    return false;
                }
                boolean __metaLoaded = this.__metaLoaded;
                if (__metaLoaded != __other.__isLoaded(PropId.byIndex(SLOT_META))) {
                    return false;
                }
                if (__metaLoaded && __metaValue != __other.meta()) {
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
                type = OptionAnalysis.class
        )
        private static class DraftImpl extends Implementor implements DraftSpi, OptionAnalysisDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            private OptionAnalysis __resolved;

            DraftImpl(DraftContext ctx, OptionAnalysis base) {
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
            public OptionAnalysisDraft setId(String id) {
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
            public String eventName() {
                return (__modified!= null ? __modified : __base).eventName();
            }

            @Override
            public OptionAnalysisDraft setEventName(String eventName) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (eventName == null) {
                    throw new IllegalArgumentException(
                        "'eventName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__eventNameValue = eventName;
                return this;
            }

            @Override
            @JsonIgnore
            public String eventCode() {
                return (__modified!= null ? __modified : __base).eventCode();
            }

            @Override
            public OptionAnalysisDraft setEventCode(String eventCode) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (eventCode == null) {
                    throw new IllegalArgumentException(
                        "'eventCode' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__eventCodeValue = eventCode;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public UserDraft optionUser() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).optionUser());
            }

            @Override
            public UserDraft optionUser(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_OPTION_USER)) || optionUser() == null)) {
                    setOptionUser(UserDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).optionUser());
            }

            @Override
            public OptionAnalysisDraft setOptionUser(User optionUser) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__optionUserValue = optionUser;
                __tmpModified.__optionUserLoaded = true;
                return this;
            }

            @Nullable
            @Override
            public String optionUserId() {
                User optionUser = optionUser();
                if (optionUser == null) {
                    return null;
                }
                return optionUser.userCode();
            }

            @OldChain
            @Override
            public OptionAnalysisDraft setOptionUserId(@Nullable String optionUserId) {
                if (optionUserId == null) {
                    setOptionUser(null);
                    return this;
                }
                optionUser(true).setUserCode(optionUserId);
                return this;
            }

            @Override
            public OptionAnalysisDraft applyOptionUser(DraftConsumer<UserDraft> block) {
                applyOptionUser(null, block);
                return this;
            }

            @Override
            public OptionAnalysisDraft applyOptionUser(User base, DraftConsumer<UserDraft> block) {
                setOptionUser(UserDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            public String ipAddress() {
                return (__modified!= null ? __modified : __base).ipAddress();
            }

            @Override
            public OptionAnalysisDraft setIpAddress(String ipAddress) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (ipAddress == null) {
                    throw new IllegalArgumentException(
                        "'ipAddress' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__ipAddressValue = ipAddress;
                return this;
            }

            @Override
            @JsonIgnore
            public Date createDate() {
                return (__modified!= null ? __modified : __base).createDate();
            }

            @Override
            public OptionAnalysisDraft setCreateDate(Date createDate) {
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
            @Nullable
            public String meta() {
                return (__modified!= null ? __modified : __base).meta();
            }

            @Override
            public OptionAnalysisDraft setMeta(String meta) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__metaValue = meta;
                __tmpModified.__metaLoaded = true;
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
                    case SLOT_EVENT_NAME:
                    		setEventName((String)value);break;
                    case SLOT_EVENT_CODE:
                    		setEventCode((String)value);break;
                    case SLOT_OPTION_USER:
                    		setOptionUser((User)value);break;
                    case SLOT_IP_ADDRESS:
                    		setIpAddress((String)value);break;
                    case SLOT_CREATE_DATE:
                    		setCreateDate((Date)value);break;
                    case SLOT_META:
                    		setMeta((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.OptionAnalysis\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id":
                    		setId((String)value);break;
                    case "eventName":
                    		setEventName((String)value);break;
                    case "eventCode":
                    		setEventCode((String)value);break;
                    case "optionUser":
                    		setOptionUser((User)value);break;
                    case "ipAddress":
                    		setIpAddress((String)value);break;
                    case "createDate":
                    		setCreateDate((Date)value);break;
                    case "meta":
                    		setMeta((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.OptionAnalysis\": \"" + prop + "\"");
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
                    __modified().__visibility = __visibility = Visibility.of(7);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_ID:
                    		__visibility.show(SLOT_ID, visible);break;
                    case SLOT_EVENT_NAME:
                    		__visibility.show(SLOT_EVENT_NAME, visible);break;
                    case SLOT_EVENT_CODE:
                    		__visibility.show(SLOT_EVENT_CODE, visible);break;
                    case SLOT_OPTION_USER:
                    		__visibility.show(SLOT_OPTION_USER, visible);break;
                    case SLOT_IP_ADDRESS:
                    		__visibility.show(SLOT_IP_ADDRESS, visible);break;
                    case SLOT_CREATE_DATE:
                    		__visibility.show(SLOT_CREATE_DATE, visible);break;
                    case SLOT_META:
                    		__visibility.show(SLOT_META, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.sys.OptionAnalysis\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(7);
                }
                switch (prop) {
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
                    case "eventName":
                    		__visibility.show(SLOT_EVENT_NAME, visible);break;
                    case "eventCode":
                    		__visibility.show(SLOT_EVENT_CODE, visible);break;
                    case "optionUser":
                    		__visibility.show(SLOT_OPTION_USER, visible);break;
                    case "ipAddress":
                    		__visibility.show(SLOT_IP_ADDRESS, visible);break;
                    case "createDate":
                    		__visibility.show(SLOT_CREATE_DATE, visible);break;
                    case "meta":
                    		__visibility.show(SLOT_META, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.sys.OptionAnalysis\": \"" + 
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
                    case SLOT_EVENT_NAME:
                    		__modified().__eventNameValue = null;break;
                    case SLOT_EVENT_CODE:
                    		__modified().__eventCodeValue = null;break;
                    case SLOT_OPTION_USER:
                    		__modified().__optionUserLoaded = false;break;
                    case SLOT_IP_ADDRESS:
                    		__modified().__ipAddressValue = null;break;
                    case SLOT_CREATE_DATE:
                    		__modified().__createDateValue = null;break;
                    case SLOT_META:
                    		__modified().__metaLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.OptionAnalysis\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                    case "eventName":
                    		__modified().__eventNameValue = null;break;
                    case "eventCode":
                    		__modified().__eventCodeValue = null;break;
                    case "optionUser":
                    		__modified().__optionUserLoaded = false;break;
                    case "ipAddress":
                    		__modified().__ipAddressValue = null;break;
                    case "createDate":
                    		__modified().__createDateValue = null;break;
                    case "meta":
                    		__modified().__metaLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.OptionAnalysis\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                        if (base.__isLoaded(PropId.byIndex(SLOT_OPTION_USER))) {
                            User oldValue = base.optionUser();
                            User newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setOptionUser(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__optionUserValue = __ctx.resolveObject(__tmpModified.__optionUserValue);
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
            type = OptionAnalysis.class
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
                description = "事件名称"
        )
        public Builder eventName(String eventName) {
            if (eventName != null) {
                __draft.setEventName(eventName);
            }
            return this;
        }

        @Schema(
                description = "事件编码"
        )
        public Builder eventCode(String eventCode) {
            if (eventCode != null) {
                __draft.setEventCode(eventCode);
            }
            return this;
        }

        @Schema(
                description = "操作人，如果没有就是游客"
        )
        @jakarta.annotation.Nullable
        public Builder optionUser(User optionUser) {
            __draft.setOptionUser(optionUser);
            return this;
        }

        @Schema(
                description = "ip地址"
        )
        public Builder ipAddress(String ipAddress) {
            if (ipAddress != null) {
                __draft.setIpAddress(ipAddress);
            }
            return this;
        }

        @Schema(
                description = "创建时间"
        )
        public Builder createDate(Date createDate) {
            if (createDate != null) {
                __draft.setCreateDate(createDate);
            }
            return this;
        }

        @Schema(
                description = "元数据存取某些相关分析数据json"
        )
        @jakarta.annotation.Nullable
        public Builder meta(String meta) {
            __draft.setMeta(meta);
            return this;
        }

        public OptionAnalysis build() {
            return (OptionAnalysis)__draft.__modified();
        }
    }
}
