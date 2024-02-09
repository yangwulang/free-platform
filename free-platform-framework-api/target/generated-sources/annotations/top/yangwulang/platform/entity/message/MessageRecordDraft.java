package top.yangwulang.platform.entity.message;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
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
import java.util.Arrays;
import java.util.Collections;
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
import org.babyfish.jimmer.sql.ManyToManyView;
import org.babyfish.jimmer.sql.OneToMany;
import org.babyfish.jimmer.sql.collection.ManyToManyViewList;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.StatusTypeBaseDraft;
import top.yangwulang.platform.entity.TypeBaseDraft;
import top.yangwulang.platform.entity.sys.User;

@GeneratedBy(
        type = MessageRecord.class
)
public interface MessageRecordDraft extends MessageRecord, TypeBaseDraft, StatusTypeBaseDraft {
    MessageRecordDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    MessageRecordDraft setId(String id);

    @OldChain
    MessageRecordDraft setStatus(int status);

    @OldChain
    MessageRecordDraft setType(String type);

    @OldChain
    MessageRecordDraft setTitle(String title);

    @OldChain
    MessageRecordDraft setSubTitle(String subTitle);

    @OldChain
    MessageRecordDraft setAvatar(String avatar);

    @OldChain
    MessageRecordDraft setContent(String content);

    @OldChain
    MessageRecordDraft setMessageType(Integer messageType);

    List<MessageRecordUserDraft> messageRecordUsers(boolean autoCreate);

    @OldChain
    MessageRecordDraft setMessageRecordUsers(List<MessageRecordUser> messageRecordUsers);

    @OldChain
    MessageRecordDraft addIntoMessageRecordUsers(DraftConsumer<MessageRecordUserDraft> block);

    @OldChain
    MessageRecordDraft addIntoMessageRecordUsers(MessageRecordUser base,
            DraftConsumer<MessageRecordUserDraft> block);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_STATUS = 1;

        public static final int SLOT_TYPE = 2;

        public static final int SLOT_TITLE = 3;

        public static final int SLOT_SUB_TITLE = 4;

        public static final int SLOT_AVATAR = 5;

        public static final int SLOT_CONTENT = 6;

        public static final int SLOT_MESSAGE_TYPE = 7;

        public static final int SLOT_TARGET_USERS = 8;

