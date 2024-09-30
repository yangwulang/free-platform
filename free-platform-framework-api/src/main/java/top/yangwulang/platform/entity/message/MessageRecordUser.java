package top.yangwulang.platform.entity.message;

import org.babyfish.jimmer.sql.Column;
import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.ManyToOne;
import org.babyfish.jimmer.sql.Table;
import top.yangwulang.platform.entity.TypeBase;
import top.yangwulang.platform.entity.sys.User;

import jakarta.annotation.Nullable;

/**
 * 用户消息
 *
 * @author yangwulang
 */
@Entity
@Table(name = "sys_message_record_user")
public interface MessageRecordUser extends TypeBase {

    /**
     * 消息记录
     *
     * @return 消息
     */
    @ManyToOne
    @Nullable MessageRecord record();

    /**
     * 用户
     *
     * @return 用户
     */
    @ManyToOne
    @Nullable User user();

    /**
     * 是否已读
     *
     * @return 是否已读
     */
    @Column(name = "is_read")
    Integer readStatus();
}
