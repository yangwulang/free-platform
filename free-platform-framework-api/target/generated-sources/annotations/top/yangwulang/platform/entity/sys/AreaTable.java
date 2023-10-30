package top.yangwulang.platform.entity.sys;

import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
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
    public AreaTable parent() {
        __beforeJoin();
        if (raw != null) {
            return new AreaTable(raw.joinImplementor("parent"));
        }
        return new AreaTable(joinOperation("parent"));
    }

    @Override
    public AreaTable parent(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new AreaTable(raw.joinImplementor("parent", joinType));
        }
        return new AreaTable(joinOperation("parent", joinType));
    }

    @Override
    public PropExpression.Str parentId() {
        return get("parentId");
    }

    @Override
    public PropExpression.Str areaName() {
        return get("areaName");
    }

    @Override
    public PropExpression.Num<Long> sort() {
        return get("sort");
    }

    @Override
    public PropExpression.Str areaType() {
        return get("areaType");
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
            return get("id");
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
