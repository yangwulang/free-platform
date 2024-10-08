package top.yangwulang.platform.entity.message;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalStateException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.Collections;
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
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserDraft;

@GeneratedBy(
        type = MessageRecordUser.class
)
public interface MessageRecordUserDraft extends MessageRecordUser, TypeBaseDraft {
    MessageRecordUserDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    MessageRecordUserDraft setId(String id);

    @Nullable
    MessageRecordDraft record();

    MessageRecordDraft record(boolean autoCreate);

    @OldChain
    MessageRecordUserDraft setRecord(MessageRecord record);

    @Nullable
    String recordId();

    @OldChain
    MessageRecordUserDraft setRecordId(@Nullable String recordId);

    @OldChain
    MessageRecordUserDraft applyRecord(DraftConsumer<MessageRecordDraft> block);

    @OldChain
    MessageRecordUserDraft applyRecord(MessageRecord base, DraftConsumer<MessageRecordDraft> block);

    @Nullable
    UserDraft user();

    UserDraft user(boolean autoCreate);

    @OldChain
    MessageRecordUserDraft setUser(User user);

    @Nullable
    String userId();

    @OldChain
    MessageRecordUserDraft setUserId(@Nullable String userId);

    @OldChain
    MessageRecordUserDraft applyUser(DraftConsumer<UserDraft> block);

    @OldChain
    MessageRecordUserDraft applyUser(User base, DraftConsumer<UserDraft> block);

    @OldChain
    MessageRecordUserDraft setReadStatus(Integer readStatus);

    @GeneratedBy(
            type = MessageRecordUser.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_RECORD = 1;

        public static final int SLOT_USER = 2;

        public static final int SLOT_READ_STATUS = 3;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.184",
                MessageRecordUser.class,
                Collections.singleton(TypeBaseDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (MessageRecordUser)base)
            )
            .redefine("id", SLOT_ID)
            .add(SLOT_RECORD, "record", ManyToOne.class, MessageRecord.class, true)
            .add(SLOT_USER, "user", ManyToOne.class, User.class, true)
            .add(SLOT_READ_STATUS, "readStatus", ImmutablePropCategory.SCALAR, Integer.class, true)
            .build();

        private Producer() {
        }

        public MessageRecordUser produce(DraftConsumer<MessageRecordUserDraft> block) {
            return produce(null, block);
        }

        public MessageRecordUser produce(MessageRecordUser base,
                DraftConsumer<MessageRecordUserDraft> block) {
            return (MessageRecordUser)Internal.produce(TYPE, base, block);
        }

