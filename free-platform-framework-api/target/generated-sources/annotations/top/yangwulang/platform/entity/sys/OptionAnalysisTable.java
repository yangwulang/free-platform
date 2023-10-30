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
        return get("id");
    }

    @Override
    public PropExpression.Str eventName() {
        return get("eventName");
    }

    @Override
    public PropExpression.Str eventCode() {
        return get("eventCode");
    }

    @Override
    public UserTable optionUser() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor("optionUser"));
        }
        return new UserTable(joinOperation("optionUser"));
    }

    @Override
    public UserTable optionUser(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor("optionUser", joinType));
        }
        return new UserTable(joinOperation("optionUser", joinType));
    }

    @Override
    public PropExpression.Str ipAddress() {
        return get("ipAddress");
    }

    @Override
    public PropExpression.Cmp<Date> createDate() {
        return get("createDate");
    }

    @Override
    public PropExpression.Str meta() {
        return get("meta");
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
            return get("id");
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
