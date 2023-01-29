package top.yangwulang.platform.entity.book;

import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.babyfish.jimmer.CircularReferenceException;
import org.babyfish.jimmer.Draft;
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
import org.babyfish.jimmer.jackson.ImmutableModuleRequiredException;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.runtime.DraftContext;
import org.babyfish.jimmer.runtime.DraftSpi;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.runtime.Internal;
import org.babyfish.jimmer.runtime.NonSharedList;
import org.babyfish.jimmer.sql.OneToMany;

public interface BookInfoDraft extends BookInfo, Draft {
    BookInfoDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    BookInfoDraft setId(String id);

    @OldChain
    BookInfoDraft setBookName(String bookName);

    @OldChain
    BookInfoDraft setAuthor(String author);

    @OldChain
    BookInfoDraft setDescribe(String describe);

    @OldChain
    BookInfoDraft setStatus(String status);

    @OldChain
    BookInfoDraft setBookImgPath(String bookImgPath);

    @OldChain
    BookInfoDraft setCategory(String category);

    @OldChain
    BookInfoDraft setBookFrom(String bookFrom);

    List<BookChapterDraft> chapters(boolean autoCreate);

    @OldChain
    BookInfoDraft setChapters(List<BookChapter> chapters);

    @OldChain
    BookInfoDraft addIntoChapters(DraftConsumer<BookChapterDraft> block);

