package top.yangwulang.platform.entity.sys;

import java.lang.String;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.PropsFor;
import top.yangwulang.platform.entity.TypeBaseProps;

@GeneratedBy(
        type = Post.class
)
@PropsFor(Post.class)
public interface PostProps extends TypeBaseProps {
    TypedProp.Scalar<Post, String> ID = 
        TypedProp.scalar(ImmutableType.get(Post.class).getProp("id"));

    TypedProp.Scalar<Post, String> POST_CODE = 
        TypedProp.scalar(ImmutableType.get(Post.class).getProp("postCode"));

    TypedProp.Scalar<Post, String> POST_NAME = 
        TypedProp.scalar(ImmutableType.get(Post.class).getProp("postName"));

    TypedProp.Scalar<Post, String> POST_TYPE = 
        TypedProp.scalar(ImmutableType.get(Post.class).getProp("postType"));

    TypedProp.ReferenceList<Post, Employee> EMPLOYEES = 
        TypedProp.referenceList(ImmutableType.get(Post.class).getProp("employees"));

    PropExpression.Str postCode();

    PropExpression.Str postName();

    PropExpression.Str postType();

    Predicate employees(Function<EmployeeTableEx, Predicate> block);
}
