package top.yangwulang.platform.entity.sys;

import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.util.function.Function;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.ast.Predicate;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Post.class
)
public class PostTable extends AbstractTypedTable<Post> implements PostProps {
    public static final PostTable $ = new PostTable();

    public PostTable() {
        super(Post.class);
    }

    public PostTable(AbstractTypedTable.DelayedOperation<Post> delayedOperation) {
        super(Post.class, delayedOperation);
    }

    public PostTable(TableImplementor<Post> table) {
        super(table);
    }

    protected PostTable(PostTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Str id() {
        return __get(PostProps.ID.unwrap());
    }

    @Override
    public PropExpression.Str postCode() {
        return __get(PostProps.POST_CODE.unwrap());
    }

    @Override
    public PropExpression.Str postName() {
        return __get(PostProps.POST_NAME.unwrap());
    }

    @Override
    public PropExpression.Str postType() {
        return __get(PostProps.POST_TYPE.unwrap());
    }

    @Override
    public Predicate employees(Function<EmployeeTableEx, Predicate> block) {
        return exists(PostProps.EMPLOYEES.unwrap(), block);
    }

    @Override
    public PostTableEx asTableEx() {
        return new PostTableEx(this, null);
    }

    @Override
    public PostTable __disableJoin(String reason) {
        return new PostTable(this, reason);
    }

    @GeneratedBy(
            type = Post.class
    )
    public static class Remote extends AbstractTypedTable<Post> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Post.class, delayedOperation);
        }

        public Remote(TableImplementor<Post> table) {
            super(table);
        }

        public PropExpression.Str id() {
            return __get(PostProps.ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<Post> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
