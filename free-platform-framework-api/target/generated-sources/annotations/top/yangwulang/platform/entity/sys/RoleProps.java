package top.yangwulang.platform.entity.sys;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Date;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;
import top.yangwulang.platform.entity.DataTypeBaseProps;

@GeneratedBy(
        type = Role.class
)
@PropsFor(Role.class)
public interface RoleProps extends DataTypeBaseProps {
    TypedProp.Scalar<Role, String> ID = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("id"));

    TypedProp.Scalar<Role, Integer> STATUS = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("status"));

    TypedProp.Scalar<Role, String> CREATE_BY = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("createBy"));

    TypedProp.Scalar<Role, Date> CREATE_DATE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("createDate"));

    TypedProp.Scalar<Role, String> UPDATE_BY = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("updateBy"));

    TypedProp.Scalar<Role, Date> UPDATE_DATE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("updateDate"));

    TypedProp.Scalar<Role, String> REMARKS = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("remarks"));

    TypedProp.Scalar<Role, String> ROLE_CODE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("roleCode"));

    TypedProp.Scalar<Role, String> ROLE_NAME = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("roleName"));

    TypedProp.Scalar<Role, String> ROLE_TYPE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("roleType"));

    TypedProp.Scalar<Role, BigDecimal> ROLE_SORT = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("roleSort"));

    TypedProp.Scalar<Role, Boolean> IS_SYS = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("isSys"));

    TypedProp.Scalar<Role, String> USER_TYPE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("userType"));

    TypedProp.Scalar<Role, String> DATA_SCOPE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("dataScope"));

    TypedProp.Scalar<Role, String> BIZ_SCOPE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("bizScope"));

    TypedProp.Scalar<Role, String> CORP_CODE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("corpCode"));

    TypedProp.Scalar<Role, String> CORP_NAME = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("corpName"));

    TypedProp.ReferenceList<Role, Menu> MENUS = 
        TypedProp.referenceList(ImmutableType.get(Role.class).getProp("menus"));

    TypedProp.ReferenceList<Role, User> USERS = 
        TypedProp.referenceList(ImmutableType.get(Role.class).getProp("users"));

    PropExpression.Str roleCode();

    PropExpression.Str roleName();

    PropExpression.Str roleType();

    PropExpression.Num<BigDecimal> roleSort();

    PropExpression.Cmp<Boolean> isSys();

    PropExpression.Str userType();

    PropExpression.Str dataScope();

    PropExpression.Str bizScope();

    PropExpression.Str corpCode();

    PropExpression.Str corpName();

    Predicate menus(Function<MenuTableEx, Predicate> block);

    Predicate users(Function<UserTableEx, Predicate> block);
}
