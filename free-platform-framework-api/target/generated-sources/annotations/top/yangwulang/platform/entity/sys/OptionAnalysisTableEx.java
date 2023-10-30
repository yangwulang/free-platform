package top.yangwulang.platform.entity.sys;

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

@GeneratedBy(
        type = OptionAnalysis.class
)
public class OptionAnalysisTableEx extends OptionAnalysisTable implements TableEx<OptionAnalysis> {
    public static final OptionAnalysisTableEx $ = new OptionAnalysisTableEx(OptionAnalysisTable.$, null);

    public OptionAnalysisTableEx() {
        super();
    }

    public OptionAnalysisTableEx(
            AbstractTypedTable.DelayedOperation<OptionAnalysis> delayedOperation) {
        super(delayedOperation);
    }

    public OptionAnalysisTableEx(TableImplementor<OptionAnalysis> table) {
        super(table);
    }

    protected OptionAnalysisTableEx(OptionAnalysisTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public UserTableEx optionUser() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor("optionUser"));
        }
        return new UserTableEx(joinOperation("optionUser"));
    }

    public UserTableEx optionUser(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor("optionUser", joinType));
        }
        return new UserTableEx(joinOperation("optionUser", joinType));
    }

    @Override
    public OptionAnalysisTableEx asTableEx() {
        return this;
    }

    @Override
    public OptionAnalysisTableEx __disableJoin(String reason) {
        return new OptionAnalysisTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<OptionAnalysisTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<OptionAnalysisTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
