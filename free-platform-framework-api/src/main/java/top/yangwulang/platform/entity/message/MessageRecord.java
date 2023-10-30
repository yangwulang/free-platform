package top.yangwulang.platform.entity.message;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.Null;

import top.yangwulang.platform.entity.StatusTypeBase;
import top.yangwulang.platform.entity.TypeBase;
import top.yangwulang.platform.entity.sys.User;

import java.util.List;

@Schema(description = "消息记录")
@Table(name = "sys_message_record")
@Entity
public interface MessageRecord extends TypeBase, StatusTypeBase {
    /**
     * 类型：消息
     */
    String TYPE_MESSAGE = "message";
    /**
     * 类型：通知
     */
    String TYPE_NOTICE = "notice";
    /**
     * 类型：待办
     */
    String TYPE_TODO = "todo";

    int IS_READ_READ = 1;

    int IS_READ_UN_READ = 0;

    @Schema(description = "类型")
    String type();

    @Schema(description = "消息标题")
    String title();

    @Schema(description = "消息子标题")
    String subTitle();

    @Schema(description = "消息icon")
    @Null String avatar();

    @Schema(description = "消息内容")
    String content();

    @Schema(description = "消息类型")
    Integer messageType();

    @Schema(description = "接收的用户")
    @ManyToManyView(prop = "messageRecordUsers", deeperProp = "user")
/*    @JoinTable(
            name = "SYS_MESSAGE_RECORD_USER",
            joinColumnName = "RECORD_ID",
            inverseJoinColumnName = "USER_ID"
    )*/
    List<User> targetUsers();

    @OneToMany(mappedBy = "record")
    List<MessageRecordUser> messageRecordUsers();
}
