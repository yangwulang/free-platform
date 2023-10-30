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
        return get("id");
    }

    @Override
    public CompanyTable parent() {
        __beforeJoin();
        if (raw != null) {
            return new CompanyTable(raw.joinImplementor("parent"));
        }
        return new CompanyTable(joinOperation("parent"));
    }

    @Override
    public CompanyTable parent(JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return new CompanyTable(raw.joinImplementor("parent", joinType));
        }
        return new CompanyTable(joinOperation("parent", joinType));
    }

    @Override
    public PropExpression.Str parentId() {
        return get("parentId");
    }

    @Override
    public PropExpression.Str companyCode() {
        return get("companyCode");
    }

    @Override
    public PropExpression.Str companyName() {
        return get("companyName");
    }

    @Override
    public PropExpression.Str companyFullName() {
        return get("companyFullName");
    }

    @Override
    public PropExpression.Str corpCode() {
        return get("corpCode");
    }

    @Override
    public PropExpression.Str corpName() {
        return get("corpName");
    }

    @Override
    public CompanyTableEx asTableEx() {
        return new CompanyTableEx(this, null);
    }

    @Override
    public CompanyTable __disableJoin(String reason) {
        return new CompanyTable(this, reason);
    }

    public static class Remote extends AbstractTypedTable<Company> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Company.class, delayedOperation);
        }

        public Remote(TableImplementor<Company> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return get("id");
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
