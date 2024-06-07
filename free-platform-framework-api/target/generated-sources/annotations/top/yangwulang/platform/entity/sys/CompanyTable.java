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
        type = Company.class
)
public class CompanyTable extends AbstractTypedTable<Company> implements CompanyProps {
    public static final CompanyTable $ = new CompanyTable();

    public CompanyTable() {
        super(Company.class);
    }

    public CompanyTable(AbstractTypedTable.DelayedOperation<Company> delayedOperation) {
        super(Company.class, delayedOperation);
    }

    public CompanyTable(TableImplementor<Company> table) {
        super(table);
    }

    protected CompanyTable(CompanyTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return __get(CompanyProps.ID.unwrap());
    }

    @Override
    public CompanyTable parent() {
        __beforeJoin();
        if (raw != null) {
            return new CompanyTable(raw.joinImplementor(CompanyProps.PARENT.unwrap()));
        }
        return new CompanyTable(joinOperation(CompanyProps.PARENT.unwrap()));
    }

    @Override
    public CompanyTable parent(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new CompanyTable(raw.joinImplementor(CompanyProps.PARENT.unwrap(), joinType));
        }
        return new CompanyTable(joinOperation(CompanyProps.PARENT.unwrap(), joinType));
    }

    @Override
    public PropExpression.Str parentId() {
        return __getAssociatedId(CompanyProps.PARENT.unwrap());
    }

    @Override
    public Predicate children(Function<CompanyTableEx, Predicate> block) {
        return exists(CompanyProps.CHILDREN.unwrap(), block);
    }

    @Override
    public Predicate employees(Function<EmployeeTableEx, Predicate> block) {
        return exists(CompanyProps.EMPLOYEES.unwrap(), block);
    }

    @Override
    public PropExpression.Str companyCode() {
        return __get(CompanyProps.COMPANY_CODE.unwrap());
    }

    @Override
    public PropExpression.Str companyName() {
        return __get(CompanyProps.COMPANY_NAME.unwrap());
    }

    @Override
    public PropExpression.Str companyFullName() {
        return __get(CompanyProps.COMPANY_FULL_NAME.unwrap());
    }

    @Override
    public PropExpression.Str corpCode() {
        return __get(CompanyProps.CORP_CODE.unwrap());
    }

    @Override
    public PropExpression.Str corpName() {
        return __get(CompanyProps.CORP_NAME.unwrap());
    }

    @Override
    public CompanyTableEx asTableEx() {
        return new CompanyTableEx(this, null);
    }

    @Override
    public CompanyTable __disableJoin(String reason) {
        return new CompanyTable(this, reason);
    }

    @GeneratedBy(
            type = Company.class
    )
    public static class Remote extends AbstractTypedTable<Company> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Company.class, delayedOperation);
        }

        public Remote(TableImplementor<Company> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(CompanyProps.ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<Company> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
