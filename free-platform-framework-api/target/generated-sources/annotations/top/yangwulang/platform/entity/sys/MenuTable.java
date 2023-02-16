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
    public PropExpression<Boolean> show() {
        return get("show");
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
}
