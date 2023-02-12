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
import top.yangwulang.platform.entity.book.BookInfo;
import top.yangwulang.platform.entity.book.BookInfoDraft;
import top.yangwulang.platform.entity.book.BookInfoFetcher;

public class BookInfoInput implements Input<BookInfo> {
    public static final StaticMetadata<BookInfo, BookInfoInput> METADATA = 
        new StaticMetadata<BookInfo, BookInfoInput>(
            BookInfoFetcher.$
                .bookName()
                .author()
                .describe()
                .status()
                .bookImgPath()
                .category()
                .bookFrom(),
            BookInfoInput::new
    );

    @Nullable
    @Null
    @Schema(
            description = "书籍信息主键"
    )
    private final String id;

    @Nullable
    @Null
    @Schema(
            description = "书籍名称"
    )
    private final String bookName;

    @Nullable
    @Null
    @Schema(
            description = "书籍作者"
    )
    private final String author;

    @Nullable
    @Null
    @Schema(
            description = "描述"
    )
    private final String describe;

    @Nullable
    @Null
    @Schema(
            description = "书籍状态"
    )
    private final String status;

    @Nullable
    @Null
    @Schema(
            description = "书籍地址"
    )
    private final String bookImgPath;

    @Nullable
    @Null
    @Schema(
            description = "书籍分类"
    )
    private final String category;

    @Nullable
    @Null
    @Schema(
            description = "书籍来源"
    )
    private final String bookFrom;

    @JsonCreator
    @ConstructorProperties({"id", "bookName", "author", "describe", "status", "bookImgPath", "category", "bookFrom"})
    public BookInfoInput(@Nullable @Null @JsonProperty("id") String id,
            @Nullable @Null @JsonProperty("bookName") String bookName,
            @Nullable @Null @JsonProperty("author") String author,
            @Nullable @Null @JsonProperty("describe") String describe,
            @Nullable @Null @JsonProperty("status") String status,
            @Nullable @Null @JsonProperty("bookImgPath") String bookImgPath,
            @Nullable @Null @JsonProperty("category") String category,
            @Nullable @Null @JsonProperty("bookFrom") String bookFrom) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.describe = describe;
        this.status = status;
        this.bookImgPath = bookImgPath;
        this.category = category;
        this.bookFrom = bookFrom;
    }

    BookInfoInput(@NotNull BookInfo base) {
        // This constructor is not public so that the `@Argument` of spring-graphql can work, please use `of`
        ImmutableSpi spi = (ImmutableSpi)base;
        this.id = spi.__isLoaded(1) ? base.id() : null;
        this.bookName = spi.__isLoaded(2) ? base.bookName() : null;
        this.author = spi.__isLoaded(3) ? base.author() : null;
        this.describe = spi.__isLoaded(4) ? base.describe() : null;
        this.status = spi.__isLoaded(5) ? base.status() : null;
        this.bookImgPath = spi.__isLoaded(6) ? base.bookImgPath() : null;
        this.category = spi.__isLoaded(7) ? base.category() : null;
        this.bookFrom = spi.__isLoaded(8) ? base.bookFrom() : null;
    }

    public static BookInfoInput of(@NotNull BookInfo base) {
        return new BookInfoInput(base);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public static Builder newBuilder(@Nullable BookInfoInput base) {
        return new Builder(base);
    }

    @Nullable
    @Null
    public String getId() {
        return id;
    }

    @Nullable
    @Null
    public String getBookName() {
        return bookName;
    }

    @Nullable
    @Null
    public String getAuthor() {
        return author;
    }

    @Nullable
    @Null
    public String getDescribe() {
        return describe;
    }

    @Nullable
    @Null
    public String getStatus() {
        return status;
    }

    @Nullable
    @Null
    public String getBookImgPath() {
        return bookImgPath;
    }

    @Nullable
    @Null
    public String getCategory() {
        return category;
    }

    @Nullable
    @Null
    public String getBookFrom() {
        return bookFrom;
    }

    @Override
    public BookInfo toEntity() {
        return toEntity(null);
    }

    @Override
    public BookInfo toEntity(@Nullable BookInfo base) {
        return BookInfoDraft.$.produce(base, draft -> {
            if (id != null) {
                draft.setId(id);
            }
            draft.setBookName(bookName);
            draft.setAuthor(author);
            draft.setDescribe(describe);
            draft.setStatus(status);
            draft.setBookImgPath(bookImgPath);
            draft.setCategory(category);
            draft.setBookFrom(bookFrom);
        });
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("BookInfoInput{")
            .append("id").append('=').append(id)
            .append(", ")
            .append("bookName").append('=').append(bookName)
            .append(", ")
            .append("author").append('=').append(author)
            .append(", ")
            .append("describe").append('=').append(describe)
            .append(", ")
            .append("status").append('=').append(status)
            .append(", ")
            .append("bookImgPath").append('=').append(bookImgPath)
            .append(", ")
            .append("category").append('=').append(category)
            .append(", ")
            .append("bookFrom").append('=').append(bookFrom)
            .append('}')
            .toString();
    }

    public static class Builder {
        private String id;

        private String bookName;

        private String author;

        private String describe;

        private String status;

        private String bookImgPath;

        private String category;

        private String bookFrom;

        Builder(BookInfoInput base) {
            if (base != null) {
                this.id = base.getId();
                this.bookName = base.getBookName();
                this.author = base.getAuthor();
                this.describe = base.getDescribe();
                this.status = base.getStatus();
                this.bookImgPath = base.getBookImgPath();
                this.category = base.getCategory();
                this.bookFrom = base.getBookFrom();
            }
        }

        @NotNull
        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        @NotNull
        public Builder setBookName(@Nullable String bookName) {
            this.bookName = bookName;
            return this;
        }

        @NotNull
        public Builder setAuthor(@Nullable String author) {
            this.author = author;
            return this;
        }

        @NotNull
        public Builder setDescribe(@Nullable String describe) {
            this.describe = describe;
            return this;
        }

        @NotNull
        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        @NotNull
        public Builder setBookImgPath(@Nullable String bookImgPath) {
            this.bookImgPath = bookImgPath;
            return this;
        }

        @NotNull
        public Builder setCategory(@Nullable String category) {
            this.category = category;
            return this;
        }

        @NotNull
        public Builder setBookFrom(@Nullable String bookFrom) {
            this.bookFrom = bookFrom;
            return this;
        }

        @NotNull
        public BookInfoInput build() {
            return new BookInfoInput(
                id,
                bookName,
                author,
                describe,
                status,
                bookImgPath,
                category,
                bookFrom
            );
        }
    }
}
