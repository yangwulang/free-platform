package top.yangwulang.platform.entity.sys;

import java.lang.String;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;
import top.yangwulang.platform.entity.TypeBaseProps;

@GeneratedBy(
        type = Company.class
)
@PropsFor(Company.class)
public interface CompanyProps extends TypeBaseProps {
    TypedProp.Scalar<Company, String> ID = 
        TypedProp.scalar(ImmutableType.get(Company.class).getProp("id"));

    TypedProp.Reference<Company, Company> PARENT = 
        TypedProp.reference(ImmutableType.get(Company.class).getProp("parent"));

    TypedProp.Scalar<Company, String> PARENT_ID = 
        TypedProp.scalar(ImmutableType.get(Company.class).getProp("parentId"));

    TypedProp.ReferenceList<Company, Company> CHILDREN = 
        TypedProp.referenceList(ImmutableType.get(Company.class).getProp("children"));

    TypedProp.ReferenceList<Company, Employee> EMPLOYEES = 
        TypedProp.referenceList(ImmutableType.get(Company.class).getProp("employees"));

    TypedProp.Scalar<Company, String> COMPANY_CODE = 
        TypedProp.scalar(ImmutableType.get(Company.class).getProp("companyCode"));

    TypedProp.Scalar<Company, String> COMPANY_NAME = 
        TypedProp.scalar(ImmutableType.get(Company.class).getProp("companyName"));

    TypedProp.Scalar<Company, String> COMPANY_FULL_NAME = 
        TypedProp.scalar(ImmutableType.get(Company.class).getProp("companyFullName"));

    TypedProp.Scalar<Company, String> CORP_CODE = 
        TypedProp.scalar(ImmutableType.get(Company.class).getProp("corpCode"));

    TypedProp.Scalar<Company, String> CORP_NAME = 
        TypedProp.scalar(ImmutableType.get(Company.class).getProp("corpName"));

    CompanyTable parent();

    CompanyTable parent(JoinType joinType);

    PropExpression.Str parentId();

    Predicate children(Function<CompanyTableEx, Predicate> block);

    Predicate employees(Function<EmployeeTableEx, Predicate> block);

    PropExpression.Str companyCode();

    PropExpression.Str companyName();

    PropExpression.Str companyFullName();

    PropExpression.Str corpCode();

    PropExpression.Str corpName();
}
