package top.yangwulang.platform.entity.message;

import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;
import top.yangwulang.platform.entity.sys.UserTable;

@GeneratedBy(
        type = MessageRecordUser.class
)
public class MessageRecordUserTable extends AbstractTypedTable<MessageRecordUser> implements MessageRecordUserProps {
    public static final MessageRecordUserTable $ = new MessageRecordUserTable();

    public MessageRecordUserTable() {
        super(MessageRecordUser.class);
    }

    public MessageRecordUserTable(
            AbstractTypedTable.DelayedOperation<MessageRecordUser> delayedOperation) {
        super(MessageRecordUser.class, delayedOperation);
    }

    public MessageRecordUserTable(TableImplementor<MessageRecordUser> table) {
        super(table);
    }

    protected MessageRecordUserTable(MessageRecordUserTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return __get(MessageRecordUserProps.ID.unwrap());
    }

    @Override
    public MessageRecordTable record() {
        __beforeJoin();
        if (raw != null) {
            return new MessageRecordTable(raw.joinImplementor(MessageRecordUserProps.RECORD.unwrap()));
        }
        return new MessageRecordTable(joinOperation(MessageRecordUserProps.RECORD.unwrap()));
    }

    @Override
    public MessageRecordTable record(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new MessageRecordTable(raw.joinImplementor(MessageRecordUserProps.RECORD.unwrap(), joinType));
        }
        return new MessageRecordTable(joinOperation(MessageRecordUserProps.RECORD.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str recordId() {
        return __getAssociatedId(MessageRecordUserProps.RECORD.unwrap());
    }

    @Override
    public UserTable user() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(MessageRecordUserProps.USER.unwrap()));
        }
        return new UserTable(joinOperation(MessageRecordUserProps.USER.unwrap()));
    }

    @Override
    public UserTable user(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(MessageRecordUserProps.USER.unwrap(), joinType));
        }
        return new UserTable(joinOperation(MessageRecordUserProps.USER.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str userId() {
        return __getAssociatedId(MessageRecordUserProps.USER.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> isRead() {
        return __get(MessageRecordUserProps.IS_READ.unwrap());
    }

    @Override
    public MessageRecordUserTableEx asTableEx() {
        return new MessageRecordUserTableEx(this, null);
    }

    @Override
    public MessageRecordUserTable __disableJoin(String reason) {
        return new MessageRecordUserTable(this, reason);
    }

    @GeneratedBy(
            type = MessageRecordUser.class
    )
    public static class Remote extends AbstractTypedTable<MessageRecordUser> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(MessageRecordUser.class, delayedOperation);
        }

        public Remote(TableImplementor<MessageRecordUser> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(MessageRecordUserProps.ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<MessageRecordUser> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
