package top.yangwulang.platform.entity.sys;

import java.lang.Override;
import java.util.function.Consumer;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType;
import org.babyfish.jimmer.sql.fetcher.ListFieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = Post.class
)
public class PostFetcher extends AbstractTypedFetcher<Post, PostFetcher> {
    public static final PostFetcher $ = new PostFetcher(null);

    private PostFetcher(FetcherImpl<Post> base) {
        super(Post.class, base);
    }

    private PostFetcher(PostFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private PostFetcher(PostFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static PostFetcher $from(Fetcher<Post> base) {
        return base instanceof PostFetcher ? 
        	(PostFetcher)base : 
        	new PostFetcher((FetcherImpl<Post>)base);
    }

    @NewChain
    public PostFetcher postCode() {
        return add("postCode");
    }

    @NewChain
    public PostFetcher postCode(boolean enabled) {
        return enabled ? add("postCode") : remove("postCode");
    }

    @NewChain
    public PostFetcher postName() {
        return add("postName");
    }

    @NewChain
    public PostFetcher postName(boolean enabled) {
        return enabled ? add("postName") : remove("postName");
    }

    @NewChain
    public PostFetcher postType() {
        return add("postType");
    }

    @NewChain
    public PostFetcher postType(boolean enabled) {
        return enabled ? add("postType") : remove("postType");
    }

    @NewChain
    public PostFetcher employees() {
        return add("employees");
    }

    @NewChain
    public PostFetcher employees(boolean enabled) {
        return enabled ? add("employees") : remove("employees");
    }

    @NewChain
    public PostFetcher employees(Fetcher<Employee> childFetcher) {
        return add("employees", childFetcher);
    }

    @NewChain
    public PostFetcher employees(Fetcher<Employee> childFetcher,
            Consumer<ListFieldConfig<Employee, EmployeeTable>> fieldConfig) {
        return add("employees", childFetcher, fieldConfig);
    }

    @NewChain
    public PostFetcher employees(IdOnlyFetchType idOnlyFetchType) {
        return add("employees", idOnlyFetchType);
    }

    @Override
    protected PostFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new PostFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected PostFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new PostFetcher(this, prop, fieldConfig);
    }
}
