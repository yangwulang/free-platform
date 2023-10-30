package top.yangwulang.platform.entity.sys;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.impl.table.TableProxies;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.WeakJoin;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Menu.class
)
public class MenuTableEx extends MenuTable implements TableEx<Menu> {
    public static final MenuTableEx $ = new MenuTableEx(MenuTable.$, null);

    public MenuTableEx() {
        super();
    }

    public MenuTableEx(AbstractTypedTable.DelayedOperation<Menu> delayedOperation) {
        super(delayedOperation);
    }

    public MenuTableEx(TableImplementor<Menu> table) {
        super(table);
    }

    protected MenuTableEx(MenuTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public MenuTableEx parent() {
        __beforeJoin();
        if (raw != null) {
            return new MenuTableEx(raw.joinImplementor("parent"));
        }
        return new MenuTableEx(joinOperation("parent"));
    }

    public MenuTableEx parent(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new MenuTableEx(raw.joinImplementor("parent", joinType));
        }
        return new MenuTableEx(joinOperation("parent", joinType));
    }

    public MenuTableEx children() {
        __beforeJoin();
        if (raw != null) {
            return new MenuTableEx(raw.joinImplementor("children"));
        }
        return new MenuTableEx(joinOperation("children"));
    }

    public MenuTableEx children(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new MenuTableEx(raw.joinImplementor("children", joinType));
        }
        return new MenuTableEx(joinOperation("children", joinType));
    }

    public RoleTableEx roles() {
        __beforeJoin();
        if (raw != null) {
            return new RoleTableEx(raw.joinImplementor("roles"));
        }
        return new RoleTableEx(joinOperation("roles"));
    }

    public RoleTableEx roles(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new RoleTableEx(raw.joinImplementor("roles", joinType));
        }
        return new RoleTableEx(joinOperation("roles", joinType));
    }

    @Override
    public MenuTableEx asTableEx() {
        return this;
    }

    @Override
    public MenuTableEx __disableJoin(String reason) {
        return new MenuTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<MenuTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<MenuTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
