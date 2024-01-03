package top.yangwulang.platform.entity.sys;

import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Long;
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
        type = Area.class
)
public class AreaTable extends AbstractTypedTable<Area> implements AreaProps {
    public static final AreaTable $ = new AreaTable();

    public AreaTable() {
        super(Area.class);
    }

    public AreaTable(AbstractTypedTable.DelayedOperation<Area> delayedOperation) {
        super(Area.class, delayedOperation);
    }

    public AreaTable(TableImplementor<Area> table) {
        super(table);
    }

    protected AreaTable(AreaTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return __get(AreaProps.ID.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> status() {
        return __get(AreaProps.STATUS.unwrap());
    }

    @Override
    public PropExpression.Str createBy() {
        return __get(AreaProps.CREATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> createDate() {
        return __get(AreaProps.CREATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str updateBy() {
        return __get(AreaProps.UPDATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> updateDate() {
        return __get(AreaProps.UPDATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str remarks() {
        return __get(AreaProps.REMARKS.unwrap());
    }

    @Override
    public AreaTable parent() {
        __beforeJoin();
        if (raw != null) {
            return new AreaTable(raw.joinImplementor(AreaProps.PARENT.unwrap()));
        }
        return new AreaTable(joinOperation(AreaProps.PARENT.unwrap()));
    }

    @Override
    public AreaTable parent(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new AreaTable(raw.joinImplementor(AreaProps.PARENT.unwrap(), joinType));
        }
        return new AreaTable(joinOperation(AreaProps.PARENT.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str parentId() {
        return __getAssociatedId(AreaProps.PARENT.unwrap());
    }

    @Override
    public Predicate children(Function<AreaTableEx, Predicate> block) {
        return exists(AreaProps.CHILDREN.unwrap(), block);
    }

    @Override
    public PropExpression.Str areaName() {
        return __get(AreaProps.AREA_NAME.unwrap());
    }

    @Override
    public PropExpression.Num<Long> sort() {
        return __get(AreaProps.SORT.unwrap());
    }

    @Override
    public PropExpression.Str areaType() {
        return __get(AreaProps.AREA_TYPE.unwrap());
    }

    @Override
    public AreaTableEx asTableEx() {
        return new AreaTableEx(this, null);
    }

    @Override
    public AreaTable __disableJoin(String reason) {
        return new AreaTable(this, reason);
    }

    public static class Remote extends AbstractTypedTable<Area> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Area.class, delayedOperation);
        }

        public Remote(TableImplementor<Area> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(AreaProps.ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<Area> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
