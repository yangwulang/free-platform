package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = DictData.class
)
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
        return __get(DictDataProps.ID.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> status() {
        return __get(DictDataProps.STATUS.unwrap());
    }

    @Override
    public PropExpression.Str createBy() {
        return __get(DictDataProps.CREATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> createDate() {
        return __get(DictDataProps.CREATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str updateBy() {
        return __get(DictDataProps.UPDATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> updateDate() {
        return __get(DictDataProps.UPDATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str remarks() {
        return __get(DictDataProps.REMARKS.unwrap());
    }

    @Override
    public DictDataTable parent() {
        __beforeJoin();
        if (raw != null) {
            return new DictDataTable(raw.joinImplementor(DictDataProps.PARENT.unwrap()));
        }
        return new DictDataTable(joinOperation(DictDataProps.PARENT.unwrap()));
    }

    @Override
    public DictDataTable parent(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new DictDataTable(raw.joinImplementor(DictDataProps.PARENT.unwrap(), joinType));
        }
        return new DictDataTable(joinOperation(DictDataProps.PARENT.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str parentId() {
        return __getAssociatedId(DictDataProps.PARENT.unwrap());
    }

    @Override
    public Predicate children(Function<DictDataTableEx, Predicate> block) {
        return exists(DictDataProps.CHILDREN.unwrap(), block);
    }

    @Override
    public DictTypeTable dictType() {
        __beforeJoin();
        if (raw != null) {
            return new DictTypeTable(raw.joinImplementor(DictDataProps.DICT_TYPE.unwrap()));
        }
        return new DictTypeTable(joinOperation(DictDataProps.DICT_TYPE.unwrap()));
    }

    @Override
    public DictTypeTable dictType(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new DictTypeTable(raw.joinImplementor(DictDataProps.DICT_TYPE.unwrap(), joinType));
        }
        return new DictTypeTable(joinOperation(DictDataProps.DICT_TYPE.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str dictTypeId() {
        return __getAssociatedId(DictDataProps.DICT_TYPE.unwrap());
    }

    @Override
    public PropExpression.Str dictLabel() {
        return __get(DictDataProps.DICT_LABEL.unwrap());
    }

    @Override
    public PropExpression.Str dictValue() {
        return __get(DictDataProps.DICT_VALUE.unwrap());
    }

    @Override
    public PropExpression.Cmp<Boolean> isSys() {
        return __get(DictDataProps.IS_SYS.unwrap());
    }

    @Override
    public PropExpression.Str description() {
        return __get(DictDataProps.DESCRIPTION.unwrap());
    }

    @Override
    public PropExpression.Str cssStyle() {
        return __get(DictDataProps.CSS_STYLE.unwrap());
    }

    @Override
    public PropExpression.Str cssClass() {
        return __get(DictDataProps.CSS_CLASS.unwrap());
    }

    @Override
    public PropExpression.Str corpCode() {
        return __get(DictDataProps.CORP_CODE.unwrap());
    }

    @Override
    public PropExpression.Str corpName() {
        return __get(DictDataProps.CORP_NAME.unwrap());
    }

    @Override
    public DictDataTableEx asTableEx() {
        return new DictDataTableEx(this, null);
    }

    @Override
    public DictDataTable __disableJoin(String reason) {
        return new DictDataTable(this, reason);
    }

    @GeneratedBy(
            type = DictData.class
    )
    public static class Remote extends AbstractTypedTable<DictData> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(DictData.class, delayedOperation);
        }

        public Remote(TableImplementor<DictData> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(DictDataProps.ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<DictData> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
