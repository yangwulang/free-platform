package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import org.babyfish.jimmer.internal.GeneratedBy;
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
        return __get(DictTypeProps.ID.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> status() {
        return __get(DictTypeProps.STATUS.unwrap());
    }

    @Override
    public PropExpression.Str createBy() {
        return __get(DictTypeProps.CREATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> createDate() {
        return __get(DictTypeProps.CREATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str updateBy() {
        return __get(DictTypeProps.UPDATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> updateDate() {
        return __get(DictTypeProps.UPDATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str remarks() {
        return __get(DictTypeProps.REMARKS.unwrap());
    }

    @Override
    public PropExpression.Str dictName() {
        return __get(DictTypeProps.DICT_NAME.unwrap());
    }

    @Override
    public PropExpression.Str dictType() {
        return __get(DictTypeProps.DICT_TYPE.unwrap());
    }

    @Override
    public PropExpression.Cmp<Boolean> isSys() {
        return __get(DictTypeProps.IS_SYS.unwrap());
    }

    @Override
    public DictTypeTableEx asTableEx() {
        return new DictTypeTableEx(this, null);
    }

    @Override
    public DictTypeTable __disableJoin(String reason) {
        return new DictTypeTable(this, reason);
    }

    @GeneratedBy(
            type = DictType.class
    )
    public static class Remote extends AbstractTypedTable<DictType> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(DictType.class, delayedOperation);
        }

        public Remote(TableImplementor<DictType> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(DictTypeProps.ID.unwrap());
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