        /**
         * Class, not interface, for free-marker
         */
        @GeneratedBy(
                type = MessageRecordUser.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "id", "record", "user", "readStatus"})
        public abstract static class Implementor implements MessageRecordUser, ImmutableSpi {
            @Override
            public final Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_ID:
                    		return id();
                    case SLOT_RECORD:
                    		return record();
                    case SLOT_USER:
                    		return user();
                    case SLOT_READ_STATUS:
                    		return readStatus();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.message.MessageRecordUser\": \"" + prop + "\"");
                }
            }

            @Override
            public final Object __get(String prop) {
                switch (prop) {
                    case "id":
                    		return id();
                    case "record":
                    		return record();
                    case "user":
                    		return user();
                    case "readStatus":
                    		return readStatus();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.message.MessageRecordUser\": \"" + prop + "\"");
                }
            }

            @NotNull
            public final String getId() {
                return id();
            }

            @jakarta.annotation.Nullable
            public final MessageRecord getRecord() {
                return record();
            }

            @jakarta.annotation.Nullable
            public final User getUser() {
                return user();
            }

            public final Integer getReadStatus() {
                return readStatus();
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
                type = MessageRecordUser.class
        )
        private static class Impl extends Implementor implements Cloneable, Serializable {
            private Visibility __visibility;

            String __idValue;

            MessageRecord __recordValue;

            boolean __recordLoaded = false;

            User __userValue;

            boolean __userLoaded = false;

            Integer __readStatusValue;

            boolean __readStatusLoaded = false;

            @Override
            @JsonIgnore
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(MessageRecordUser.class, "id");
                }
                return __idValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public MessageRecord record() {
                if (!__recordLoaded) {
                    throw new UnloadedException(MessageRecordUser.class, "record");
                }
                return __recordValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public User user() {
                if (!__userLoaded) {
                    throw new UnloadedException(MessageRecordUser.class, "user");
                }
                return __userValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Integer readStatus() {
                if (!__readStatusLoaded) {
                    throw new UnloadedException(MessageRecordUser.class, "readStatus");
                }
                return __readStatusValue;
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
                    case SLOT_RECORD:
                    		return __recordLoaded;
                    case SLOT_USER:
                    		return __userLoaded;
                    case SLOT_READ_STATUS:
                    		return __readStatusLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.message.MessageRecordUser\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id":
                    		return __idValue != null;
                    case "record":
                    		return __recordLoaded;
                    case "user":
                    		return __userLoaded;
                    case "readStatus":
                    		return __readStatusLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.message.MessageRecordUser\": \"" + prop + "\"");
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
                    case SLOT_RECORD:
                    		return __visibility.visible(SLOT_RECORD);
                    case SLOT_USER:
                    		return __visibility.visible(SLOT_USER);
                    case SLOT_READ_STATUS:
                    		return __visibility.visible(SLOT_READ_STATUS);
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
                    case "record":
                    		return __visibility.visible(SLOT_RECORD);
                    case "user":
                    		return __visibility.visible(SLOT_USER);
                    case "readStatus":
                    		return __visibility.visible(SLOT_READ_STATUS);
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
                if (__recordLoaded && __recordValue != null) {
                    hash = 31 * hash + __recordValue.hashCode();
                }
                if (__userLoaded && __userValue != null) {
                    hash = 31 * hash + __userValue.hashCode();
                }
                if (__readStatusLoaded && __readStatusValue != null) {
                    hash = 31 * hash + __readStatusValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + System.identityHashCode(__idValue);
                }
                if (__recordLoaded) {
                    hash = 31 * hash + System.identityHashCode(__recordValue);
                }
                if (__userLoaded) {
                    hash = 31 * hash + System.identityHashCode(__userValue);
                }
                if (__readStatusLoaded) {
                    hash = 31 * hash + System.identityHashCode(__readStatusValue);
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
                if (__isVisible(PropId.byIndex(SLOT_RECORD)) != __other.__isVisible(PropId.byIndex(SLOT_RECORD))) {
                    return false;
                }
                boolean __recordLoaded = this.__recordLoaded;
                if (__recordLoaded != __other.__isLoaded(PropId.byIndex(SLOT_RECORD))) {
                    return false;
                }
                if (__recordLoaded && !Objects.equals(__recordValue, __other.record())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_USER)) != __other.__isVisible(PropId.byIndex(SLOT_USER))) {
                    return false;
                }
                boolean __userLoaded = this.__userLoaded;
                if (__userLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER))) {
                    return false;
                }
                if (__userLoaded && !Objects.equals(__userValue, __other.user())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_READ_STATUS)) != __other.__isVisible(PropId.byIndex(SLOT_READ_STATUS))) {
                    return false;
                }
                boolean __readStatusLoaded = this.__readStatusLoaded;
                if (__readStatusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_READ_STATUS))) {
                    return false;
                }
                if (__readStatusLoaded && !Objects.equals(__readStatusValue, __other.readStatus())) {
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
                if (__isVisible(PropId.byIndex(SLOT_RECORD)) != __other.__isVisible(PropId.byIndex(SLOT_RECORD))) {
                    return false;
                }
                boolean __recordLoaded = this.__recordLoaded;
                if (__recordLoaded != __other.__isLoaded(PropId.byIndex(SLOT_RECORD))) {
                    return false;
                }
                if (__recordLoaded && __recordValue != __other.record()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_USER)) != __other.__isVisible(PropId.byIndex(SLOT_USER))) {
                    return false;
                }
                boolean __userLoaded = this.__userLoaded;
                if (__userLoaded != __other.__isLoaded(PropId.byIndex(SLOT_USER))) {
                    return false;
                }
                if (__userLoaded && __userValue != __other.user()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_READ_STATUS)) != __other.__isVisible(PropId.byIndex(SLOT_READ_STATUS))) {
                    return false;
                }
                boolean __readStatusLoaded = this.__readStatusLoaded;
                if (__readStatusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_READ_STATUS))) {
                    return false;
                }
                if (__readStatusLoaded && __readStatusValue != __other.readStatus()) {
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
                type = MessageRecordUser.class
        )
        private static class DraftImpl extends Implementor implements DraftSpi, MessageRecordUserDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            private MessageRecordUser __resolved;

            DraftImpl(DraftContext ctx, MessageRecordUser base) {
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
            public MessageRecordUserDraft setId(String id) {
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
            @Nullable
            public MessageRecordDraft record() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).record());
            }

            @Override
            public MessageRecordDraft record(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_RECORD)) || record() == null)) {
                    setRecord(MessageRecordDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).record());
            }

            @Override
            public MessageRecordUserDraft setRecord(MessageRecord record) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__recordValue = record;
                __tmpModified.__recordLoaded = true;
                return this;
            }

            @Nullable
            @Override
            public String recordId() {
                MessageRecord record = record();
                if (record == null) {
                    return null;
                }
                return record.id();
            }

            @OldChain
            @Override
            public MessageRecordUserDraft setRecordId(@Nullable String recordId) {
                if (recordId == null) {
                    setRecord(null);
                    return this;
                }
                record(true).setId(recordId);
                return this;
            }

            @Override
            public MessageRecordUserDraft applyRecord(DraftConsumer<MessageRecordDraft> block) {
                applyRecord(null, block);
                return this;
            }

            @Override
            public MessageRecordUserDraft applyRecord(MessageRecord base,
                    DraftConsumer<MessageRecordDraft> block) {
                setRecord(MessageRecordDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public UserDraft user() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).user());
            }

            @Override
            public UserDraft user(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_USER)) || user() == null)) {
                    setUser(UserDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).user());
            }

            @Override
            public MessageRecordUserDraft setUser(User user) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__userValue = user;
                __tmpModified.__userLoaded = true;
                return this;
            }

            @Nullable
            @Override
            public String userId() {
                User user = user();
                if (user == null) {
                    return null;
                }
                return user.userCode();
            }

            @OldChain
            @Override
            public MessageRecordUserDraft setUserId(@Nullable String userId) {
                if (userId == null) {
                    setUser(null);
                    return this;
                }
                user(true).setUserCode(userId);
                return this;
            }

            @Override
            public MessageRecordUserDraft applyUser(DraftConsumer<UserDraft> block) {
                applyUser(null, block);
                return this;
            }

            @Override
            public MessageRecordUserDraft applyUser(User base, DraftConsumer<UserDraft> block) {
                setUser(UserDraft.$.produce(base, block));
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public Integer readStatus() {
                return (__modified!= null ? __modified : __base).readStatus();
            }

            @Override
            public MessageRecordUserDraft setReadStatus(Integer readStatus) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__readStatusValue = readStatus;
                __tmpModified.__readStatusLoaded = true;
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
                    case SLOT_RECORD:
                    		setRecord((MessageRecord)value);break;
                    case SLOT_USER:
                    		setUser((User)value);break;
                    case SLOT_READ_STATUS:
                    		setReadStatus((Integer)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.message.MessageRecordUser\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id":
                    		setId((String)value);break;
                    case "record":
                    		setRecord((MessageRecord)value);break;
                    case "user":
                    		setUser((User)value);break;
                    case "readStatus":
                    		setReadStatus((Integer)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.message.MessageRecordUser\": \"" + prop + "\"");
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
                    __modified().__visibility = __visibility = Visibility.of(4);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_ID:
                    		__visibility.show(SLOT_ID, visible);break;
                    case SLOT_RECORD:
                    		__visibility.show(SLOT_RECORD, visible);break;
                    case SLOT_USER:
                    		__visibility.show(SLOT_USER, visible);break;
                    case SLOT_READ_STATUS:
                    		__visibility.show(SLOT_READ_STATUS, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.message.MessageRecordUser\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(4);
                }
                switch (prop) {
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
                    case "record":
                    		__visibility.show(SLOT_RECORD, visible);break;
                    case "user":
                    		__visibility.show(SLOT_USER, visible);break;
                    case "readStatus":
                    		__visibility.show(SLOT_READ_STATUS, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.message.MessageRecordUser\": \"" + 
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
                    case SLOT_RECORD:
                    		__modified().__recordLoaded = false;break;
                    case SLOT_USER:
                    		__modified().__userLoaded = false;break;
                    case SLOT_READ_STATUS:
                    		__modified().__readStatusLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.message.MessageRecordUser\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                    case "record":
                    		__modified().__recordLoaded = false;break;
                    case "user":
                    		__modified().__userLoaded = false;break;
                    case "readStatus":
                    		__modified().__readStatusLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.message.MessageRecordUser\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                        if (base.__isLoaded(PropId.byIndex(SLOT_RECORD))) {
                            MessageRecord oldValue = base.record();
                            MessageRecord newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setRecord(newValue);
                            }
                        }
                        if (base.__isLoaded(PropId.byIndex(SLOT_USER))) {
                            User oldValue = base.user();
                            User newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setUser(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__recordValue = __ctx.resolveObject(__tmpModified.__recordValue);
                        __tmpModified.__userValue = __ctx.resolveObject(__tmpModified.__userValue);
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
            type = MessageRecordUser.class
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

        @jakarta.annotation.Nullable
        public Builder record(MessageRecord record) {
            __draft.setRecord(record);
            return this;
        }

        @jakarta.annotation.Nullable
        public Builder user(User user) {
            __draft.setUser(user);
            return this;
        }

        public Builder readStatus(Integer readStatus) {
            __draft.setReadStatus(readStatus);
            return this;
        }

        public MessageRecordUser build() {
            return (MessageRecordUser)__draft.__modified();
        }
    }
}
