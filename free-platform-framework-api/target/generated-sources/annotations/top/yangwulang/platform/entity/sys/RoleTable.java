package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

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
    public PropExpression<Boolean> sys() {
        return get("sys");
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
}
