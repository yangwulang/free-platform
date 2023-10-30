package top.yangwulang.platform.entity.sys;

import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
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
        return get("empCode");
    }

    @Override
    public UserTable user() {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor("user"));
        }
        return new UserTable(joinOperation("user"));
    }

    @Override
    public UserTable user(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new UserTable(raw.joinImplementor("user", joinType));
        }
        return new UserTable(joinOperation("user", joinType));
    }

    @Override
    public CompanyTable company() {
        __beforeJoin();
        if (raw != null) {
            return new CompanyTable(raw.joinImplementor("company"));
        }
        return new CompanyTable(joinOperation("company"));
    }

    @Override
    public CompanyTable company(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new CompanyTable(raw.joinImplementor("company", joinType));
        }
        return new CompanyTable(joinOperation("company", joinType));
    }

    @Override
    public PropExpression.Str companyId() {
        return get("companyId");
    }

    @Override
    public PropExpression.Str empName() {
        return get("empName");
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
            return get("empCode");
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
