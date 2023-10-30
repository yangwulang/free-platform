package top.yangwulang.platform.entity.message;

import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = MessageRecord.class
)
public class MessageRecordTable extends AbstractTypedTable<MessageRecord> implements MessageRecordProps {
    public static final MessageRecordTable $ = new MessageRecordTable();

    public MessageRecordTable() {
        super(MessageRecord.class);
    }

    public MessageRecordTable(AbstractTypedTable.DelayedOperation<MessageRecord> delayedOperation) {
        super(MessageRecord.class, delayedOperation);
    }

    public MessageRecordTable(TableImplementor<MessageRecord> table) {
        super(table);
    }

    protected MessageRecordTable(MessageRecordTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return get("id");
    }

    @Override
    public PropExpression.Num<Integer> status() {
        return get("status");
    }

    @Override
    public PropExpression.Str type() {
        return get("type");
    }

    @Override
    public PropExpression.Str title() {
        return get("title");
    }

    @Override
    public PropExpression.Str subTitle() {
        return get("subTitle");
    }

    @Override
    public PropExpression.Str avatar() {
        return get("avatar");
    }

    @Override
    public PropExpression.Str content() {
        return get("content");
    }

    @Override
    public PropExpression.Num<Integer> messageType() {
        return get("messageType");
    }

    @Override
    public MessageRecordTableEx asTableEx() {
        return new MessageRecordTableEx(this, null);
    }

    @Override
    public MessageRecordTable __disableJoin(String reason) {
        return new MessageRecordTable(this, reason);
    }

    public static class Remote extends AbstractTypedTable<MessageRecord> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(MessageRecord.class, delayedOperation);
        }

        public Remote(TableImplementor<MessageRecord> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return get("id");
        }

        @Override
        @Deprecated
        public TableEx<MessageRecord> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
