package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = DictType.class
)
public class DictTypeTable extends AbstractTypedTable<DictType> implements DictTypeProps {
    public static final DictTypeTable $ = new DictTypeTable();

    public DictTypeTable() {
        super(DictType.class);
    }

    public DictTypeTable(AbstractTypedTable.DelayedOperation<DictType> delayedOperation) {
        super(DictType.class, delayedOperation);
    }

    public DictTypeTable(TableImplementor<DictType> table) {
        super(table);
    }

    protected DictTypeTable(DictTypeTable base, String joinDisabledReason) {
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
    public PropExpression.Str createBy() {
        return get("createBy");
    }

    @Override
    public PropExpression.Cmp<Date> createDate() {
        return get("createDate");
    }

    @Override
    public PropExpression.Str updateBy() {
        return get("updateBy");
    }

    @Override
    public PropExpression.Cmp<Date> updateDate() {
        return get("updateDate");
    }

    @Override
    public PropExpression.Str remarks() {
        return get("remarks");
    }

    @Override
    public PropExpression.Str dictName() {
        return get("dictName");
    }

    @Override
    public PropExpression.Str dictType() {
        return get("dictType");
    }

    @Override
    public PropExpression.Cmp<Boolean> isSys() {
        return get("isSys");
    }

    @Override
    public DictTypeTableEx asTableEx() {
        return new DictTypeTableEx(this, null);
    }

    @Override
    public DictTypeTable __disableJoin(String reason) {
        return new DictTypeTable(this, reason);
    }

    public static class Remote extends AbstractTypedTable<DictType> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(DictType.class, delayedOperation);
        }

        public Remote(TableImplementor<DictType> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return get("id");
        }

        @Override
        @Deprecated
        public TableEx<DictType> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
