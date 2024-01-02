package top.yangwulang.platform.entity.message;

import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;
import top.yangwulang.platform.entity.StatusTypeBaseProps;
import top.yangwulang.platform.entity.TypeBaseProps;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserTableEx;

@GeneratedBy(
        type = MessageRecord.class
)
@PropsFor(MessageRecord.class)
public interface MessageRecordProps extends TypeBaseProps, StatusTypeBaseProps {
    TypedProp.Scalar<MessageRecord, String> ID = 
        TypedProp.scalar(ImmutableType.get(MessageRecord.class).getProp("id"));

    TypedProp.Scalar<MessageRecord, Integer> STATUS = 
        TypedProp.scalar(ImmutableType.get(MessageRecord.class).getProp("status"));

    TypedProp.Scalar<MessageRecord, String> TYPE = 
        TypedProp.scalar(ImmutableType.get(MessageRecord.class).getProp("type"));

    TypedProp.Scalar<MessageRecord, String> TITLE = 
        TypedProp.scalar(ImmutableType.get(MessageRecord.class).getProp("title"));

    TypedProp.Scalar<MessageRecord, String> SUB_TITLE = 
        TypedProp.scalar(ImmutableType.get(MessageRecord.class).getProp("subTitle"));

    TypedProp.Scalar<MessageRecord, String> AVATAR = 
        TypedProp.scalar(ImmutableType.get(MessageRecord.class).getProp("avatar"));

    TypedProp.Scalar<MessageRecord, String> CONTENT = 
        TypedProp.scalar(ImmutableType.get(MessageRecord.class).getProp("content"));

    TypedProp.Scalar<MessageRecord, Integer> MESSAGE_TYPE = 
        TypedProp.scalar(ImmutableType.get(MessageRecord.class).getProp("messageType"));

    TypedProp.ReferenceList<MessageRecord, User> TARGET_USERS = 
        TypedProp.referenceList(ImmutableType.get(MessageRecord.class).getProp("targetUsers"));

    TypedProp.ReferenceList<MessageRecord, MessageRecordUser> MESSAGE_RECORD_USERS = 
        TypedProp.referenceList(ImmutableType.get(MessageRecord.class).getProp("messageRecordUsers"));

    PropExpression.Str type();

    PropExpression.Str title();

    PropExpression.Str subTitle();

    PropExpression.Str avatar();

    PropExpression.Str content();

    PropExpression.Num<Integer> messageType();

    Predicate targetUsers(Function<UserTableEx, Predicate> block);

    Predicate messageRecordUsers(Function<MessageRecordUserTableEx, Predicate> block);
}