        public static final int SLOT_MESSAGE_RECORD_USERS = 9;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.93",
                MessageRecord.class,
                Arrays.asList(
                    TypeBaseDraft.Producer.TYPE,
                    StatusTypeBaseDraft.Producer.TYPE
                )
                ,(ctx, base) -> new DraftImpl(ctx, (MessageRecord)base)
            )
            .redefine("id", SLOT_ID)
            .redefine("status", SLOT_STATUS)
            .add(SLOT_TYPE, "type", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_TITLE, "title", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_SUB_TITLE, "subTitle", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_AVATAR, "avatar", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_CONTENT, "content", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_MESSAGE_TYPE, "messageType", ImmutablePropCategory.SCALAR, Integer.class, true)
            .add(SLOT_TARGET_USERS, "targetUsers", ManyToManyView.class, User.class, false)
            .add(SLOT_MESSAGE_RECORD_USERS, "messageRecordUsers", OneToMany.class, MessageRecordUser.class, false)
            .build();

        private Producer() {
        }

        public MessageRecord produce(DraftConsumer<MessageRecordDraft> block) {
            return produce(null, block);
        }

        public MessageRecord produce(MessageRecord base, DraftConsumer<MessageRecordDraft> block) {
            return (MessageRecord)Internal.produce(TYPE, base, block);
        }

        public abstract interface Implementor extends MessageRecord, ImmutableSpi {
            PropId DEEPER_PROP_ID_TARGET_USERS = Producer.TYPE.getProp("targetUsers").getManyToManyViewBaseDeeperProp().getId();

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
                    case SLOT_TYPE:
                    		return type();
                    case SLOT_TITLE:
                    		return title();
                    case SLOT_SUB_TITLE:
                    		return subTitle();
                    case SLOT_AVATAR:
                    		return avatar();
                    case SLOT_CONTENT:
                    		return content();
                    case SLOT_MESSAGE_TYPE:
                    		return messageType();
                    case SLOT_TARGET_USERS:
                    		return targetUsers();
                    case SLOT_MESSAGE_RECORD_USERS:
                    		return messageRecordUsers();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.message.MessageRecord\": \"" + prop + "\"");
                }
            }

            @Override
            default Object __get(String prop) {
                switch (prop) {
                    case "id":
                    		return id();
                    case "status":
                    		return (Integer)status();
                    case "type":
                    		return type();
                    case "title":
                    		return title();
                    case "subTitle":
                    		return subTitle();
                    case "avatar":
                    		return avatar();
                    case "content":
                    		return content();
                    case "messageType":
                    		return messageType();
                    case "targetUsers":
                    		return targetUsers();
                    case "messageRecordUsers":
                    		return messageRecordUsers();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.message.MessageRecord\": \"" + prop + "\"");
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
            default String getType() {
                return type();
            }

            @JsonIgnore
            default String getTitle() {
                return title();
            }

            @JsonIgnore
            default String getSubTitle() {
                return subTitle();
            }

            @JsonIgnore
            default String getAvatar() {
                return avatar();
            }

            @JsonIgnore
            default String getContent() {
                return content();
            }

            @JsonIgnore
            default Integer getMessageType() {
                return messageType();
            }

            @Override
            default List<User> targetUsers() {
                return new ManyToManyViewList<>(
                            DEEPER_PROP_ID_TARGET_USERS, messageRecordUsers()
                        );
            }

            @JsonIgnore
            default List<User> getTargetUsers() {
                return targetUsers();
            }

            @JsonIgnore
            default List<MessageRecordUser> getMessageRecordUsers() {
                return messageRecordUsers();
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

            String __typeValue;

            String __titleValue;

            String __subTitleValue;

            String __avatarValue;

            boolean __avatarLoaded = false;

            String __contentValue;

            Integer __messageTypeValue;

            boolean __messageTypeLoaded = false;

            NonSharedList<MessageRecordUser> __messageRecordUsersValue;

            Impl() {
                __visibility = Visibility.of(10);
                __visibility.show(SLOT_TARGET_USERS, false);
            }

            @Override
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(MessageRecord.class, "id");
                }
                return __idValue;
            }

            @Override
            public int status() {
                if (!__statusLoaded) {
                    throw new UnloadedException(MessageRecord.class, "status");
                }
                return __statusValue;
            }

            @Override
            public String type() {
                if (__typeValue == null) {
                    throw new UnloadedException(MessageRecord.class, "type");
                }
                return __typeValue;
            }

            @Override
            public String title() {
                if (__titleValue == null) {
                    throw new UnloadedException(MessageRecord.class, "title");
                }
                return __titleValue;
            }

            @Override
            public String subTitle() {
                if (__subTitleValue == null) {
                    throw new UnloadedException(MessageRecord.class, "subTitle");
                }
                return __subTitleValue;
            }

            @Override
            @Nullable
            public String avatar() {
                if (!__avatarLoaded) {
                    throw new UnloadedException(MessageRecord.class, "avatar");
                }
                return __avatarValue;
            }

            @Override
            public String content() {
                if (__contentValue == null) {
                    throw new UnloadedException(MessageRecord.class, "content");
                }
                return __contentValue;
            }

            @Override
            @Nullable
            public Integer messageType() {
                if (!__messageTypeLoaded) {
                    throw new UnloadedException(MessageRecord.class, "messageType");
                }
                return __messageTypeValue;
            }

            @Override
            public List<MessageRecordUser> messageRecordUsers() {
                if (__messageRecordUsersValue == null) {
                    throw new UnloadedException(MessageRecord.class, "messageRecordUsers");
                }
                return __messageRecordUsersValue;
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
                    case SLOT_TYPE:
                    		return __typeValue != null;
                    case SLOT_TITLE:
                    		return __titleValue != null;
                    case SLOT_SUB_TITLE:
                    		return __subTitleValue != null;
                    case SLOT_AVATAR:
                    		return __avatarLoaded;
                    case SLOT_CONTENT:
                    		return __contentValue != null;
                    case SLOT_MESSAGE_TYPE:
                    		return __messageTypeLoaded;
                    case SLOT_TARGET_USERS:
                    		return __isLoaded(PropId.byIndex(SLOT_MESSAGE_RECORD_USERS)) && messageRecordUsers().stream().allMatch(__each -> 
                                ((ImmutableSpi)__each).__isLoaded(DEEPER_PROP_ID_TARGET_USERS)
                            );
                    case SLOT_MESSAGE_RECORD_USERS:
                    		return __messageRecordUsersValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.message.MessageRecord\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id":
                    		return __idValue != null;
                    case "status":
                    		return __statusLoaded;
                    case "type":
                    		return __typeValue != null;
                    case "title":
                    		return __titleValue != null;
                    case "subTitle":
                    		return __subTitleValue != null;
                    case "avatar":
                    		return __avatarLoaded;
                    case "content":
                    		return __contentValue != null;
                    case "messageType":
                    		return __messageTypeLoaded;
                    case "targetUsers":
                    		return __isLoaded(PropId.byIndex(SLOT_MESSAGE_RECORD_USERS)) && messageRecordUsers().stream().allMatch(__each -> 
                                ((ImmutableSpi)__each).__isLoaded(DEEPER_PROP_ID_TARGET_USERS)
                            );
                    case "messageRecordUsers":
                    		return __messageRecordUsersValue != null;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.message.MessageRecord\": \"" + prop + "\"");
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
                    case SLOT_TYPE:
                    		return __visibility.visible(SLOT_TYPE);
                    case SLOT_TITLE:
                    		return __visibility.visible(SLOT_TITLE);
                    case SLOT_SUB_TITLE:
                    		return __visibility.visible(SLOT_SUB_TITLE);
                    case SLOT_AVATAR:
                    		return __visibility.visible(SLOT_AVATAR);
                    case SLOT_CONTENT:
                    		return __visibility.visible(SLOT_CONTENT);
                    case SLOT_MESSAGE_TYPE:
                    		return __visibility.visible(SLOT_MESSAGE_TYPE);
                    case SLOT_TARGET_USERS:
                    		return __visibility.visible(SLOT_TARGET_USERS);
                    case SLOT_MESSAGE_RECORD_USERS:
                    		return __visibility.visible(SLOT_MESSAGE_RECORD_USERS);
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
                    case "type":
                    		return __visibility.visible(SLOT_TYPE);
                    case "title":
                    		return __visibility.visible(SLOT_TITLE);
                    case "subTitle":
                    		return __visibility.visible(SLOT_SUB_TITLE);
                    case "avatar":
                    		return __visibility.visible(SLOT_AVATAR);
                    case "content":
                    		return __visibility.visible(SLOT_CONTENT);
                    case "messageType":
                    		return __visibility.visible(SLOT_MESSAGE_TYPE);
                    case "targetUsers":
                    		return __visibility.visible(SLOT_TARGET_USERS);
                    case "messageRecordUsers":
                    		return __visibility.visible(SLOT_MESSAGE_RECORD_USERS);
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
                if (__typeValue != null) {
                    hash = 31 * hash + __typeValue.hashCode();
                }
                if (__titleValue != null) {
                    hash = 31 * hash + __titleValue.hashCode();
                }
                if (__subTitleValue != null) {
                    hash = 31 * hash + __subTitleValue.hashCode();
                }
                if (__avatarLoaded && __avatarValue != null) {
                    hash = 31 * hash + __avatarValue.hashCode();
                }
                if (__contentValue != null) {
                    hash = 31 * hash + __contentValue.hashCode();
                }
                if (__messageTypeLoaded && __messageTypeValue != null) {
                    hash = 31 * hash + __messageTypeValue.hashCode();
                }
                if (__messageRecordUsersValue != null) {
                    hash = 31 * hash + __messageRecordUsersValue.hashCode();
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
                if (__typeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__typeValue);
                }
                if (__titleValue != null) {
                    hash = 31 * hash + System.identityHashCode(__titleValue);
                }
                if (__subTitleValue != null) {
                    hash = 31 * hash + System.identityHashCode(__subTitleValue);
                }
                if (__avatarLoaded) {
                    hash = 31 * hash + System.identityHashCode(__avatarValue);
                }
                if (__contentValue != null) {
                    hash = 31 * hash + System.identityHashCode(__contentValue);
                }
                if (__messageTypeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__messageTypeValue);
                }
                if (__messageRecordUsersValue != null) {
                    hash = 31 * hash + System.identityHashCode(__messageRecordUsersValue);
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
                if (__isVisible(PropId.byIndex(SLOT_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_TYPE))) {
                    return false;
                }
                boolean __typeLoaded = __typeValue != null;
                if (__typeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_TYPE))) {
                    return false;
                }
                if (__typeLoaded && !Objects.equals(__typeValue, __other.type())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_TITLE)) != __other.__isVisible(PropId.byIndex(SLOT_TITLE))) {
                    return false;
                }
                boolean __titleLoaded = __titleValue != null;
                if (__titleLoaded != __other.__isLoaded(PropId.byIndex(SLOT_TITLE))) {
                    return false;
                }
                if (__titleLoaded && !Objects.equals(__titleValue, __other.title())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_SUB_TITLE)) != __other.__isVisible(PropId.byIndex(SLOT_SUB_TITLE))) {
                    return false;
                }
                boolean __subTitleLoaded = __subTitleValue != null;
                if (__subTitleLoaded != __other.__isLoaded(PropId.byIndex(SLOT_SUB_TITLE))) {
                    return false;
                }
                if (__subTitleLoaded && !Objects.equals(__subTitleValue, __other.subTitle())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_AVATAR)) != __other.__isVisible(PropId.byIndex(SLOT_AVATAR))) {
                    return false;
                }
                boolean __avatarLoaded = this.__avatarLoaded;
                if (__avatarLoaded != __other.__isLoaded(PropId.byIndex(SLOT_AVATAR))) {
                    return false;
                }
                if (__avatarLoaded && !Objects.equals(__avatarValue, __other.avatar())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CONTENT)) != __other.__isVisible(PropId.byIndex(SLOT_CONTENT))) {
                    return false;
                }
                boolean __contentLoaded = __contentValue != null;
                if (__contentLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CONTENT))) {
                    return false;
                }
                if (__contentLoaded && !Objects.equals(__contentValue, __other.content())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MESSAGE_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_MESSAGE_TYPE))) {
                    return false;
                }
                boolean __messageTypeLoaded = this.__messageTypeLoaded;
                if (__messageTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MESSAGE_TYPE))) {
                    return false;
                }
                if (__messageTypeLoaded && !Objects.equals(__messageTypeValue, __other.messageType())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_TARGET_USERS)) != __other.__isVisible(PropId.byIndex(SLOT_TARGET_USERS))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MESSAGE_RECORD_USERS)) != __other.__isVisible(PropId.byIndex(SLOT_MESSAGE_RECORD_USERS))) {
                    return false;
                }
                boolean __messageRecordUsersLoaded = __messageRecordUsersValue != null;
                if (__messageRecordUsersLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MESSAGE_RECORD_USERS))) {
                    return false;
                }
                if (__messageRecordUsersLoaded && !Objects.equals(__messageRecordUsersValue, __other.messageRecordUsers())) {
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
                if (__isVisible(PropId.byIndex(SLOT_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_TYPE))) {
                    return false;
                }
                boolean __typeLoaded = __typeValue != null;
                if (__typeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_TYPE))) {
                    return false;
                }
                if (__typeLoaded && __typeValue != __other.type()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_TITLE)) != __other.__isVisible(PropId.byIndex(SLOT_TITLE))) {
                    return false;
                }
                boolean __titleLoaded = __titleValue != null;
                if (__titleLoaded != __other.__isLoaded(PropId.byIndex(SLOT_TITLE))) {
                    return false;
                }
                if (__titleLoaded && __titleValue != __other.title()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_SUB_TITLE)) != __other.__isVisible(PropId.byIndex(SLOT_SUB_TITLE))) {
                    return false;
                }
                boolean __subTitleLoaded = __subTitleValue != null;
                if (__subTitleLoaded != __other.__isLoaded(PropId.byIndex(SLOT_SUB_TITLE))) {
                    return false;
                }
                if (__subTitleLoaded && __subTitleValue != __other.subTitle()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_AVATAR)) != __other.__isVisible(PropId.byIndex(SLOT_AVATAR))) {
                    return false;
                }
                boolean __avatarLoaded = this.__avatarLoaded;
                if (__avatarLoaded != __other.__isLoaded(PropId.byIndex(SLOT_AVATAR))) {
                    return false;
                }
                if (__avatarLoaded && __avatarValue != __other.avatar()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CONTENT)) != __other.__isVisible(PropId.byIndex(SLOT_CONTENT))) {
                    return false;
                }
                boolean __contentLoaded = __contentValue != null;
                if (__contentLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CONTENT))) {
                    return false;
                }
                if (__contentLoaded && __contentValue != __other.content()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MESSAGE_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_MESSAGE_TYPE))) {
                    return false;
                }
                boolean __messageTypeLoaded = this.__messageTypeLoaded;
                if (__messageTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MESSAGE_TYPE))) {
                    return false;
                }
                if (__messageTypeLoaded && __messageTypeValue != __other.messageType()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_TARGET_USERS)) != __other.__isVisible(PropId.byIndex(SLOT_TARGET_USERS))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_MESSAGE_RECORD_USERS)) != __other.__isVisible(PropId.byIndex(SLOT_MESSAGE_RECORD_USERS))) {
                    return false;
                }
                boolean __messageRecordUsersLoaded = __messageRecordUsersValue != null;
                if (__messageRecordUsersLoaded != __other.__isLoaded(PropId.byIndex(SLOT_MESSAGE_RECORD_USERS))) {
                    return false;
                }
                if (__messageRecordUsersLoaded && __messageRecordUsersValue != __other.messageRecordUsers()) {
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

        private static class DraftImpl implements Implementor, DraftSpi, MessageRecordDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, MessageRecord base) {
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
            public MessageRecordDraft setId(String id) {
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
            public MessageRecordDraft setStatus(int status) {
                Impl __tmpModified = __modified();
                __tmpModified.__statusValue = status;
                __tmpModified.__statusLoaded = true;
                return this;
            }

            @Override
            public String type() {
                return (__modified!= null ? __modified : __base).type();
            }

            @Override
            public MessageRecordDraft setType(String type) {
                if (type == null) {
                    throw new IllegalArgumentException(
                        "'type' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__typeValue = type;
                return this;
            }

            @Override
            public String title() {
                return (__modified!= null ? __modified : __base).title();
            }

            @Override
            public MessageRecordDraft setTitle(String title) {
                if (title == null) {
                    throw new IllegalArgumentException(
                        "'title' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__titleValue = title;
                return this;
            }

            @Override
            public String subTitle() {
                return (__modified!= null ? __modified : __base).subTitle();
            }

            @Override
            public MessageRecordDraft setSubTitle(String subTitle) {
                if (subTitle == null) {
                    throw new IllegalArgumentException(
                        "'subTitle' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__subTitleValue = subTitle;
                return this;
            }

            @Override
            @Nullable
            public String avatar() {
                return (__modified!= null ? __modified : __base).avatar();
            }

            @Override
            public MessageRecordDraft setAvatar(String avatar) {
                Impl __tmpModified = __modified();
                __tmpModified.__avatarValue = avatar;
                __tmpModified.__avatarLoaded = true;
                return this;
            }

            @Override
            public String content() {
                return (__modified!= null ? __modified : __base).content();
            }

            @Override
            public MessageRecordDraft setContent(String content) {
                if (content == null) {
                    throw new IllegalArgumentException(
                        "'content' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__contentValue = content;
                return this;
            }

            @Override
            @Nullable
            public Integer messageType() {
                return (__modified!= null ? __modified : __base).messageType();
            }

            @Override
            public MessageRecordDraft setMessageType(Integer messageType) {
                Impl __tmpModified = __modified();
                __tmpModified.__messageTypeValue = messageType;
                __tmpModified.__messageTypeLoaded = true;
                return this;
            }

            @Override
            public List<MessageRecordUser> messageRecordUsers() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).messageRecordUsers(), MessageRecordUser.class, true);
            }

            @Override
            public List<MessageRecordUserDraft> messageRecordUsers(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_MESSAGE_RECORD_USERS)))) {
                    setMessageRecordUsers(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).messageRecordUsers(), MessageRecordUser.class, true);
            }

            @Override
            public MessageRecordDraft setMessageRecordUsers(
                    List<MessageRecordUser> messageRecordUsers) {
                if (messageRecordUsers == null) {
                    throw new IllegalArgumentException(
                        "'messageRecordUsers' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__messageRecordUsersValue = NonSharedList.of(__tmpModified.__messageRecordUsersValue, messageRecordUsers);
                return this;
            }

            @Override
            public MessageRecordDraft addIntoMessageRecordUsers(
                    DraftConsumer<MessageRecordUserDraft> block) {
                addIntoMessageRecordUsers(null, block);
                return this;
            }

            @Override
            public MessageRecordDraft addIntoMessageRecordUsers(MessageRecordUser base,
                    DraftConsumer<MessageRecordUserDraft> block) {
                messageRecordUsers(true).add((MessageRecordUserDraft)MessageRecordUserDraft.$.produce(base, block));
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
                    case SLOT_TYPE:
                    		setType((String)value);break;
                    case SLOT_TITLE:
                    		setTitle((String)value);break;
                    case SLOT_SUB_TITLE:
                    		setSubTitle((String)value);break;
                    case SLOT_AVATAR:
                    		setAvatar((String)value);break;
                    case SLOT_CONTENT:
                    		setContent((String)value);break;
                    case SLOT_MESSAGE_TYPE:
                    		setMessageType((Integer)value);break;
                    case SLOT_TARGET_USERS:
                    		break;
                    case SLOT_MESSAGE_RECORD_USERS:
                    		setMessageRecordUsers((List<MessageRecordUser>)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.message.MessageRecord\": \"" + prop + "\"");
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
                    case "type":
                    		setType((String)value);break;
                    case "title":
                    		setTitle((String)value);break;
                    case "subTitle":
                    		setSubTitle((String)value);break;
                    case "avatar":
                    		setAvatar((String)value);break;
                    case "content":
                    		setContent((String)value);break;
                    case "messageType":
                    		setMessageType((Integer)value);break;
                    case "targetUsers":
                    		break;
                    case "messageRecordUsers":
                    		setMessageRecordUsers((List<MessageRecordUser>)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.message.MessageRecord\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(10);
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
                    case SLOT_TYPE:
                    		__visibility.show(SLOT_TYPE, visible);break;
                    case SLOT_TITLE:
                    		__visibility.show(SLOT_TITLE, visible);break;
                    case SLOT_SUB_TITLE:
                    		__visibility.show(SLOT_SUB_TITLE, visible);break;
                    case SLOT_AVATAR:
                    		__visibility.show(SLOT_AVATAR, visible);break;
                    case SLOT_CONTENT:
                    		__visibility.show(SLOT_CONTENT, visible);break;
                    case SLOT_MESSAGE_TYPE:
                    		__visibility.show(SLOT_MESSAGE_TYPE, visible);break;
                    case SLOT_TARGET_USERS:
                    		__visibility.show(SLOT_TARGET_USERS, visible);break;
                    case SLOT_MESSAGE_RECORD_USERS:
                    		__visibility.show(SLOT_MESSAGE_RECORD_USERS, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.message.MessageRecord\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(10);
                }
                switch (prop) {
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
                    case "status":
                    		__visibility.show(SLOT_STATUS, visible);break;
                    case "type":
                    		__visibility.show(SLOT_TYPE, visible);break;
                    case "title":
                    		__visibility.show(SLOT_TITLE, visible);break;
                    case "subTitle":
                    		__visibility.show(SLOT_SUB_TITLE, visible);break;
                    case "avatar":
                    		__visibility.show(SLOT_AVATAR, visible);break;
                    case "content":
                    		__visibility.show(SLOT_CONTENT, visible);break;
                    case "messageType":
                    		__visibility.show(SLOT_MESSAGE_TYPE, visible);break;
                    case "targetUsers":
                    		__visibility.show(SLOT_TARGET_USERS, visible);break;
                    case "messageRecordUsers":
                    		__visibility.show(SLOT_MESSAGE_RECORD_USERS, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.message.MessageRecord\": \"" + 
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
                    case SLOT_TYPE:
                    		__modified().__typeValue = null;break;
                    case SLOT_TITLE:
                    		__modified().__titleValue = null;break;
                    case SLOT_SUB_TITLE:
                    		__modified().__subTitleValue = null;break;
                    case SLOT_AVATAR:
                    		__modified().__avatarLoaded = false;break;
                    case SLOT_CONTENT:
                    		__modified().__contentValue = null;break;
                    case SLOT_MESSAGE_TYPE:
                    		__modified().__messageTypeLoaded = false;break;
                    case SLOT_TARGET_USERS:
                    		__unload(PropId.byIndex(SLOT_MESSAGE_RECORD_USERS));break;
                    case SLOT_MESSAGE_RECORD_USERS:
                    		__modified().__messageRecordUsersValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.message.MessageRecord\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "id":
                    		__modified().__idValue = null;break;
                    case "status":
                    		__modified().__statusLoaded = false;break;
                    case "type":
                    		__modified().__typeValue = null;break;
                    case "title":
                    		__modified().__titleValue = null;break;
                    case "subTitle":
                    		__modified().__subTitleValue = null;break;
                    case "avatar":
                    		__modified().__avatarLoaded = false;break;
                    case "content":
                    		__modified().__contentValue = null;break;
                    case "messageType":
                    		__modified().__messageTypeLoaded = false;break;
                    case "targetUsers":
                    		__unload(PropId.byIndex(SLOT_MESSAGE_RECORD_USERS));break;
                    case "messageRecordUsers":
                    		__modified().__messageRecordUsersValue = null;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.message.MessageRecord\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                        if (base.__isLoaded(PropId.byIndex(SLOT_MESSAGE_RECORD_USERS))) {
                            List<MessageRecordUser> oldValue = base.messageRecordUsers();
                            List<MessageRecordUser> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setMessageRecordUsers(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__messageRecordUsersValue = NonSharedList.of(__tmpModified.__messageRecordUsersValue, __ctx.resolveList(__tmpModified.__messageRecordUsersValue));
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

        private String type;

        private String title;

        private String subTitle;

        private boolean __avatarLoaded;

        private String avatar;

        private String content;

        private boolean __messageTypeLoaded;

        private Integer messageType;

        private List<User> targetUsers;

        private List<MessageRecordUser> messageRecordUsers;

        public MapStruct id(String id) {
            this.id = id;
            return this;
        }

        public MapStruct status(Integer status) {
            this.status = status;
            return this;
        }

        public MapStruct type(String type) {
            this.type = type;
            return this;
        }

        public MapStruct title(String title) {
            this.title = title;
            return this;
        }

        public MapStruct subTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }

        public MapStruct avatar(String avatar) {
            this.__avatarLoaded = true;
            this.avatar = avatar;
            return this;
        }

        public MapStruct content(String content) {
            this.content = content;
            return this;
        }

        public MapStruct messageType(Integer messageType) {
            this.__messageTypeLoaded = true;
            this.messageType = messageType;
            return this;
        }

        public MapStruct messageRecordUsers(List<MessageRecordUser> messageRecordUsers) {
            this.messageRecordUsers = messageRecordUsers != null ? messageRecordUsers : Collections.emptyList();
            return this;
        }

        public MessageRecord build() {
            return MessageRecordDraft.$.produce(__draft -> {
                if (id != null) {
                    __draft.setId(id);
                }
                if (status != null) {
                    __draft.setStatus(status);
                }
                if (type != null) {
                    __draft.setType(type);
                }
                if (title != null) {
                    __draft.setTitle(title);
                }
                if (subTitle != null) {
                    __draft.setSubTitle(subTitle);
                }
                if (__avatarLoaded) {
                    __draft.setAvatar(avatar);
                }
                if (content != null) {
                    __draft.setContent(content);
                }
                if (__messageTypeLoaded) {
                    __draft.setMessageType(messageType);
                }
                if (messageRecordUsers != null) {
                    __draft.setMessageRecordUsers(messageRecordUsers);
                }
            });
        }
    }
}
