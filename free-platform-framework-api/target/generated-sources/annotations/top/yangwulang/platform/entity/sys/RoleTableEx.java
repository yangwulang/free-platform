package top.yangwulang.platform.entity.sys;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.impl.table.TableProxies;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.WeakJoin;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Role.class
)
public class RoleTableEx extends RoleTable implements TableEx<Role> {
    public static final RoleTableEx $ = new RoleTableEx(RoleTable.$, null);

    public RoleTableEx() {
        super();
    }

    public RoleTableEx(AbstractTypedTable.DelayedOperation<Role> delayedOperation) {
        super(delayedOperation);
    }

    public RoleTableEx(TableImplementor<Role> table) {
        super(table);
    }

    protected RoleTableEx(RoleTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public MenuTableEx menus() {
        __beforeJoin();
        if (raw != null) {
            return new MenuTableEx(raw.joinImplementor(RoleProps.MENUS.unwrap()));
        }
        return new MenuTableEx(joinOperation(RoleProps.MENUS.unwrap()));
    }

    public MenuTableEx menus(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new MenuTableEx(raw.joinImplementor(RoleProps.MENUS.unwrap(), joinType));
        }
        return new MenuTableEx(joinOperation(RoleProps.MENUS.unwrap(), joinType));
    }

    @Override
    public Predicate menus(Function<MenuTableEx, Predicate> block) {
        return exists(RoleProps.MENUS.unwrap(), block);
    }

    public UserTableEx users() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(RoleProps.USERS.unwrap()));
        }
        return new UserTableEx(joinOperation(RoleProps.USERS.unwrap()));
    }

    public UserTableEx users(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(RoleProps.USERS.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(RoleProps.USERS.unwrap(), joinType));
    }

    @Override
    public Predicate users(Function<UserTableEx, Predicate> block) {
        return exists(RoleProps.USERS.unwrap(), block);
    }

    @Override
    public RoleTableEx asTableEx() {
        return this;
    }

    @Override
    public RoleTableEx __disableJoin(String reason) {
        return new RoleTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<RoleTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<RoleTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
