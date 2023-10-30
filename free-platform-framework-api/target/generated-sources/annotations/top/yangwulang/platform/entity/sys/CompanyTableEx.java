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
        type = Company.class
)
public class CompanyTableEx extends CompanyTable implements TableEx<Company> {
    public static final CompanyTableEx $ = new CompanyTableEx(CompanyTable.$, null);

    public CompanyTableEx() {
        super();
    }

    public CompanyTableEx(AbstractTypedTable.DelayedOperation<Company> delayedOperation) {
        super(delayedOperation);
    }

    public CompanyTableEx(TableImplementor<Company> table) {
        super(table);
    }

    protected CompanyTableEx(CompanyTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    public CompanyTableEx parent() {
        __beforeJoin();
        if (raw != null) {
            return new CompanyTableEx(raw.joinImplementor("parent"));
        }
        return new CompanyTableEx(joinOperation("parent"));
    }

    public CompanyTableEx parent(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new CompanyTableEx(raw.joinImplementor("parent", joinType));
        }
        return new CompanyTableEx(joinOperation("parent", joinType));
    }

    public CompanyTableEx children() {
        __beforeJoin();
        if (raw != null) {
            return new CompanyTableEx(raw.joinImplementor("children"));
        }
        return new CompanyTableEx(joinOperation("children"));
    }

    public CompanyTableEx children(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new CompanyTableEx(raw.joinImplementor("children", joinType));
        }
        return new CompanyTableEx(joinOperation("children", joinType));
    }

    public EmployeeTableEx employees() {
        __beforeJoin();
        if (raw != null) {
            return new EmployeeTableEx(raw.joinImplementor("employees"));
        }
        return new EmployeeTableEx(joinOperation("employees"));
    }

    public EmployeeTableEx employees(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new EmployeeTableEx(raw.joinImplementor("employees", joinType));
        }
        return new EmployeeTableEx(joinOperation("employees", joinType));
    }

    @Override
    public CompanyTableEx asTableEx() {
        return this;
    }

    @Override
    public CompanyTableEx __disableJoin(String reason) {
        return new CompanyTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<CompanyTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<CompanyTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
