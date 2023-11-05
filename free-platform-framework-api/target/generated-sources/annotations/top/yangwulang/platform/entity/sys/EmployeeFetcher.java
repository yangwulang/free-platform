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
        type = Employee.class
)
public class EmployeeFetcher extends AbstractTypedFetcher<Employee, EmployeeFetcher> {
    public static final EmployeeFetcher $ = new EmployeeFetcher(null);

    private EmployeeFetcher(FetcherImpl<Employee> base) {
        super(Employee.class, base);
    }

    private EmployeeFetcher(EmployeeFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private EmployeeFetcher(EmployeeFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static EmployeeFetcher $from(Fetcher<Employee> base) {
        return base instanceof EmployeeFetcher ? 
        	(EmployeeFetcher)base : 
        	new EmployeeFetcher((FetcherImpl<Employee>)base);
    }

    @NewChain
    public EmployeeFetcher user() {
        return add("user");
    }

    @NewChain
    public EmployeeFetcher user(boolean enabled) {
        return enabled ? add("user") : remove("user");
    }

    @NewChain
    public EmployeeFetcher user(Fetcher<User> childFetcher) {
        return add("user", childFetcher);
    }

    @NewChain
    public EmployeeFetcher user(Fetcher<User> childFetcher,
            Consumer<FieldConfig<User, UserTable>> fieldConfig) {
        return add("user", childFetcher, fieldConfig);
    }

    @NewChain
    public EmployeeFetcher user(IdOnlyFetchType idOnlyFetchType) {
        return add("user", idOnlyFetchType);
    }

    @NewChain
    public EmployeeFetcher company() {
        return add("company");
    }

    @NewChain
    public EmployeeFetcher company(boolean enabled) {
        return enabled ? add("company") : remove("company");
    }

    @NewChain
    public EmployeeFetcher company(Fetcher<Company> childFetcher) {
        return add("company", childFetcher);
    }

    @NewChain
    public EmployeeFetcher company(Fetcher<Company> childFetcher,
            Consumer<FieldConfig<Company, CompanyTable>> fieldConfig) {
        return add("company", childFetcher, fieldConfig);
    }

    @NewChain
    public EmployeeFetcher company(IdOnlyFetchType idOnlyFetchType) {
        return add("company", idOnlyFetchType);
    }

    @NewChain
    public EmployeeFetcher companyId() {
        return add("companyId");
    }

    @NewChain
    public EmployeeFetcher companyId(boolean enabled) {
        return enabled ? add("companyId") : remove("companyId");
    }

    @NewChain
    public EmployeeFetcher companyId(IdOnlyFetchType idOnlyFetchType) {
        return add("companyId", idOnlyFetchType);
    }

    @NewChain
    public EmployeeFetcher empName() {
        return add("empName");
    }

    @NewChain
    public EmployeeFetcher empName(boolean enabled) {
        return enabled ? add("empName") : remove("empName");
    }

    @NewChain
    public EmployeeFetcher posts() {
        return add("posts");
    }

    @NewChain
    public EmployeeFetcher posts(boolean enabled) {
        return enabled ? add("posts") : remove("posts");
    }

    @NewChain
    public EmployeeFetcher posts(Fetcher<Post> childFetcher) {
        return add("posts", childFetcher);
    }

    @NewChain
    public EmployeeFetcher posts(Fetcher<Post> childFetcher,
            Consumer<ListFieldConfig<Post, PostTable>> fieldConfig) {
        return add("posts", childFetcher, fieldConfig);
    }

    @NewChain
    public EmployeeFetcher posts(IdOnlyFetchType idOnlyFetchType) {
        return add("posts", idOnlyFetchType);
    }

    @Override
    protected EmployeeFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new EmployeeFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected EmployeeFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new EmployeeFetcher(this, prop, fieldConfig);
    }
}
