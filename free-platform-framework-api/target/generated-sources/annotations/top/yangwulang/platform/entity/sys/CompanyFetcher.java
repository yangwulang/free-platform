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
import org.babyfish.jimmer.sql.fetcher.RecursiveFieldConfig;
import org.babyfish.jimmer.sql.fetcher.RecursiveListFieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = Company.class
)
public class CompanyFetcher extends AbstractTypedFetcher<Company, CompanyFetcher> {
    public static final CompanyFetcher $ = new CompanyFetcher(null);

    private CompanyFetcher(FetcherImpl<Company> base) {
        super(Company.class, base);
    }

    private CompanyFetcher(CompanyFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private CompanyFetcher(CompanyFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static CompanyFetcher $from(Fetcher<Company> base) {
        return base instanceof CompanyFetcher ? 
        	(CompanyFetcher)base : 
        	new CompanyFetcher((FetcherImpl<Company>)base);
    }

    @NewChain
    public CompanyFetcher parent() {
        return add("parent");
    }

    @NewChain
    public CompanyFetcher parent(boolean enabled) {
        return enabled ? add("parent") : remove("parent");
    }

    @NewChain
    public CompanyFetcher parent(Fetcher<Company> childFetcher) {
        return add("parent", childFetcher);
    }

    @NewChain
    public CompanyFetcher parent(Fetcher<Company> childFetcher,
            Consumer<RecursiveFieldConfig<Company, CompanyTable>> fieldConfig) {
        return add("parent", childFetcher, fieldConfig);
    }

    @NewChain
    public CompanyFetcher parent(IdOnlyFetchType idOnlyFetchType) {
        return add("parent", idOnlyFetchType);
    }

    @NewChain
    public CompanyFetcher parentId() {
        return add("parentId");
    }

    @NewChain
    public CompanyFetcher parentId(boolean enabled) {
        return enabled ? add("parentId") : remove("parentId");
    }

    @NewChain
    public CompanyFetcher parentId(IdOnlyFetchType idOnlyFetchType) {
        return add("parentId", idOnlyFetchType);
    }

    @NewChain
    public CompanyFetcher children() {
        return add("children");
    }

    @NewChain
    public CompanyFetcher children(boolean enabled) {
        return enabled ? add("children") : remove("children");
    }

    @NewChain
    public CompanyFetcher children(Fetcher<Company> childFetcher) {
        return add("children", childFetcher);
    }

    @NewChain
    public CompanyFetcher children(Fetcher<Company> childFetcher,
            Consumer<RecursiveListFieldConfig<Company, CompanyTable>> fieldConfig) {
        return add("children", childFetcher, fieldConfig);
    }

    @NewChain
    public CompanyFetcher employees() {
        return add("employees");
    }

    @NewChain
    public CompanyFetcher employees(boolean enabled) {
        return enabled ? add("employees") : remove("employees");
    }

    @NewChain
    public CompanyFetcher employees(Fetcher<Employee> childFetcher) {
        return add("employees", childFetcher);
    }

    @NewChain
    public CompanyFetcher employees(Fetcher<Employee> childFetcher,
            Consumer<ListFieldConfig<Employee, EmployeeTable>> fieldConfig) {
        return add("employees", childFetcher, fieldConfig);
    }

    @NewChain
    public CompanyFetcher companyCode() {
        return add("companyCode");
    }

    @NewChain
    public CompanyFetcher companyCode(boolean enabled) {
        return enabled ? add("companyCode") : remove("companyCode");
    }

    @NewChain
    public CompanyFetcher companyName() {
        return add("companyName");
    }

    @NewChain
    public CompanyFetcher companyName(boolean enabled) {
        return enabled ? add("companyName") : remove("companyName");
    }

    @NewChain
    public CompanyFetcher companyFullName() {
        return add("companyFullName");
    }

    @NewChain
    public CompanyFetcher companyFullName(boolean enabled) {
        return enabled ? add("companyFullName") : remove("companyFullName");
    }

    @NewChain
    public CompanyFetcher corpCode() {
        return add("corpCode");
    }

    @NewChain
    public CompanyFetcher corpCode(boolean enabled) {
        return enabled ? add("corpCode") : remove("corpCode");
    }

    @NewChain
    public CompanyFetcher corpName() {
        return add("corpName");
    }

    @NewChain
    public CompanyFetcher corpName(boolean enabled) {
        return enabled ? add("corpName") : remove("corpName");
    }

    @Override
    protected CompanyFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new CompanyFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected CompanyFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new CompanyFetcher(this, prop, fieldConfig);
    }
}
