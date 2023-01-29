package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

public class DictDataTable extends AbstractTypedTable<DictData> implements DictDataProps {
    public static final DictDataTable $ = new DictDataTable();

    public DictDataTable() {
        super(DictData.class);
    }

    public DictDataTable(AbstractTypedTable.DelayedOperation<DictData> delayedOperation) {
        super(DictData.class, delayedOperation);
    }

    public DictDataTable(TableImplementor<DictData> table) {
        super(table);
    }

    protected DictDataTable(DictDataTable base, String joinDisabledReason) {
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
    public DictDataTable parent() {
        __beforeJoin();
        if (raw != null) {
            return new DictDataTable(raw.joinImplementor("parent"));
        }
        return new DictDataTable(joinOperation("parent"));
    }

    @Override
    public DictDataTable parent(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new DictDataTable(raw.joinImplementor("parent", joinType));
        }
        return new DictDataTable(joinOperation("parent", joinType));
    }

    @Override
    public DictTypeTable dictType() {
        __beforeJoin();
        if (raw != null) {
            return new DictTypeTable(raw.joinImplementor("dictType"));
        }
        return new DictTypeTable(joinOperation("dictType"));
    }

    @Override
    public DictTypeTable dictType(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new DictTypeTable(raw.joinImplementor("dictType", joinType));
        }
        return new DictTypeTable(joinOperation("dictType", joinType));
    }

    @Override
    public PropExpression.Str parentCodes() {
        return get("parentCodes");
    }

    @Override
    public PropExpression.Num<BigDecimal> treeSort() {
        return get("treeSort");
    }

    @Override
    public PropExpression.Str treeSorts() {
        return get("treeSorts");
    }

    @Override
    public PropExpression.Str treeLeaf() {
        return get("treeLeaf");
    }

    @Override
    public PropExpression.Num<BigDecimal> treeLevel() {
        return get("treeLevel");
    }

    @Override
    public PropExpression.Str treeNames() {
        return get("treeNames");
    }

    @Override
    public PropExpression.Str dictLabel() {
        return get("dictLabel");
    }

    @Override
    public PropExpression.Str dictValue() {
        return get("dictValue");
    }

    @Override
    public PropExpression<Boolean> sys() {
        return get("sys");
    }

    @Override
    public PropExpression.Str description() {
        return get("description");
    }

    @Override
    public PropExpression.Str cssStyle() {
        return get("cssStyle");
    }

    @Override
    public PropExpression.Str cssClass() {
        return get("cssClass");
    }

    @Override
    public PropExpression.Str corpCode() {
        return get("corpCode");
    }

    @Override
    public PropExpression.Str corpName() {
        return get("corpName");
    }

    @Override
    public DictDataTableEx asTableEx() {
        return new DictDataTableEx(this, null);
    }

    @Override
    public DictDataTable __disableJoin(String reason) {
        return new DictDataTable(this, reason);
    }
}
