package top.yangwulang.platform.entity.sys;

import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;
import top.yangwulang.platform.entity.BaseEntityProps;

@GeneratedBy(
        type = User.class
)
@PropsFor(User.class)
public interface UserProps extends BaseEntityProps {
    TypedProp.Scalar<User, String> USER_CODE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("userCode"));

    TypedProp.Scalar<User, Integer> STATUS = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("status"));

    TypedProp.Scalar<User, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("createBy"));

    TypedProp.Scalar<User, Date> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("createDate"));

    TypedProp.Scalar<User, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("updateBy"));

    TypedProp.Scalar<User, Date> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("updateDate"));

    TypedProp.Scalar<User, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("remarks"));

    TypedProp.Scalar<User, String> LOGIN_CODE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("loginCode"));

    TypedProp.Scalar<User, String> USER_NAME = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("userName"));

    TypedProp.Scalar<User, String> PASSWORD = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("password"));

    TypedProp.Scalar<User, String> EMAIL = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("email"));

    TypedProp.Scalar<User, String> MOBILE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("mobile"));

    TypedProp.Scalar<User, String> PHONE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("phone"));

    TypedProp.Scalar<User, String> SEX = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("sex"));

    TypedProp.Scalar<User, String> AVATAR = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("avatar"));

    TypedProp.Scalar<User, String> SIGN = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("sign"));

    TypedProp.Scalar<User, String> WX_OPEN_ID = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("wxOpenId"));

    TypedProp.Scalar<User, String> MOBILE_IMEI = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("mobileImei"));

    TypedProp.Scalar<User, String> USER_TYPE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("userType"));

    TypedProp.Scalar<User, String> REF_CODE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("refCode"));

    TypedProp.Scalar<User, String> REF_NAME = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("refName"));

    TypedProp.Scalar<User, String> MGR_TYPE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("mgrType"));

    TypedProp.Scalar<User, Integer> PWD_SECURITY_LEVEL = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("pwdSecurityLevel"));

    TypedProp.Scalar<User, Integer> USER_WEIGHT = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp("userWeight"));

    TypedProp.ReferenceList<User, Role> ROLES = 
        TypedProp.referenceList(ImmutableType.get(User.class).getProp("roles"));

    PropExpression.Str userCode();

    PropExpression.Str loginCode();

    PropExpression.Str userName();

    PropExpression.Str password();

    PropExpression.Str email();

    PropExpression.Str mobile();

    PropExpression.Str phone();

    PropExpression.Str sex();

    PropExpression.Str avatar();

    PropExpression.Str sign();

    PropExpression.Str wxOpenId();

    PropExpression.Str mobileImei();

    PropExpression.Str userType();

    PropExpression.Str refCode();

    PropExpression.Str refName();

    PropExpression.Str mgrType();

    PropExpression.Num<Integer> pwdSecurityLevel();

    PropExpression.Num<Integer> userWeight();

    Predicate roles(Function<RoleTableEx, Predicate> block);
}
