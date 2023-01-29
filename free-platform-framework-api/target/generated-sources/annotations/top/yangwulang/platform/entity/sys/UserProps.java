package top.yangwulang.platform.entity.sys;

import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@PropsFor(User.class)
public interface UserProps extends Props {
    TypedProp.Scalar<User, String> USER_CODE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(1));

    TypedProp.Scalar<User, String> LOGIN_CODE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(2));

    TypedProp.Scalar<User, String> USER_NAME = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(3));

    TypedProp.Scalar<User, String> PASSWORD = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(4));

    TypedProp.Scalar<User, String> EMAIL = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(5));

    TypedProp.Scalar<User, String> MOBILE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(6));

    TypedProp.Scalar<User, String> PHONE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(7));

    TypedProp.Scalar<User, String> SEX = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(8));

    TypedProp.Scalar<User, String> AVATAR = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(9));

    TypedProp.Scalar<User, String> SIGN = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(10));

    TypedProp.Scalar<User, String> WX_OPEN_ID = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(11));

    TypedProp.Scalar<User, String> MOBILE_IMEI = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(12));

    TypedProp.Scalar<User, String> USER_TYPE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(13));

    TypedProp.Scalar<User, String> REF_CODE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(14));

    TypedProp.Scalar<User, String> REF_NAME = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(15));

    TypedProp.Scalar<User, String> MGR_TYPE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(16));

    TypedProp.Scalar<User, Integer> PWD_SECURITY_LEVEL = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(17));

    TypedProp.Scalar<User, Integer> USER_WEIGHT = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(18));

    TypedProp.Scalar<User, String> STATUS = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(19));

    TypedProp.Scalar<User, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(20));

    TypedProp.Scalar<User, Date> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(21));

    TypedProp.Scalar<User, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(22));

    TypedProp.Scalar<User, Date> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(23));

    TypedProp.Scalar<User, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(User.class).getProp(24));

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

    PropExpression.Str status();

    PropExpression.Str createBy();

    PropExpression.Cmp<Date> createDate();

    PropExpression.Str updateBy();

    PropExpression.Cmp<Date> updateDate();

    PropExpression.Str remarks();
}
