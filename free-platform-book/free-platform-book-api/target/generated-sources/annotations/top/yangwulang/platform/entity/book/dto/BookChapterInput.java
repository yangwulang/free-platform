package top.yangwulang.platform.entity.book.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.beans.ConstructorProperties;
import java.lang.Override;
import java.lang.String;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.StaticMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.book.BookChapter;
import top.yangwulang.platform.entity.book.BookChapterDraft;
import top.yangwulang.platform.entity.book.BookChapterFetcher;
import top.yangwulang.platform.entity.book.BookInfo;

public class BookChapterInput implements Input<BookChapter> {
    public static final StaticMetadata<BookChapter, BookChapterInput> METADATA = 
        new StaticMetadata<BookChapter, BookChapterInput>(
            BookChapterFetcher.$
                .chapterTitle()
                .fromPath()
                .book(),
            BookChapterInput::new
    );

    @Nullable
    @Null
    @Schema(
            description = "章节标题"
    )
    private final String chapterTitle;

    @Nullable
    @Null
    @Schema(
            description = "书籍来源"
    )
    private final String fromPath;

    @Nullable
    @Null
    @Schema(
            description = "书籍信息",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private final String bookId;

    @JsonCreator
    @ConstructorProperties({"chapterTitle", "fromPath", "bookId"})
    public BookChapterInput(@Nullable @Null @JsonProperty("chapterTitle") String chapterTitle,
            @Nullable @Null @JsonProperty("fromPath") String fromPath,
            @Nullable @Null @JsonProperty("bookId") String bookId) {
        this.chapterTitle = chapterTitle;
        this.fromPath = fromPath;
        this.bookId = bookId;
    }

    BookChapterInput(@NotNull BookChapter base) {
        // This constructor is not public so that the `@Argument` of spring-graphql can work, please use `of`
        ImmutableSpi spi = (ImmutableSpi)base;
        this.chapterTitle = spi.__isLoaded(2) ? base.chapterTitle() : null;
        this.fromPath = spi.__isLoaded(4) ? base.fromPath() : null;
        BookInfo _tmp_book = spi.__isLoaded(3) ? base.book() : null;
        this.bookId = _tmp_book != null ? _tmp_book.id() : null;
    }

    public static BookChapterInput of(@NotNull BookChapter base) {
        return new BookChapterInput(base);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public static Builder newBuilder(@Nullable BookChapterInput base) {
        return new Builder(base);
    }

    @Nullable
    @Null
    public String getChapterTitle() {
        return chapterTitle;
    }

    @Nullable
    @Null
    public String getFromPath() {
        return fromPath;
    }

    @Nullable
    @Null
    public String getBookId() {
        return bookId;
    }

    @Override
    public BookChapter toEntity() {
        return toEntity(null);
    }

    @Override
    public BookChapter toEntity(@Nullable BookChapter base) {
        return BookChapterDraft.$.produce(base, draft -> {
            draft.setChapterTitle(chapterTitle);
            draft.setFromPath(fromPath);
            if (bookId != null) {
                draft.setBook(targetDraft -> targetDraft.setId(bookId));
            } else {
                draft.setBook((BookInfo)null);
            }
        });
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("BookChapterInput{")
            .append("chapterTitle").append('=').append(chapterTitle)
            .append(", ")
            .append("fromPath").append('=').append(fromPath)
            .append(", ")
            .append("bookId").append('=').append(bookId)
            .append('}')
            .toString();
    }

    public static class Builder {
        private String chapterTitle;

        private String fromPath;

        private String bookId;

        Builder(BookChapterInput base) {
            if (base != null) {
                this.chapterTitle = base.getChapterTitle();
                this.fromPath = base.getFromPath();
                this.bookId = base.getBookId();
            }
        }

        @NotNull
        public Builder setChapterTitle(@Nullable String chapterTitle) {
            this.chapterTitle = chapterTitle;
            return this;
        }

        @NotNull
        public Builder setFromPath(@Nullable String fromPath) {
            this.fromPath = fromPath;
            return this;
        }

        @NotNull
        public Builder setBook(@Nullable String bookId) {
            this.bookId = bookId;
            return this;
        }

        @NotNull
        public BookChapterInput build() {
            return new BookChapterInput(
                chapterTitle,
                fromPath,
                bookId
            );
        }
    }
}
