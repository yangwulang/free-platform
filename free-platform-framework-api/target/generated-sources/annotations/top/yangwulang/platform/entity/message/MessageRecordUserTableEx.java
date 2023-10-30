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
        type = MessageRecordUser.class
)
public class MessageRecordUserTableEx extends MessageRecordUserTable implements TableEx<MessageRecordUser> {
    public static final MessageRecordUserTableEx $ = new MessageRecordUserTableEx(MessageRecordUserTable.$, null);

    public MessageRecordUserTableEx() {
        super();
    }

    public MessageRecordUserTableEx(
            AbstractTypedTable.DelayedOperation<MessageRecordUser> delayedOperation) {
        super(delayedOperation);
    }

    public MessageRecordUserTableEx(TableImplementor<MessageRecordUser> table) {
        super(table);
    }

    protected MessageRecordUserTableEx(MessageRecordUserTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public MessageRecordTableEx record() {
        __beforeJoin();
        if (raw != null) {
            return new MessageRecordTableEx(raw.joinImplementor("record"));
        }
        return new MessageRecordTableEx(joinOperation("record"));
    }

    public MessageRecordTableEx record(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new MessageRecordTableEx(raw.joinImplementor("record", joinType));
        }
        return new MessageRecordTableEx(joinOperation("record", joinType));
    }

    public UserTableEx user() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor("user"));
        }
        return new UserTableEx(joinOperation("user"));
    }

    public UserTableEx user(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor("user", joinType));
        }
        return new UserTableEx(joinOperation("user", joinType));
    }

    @Override
    public MessageRecordUserTableEx asTableEx() {
        return this;
    }

    @Override
    public MessageRecordUserTableEx __disableJoin(String reason) {
        return new MessageRecordUserTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<MessageRecordUserTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<MessageRecordUserTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
