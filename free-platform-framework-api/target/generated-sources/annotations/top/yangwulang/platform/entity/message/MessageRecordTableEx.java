package top.yangwulang.platform.entity.message;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
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
            return new UserTableEx(raw.joinImplementor("targetUsers"));
        }
        return new UserTableEx(joinOperation("targetUsers"));
    }

    public UserTableEx targetUsers(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor("targetUsers", joinType));
        }
        return new UserTableEx(joinOperation("targetUsers", joinType));
    }

    public MessageRecordUserTableEx messageRecordUsers() {
        __beforeJoin();
        if (raw != null) {
            return new MessageRecordUserTableEx(raw.joinImplementor("messageRecordUsers"));
        }
        return new MessageRecordUserTableEx(joinOperation("messageRecordUsers"));
    }

    public MessageRecordUserTableEx messageRecordUsers(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new MessageRecordUserTableEx(raw.joinImplementor("messageRecordUsers", joinType));
        }
        return new MessageRecordUserTableEx(joinOperation("messageRecordUsers", joinType));
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
