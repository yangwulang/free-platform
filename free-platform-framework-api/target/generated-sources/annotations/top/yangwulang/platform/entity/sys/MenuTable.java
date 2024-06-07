package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
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
        return __get(MenuProps.ID.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> status() {
        return __get(MenuProps.STATUS.unwrap());
    }

    @Override
    public PropExpression.Str createBy() {
        return __get(MenuProps.CREATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> createDate() {
        return __get(MenuProps.CREATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str updateBy() {
        return __get(MenuProps.UPDATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> updateDate() {
        return __get(MenuProps.UPDATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str remarks() {
        return __get(MenuProps.REMARKS.unwrap());
    }

    @Override
    public MenuTable parent() {
        __beforeJoin();
        if (raw != null) {
            return new MenuTable(raw.joinImplementor(MenuProps.PARENT.unwrap()));
        }
        return new MenuTable(joinOperation(MenuProps.PARENT.unwrap()));
    }

    @Override
    public MenuTable parent(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new MenuTable(raw.joinImplementor(MenuProps.PARENT.unwrap(), joinType));
        }
        return new MenuTable(joinOperation(MenuProps.PARENT.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str parentId() {
        return __getAssociatedId(MenuProps.PARENT.unwrap());
    }

    @Override
    public Predicate children(Function<MenuTableEx, Predicate> block) {
        return exists(MenuProps.CHILDREN.unwrap(), block);
    }

    @Override
    public PropExpression.Str menuName() {
        return __get(MenuProps.MENU_NAME.unwrap());
    }

    @Override
    public PropExpression.Str menuType() {
        return __get(MenuProps.MENU_TYPE.unwrap());
    }

    @Override
    public PropExpression.Str menuHref() {
        return __get(MenuProps.MENU_HREF.unwrap());
    }

    @Override
    public PropExpression.Str menuComponent() {
        return __get(MenuProps.MENU_COMPONENT.unwrap());
    }

    @Override
    public PropExpression.Str menuTarget() {
        return __get(MenuProps.MENU_TARGET.unwrap());
    }

    @Override
    public PropExpression.Str menuIcon() {
        return __get(MenuProps.MENU_ICON.unwrap());
    }

    @Override
    public PropExpression.Str menuColor() {
        return __get(MenuProps.MENU_COLOR.unwrap());
    }

    @Override
    public PropExpression.Str menuTitle() {
        return __get(MenuProps.MENU_TITLE.unwrap());
    }

    @Override
    public PropExpression.Str permission() {
        return __get(MenuProps.PERMISSION.unwrap());
    }

    @Override
    public PropExpression.Num<BigDecimal> weight() {
        return __get(MenuProps.WEIGHT.unwrap());
    }

    @Override
    public PropExpression.Cmp<Boolean> isShow() {
        return __get(MenuProps.IS_SHOW.unwrap());
    }

    @Override
    public PropExpression.Str sysCode() {
        return __get(MenuProps.SYS_CODE.unwrap());
    }

    @Override
    public Predicate roles(Function<RoleTableEx, Predicate> block) {
        return exists(MenuProps.ROLES.unwrap(), block);
    }

    @Override
    public MenuTableEx asTableEx() {
        return new MenuTableEx(this, null);
    }

    @Override
    public MenuTable __disableJoin(String reason) {
        return new MenuTable(this, reason);
    }

    @GeneratedBy(
            type = Menu.class
    )
    public static class Remote extends AbstractTypedTable<Menu> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Menu.class, delayedOperation);
        }

        public Remote(TableImplementor<Menu> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(MenuProps.ID.unwrap());
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
