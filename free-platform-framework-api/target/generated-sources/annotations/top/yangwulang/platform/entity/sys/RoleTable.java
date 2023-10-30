package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Date;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Role.class
)
public class RoleTable extends AbstractTypedTable<Role> implements RoleProps {
    public static final RoleTable $ = new RoleTable();

    public RoleTable() {
        super(Role.class);
    }

    public RoleTable(AbstractTypedTable.DelayedOperation<Role> delayedOperation) {
        super(Role.class, delayedOperation);
    }

    public RoleTable(TableImplementor<Role> table) {
        super(table);
    }

    protected RoleTable(RoleTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return get("id");
    }

    @Override
    public PropExpression.Num<Integer> status() {
        return get("status");
    }

    @Override
    public PropExpression.Str createBy() {
        return get("createBy");
    }

    @Override
    public PropExpression.Cmp<Date> createDate() {
        return get("createDate");
    }

    @Override
    public PropExpression.Str updateBy() {
        return get("updateBy");
    }

    @Override
    public PropExpression.Cmp<Date> updateDate() {
        return get("updateDate");
    }

    @Override
    public PropExpression.Str remarks() {
        return get("remarks");
    }

    @Override
    public PropExpression.Str roleCode() {
        return get("roleCode");
    }

    @Override
    public PropExpression.Str roleName() {
        return get("roleName");
    }

    @Override
    public PropExpression.Str roleType() {
        return get("roleType");
    }

    @Override
    public PropExpression.Num<BigDecimal> roleSort() {
        return get("roleSort");
    }

    @Override
    public PropExpression.Cmp<Boolean> isSys() {
        return get("isSys");
    }

    @Override
    public PropExpression.Str userType() {
        return get("userType");
    }

    @Override
    public PropExpression.Str dataScope() {
        return get("dataScope");
    }

    @Override
    public PropExpression.Str bizScope() {
        return get("bizScope");
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
    public RoleTableEx asTableEx() {
        return new RoleTableEx(this, null);
    }

    @Override
    public RoleTable __disableJoin(String reason) {
        return new RoleTable(this, reason);
    }

    public static class Remote extends AbstractTypedTable<Role> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Role.class, delayedOperation);
        }

        public Remote(TableImplementor<Role> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return get("id");
        }

        @Override
        @Deprecated
        public TableEx<Role> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
