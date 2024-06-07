package top.yangwulang.platform.entity.sys;

import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = User.class
)
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
        return __get(UserProps.USER_CODE.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> status() {
        return __get(UserProps.STATUS.unwrap());
    }

    @Override
    public PropExpression.Str createBy() {
        return __get(UserProps.CREATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> createDate() {
        return __get(UserProps.CREATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str updateBy() {
        return __get(UserProps.UPDATE_BY.unwrap());
    }

    @Override
    public PropExpression.Cmp<Date> updateDate() {
        return __get(UserProps.UPDATE_DATE.unwrap());
    }

    @Override
    public PropExpression.Str remarks() {
        return __get(UserProps.REMARKS.unwrap());
    }

    @Override
    public PropExpression.Str loginCode() {
        return __get(UserProps.LOGIN_CODE.unwrap());
    }

    @Override
    public PropExpression.Str userName() {
        return __get(UserProps.USER_NAME.unwrap());
    }

    @Override
    public PropExpression.Str password() {
        return __get(UserProps.PASSWORD.unwrap());
    }

    @Override
    public PropExpression.Str email() {
        return __get(UserProps.EMAIL.unwrap());
    }

    @Override
    public PropExpression.Str mobile() {
        return __get(UserProps.MOBILE.unwrap());
    }

    @Override
    public PropExpression.Str phone() {
        return __get(UserProps.PHONE.unwrap());
    }

    @Override
    public PropExpression.Str sex() {
        return __get(UserProps.SEX.unwrap());
    }

    @Override
    public PropExpression.Str avatar() {
        return __get(UserProps.AVATAR.unwrap());
    }

    @Override
    public PropExpression.Str sign() {
        return __get(UserProps.SIGN.unwrap());
    }

    @Override
    public PropExpression.Str wxOpenId() {
        return __get(UserProps.WX_OPEN_ID.unwrap());
    }

    @Override
    public PropExpression.Str mobileImei() {
        return __get(UserProps.MOBILE_IMEI.unwrap());
    }

    @Override
    public PropExpression.Str userType() {
        return __get(UserProps.USER_TYPE.unwrap());
    }

    @Override
    public PropExpression.Str refCode() {
        return __get(UserProps.REF_CODE.unwrap());
    }

    @Override
    public PropExpression.Str refName() {
        return __get(UserProps.REF_NAME.unwrap());
    }

    @Override
    public PropExpression.Str mgrType() {
        return __get(UserProps.MGR_TYPE.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> pwdSecurityLevel() {
        return __get(UserProps.PWD_SECURITY_LEVEL.unwrap());
    }

    @Override
    public PropExpression.Num<Integer> userWeight() {
        return __get(UserProps.USER_WEIGHT.unwrap());
    }

    @Override
    public Predicate roles(Function<RoleTableEx, Predicate> block) {
        return exists(UserProps.ROLES.unwrap(), block);
    }

    @Override
    public UserTableEx asTableEx() {
        return new UserTableEx(this, null);
    }

    @Override
    public UserTable __disableJoin(String reason) {
        return new UserTable(this, reason);
    }

    @GeneratedBy(
            type = User.class
    )
    public static class Remote extends AbstractTypedTable<User> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(User.class, delayedOperation);
        }

        public Remote(TableImplementor<User> table) {
            super(table);
        }

        public PropExpression.Str userCode() {
            return __get(UserProps.USER_CODE.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<User> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
