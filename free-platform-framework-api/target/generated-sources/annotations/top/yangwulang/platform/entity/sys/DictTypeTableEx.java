package top.yangwulang.platform.entity.sys;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.impl.table.TableProxies;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.WeakJoin;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

public class DictTypeTableEx extends DictTypeTable implements TableEx<DictType> {
    public static final DictTypeTableEx $ = new DictTypeTableEx(DictTypeTable.$, null);

    public DictTypeTableEx() {
        super();
    }

    public DictTypeTableEx(AbstractTypedTable.DelayedOperation<DictType> delayedOperation) {
        super(delayedOperation);
    }

    public DictTypeTableEx(TableImplementor<DictType> table) {
        super(table);
    }

    protected DictTypeTableEx(DictTypeTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public DictTypeTableEx asTableEx() {
        return this;
    }

    @Override
    public DictTypeTableEx __disableJoin(String reason) {
        return new DictTypeTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<DictTypeTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<DictTypeTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
