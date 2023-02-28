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

public class DictDataTableEx extends DictDataTable implements TableEx<DictData> {
    public static final DictDataTableEx $ = new DictDataTableEx(DictDataTable.$, null);

    public DictDataTableEx() {
        super();
    }

    public DictDataTableEx(AbstractTypedTable.DelayedOperation<DictData> delayedOperation) {
        super(delayedOperation);
    }

    public DictDataTableEx(TableImplementor<DictData> table) {
        super(table);
    }

    protected DictDataTableEx(DictDataTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public DictDataTableEx parent() {
        __beforeJoin();
        if (raw != null) {
            return new DictDataTableEx(raw.joinImplementor("parent"));
        }
        return new DictDataTableEx(joinOperation("parent"));
    }

    public DictDataTableEx parent(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new DictDataTableEx(raw.joinImplementor("parent", joinType));
        }
        return new DictDataTableEx(joinOperation("parent", joinType));
    }

    public DictDataTableEx children() {
        __beforeJoin();
        if (raw != null) {
            return new DictDataTableEx(raw.joinImplementor("children"));
        }
        return new DictDataTableEx(joinOperation("children"));
    }

    public DictDataTableEx children(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new DictDataTableEx(raw.joinImplementor("children", joinType));
        }
        return new DictDataTableEx(joinOperation("children", joinType));
    }

    public DictTypeTableEx dictType() {
        __beforeJoin();
        if (raw != null) {
            return new DictTypeTableEx(raw.joinImplementor("dictType"));
        }
        return new DictTypeTableEx(joinOperation("dictType"));
    }

    public DictTypeTableEx dictType(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new DictTypeTableEx(raw.joinImplementor("dictType", joinType));
        }
        return new DictTypeTableEx(joinOperation("dictType", joinType));
    }

    @Override
    public DictDataTableEx asTableEx() {
        return this;
    }

    @Override
    public DictDataTableEx __disableJoin(String reason) {
        return new DictDataTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<DictDataTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<DictDataTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
