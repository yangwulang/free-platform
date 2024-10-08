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
        type = Employee.class
)
public class EmployeeTableEx extends EmployeeTable implements TableEx<Employee> {
    public static final EmployeeTableEx $ = new EmployeeTableEx(EmployeeTable.$, null);

    public EmployeeTableEx() {
        super();
    }

    public EmployeeTableEx(AbstractTypedTable.DelayedOperation<Employee> delayedOperation) {
        super(delayedOperation);
    }

    public EmployeeTableEx(TableImplementor<Employee> table) {
        super(table);
    }

    protected EmployeeTableEx(EmployeeTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public UserTableEx user() {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(EmployeeProps.USER.unwrap()));
        }
        return new UserTableEx(joinOperation(EmployeeProps.USER.unwrap()));
    }

    public UserTableEx user(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTableEx(raw.joinImplementor(EmployeeProps.USER.unwrap(), joinType));
        }
        return new UserTableEx(joinOperation(EmployeeProps.USER.unwrap(), joinType));
    }

    public CompanyTableEx company() {
        __beforeJoin();
        if (raw != null) {
            return new CompanyTableEx(raw.joinImplementor(EmployeeProps.COMPANY.unwrap()));
        }
        return new CompanyTableEx(joinOperation(EmployeeProps.COMPANY.unwrap()));
    }

    public CompanyTableEx company(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new CompanyTableEx(raw.joinImplementor(EmployeeProps.COMPANY.unwrap(), joinType));
        }
        return new CompanyTableEx(joinOperation(EmployeeProps.COMPANY.unwrap(), joinType));
    }

    public PostTableEx posts() {
        __beforeJoin();
        if (raw != null) {
            return new PostTableEx(raw.joinImplementor(EmployeeProps.POSTS.unwrap()));
        }
        return new PostTableEx(joinOperation(EmployeeProps.POSTS.unwrap()));
    }

    public PostTableEx posts(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new PostTableEx(raw.joinImplementor(EmployeeProps.POSTS.unwrap(), joinType));
        }
        return new PostTableEx(joinOperation(EmployeeProps.POSTS.unwrap(), joinType));
    }

    @Override
    public Predicate posts(Function<PostTableEx, Predicate> block) {
        return exists(EmployeeProps.POSTS.unwrap(), block);
    }

    @Override
    public EmployeeTableEx asTableEx() {
        return this;
    }

    @Override
    public EmployeeTableEx __disableJoin(String reason) {
        return new EmployeeTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<EmployeeTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<EmployeeTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
