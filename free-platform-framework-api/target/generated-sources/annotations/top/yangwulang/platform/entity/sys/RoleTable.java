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
        return __get(RoleProps.ID.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> status() {
        return __get(RoleProps.STATUS.unwrap());
    }

    @Override
    public PropExpression.Str createBy() {
        return __get(RoleProps.CREATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> createDate() {
        return __get(RoleProps.CREATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str updateBy() {
        return __get(RoleProps.UPDATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> updateDate() {
        return __get(RoleProps.UPDATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str remarks() {
        return __get(RoleProps.REMARKS.unwrap());
    }

    @Override
    public PropExpression.Str roleCode() {
        return __get(RoleProps.ROLE_CODE.unwrap());
    }

    @Override
    public PropExpression.Str roleName() {
        return __get(RoleProps.ROLE_NAME.unwrap());
    }

    @Override
    public PropExpression.Str roleType() {
        return __get(RoleProps.ROLE_TYPE.unwrap());
    }

    @Override
    public PropExpression.Num<BigDecimal> roleSort() {
        return __get(RoleProps.ROLE_SORT.unwrap());
    }

    @Override
    public PropExpression.Cmp<Boolean> isSys() {
        return __get(RoleProps.IS_SYS.unwrap());
    }

    @Override
    public PropExpression.Str userType() {
        return __get(RoleProps.USER_TYPE.unwrap());
    }

    @Override
    public PropExpression.Str dataScope() {
        return __get(RoleProps.DATA_SCOPE.unwrap());
    }

    @Override
    public PropExpression.Str bizScope() {
        return __get(RoleProps.BIZ_SCOPE.unwrap());
    }

    @Override
    public PropExpression.Str corpCode() {
        return __get(RoleProps.CORP_CODE.unwrap());
    }

    @Override
    public PropExpression.Str corpName() {
        return __get(RoleProps.CORP_NAME.unwrap());
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
            return __get(RoleProps.ID.unwrap());
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
