package top.yangwulang.platform.entity.message;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.impl.table.TableProxies;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.WeakJoin;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;
import top.yangwulang.platform.entity.sys.UserTableEx;

@GeneratedBy(
        type = MessageRecord.class
)
public class MessageRecordTableEx extends MessageRecordTable implements TableEx<MessageRecord> {
    public static final MessageRecordTableEx $ = new MessageRecordTableEx(MessageRecordTable.$, null);

    public MessageRecordTableEx() {
        super();
    }

    public MessageRecordTableEx(
            AbstractTypedTable.DelayedOperation<MessageRecord> delayedOperation) {
        super(delayedOperation);
    }

    public MessageRecordTableEx(TableImplementor<MessageRecord> table) {
        super(table);
    }

    protected MessageRecordTableEx(MessageRecordTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public UserTableEx targetUsers() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(MessageRecordProps.TARGET_USERS.unwrap()));
        }
        return new UserTableEx(joinOperation(MessageRecordProps.TARGET_USERS.unwrap()));
    }

    public UserTableEx targetUsers(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(MessageRecordProps.TARGET_USERS.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(MessageRecordProps.TARGET_USERS.unwrap(), joinType));
    }

    @Override
    public Predicate targetUsers(Function<UserTableEx, Predicate> block) {
        return exists(MessageRecordProps.TARGET_USERS.unwrap(), block);
    }

    public MessageRecordUserTableEx messageRecordUsers() {
        __beforeJoin();
        if (raw != null) {
            return new MessageRecordUserTableEx(raw.joinImplementor(MessageRecordProps.MESSAGE_RECORD_USERS.unwrap()));
        }
        return new MessageRecordUserTableEx(joinOperation(MessageRecordProps.MESSAGE_RECORD_USERS.unwrap()));
    }

    public MessageRecordUserTableEx messageRecordUsers(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new MessageRecordUserTableEx(raw.joinImplementor(MessageRecordProps.MESSAGE_RECORD_USERS.unwrap(), joinType));
        }
        return new MessageRecordUserTableEx(joinOperation(MessageRecordProps.MESSAGE_RECORD_USERS.unwrap(), joinType));
    }

    @Override
    public Predicate messageRecordUsers(Function<MessageRecordUserTableEx, Predicate> block) {
        return exists(MessageRecordProps.MESSAGE_RECORD_USERS.unwrap(), block);
    }

    @Override
    public MessageRecordTableEx asTableEx() {
        return this;
    }

    @Override
    public MessageRecordTableEx __disableJoin(String reason) {
        return new MessageRecordTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<MessageRecordTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<MessageRecordTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
