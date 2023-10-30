package top.yangwulang.platform.entity.message.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import lombok.Data;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.ViewMetadata;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.message.MessageRecord;
import top.yangwulang.platform.entity.message.MessageRecordDraft;
import top.yangwulang.platform.entity.message.MessageRecordFetcher;
import top.yangwulang.platform.entity.message.MessageRecordProps;

@GeneratedBy(
        file = "src/main/dto/top/yangwulang/platform/entity/message/MessageRecord.dto"
)
@Data
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
        ImmutableSpi spi = (ImmutableSpi)base;
        this.id = base.id();
        this.status = base.status();
        this.type = base.type();
        this.title = base.title();
        this.subTitle = base.subTitle();
        this.avatar = spi.__isLoaded(MessageRecordProps.AVATAR.unwrap().getId()) ? base.avatar() : null;
        this.content = base.content();
        this.messageType = spi.__isLoaded(MessageRecordProps.MESSAGE_TYPE.unwrap().getId()) ? base.messageType() : null;
    }

    public static MessageRecordListView of(@org.jetbrains.annotations.NotNull MessageRecord base) {
        return new MessageRecordListView(base);
    }

    @Override
    public MessageRecord toEntity() {
        return MessageRecordDraft.$.produce(draft -> {
            draft.setId(id);
            draft.setStatus(status);
            draft.setType(type);
            draft.setTitle(title);
            draft.setSubTitle(subTitle);
            draft.setAvatar(avatar);
            draft.setContent(content);
            draft.setMessageType(messageType);
        });
    }
}
