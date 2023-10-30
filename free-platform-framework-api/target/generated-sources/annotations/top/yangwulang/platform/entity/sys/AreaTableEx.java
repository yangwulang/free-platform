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
        type = Area.class
)
public class AreaTableEx extends AreaTable implements TableEx<Area> {
    public static final AreaTableEx $ = new AreaTableEx(AreaTable.$, null);

    public AreaTableEx() {
        super();
    }

    public AreaTableEx(AbstractTypedTable.DelayedOperation<Area> delayedOperation) {
        super(delayedOperation);
    }

    public AreaTableEx(TableImplementor<Area> table) {
        super(table);
    }

    protected AreaTableEx(AreaTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public AreaTableEx parent() {
        __beforeJoin();
        if (raw != null) {
            return new AreaTableEx(raw.joinImplementor("parent"));
        }
        return new AreaTableEx(joinOperation("parent"));
    }

    public AreaTableEx parent(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new AreaTableEx(raw.joinImplementor("parent", joinType));
        }
        return new AreaTableEx(joinOperation("parent", joinType));
    }

    public AreaTableEx children() {
        __beforeJoin();
        if (raw != null) {
            return new AreaTableEx(raw.joinImplementor("children"));
        }
        return new AreaTableEx(joinOperation("children"));
    }

    public AreaTableEx children(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new AreaTableEx(raw.joinImplementor("children", joinType));
        }
        return new AreaTableEx(joinOperation("children", joinType));
    }

    @Override
    public AreaTableEx asTableEx() {
        return this;
    }

    @Override
    public AreaTableEx __disableJoin(String reason) {
        return new AreaTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<AreaTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<AreaTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
