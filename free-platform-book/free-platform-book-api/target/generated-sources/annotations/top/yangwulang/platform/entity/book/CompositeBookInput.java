package top.yangwulang.platform.entity.book;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.validation.constraints.Null;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CompositeBookInput implements Input<BookInfo> {
    @NotNull
    @javax.validation.constraints.NotNull
    private final String id;

    @NotNull
    @javax.validation.constraints.NotNull
    private final String bookName;

    @Nullable
    @Null
    private final String author;

    @Nullable
    @Null
    private final String describe;

    @Nullable
    @Null
    private final String status;

    @Nullable
    @Null
    private final String bookImgPath;

    @Nullable
    @Null
    private final String category;

    @Nullable
    @Null
    private final String bookFrom;

    @NotNull
    @javax.validation.constraints.NotNull
    private final List<TargetOf_chapters> chapters;

    @JsonCreator
    public CompositeBookInput(
            @NotNull @javax.validation.constraints.NotNull @JsonProperty(value = "id", required = true) String id,
            @NotNull @javax.validation.constraints.NotNull @JsonProperty(value = "bookName", required = true) String bookName,
            @Nullable @Null @JsonProperty("author") String author,
            @Nullable @Null @JsonProperty("describe") String describe,
            @Nullable @Null @JsonProperty("status") String status,
            @Nullable @Null @JsonProperty("bookImgPath") String bookImgPath,
            @Nullable @Null @JsonProperty("category") String category,
            @Nullable @Null @JsonProperty("bookFrom") String bookFrom,
            @NotNull @javax.validation.constraints.NotNull @JsonProperty(value = "chapters", required = true) List<TargetOf_chapters> chapters) {
        this.id = Objects.requireNonNull(id, "id");
        this.bookName = Objects.requireNonNull(bookName, "bookName");
        this.author = author;
        this.describe = describe;
        this.status = status;
        this.bookImgPath = bookImgPath;
        this.category = category;
        this.bookFrom = bookFrom;
        this.chapters = Objects.requireNonNull(chapters, "chapters");
    }

    CompositeBookInput(@NotNull BookInfo base) {
        ImmutableSpi spi = (ImmutableSpi)base;
        this.id = base.id();
        this.bookName = base.bookName();
        this.author = spi.__isLoaded(3) ? base.author() : null;
        this.describe = spi.__isLoaded(4) ? base.describe() : null;
        this.status = spi.__isLoaded(5) ? base.status() : null;
        this.bookImgPath = spi.__isLoaded(6) ? base.bookImgPath() : null;
        this.category = spi.__isLoaded(7) ? base.category() : null;
        this.bookFrom = spi.__isLoaded(8) ? base.bookFrom() : null;
        this.chapters = base.chapters().stream().map(TargetOf_chapters::new).collect(Collectors.toList());
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public static Builder newBuilder(@Nullable CompositeBookInput base) {
        return new Builder(base);
    }

    @NotNull
    @javax.validation.constraints.NotNull
    public String getId() {
        return id;
    }

    @NotNull
    @javax.validation.constraints.NotNull
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

    @NotNull
    @javax.validation.constraints.NotNull
    public List<TargetOf_chapters> getChapters() {
        return chapters;
    }

    @Override
    public BookInfo toEntity() {
        return toEntity(null);
    }

    public BookInfo toEntity(@Nullable BookInfo base) {
        return BookInfoDraft.$.produce(base, draft -> {
            draft.setId(id);
            draft.setBookName(bookName);
            draft.setAuthor(author);
            draft.setDescribe(describe);
            draft.setStatus(status);
            draft.setBookImgPath(bookImgPath);
            draft.setCategory(category);
            draft.setBookFrom(bookFrom);
            for (TargetOf_chapters __e : chapters) {
                draft.chapters(true).add((BookChapterDraft)__e.toEntity());
            }
        });
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("CompositeBookInput{")
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
            .append(", ")
            .append("chapters").append('=').append(chapters)
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

            private List<TargetOf_chapters> chapters;

            Builder(CompositeBookInput base) {
                if (base != null) {
                    this.id = base.getId();
                    this.bookName = base.getBookName();
                    this.author = base.getAuthor();
                    this.describe = base.getDescribe();
                    this.status = base.getStatus();
                    this.bookImgPath = base.getBookImgPath();
                    this.category = base.getCategory();
                    this.bookFrom = base.getBookFrom();
                    this.chapters = base.getChapters();
                }
            }

            @NotNull
            public Builder setId(@NotNull String id) {
                this.id = id;
                return this;
            }

            @NotNull
            public Builder setBookName(@NotNull String bookName) {
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
            public Builder setChapters(@NotNull List<TargetOf_chapters> chapters) {
                this.chapters = chapters;
                return this;
            }

            @NotNull
            public CompositeBookInput build() {
                if (id == null) {
                    throw new IllegalArgumentException("Property \"id\" has not been set");
                }
                if (bookName == null) {
                    throw new IllegalArgumentException("Property \"bookName\" has not been set");
                }
                if (chapters == null) {
                    throw new IllegalArgumentException("Property \"chapters\" has not been set");
                }
                return new CompositeBookInput(
                    id,
                    bookName,
                    author,
                    describe,
                    status,
                    bookImgPath,
                    category,
                    bookFrom,
                    chapters
                );
            }
        }

        public static class TargetOf_chapters {
            @Nullable
            @Null
            private final String id;

            @Nullable
            @Null
            private final String chapterTitle;

            @Nullable
            @Null
            private final String bookId;

            @Nullable
            @Null
            private final String fromPath;

            @JsonCreator
            public TargetOf_chapters(@Nullable @Null @JsonProperty("id") String id,
                    @Nullable @Null @JsonProperty("chapterTitle") String chapterTitle,
                    @Nullable @Null @JsonProperty("bookId") String bookId,
                    @Nullable @Null @JsonProperty("fromPath") String fromPath) {
                this.id = id;
                this.chapterTitle = chapterTitle;
                this.bookId = bookId;
                this.fromPath = fromPath;
            }

            TargetOf_chapters(@NotNull BookChapter base) {
                ImmutableSpi spi = (ImmutableSpi)base;
                this.id = spi.__isLoaded(1) ? base.id() : null;
                this.chapterTitle = spi.__isLoaded(2) ? base.chapterTitle() : null;
                BookInfo _tmpForbookId = spi.__isLoaded(3) ? base.book() : null;
                this.bookId = _tmpForbookId != null ? _tmpForbookId.id() : null;
                this.fromPath = spi.__isLoaded(4) ? base.fromPath() : null;
            }

            public static Builder newBuilder() {
                return new Builder(null);
            }

            public static Builder newBuilder(@Nullable TargetOf_chapters base) {
                return new Builder(base);
            }

            @Nullable
            @Null
            public String getId() {
                return id;
            }

            @Nullable
            @Null
            public String getChapterTitle() {
                return chapterTitle;
            }

            @Nullable
            @Null
            public String getBookId() {
                return bookId;
            }

            @Nullable
            @Null
            public String getFromPath() {
                return fromPath;
            }

            public BookChapter toEntity() {
                return toEntity(null);
            }

            public BookChapter toEntity(@Nullable BookChapter base) {
                return BookChapterDraft.$.produce(base, draft -> {
                    if (id != null) {
                        draft.setId(id);
                    }
                    draft.setChapterTitle(chapterTitle);
                    if (bookId != null) {
                        draft.setBook(targetDraft -> targetDraft.setId(bookId));
                    }
                    draft.setFromPath(fromPath);
                });
            }

            @Override
            public String toString() {
                return new StringBuilder()
                    .append("CompositeBookInput.TargetOf_chapters{")
                    .append("id").append('=').append(id)
                    .append(", ")
                    .append("chapterTitle").append('=').append(chapterTitle)
                    .append(", ")
                    .append("bookId").append('=').append(bookId)
                    .append(", ")
                    .append("fromPath").append('=').append(fromPath)
                    .append('}')
                    .toString();
                }

                public static class Builder {
                    private String id;

                    private String chapterTitle;

                    private String bookId;

                    private String fromPath;

                    Builder(TargetOf_chapters base) {
                        if (base != null) {
                            this.id = base.getId();
                            this.chapterTitle = base.getChapterTitle();
                            this.bookId = base.getBookId();
                            this.fromPath = base.getFromPath();
                        }
                    }

                    @NotNull
                    public Builder setId(@Nullable String id) {
                        this.id = id;
                        return this;
                    }

                    @NotNull
                    public Builder setChapterTitle(@Nullable String chapterTitle) {
                        this.chapterTitle = chapterTitle;
                        return this;
                    }

                    @NotNull
                    public Builder setBookId(@Nullable String bookId) {
                        this.bookId = bookId;
                        return this;
                    }

                    @NotNull
                    public Builder setFromPath(@Nullable String fromPath) {
                        this.fromPath = fromPath;
                        return this;
                    }

                    @NotNull
                    public TargetOf_chapters build() {
                        return new TargetOf_chapters(
                            id,
                            chapterTitle,
                            bookId,
                            fromPath
                        );
                    }
                }
            }
        }
