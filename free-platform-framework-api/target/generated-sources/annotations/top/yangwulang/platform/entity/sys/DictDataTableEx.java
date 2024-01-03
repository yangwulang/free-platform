package top.yangwulang.platform.entity.sys;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.impl.table.TableProxies;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.WeakJoin;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = DictData.class
)
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
            return new DictDataTableEx(raw.joinImplementor(DictDataProps.PARENT.unwrap()));
        }
        return new DictDataTableEx(joinOperation(DictDataProps.PARENT.unwrap()));
    }

    public DictDataTableEx parent(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new DictDataTableEx(raw.joinImplementor(DictDataProps.PARENT.unwrap(), joinType));
        }
        return new DictDataTableEx(joinOperation(DictDataProps.PARENT.unwrap(), joinType));
    }

    public DictDataTableEx children() {
        __beforeJoin();
        if (raw != null) {
            return new DictDataTableEx(raw.joinImplementor(DictDataProps.CHILDREN.unwrap()));
        }
        return new DictDataTableEx(joinOperation(DictDataProps.CHILDREN.unwrap()));
    }

    public DictDataTableEx children(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new DictDataTableEx(raw.joinImplementor(DictDataProps.CHILDREN.unwrap(), joinType));
        }
        return new DictDataTableEx(joinOperation(DictDataProps.CHILDREN.unwrap(), joinType));
    }

    @Override
    public Predicate children(Function<DictDataTableEx, Predicate> block) {
        return exists(DictDataProps.CHILDREN.unwrap(), block);
    }

    public DictTypeTableEx dictType() {
        __beforeJoin();
        if (raw != null) {
            return new DictTypeTableEx(raw.joinImplementor(DictDataProps.DICT_TYPE.unwrap()));
        }
        return new DictTypeTableEx(joinOperation(DictDataProps.DICT_TYPE.unwrap()));
    }

    public DictTypeTableEx dictType(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new DictTypeTableEx(raw.joinImplementor(DictDataProps.DICT_TYPE.unwrap(), joinType));
        }
        return new DictTypeTableEx(joinOperation(DictDataProps.DICT_TYPE.unwrap(), joinType));
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
