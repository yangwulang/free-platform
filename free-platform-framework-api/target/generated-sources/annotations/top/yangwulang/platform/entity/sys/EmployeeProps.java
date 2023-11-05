package top.yangwulang.platform.entity.sys;

import java.lang.String;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = Employee.class
)
@PropsFor(Employee.class)
public interface EmployeeProps extends Props {
    TypedProp.Scalar<Employee, String> EMP_CODE = 
        TypedProp.scalar(ImmutableType.get(Employee.class).getProp("empCode"));

    TypedProp.Reference<Employee, User> USER = 
        TypedProp.reference(ImmutableType.get(Employee.class).getProp("user"));

    TypedProp.Reference<Employee, Company> COMPANY = 
        TypedProp.reference(ImmutableType.get(Employee.class).getProp("company"));

    TypedProp.Scalar<Employee, String> COMPANY_ID = 
        TypedProp.scalar(ImmutableType.get(Employee.class).getProp("companyId"));

    TypedProp.Scalar<Employee, String> EMP_NAME = 
        TypedProp.scalar(ImmutableType.get(Employee.class).getProp("empName"));

    TypedProp.ReferenceList<Employee, Post> POSTS = 
        TypedProp.referenceList(ImmutableType.get(Employee.class).getProp("posts"));

    PropExpression.Str empCode();

    UserTable user();

    UserTable user(JoinType joinType);

    PropExpression.Str userId();

    CompanyTable company();

    CompanyTable company(JoinType joinType);

    PropExpression.Str companyId();

    PropExpression.Str empName();
}
