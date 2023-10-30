package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Date;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Menu.class
)
public class MenuTable extends AbstractTypedTable<Menu> implements MenuProps {
    public static final MenuTable $ = new MenuTable();

    public MenuTable() {
        super(Menu.class);
    }

    public MenuTable(AbstractTypedTable.DelayedOperation<Menu> delayedOperation) {
        super(Menu.class, delayedOperation);
    }

    public MenuTable(TableImplementor<Menu> table) {
        super(table);
    }

    protected MenuTable(MenuTable base, String joinDisabledReason) {
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
    public MenuTable parent() {
        __beforeJoin();
        if (raw != null) {
            return new MenuTable(raw.joinImplementor("parent"));
        }
        return new MenuTable(joinOperation("parent"));
    }

    @Override
    public MenuTable parent(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new MenuTable(raw.joinImplementor("parent", joinType));
        }
        return new MenuTable(joinOperation("parent", joinType));
    }

    @Override
    public PropExpression.Str parentId() {
        return get("parentId");
    }

    @Override
    public PropExpression.Str menuName() {
        return get("menuName");
    }

    @Override
    public PropExpression.Str menuType() {
        return get("menuType");
    }

    @Override
    public PropExpression.Str menuHref() {
        return get("menuHref");
    }

    @Override
    public PropExpression.Str menuComponent() {
        return get("menuComponent");
    }

    @Override
    public PropExpression.Str menuTarget() {
        return get("menuTarget");
    }

    @Override
    public PropExpression.Str menuIcon() {
        return get("menuIcon");
    }

    @Override
    public PropExpression.Str menuColor() {
        return get("menuColor");
    }

    @Override
    public PropExpression.Str menuTitle() {
        return get("menuTitle");
    }

    @Override
    public PropExpression.Str permission() {
        return get("permission");
    }

    @Override
    public PropExpression.Num<BigDecimal> weight() {
        return get("weight");
    }

    @Override
    public PropExpression.Cmp<Boolean> isShow() {
        return get("isShow");
    }

    @Override
    public PropExpression.Str sysCode() {
        return get("sysCode");
    }

    @Override
    public MenuTableEx asTableEx() {
        return new MenuTableEx(this, null);
    }

    @Override
    public MenuTable __disableJoin(String reason) {
        return new MenuTable(this, reason);
    }

    public static class Remote extends AbstractTypedTable<Menu> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Menu.class, delayedOperation);
        }

        public Remote(TableImplementor<Menu> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return get("id");
        }

        @Override
        @Deprecated
        public TableEx<Menu> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
