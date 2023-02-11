package top.yangwulang.platform.entity.sys;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

public class UserTable extends AbstractTypedTable<User> implements UserProps {
    public static final UserTable $ = new UserTable();

    public UserTable() {
        super(User.class);
    }

    public UserTable(AbstractTypedTable.DelayedOperation<User> delayedOperation) {
        super(User.class, delayedOperation);
    }

    public UserTable(TableImplementor<User> table) {
        super(table);
    }

    protected UserTable(UserTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str userCode() {
        return get("userCode");
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
    public PropExpression.Str loginCode() {
        return get("loginCode");
    }

    @Override
    public PropExpression.Str userName() {
        return get("userName");
    }

    @Override
    public PropExpression.Str password() {
        return get("password");
    }

    @Override
    public PropExpression.Str email() {
        return get("email");
    }

    @Override
    public PropExpression.Str mobile() {
        return get("mobile");
    }

    @Override
    public PropExpression.Str phone() {
        return get("phone");
    }

    @Override
    public PropExpression.Str sex() {
        return get("sex");
    }

    @Override
    public PropExpression.Str avatar() {
        return get("avatar");
    }

    @Override
    public PropExpression.Str sign() {
        return get("sign");
    }

    @Override
    public PropExpression.Str wxOpenId() {
        return get("wxOpenId");
    }

    @Override
    public PropExpression.Str mobileImei() {
        return get("mobileImei");
    }

    @Override
    public PropExpression.Str userType() {
        return get("userType");
    }

    @Override
    public PropExpression.Str refCode() {
        return get("refCode");
    }

    @Override
    public PropExpression.Str refName() {
        return get("refName");
    }

    @Override
    public PropExpression.Str mgrType() {
        return get("mgrType");
    }

    @Override
    public PropExpression.Num<Integer> pwdSecurityLevel() {
        return get("pwdSecurityLevel");
    }

    @Override
    public PropExpression.Num<Integer> userWeight() {
        return get("userWeight");
    }

    @Override
    public UserTableEx asTableEx() {
        return new UserTableEx(this, null);
    }

    @Override
    public UserTable __disableJoin(String reason) {
        return new UserTable(this, reason);
    }
}
