package top.yangwulang.platform.entity.book;

import java.lang.Override;
import java.util.function.Consumer;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.ListFieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

public class BookInfoFetcher extends AbstractTypedFetcher<BookInfo, BookInfoFetcher> {
    public static final BookInfoFetcher $ = new BookInfoFetcher(null);

    private BookInfoFetcher(FetcherImpl<BookInfo> base) {
        super(BookInfo.class, base);
    }

    private BookInfoFetcher(BookInfoFetcher prev, ImmutableProp prop, boolean negative) {
        super(prev, prop, negative);
    }

    private BookInfoFetcher(BookInfoFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static BookInfoFetcher $from(Fetcher<BookInfo> base) {
        return base instanceof BookInfoFetcher ? 
        	(BookInfoFetcher)base : 
        	new BookInfoFetcher((FetcherImpl<BookInfo>)base);
    }

    @NewChain
    public BookInfoFetcher bookName() {
        return add("bookName");
    }

    @NewChain
    public BookInfoFetcher bookName(boolean enabled) {
        return enabled ? add("bookName") : remove("bookName");
    }

    @NewChain
    public BookInfoFetcher author() {
        return add("author");
    }

    @NewChain
    public BookInfoFetcher author(boolean enabled) {
        return enabled ? add("author") : remove("author");
    }

    @NewChain
    public BookInfoFetcher describe() {
        return add("describe");
    }

    @NewChain
    public BookInfoFetcher describe(boolean enabled) {
        return enabled ? add("describe") : remove("describe");
    }

    @NewChain
    public BookInfoFetcher status() {
        return add("status");
    }

    @NewChain
    public BookInfoFetcher status(boolean enabled) {
        return enabled ? add("status") : remove("status");
    }

    @NewChain
    public BookInfoFetcher bookImgPath() {
        return add("bookImgPath");
    }

    @NewChain
    public BookInfoFetcher bookImgPath(boolean enabled) {
        return enabled ? add("bookImgPath") : remove("bookImgPath");
    }

    @NewChain
    public BookInfoFetcher category() {
        return add("category");
    }

    @NewChain
    public BookInfoFetcher category(boolean enabled) {
        return enabled ? add("category") : remove("category");
    }

    @NewChain
    public BookInfoFetcher bookFrom() {
        return add("bookFrom");
    }

    @NewChain
    public BookInfoFetcher bookFrom(boolean enabled) {
        return enabled ? add("bookFrom") : remove("bookFrom");
    }

    @NewChain
    public BookInfoFetcher chapters() {
        return add("chapters");
    }

    @NewChain
    public BookInfoFetcher chapters(boolean enabled) {
        return enabled ? add("chapters") : remove("chapters");
    }

    @NewChain
    public BookInfoFetcher chapters(Fetcher<BookChapter> childFetcher) {
        return add("chapters", childFetcher);
    }

    @NewChain
    public BookInfoFetcher chapters(Fetcher<BookChapter> childFetcher,
            Consumer<ListFieldConfig<BookChapter, BookChapterTable>> fieldConfig) {
        return add("chapters", childFetcher, fieldConfig);
    }

    @Override
    protected BookInfoFetcher createChildFetcher(ImmutableProp prop, boolean negative) {
        return new BookInfoFetcher(this, prop, negative);
    }

    @Override
    protected BookInfoFetcher createChildFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new BookInfoFetcher(this, prop, fieldConfig);
    }
}
