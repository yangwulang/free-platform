package top.yangwulang.platform.entity.message;

import org.babyfish.jimmer.sql.Column;
import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.ManyToOne;
import org.babyfish.jimmer.sql.Table;
import top.yangwulang.platform.entity.TypeBase;
import top.yangwulang.platform.entity.sys.User;

import javax.validation.constraints.Null;

@Entity
@Table(name = "sys_message_record_user")
public interface MessageRecordUser extends TypeBase {

    @ManyToOne
    @Null MessageRecord record();

    @ManyToOne
    @Null User user();

    @Column(name = "is_read")
    Integer isRead();
}
