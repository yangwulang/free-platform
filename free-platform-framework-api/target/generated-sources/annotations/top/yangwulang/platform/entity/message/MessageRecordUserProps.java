package top.yangwulang.platform.entity.message;

import java.lang.Integer;
import java.lang.String;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;
import top.yangwulang.platform.entity.TypeBaseProps;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserTable;

@GeneratedBy(
        type = MessageRecordUser.class
)
@PropsFor(MessageRecordUser.class)
public interface MessageRecordUserProps extends TypeBaseProps {
    TypedProp.Scalar<MessageRecordUser, String> ID = 
        TypedProp.scalar(ImmutableType.get(MessageRecordUser.class).getProp("id"));

    TypedProp.Reference<MessageRecordUser, MessageRecord> RECORD = 
        TypedProp.reference(ImmutableType.get(MessageRecordUser.class).getProp("record"));

    TypedProp.Reference<MessageRecordUser, User> USER = 
        TypedProp.reference(ImmutableType.get(MessageRecordUser.class).getProp("user"));

    TypedProp.Scalar<MessageRecordUser, Integer> IS_READ = 
        TypedProp.scalar(ImmutableType.get(MessageRecordUser.class).getProp("isRead"));

    MessageRecordTable record();

    MessageRecordTable record(JoinType joinType);

    PropExpression.Str recordId();

    UserTable user();

    UserTable user(JoinType joinType);

    PropExpression.Str userId();

    PropExpression.Num<Integer> isRead();
}
