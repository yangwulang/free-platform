package top.yangwulang.platform.entity.message.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.message.MessageRecord;
import top.yangwulang.platform.entity.message.MessageRecordDraft;
import top.yangwulang.platform.entity.message.MessageRecordFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/message/MessageRecord.dto"
)
public class MessageRecordListView implements View<MessageRecord> {
    public static final ViewMetadata<MessageRecord, MessageRecordListView> METADATA = 
        new ViewMetadata<MessageRecord, MessageRecordListView>(
            MessageRecordFetcher.$
                .status()
                .type()
                .title()
                .subTitle()
                .avatar()
                .content()
                .messageType(),
            MessageRecordListView::new
    );

    @NotNull
    private String id;

    @Schema(
            description = "状态"
    )
    private int status;

    @Schema(
            description = "类型"
    )
    @org.jetbrains.annotations.NotNull
    private String type;

    @Schema(
            description = "消息标题"
    )
    @org.jetbrains.annotations.NotNull
    private String title;

    @Schema(
            description = "消息子标题"
    )
    @org.jetbrains.annotations.NotNull
    private String subTitle;

    @Schema(
            description = "消息icon"
    )
    @Null
    private String avatar;

    @Schema(
            description = "消息内容"
    )
    @org.jetbrains.annotations.NotNull
    private String content;

    @Schema(
            description = "消息类型"
    )
    @Nullable
    private Integer messageType;

    public MessageRecordListView() {
    }

    public MessageRecordListView(@org.jetbrains.annotations.NotNull MessageRecord base) {
        this.id = base.id();
        this.status = base.status();
        this.type = base.type();
        this.title = base.title();
        this.subTitle = base.subTitle();
        this.avatar = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MessageRecordDraft.Producer.SLOT_AVATAR)) ? base.avatar() : null;
        this.content = base.content();
        this.messageType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(MessageRecordDraft.Producer.SLOT_MESSAGE_TYPE)) ? base.messageType() : null;
    }

    public static MessageRecordListView of(@org.jetbrains.annotations.NotNull MessageRecord base) {
        return new MessageRecordListView(base);
    }

    @org.jetbrains.annotations.NotNull
    public String getId() {
        return id;
    }

    public void setId(@org.jetbrains.annotations.NotNull String id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @org.jetbrains.annotations.NotNull
    public String getType() {
        return type;
    }

    public void setType(@org.jetbrains.annotations.NotNull String type) {
        this.type = type;
    }

    @org.jetbrains.annotations.NotNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@org.jetbrains.annotations.NotNull String title) {
        this.title = title;
    }

    @org.jetbrains.annotations.NotNull
    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(@org.jetbrains.annotations.NotNull String subTitle) {
        this.subTitle = subTitle;
    }

    @Nullable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(@Nullable String avatar) {
        this.avatar = avatar;
    }

    @org.jetbrains.annotations.NotNull
    public String getContent() {
        return content;
    }

    public void setContent(@org.jetbrains.annotations.NotNull String content) {
        this.content = content;
    }

    @Nullable
    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(@Nullable Integer messageType) {
        this.messageType = messageType;
    }

    @Override
    public MessageRecord toEntity() {
        return MessageRecordDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setStatus(status);
            __draft.setType(type);
            __draft.setTitle(title);
            __draft.setSubTitle(subTitle);
            __draft.setAvatar(avatar);
            __draft.setContent(content);
            __draft.setMessageType(messageType);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Integer.hashCode(status);
        hash = hash * 31 + Objects.hashCode(type);
        hash = hash * 31 + Objects.hashCode(title);
        hash = hash * 31 + Objects.hashCode(subTitle);
        hash = hash * 31 + Objects.hashCode(avatar);
        hash = hash * 31 + Objects.hashCode(content);
        hash = hash * 31 + Objects.hashCode(messageType);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MessageRecordListView other = (MessageRecordListView) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (status != other.status) {
            return false;
        }
        if (!Objects.equals(type, other.type)) {
            return false;
        }
        if (!Objects.equals(title, other.title)) {
            return false;
        }
        if (!Objects.equals(subTitle, other.subTitle)) {
            return false;
        }
        if (!Objects.equals(avatar, other.avatar)) {
            return false;
        }
        if (!Objects.equals(content, other.content)) {
            return false;
        }
        if (!Objects.equals(messageType, other.messageType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MessageRecordListView").append('(');
        builder.append("id=").append(id);
        builder.append(", status=").append(status);
        builder.append(", type=").append(type);
        builder.append(", title=").append(title);
        builder.append(", subTitle=").append(subTitle);
        builder.append(", avatar=").append(avatar);
        builder.append(", content=").append(content);
        builder.append(", messageType=").append(messageType);
        builder.append(')');
        return builder.toString();
    }
}
