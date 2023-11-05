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
        return __get(MessageRecordProps.ID.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> status() {
        return __get(MessageRecordProps.STATUS.unwrap());
    }

    @Override
    public PropExpression.Str type() {
        return __get(MessageRecordProps.TYPE.unwrap());
    }

    @Override
    public PropExpression.Str title() {
        return __get(MessageRecordProps.TITLE.unwrap());
    }

    @Override
    public PropExpression.Str subTitle() {
        return __get(MessageRecordProps.SUB_TITLE.unwrap());
    }

    @Override
    public PropExpression.Str avatar() {
        return __get(MessageRecordProps.AVATAR.unwrap());
    }

    @Override
    public PropExpression.Str content() {
        return __get(MessageRecordProps.CONTENT.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> messageType() {
        return __get(MessageRecordProps.MESSAGE_TYPE.unwrap());
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
            return __get(MessageRecordProps.ID.unwrap());
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