    @OldChain
    BookInfoDraft addIntoChapters(BookChapter base, DraftConsumer<BookChapterDraft> block);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                BookInfo.class,
                null,
                (ctx, base) -> new DraftImpl(ctx, (BookInfo)base)
            )
            .id(1, "id", String.class)
            .add(2, "bookName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(3, "author", ImmutablePropCategory.SCALAR, String.class, true)
            .add(4, "describe", ImmutablePropCategory.SCALAR, String.class, true)
            .add(5, "status", ImmutablePropCategory.SCALAR, String.class, true)
            .add(6, "bookImgPath", ImmutablePropCategory.SCALAR, String.class, true)
            .add(7, "category", ImmutablePropCategory.SCALAR, String.class, true)
            .add(8, "bookFrom", ImmutablePropCategory.SCALAR, String.class, true)
            .add(9, "chapters", OneToMany.class, BookChapter.class, false)
            .build();

        private Producer() {
        }

        public BookInfo produce(DraftConsumer<BookInfoDraft> block) {
            return produce(null, block);
        }

        public BookInfo produce(BookInfo base, DraftConsumer<BookInfoDraft> block) {
            return (BookInfo)Internal.produce(TYPE, base, block);
        }

        public abstract static class Implementor implements BookInfo, ImmutableSpi {
            @Override
            public Object __get(int prop) {
                switch (prop) {
                    case 1: return id();
                    case 2: return bookName();
                    case 3: return author();
                    case 4: return describe();
                    case 5: return status();
                    case 6: return bookImgPath();
                    case 7: return category();
                    case 8: return bookFrom();
                    case 9: return chapters();
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public Object __get(String prop) {
                switch (prop) {
                    case "id": return id();
                    case "bookName": return bookName();
                    case "author": return author();
                    case "describe": return describe();
                    case "status": return status();
                    case "bookImgPath": return bookImgPath();
                    case "category": return category();
                    case "bookFrom": return bookFrom();
                    case "chapters": return chapters();
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public ImmutableType __type() {
                return TYPE;
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString(this);
            }

            public int getDummyPropForJacksonError__() {
                throw new ImmutableModuleRequiredException();
            }
        }

        private static class Impl extends Implementor implements Cloneable {
            String id;

            String bookName;

            String author;

            boolean authorLoaded = false;

            String describe;

            boolean describeLoaded = false;

            String status;

            boolean statusLoaded = false;

            String bookImgPath;

            boolean bookImgPathLoaded = false;

            String category;

            boolean categoryLoaded = false;

            String bookFrom;

            boolean bookFromLoaded = false;

            NonSharedList<BookChapter> chapters;

            @Override
            public String id() {
                if (id == null) {
                    throw new UnloadedException(BookInfo.class, "id");
                }
                return id;
            }

            @Override
            public String bookName() {
                if (bookName == null) {
                    throw new UnloadedException(BookInfo.class, "bookName");
                }
                return bookName;
            }

            @Override
            public String author() {
                if (!authorLoaded) {
                    throw new UnloadedException(BookInfo.class, "author");
                }
                return author;
            }

            @Override
            public String describe() {
                if (!describeLoaded) {
                    throw new UnloadedException(BookInfo.class, "describe");
                }
                return describe;
            }

            @Override
            public String status() {
                if (!statusLoaded) {
                    throw new UnloadedException(BookInfo.class, "status");
                }
                return status;
            }

            @Override
            public String bookImgPath() {
                if (!bookImgPathLoaded) {
                    throw new UnloadedException(BookInfo.class, "bookImgPath");
                }
                return bookImgPath;
            }

            @Override
            public String category() {
                if (!categoryLoaded) {
                    throw new UnloadedException(BookInfo.class, "category");
                }
                return category;
            }

            @Override
            public String bookFrom() {
                if (!bookFromLoaded) {
                    throw new UnloadedException(BookInfo.class, "bookFrom");
                }
                return bookFrom;
            }

            @Override
            public List<BookChapter> chapters() {
                if (chapters == null) {
                    throw new UnloadedException(BookInfo.class, "chapters");
                }
                return chapters;
            }

            @Override
            public Impl clone() {
                try {
                    return (Impl)super.clone();
                } catch(CloneNotSupportedException ex) {
                    throw new AssertionError(ex);
                }
            }

            @Override
            public boolean __isLoaded(int prop) {
                switch (prop) {
                    case 1: return id != null;
                    case 2: return bookName != null;
                    case 3: return authorLoaded;
                    case 4: return describeLoaded;
                    case 5: return statusLoaded;
                    case 6: return bookImgPathLoaded;
                    case 7: return categoryLoaded;
                    case 8: return bookFromLoaded;
                    case 9: return chapters != null;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id": return id != null;
                    case "bookName": return bookName != null;
                    case "author": return authorLoaded;
                    case "describe": return describeLoaded;
                    case "status": return statusLoaded;
                    case "bookImgPath": return bookImgPathLoaded;
                    case "category": return categoryLoaded;
                    case "bookFrom": return bookFromLoaded;
                    case "chapters": return chapters != null;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public int hashCode() {
                int hash = 1;
                if (id != null) {
                    hash = 31 * hash + id.hashCode();
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (bookName != null) {
                    hash = 31 * hash + bookName.hashCode();
                }
                if (authorLoaded && author != null) {
                    hash = 31 * hash + author.hashCode();
                }
                if (describeLoaded && describe != null) {
                    hash = 31 * hash + describe.hashCode();
                }
                if (statusLoaded && status != null) {
                    hash = 31 * hash + status.hashCode();
                }
                if (bookImgPathLoaded && bookImgPath != null) {
                    hash = 31 * hash + bookImgPath.hashCode();
                }
                if (categoryLoaded && category != null) {
                    hash = 31 * hash + category.hashCode();
                }
                if (bookFromLoaded && bookFrom != null) {
                    hash = 31 * hash + bookFrom.hashCode();
                }
                if (chapters != null) {
                    hash = 31 * hash + chapters.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = 1;
                if (id != null) {
                    hash = 31 * hash + System.identityHashCode(id);
                }
                if (bookName != null) {
                    hash = 31 * hash + System.identityHashCode(bookName);
                }
                if (authorLoaded) {
                    hash = 31 * hash + System.identityHashCode(author);
                }
                if (describeLoaded) {
                    hash = 31 * hash + System.identityHashCode(describe);
                }
                if (statusLoaded) {
                    hash = 31 * hash + System.identityHashCode(status);
                }
                if (bookImgPathLoaded) {
                    hash = 31 * hash + System.identityHashCode(bookImgPath);
                }
                if (categoryLoaded) {
                    hash = 31 * hash + System.identityHashCode(category);
                }
                if (bookFromLoaded) {
                    hash = 31 * hash + System.identityHashCode(bookFrom);
                }
                if (chapters != null) {
                    hash = 31 * hash + System.identityHashCode(chapters);
                }
                return hash;
            }

            @Override
            public int __hashCode(boolean shallow) {
                return shallow ? __shallowHashCode() : hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor other = (Implementor)obj;
                boolean __idLoaded = id != null;
                if (__idLoaded != other.__isLoaded(1)) {
                    return false;
                }
                if (__idLoaded) {
                    // If entity-id is loaded, return directly
                    return Objects.equals(id, other.id());
                }
                boolean __bookNameLoaded = bookName != null;
                if (__bookNameLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__bookNameLoaded && !Objects.equals(bookName, other.bookName())) {
                    return false;
                }
                boolean __authorLoaded = authorLoaded;
                if (__authorLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__authorLoaded && !Objects.equals(author, other.author())) {
                    return false;
                }
                boolean __describeLoaded = describeLoaded;
                if (__describeLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__describeLoaded && !Objects.equals(describe, other.describe())) {
                    return false;
                }
                boolean __statusLoaded = statusLoaded;
                if (__statusLoaded != other.__isLoaded(5)) {
                    return false;
                }
                if (__statusLoaded && !Objects.equals(status, other.status())) {
                    return false;
                }
                boolean __bookImgPathLoaded = bookImgPathLoaded;
                if (__bookImgPathLoaded != other.__isLoaded(6)) {
                    return false;
                }
                if (__bookImgPathLoaded && !Objects.equals(bookImgPath, other.bookImgPath())) {
                    return false;
                }
                boolean __categoryLoaded = categoryLoaded;
                if (__categoryLoaded != other.__isLoaded(7)) {
                    return false;
                }
                if (__categoryLoaded && !Objects.equals(category, other.category())) {
                    return false;
                }
                boolean __bookFromLoaded = bookFromLoaded;
                if (__bookFromLoaded != other.__isLoaded(8)) {
                    return false;
                }
                if (__bookFromLoaded && !Objects.equals(bookFrom, other.bookFrom())) {
                    return false;
                }
                boolean __chaptersLoaded = chapters != null;
                if (__chaptersLoaded != other.__isLoaded(9)) {
                    return false;
                }
                if (__chaptersLoaded && !Objects.equals(chapters, other.chapters())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor other = (Implementor)obj;
                boolean __idLoaded = id != null;
                if (__idLoaded != other.__isLoaded(1)) {
                    return false;
                }
                if (__idLoaded && id != other.id()) {
                    return false;
                }
                boolean __bookNameLoaded = bookName != null;
                if (__bookNameLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__bookNameLoaded && bookName != other.bookName()) {
                    return false;
                }
                boolean __authorLoaded = authorLoaded;
                if (__authorLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__authorLoaded && author != other.author()) {
                    return false;
                }
                boolean __describeLoaded = describeLoaded;
                if (__describeLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__describeLoaded && describe != other.describe()) {
                    return false;
                }
                boolean __statusLoaded = statusLoaded;
                if (__statusLoaded != other.__isLoaded(5)) {
                    return false;
                }
                if (__statusLoaded && status != other.status()) {
                    return false;
                }
                boolean __bookImgPathLoaded = bookImgPathLoaded;
                if (__bookImgPathLoaded != other.__isLoaded(6)) {
                    return false;
                }
                if (__bookImgPathLoaded && bookImgPath != other.bookImgPath()) {
                    return false;
                }
                boolean __categoryLoaded = categoryLoaded;
                if (__categoryLoaded != other.__isLoaded(7)) {
                    return false;
                }
                if (__categoryLoaded && category != other.category()) {
                    return false;
                }
                boolean __bookFromLoaded = bookFromLoaded;
                if (__bookFromLoaded != other.__isLoaded(8)) {
                    return false;
                }
                if (__bookFromLoaded && bookFrom != other.bookFrom()) {
                    return false;
                }
                boolean __chaptersLoaded = chapters != null;
                if (__chaptersLoaded != other.__isLoaded(9)) {
                    return false;
                }
                if (__chaptersLoaded && chapters != other.chapters()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }
        }

        private static class DraftImpl extends Implementor implements DraftSpi, BookInfoDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, BookInfo base) {
                __ctx = ctx;
                if (base != null) {
                    __base = (Impl)base;
                }
                else {
                    __base = new Impl();
                }
            }

            @Override
            public boolean __isLoaded(int prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isLoaded(String prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public int hashCode() {
                return (__modified!= null ? __modified : __base).hashCode();
            }

            @Override
            public int __hashCode(boolean shallow) {
                return (__modified!= null ? __modified : __base).__hashCode(shallow);
            }

            @Override
            public boolean equals(Object obj) {
                return (__modified!= null ? __modified : __base).equals(obj);
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return (__modified!= null ? __modified : __base).__equals(obj, shallow);
            }

            @Override
            public String id() {
                return (__modified!= null ? __modified : __base).id();
            }

            @Override
            public BookInfoDraft setId(String id) {
                if (id == null) {
                    throw new IllegalArgumentException(
                        "'id' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl modified = __modified();
                modified.id = id;
                return this;
            }

            @Override
            public String bookName() {
                return (__modified!= null ? __modified : __base).bookName();
            }

            @Override
            public BookInfoDraft setBookName(String bookName) {
                if (bookName == null) {
                    throw new IllegalArgumentException(
                        "'bookName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl modified = __modified();
                modified.bookName = bookName;
                return this;
            }

            @Override
            public String author() {
                return (__modified!= null ? __modified : __base).author();
            }

            @Override
            public BookInfoDraft setAuthor(String author) {
                Impl modified = __modified();
                modified.author = author;
                modified.authorLoaded = true;
                return this;
            }

            @Override
            public String describe() {
                return (__modified!= null ? __modified : __base).describe();
            }

            @Override
            public BookInfoDraft setDescribe(String describe) {
                Impl modified = __modified();
                modified.describe = describe;
                modified.describeLoaded = true;
                return this;
            }

            @Override
            public String status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public BookInfoDraft setStatus(String status) {
                Impl modified = __modified();
                modified.status = status;
                modified.statusLoaded = true;
                return this;
            }

            @Override
            public String bookImgPath() {
                return (__modified!= null ? __modified : __base).bookImgPath();
            }

            @Override
            public BookInfoDraft setBookImgPath(String bookImgPath) {
                Impl modified = __modified();
                modified.bookImgPath = bookImgPath;
                modified.bookImgPathLoaded = true;
                return this;
            }

            @Override
            public String category() {
                return (__modified!= null ? __modified : __base).category();
            }

            @Override
            public BookInfoDraft setCategory(String category) {
                Impl modified = __modified();
                modified.category = category;
                modified.categoryLoaded = true;
                return this;
            }

            @Override
            public String bookFrom() {
                return (__modified!= null ? __modified : __base).bookFrom();
            }

            @Override
            public BookInfoDraft setBookFrom(String bookFrom) {
                Impl modified = __modified();
                modified.bookFrom = bookFrom;
                modified.bookFromLoaded = true;
                return this;
            }

            @Override
            public List<BookChapter> chapters() {
                return __ctx.toDraftList((__modified!= null ? __modified : __base).chapters(), BookChapter.class, true);
            }

            @Override
            public List<BookChapterDraft> chapters(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(9) || chapters() == null)) {
                    setChapters(new ArrayList<>());
                }
                return __ctx.toDraftList((__modified!= null ? __modified : __base).chapters(), BookChapter.class, true);
            }

            @Override
            public BookInfoDraft setChapters(List<BookChapter> chapters) {
                if (chapters == null) {
                    throw new IllegalArgumentException(
                        "'chapters' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl modified = __modified();
                modified.chapters = NonSharedList.of(modified.chapters, chapters);
                return this;
            }

            @Override
            public BookInfoDraft addIntoChapters(DraftConsumer<BookChapterDraft> block) {
                addIntoChapters(null, block);
                return this;
            }

            @Override
            public BookInfoDraft addIntoChapters(BookChapter base,
                    DraftConsumer<BookChapterDraft> block) {
                chapters(true).add((BookChapterDraft)BookChapterDraft.$.produce(base, block));
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(int prop, Object value) {
                switch (prop) {
                    case 1: setId((String)value);break;
                    case 2: setBookName((String)value);break;
                    case 3: setAuthor((String)value);break;
                    case 4: setDescribe((String)value);break;
                    case 5: setStatus((String)value);break;
                    case 6: setBookImgPath((String)value);break;
                    case 7: setCategory((String)value);break;
                    case 8: setBookFrom((String)value);break;
                    case 9: setChapters((List<BookChapter>)value);break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id": setId((String)value);break;
                    case "bookName": setBookName((String)value);break;
                    case "author": setAuthor((String)value);break;
                    case "describe": setDescribe((String)value);break;
                    case "status": setStatus((String)value);break;
                    case "bookImgPath": setBookImgPath((String)value);break;
                    case "category": setCategory((String)value);break;
                    case "bookFrom": setBookFrom((String)value);break;
                    case "chapters": setChapters((List<BookChapter>)value);break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(int prop) {
                switch (prop) {
                    case 1: __modified().id = null;break;
                    case 2: __modified().bookName = null;break;
                    case 3: __modified().authorLoaded = false;break;
                    case 4: __modified().describeLoaded = false;break;
                    case 5: __modified().statusLoaded = false;break;
                    case 6: __modified().bookImgPathLoaded = false;break;
                    case 7: __modified().categoryLoaded = false;break;
                    case 8: __modified().bookFromLoaded = false;break;
                    case 9: __modified().chapters = null;break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "id": __modified().id = null;break;
                    case "bookName": __modified().bookName = null;break;
                    case "author": __modified().authorLoaded = false;break;
                    case "describe": __modified().describeLoaded = false;break;
                    case "status": __modified().statusLoaded = false;break;
                    case "bookImgPath": __modified().bookImgPathLoaded = false;break;
                    case "category": __modified().categoryLoaded = false;break;
                    case "bookFrom": __modified().bookFromLoaded = false;break;
                    case "chapters": __modified().chapters = null;break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public DraftContext __draftContext() {
                return __ctx;
            }

            @Override
            public Object __resolve() {
                if (__resolving) {
                    throw new CircularReferenceException();
                }
                __resolving = true;
                try {
                    Implementor base = __base;
                    Impl modified = __modified;
                    if (modified == null) {
                        if (base.__isLoaded(9)) {
                            List<BookChapter> oldValue = base.chapters();
                            List<BookChapter> newValue = __ctx.resolveList(oldValue);
                            if (oldValue != newValue) {
                                setChapters(newValue);
                            }
                        }
                        modified = __modified;
                    }
                    else {
                        modified.chapters = NonSharedList.of(modified.chapters, __ctx.resolveList(modified.chapters));
                    }
                    if (modified == null || ImmutableSpi.equals(base, modified, true)) {
                        return base;
                    }
                    return modified;
                }
                finally {
                    __resolving = false;
                }
            }

            private Impl __modified() {
                Impl modified = __modified;
                if (modified == null) {
                    modified = __base.clone();
                    __modified = modified;
                }
                return modified;
            }
        }
    }
}
