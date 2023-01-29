package top.yangwulang.platform.entity.book;

import java.lang.Override;
import java.util.function.Consumer;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

public class BookChapterFetcher extends AbstractTypedFetcher<BookChapter, BookChapterFetcher> {
    public static final BookChapterFetcher $ = new BookChapterFetcher(null);

    private BookChapterFetcher(FetcherImpl<BookChapter> base) {
        super(BookChapter.class, base);
    }

    private BookChapterFetcher(BookChapterFetcher prev, ImmutableProp prop, boolean negative) {
        super(prev, prop, negative);
    }

    private BookChapterFetcher(BookChapterFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static BookChapterFetcher $from(Fetcher<BookChapter> base) {
        return base instanceof BookChapterFetcher ? 
        	(BookChapterFetcher)base : 
        	new BookChapterFetcher((FetcherImpl<BookChapter>)base);
    }

    @NewChain
    public BookChapterFetcher chapterTitle() {
        return add("chapterTitle");
    }

    @NewChain
    public BookChapterFetcher chapterTitle(boolean enabled) {
        return enabled ? add("chapterTitle") : remove("chapterTitle");
    }

    @NewChain
    public BookChapterFetcher book() {
        return add("book");
    }

    @NewChain
    public BookChapterFetcher book(boolean enabled) {
        return enabled ? add("book") : remove("book");
    }

    @NewChain
    public BookChapterFetcher book(Fetcher<BookInfo> childFetcher) {
        return add("book", childFetcher);
    }

    @NewChain
    public BookChapterFetcher book(Fetcher<BookInfo> childFetcher,
            Consumer<FieldConfig<BookInfo, BookInfoTable>> fieldConfig) {
        return add("book", childFetcher, fieldConfig);
    }

    @NewChain
    public BookChapterFetcher fromPath() {
        return add("fromPath");
    }

    @NewChain
    public BookChapterFetcher fromPath(boolean enabled) {
        return enabled ? add("fromPath") : remove("fromPath");
    }

    @Override
    protected BookChapterFetcher createChildFetcher(ImmutableProp prop, boolean negative) {
        return new BookChapterFetcher(this, prop, negative);
    }

    @Override
    protected BookChapterFetcher createChildFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new BookChapterFetcher(this, prop, fieldConfig);
    }
}
