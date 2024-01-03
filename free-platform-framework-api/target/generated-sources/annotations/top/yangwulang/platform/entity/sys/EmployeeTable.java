package top.yangwulang.platform.entity.sys;

import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Employee.class
)
public class EmployeeTable extends AbstractTypedTable<Employee> implements EmployeeProps {
    public static final EmployeeTable $ = new EmployeeTable();

    public EmployeeTable() {
        super(Employee.class);
    }

    public EmployeeTable(AbstractTypedTable.DelayedOperation<Employee> delayedOperation) {
        super(Employee.class, delayedOperation);
    }

    public EmployeeTable(TableImplementor<Employee> table) {
        super(table);
    }

    protected EmployeeTable(EmployeeTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str empCode() {
        return __get(EmployeeProps.EMP_CODE.unwrap());
    }

    @Override
    public UserTable user() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(EmployeeProps.USER.unwrap()));
        }
        return new UserTable(joinOperation(EmployeeProps.USER.unwrap()));
    }

    @Override
    public UserTable user(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor(EmployeeProps.USER.unwrap(), joinType));
        }
        return new UserTable(joinOperation(EmployeeProps.USER.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str userId() {
        return __getAssociatedId(EmployeeProps.USER.unwrap());
    }

    @Override
    public CompanyTable company() {
        __beforeJoin();
        if (raw != null) {
            return new CompanyTable(raw.joinImplementor(EmployeeProps.COMPANY.unwrap()));
        }
        return new CompanyTable(joinOperation(EmployeeProps.COMPANY.unwrap()));
    }

    @Override
    public CompanyTable company(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new CompanyTable(raw.joinImplementor(EmployeeProps.COMPANY.unwrap(), joinType));
        }
        return new CompanyTable(joinOperation(EmployeeProps.COMPANY.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str companyId() {
        return __getAssociatedId(EmployeeProps.COMPANY.unwrap());
    }

    @Override
    public PropExpression.Str empName() {
        return __get(EmployeeProps.EMP_NAME.unwrap());
    }

    @Override
    public Predicate posts(Function<PostTableEx, Predicate> block) {
        return exists(EmployeeProps.POSTS.unwrap(), block);
    }

    @Override
    public EmployeeTableEx asTableEx() {
        return new EmployeeTableEx(this, null);
    }

    @Override
    public EmployeeTable __disableJoin(String reason) {
        return new EmployeeTable(this, reason);
    }

    public static class Remote extends AbstractTypedTable<Employee> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Employee.class, delayedOperation);
        }

        public Remote(TableImplementor<Employee> table) {
            super(table);
        }

        public PropExpression.Str empCode() {
            return __get(EmployeeProps.EMP_CODE.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<Employee> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
