package top.yangwulang.platform.entity.book;

import java.lang.Override;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

public class BookCategoryFetcher extends AbstractTypedFetcher<BookCategory, BookCategoryFetcher> {
    public static final BookCategoryFetcher $ = new BookCategoryFetcher(null);

    private BookCategoryFetcher(FetcherImpl<BookCategory> base) {
        super(BookCategory.class, base);
    }

    private BookCategoryFetcher(BookCategoryFetcher prev, ImmutableProp prop, boolean negative) {
        super(prev, prop, negative);
    }

    private BookCategoryFetcher(BookCategoryFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static BookCategoryFetcher $from(Fetcher<BookCategory> base) {
        return base instanceof BookCategoryFetcher ? 
        	(BookCategoryFetcher)base : 
        	new BookCategoryFetcher((FetcherImpl<BookCategory>)base);
    }

    @NewChain
    public BookCategoryFetcher categoryName() {
        return add("categoryName");
    }

    @NewChain
    public BookCategoryFetcher categoryName(boolean enabled) {
        return enabled ? add("categoryName") : remove("categoryName");
    }

    @Override
    protected BookCategoryFetcher createChildFetcher(ImmutableProp prop, boolean negative) {
        return new BookCategoryFetcher(this, prop, negative);
    }

    @Override
    protected BookCategoryFetcher createChildFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new BookCategoryFetcher(this, prop, fieldConfig);
    }
}
