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

public class ChapterContentFetcher extends AbstractTypedFetcher<ChapterContent, ChapterContentFetcher> {
    public static final ChapterContentFetcher $ = new ChapterContentFetcher(null);

    private ChapterContentFetcher(FetcherImpl<ChapterContent> base) {
        super(ChapterContent.class, base);
    }

    private ChapterContentFetcher(ChapterContentFetcher prev, ImmutableProp prop,
            boolean negative) {
        super(prev, prop, negative);
    }

    private ChapterContentFetcher(ChapterContentFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static ChapterContentFetcher $from(Fetcher<ChapterContent> base) {
        return base instanceof ChapterContentFetcher ? 
        	(ChapterContentFetcher)base : 
        	new ChapterContentFetcher((FetcherImpl<ChapterContent>)base);
    }

    @NewChain
    public ChapterContentFetcher chapter() {
        return add("chapter");
    }

    @NewChain
    public ChapterContentFetcher chapter(boolean enabled) {
        return enabled ? add("chapter") : remove("chapter");
    }

    @NewChain
    public ChapterContentFetcher chapter(Fetcher<BookChapter> childFetcher) {
        return add("chapter", childFetcher);
    }

    @NewChain
    public ChapterContentFetcher chapter(Fetcher<BookChapter> childFetcher,
            Consumer<FieldConfig<BookChapter, BookChapterTable>> fieldConfig) {
        return add("chapter", childFetcher, fieldConfig);
    }

    @NewChain
    public ChapterContentFetcher chapterContent() {
        return add("chapterContent");
    }

    @NewChain
    public ChapterContentFetcher chapterContent(boolean enabled) {
        return enabled ? add("chapterContent") : remove("chapterContent");
    }

    @Override
    protected ChapterContentFetcher createChildFetcher(ImmutableProp prop, boolean negative) {
        return new ChapterContentFetcher(this, prop, negative);
    }

    @Override
    protected ChapterContentFetcher createChildFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new ChapterContentFetcher(this, prop, fieldConfig);
    }
}
