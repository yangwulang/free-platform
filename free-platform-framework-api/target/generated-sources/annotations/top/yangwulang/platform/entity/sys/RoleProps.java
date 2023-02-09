package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@PropsFor(Role.class)
public interface RoleProps extends Props {
    TypedProp.Scalar<Role, String> ROLE_CODE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(1));

    TypedProp.Scalar<Role, String> ROLE_NAME = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(2));

    TypedProp.Scalar<Role, String> ROLE_TYPE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(3));

    TypedProp.Scalar<Role, BigDecimal> ROLE_SORT = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(4));

    TypedProp.Scalar<Role, Boolean> SYS = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(5));

    TypedProp.Scalar<Role, String> USER_TYPE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(6));

    TypedProp.Scalar<Role, String> DATA_SCOPE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(7));

    TypedProp.Scalar<Role, String> BIZ_SCOPE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(8));

    TypedProp.Scalar<Role, String> STATUS = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(9));

    TypedProp.Scalar<Role, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(10));

    TypedProp.Scalar<Role, LocalDateTime> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(11));

    TypedProp.Scalar<Role, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(12));

    TypedProp.Scalar<Role, LocalDateTime> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(13));

    TypedProp.Scalar<Role, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(14));

    TypedProp.Scalar<Role, String> CORP_CODE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(15));

    TypedProp.Scalar<Role, String> CORP_NAME = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp(16));

    PropExpression.Str roleCode();

    PropExpression.Str roleName();

    PropExpression.Str roleType();

    PropExpression.Num<BigDecimal> roleSort();

    PropExpression<Boolean> sys();

    PropExpression.Str userType();

    PropExpression.Str dataScope();

    PropExpression.Str bizScope();

    PropExpression.Str status();

    PropExpression.Str createBy();

    PropExpression.Cmp<LocalDateTime> createDate();

    PropExpression.Str updateBy();

    PropExpression.Cmp<LocalDateTime> updateDate();

    PropExpression.Str remarks();

    PropExpression.Str corpCode();

    PropExpression.Str corpName();
}
