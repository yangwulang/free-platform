package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

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
    public PropExpression.Str status() {
        return get("status");
    }

    @Override
    public PropExpression.Str createBy() {
        return get("createBy");
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> createDate() {
        return get("createDate");
    }

    @Override
    public PropExpression.Str updateBy() {
        return get("updateBy");
    }

    @Override
    public PropExpression.Cmp<LocalDateTime> updateDate() {
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
    public PropExpression<Boolean> sys() {
        return get("sys");
    }

    @Override
    public DictTypeTableEx asTableEx() {
        return new DictTypeTableEx(this, null);
    }

    @Override
    public DictTypeTable __disableJoin(String reason) {
        return new DictTypeTable(this, reason);
    }
}
