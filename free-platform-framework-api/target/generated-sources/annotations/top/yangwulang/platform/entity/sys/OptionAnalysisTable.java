package top.yangwulang.platform.entity.sys;

import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = OptionAnalysis.class
)
public class OptionAnalysisTable extends AbstractTypedTable<OptionAnalysis> implements OptionAnalysisProps {
    public static final OptionAnalysisTable $ = new OptionAnalysisTable();

    public OptionAnalysisTable() {
        super(OptionAnalysis.class);
    }

    public OptionAnalysisTable(
            AbstractTypedTable.DelayedOperation<OptionAnalysis> delayedOperation) {
        super(OptionAnalysis.class, delayedOperation);
    }

    public OptionAnalysisTable(TableImplementor<OptionAnalysis> table) {
        super(table);
    }

    protected OptionAnalysisTable(OptionAnalysisTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return __get(OptionAnalysisProps.ID.unwrap());
    }

    @Override
    public PropExpression.Str eventName() {
        return __get(OptionAnalysisProps.EVENT_NAME.unwrap());
    }

    @Override
    public PropExpression.Str eventCode() {
        return __get(OptionAnalysisProps.EVENT_CODE.unwrap());
    }

    @Override
    public UserTable optionUser() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(OptionAnalysisProps.OPTION_USER.unwrap()));
        }
        return new UserTable(joinOperation(OptionAnalysisProps.OPTION_USER.unwrap()));
    }

    @Override
    public UserTable optionUser(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(OptionAnalysisProps.OPTION_USER.unwrap(), joinType));
        }
        return new UserTable(joinOperation(OptionAnalysisProps.OPTION_USER.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str optionUserId() {
        return __getAssociatedId(OptionAnalysisProps.OPTION_USER.unwrap());
    }

    @Override
    public PropExpression.Str ipAddress() {
        return __get(OptionAnalysisProps.IP_ADDRESS.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> createDate() {
        return __get(OptionAnalysisProps.CREATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str meta() {
        return __get(OptionAnalysisProps.META.unwrap());
    }

    @Override
    public OptionAnalysisTableEx asTableEx() {
        return new OptionAnalysisTableEx(this, null);
    }

    @Override
    public OptionAnalysisTable __disableJoin(String reason) {
        return new OptionAnalysisTable(this, reason);
    }

    public static class Remote extends AbstractTypedTable<OptionAnalysis> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(OptionAnalysis.class, delayedOperation);
        }

        public Remote(TableImplementor<OptionAnalysis> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(OptionAnalysisProps.ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<OptionAnalysis> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
