package top.yangwulang.platform.entity.book;

import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
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

public interface BookChapterDraft extends BookChapter, Draft {
    BookChapterDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    BookChapterDraft setId(String id);

    @OldChain
    BookChapterDraft setChapterTitle(String chapterTitle);

    BookInfoDraft book();

    BookInfoDraft book(boolean autoCreate);

    @OldChain
    BookChapterDraft setBook(BookInfo book);

    @OldChain
    BookChapterDraft applyBook(DraftConsumer<BookInfoDraft> block);

    @OldChain
    BookChapterDraft applyBook(BookInfo base, DraftConsumer<BookInfoDraft> block);

    @OldChain
    BookChapterDraft setFromPath(String fromPath);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                BookChapter.class,
                null,
                (ctx, base) -> new DraftImpl(ctx, (BookChapter)base)
            )
            .id(1, "id", String.class)
            .add(2, "chapterTitle", ImmutablePropCategory.SCALAR, String.class, true)
            .keyReference(3, "book", BookInfo.class, true)
            .key(4, "fromPath", String.class)
            .build();

        private Producer() {
        }

        public BookChapter produce(DraftConsumer<BookChapterDraft> block) {
            return produce(null, block);
        }

        public BookChapter produce(BookChapter base, DraftConsumer<BookChapterDraft> block) {
            return (BookChapter)Internal.produce(TYPE, base, block);
        }

        public abstract static class Implementor implements BookChapter, ImmutableSpi {
            @Override
            public Object __get(int prop) {
                switch (prop) {
                    case 1: return id();
                    case 2: return chapterTitle();
                    case 3: return book();
                    case 4: return fromPath();
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public Object __get(String prop) {
                switch (prop) {
                    case "id": return id();
                    case "chapterTitle": return chapterTitle();
                    case "book": return book();
                    case "fromPath": return fromPath();
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

            String chapterTitle;

            boolean chapterTitleLoaded = false;

            BookInfo book;

            boolean bookLoaded = false;

            String fromPath;

            boolean fromPathLoaded = false;

            @Override
            public String id() {
                if (id == null) {
                    throw new UnloadedException(BookChapter.class, "id");
                }
                return id;
            }

            @Override
            public String chapterTitle() {
                if (!chapterTitleLoaded) {
                    throw new UnloadedException(BookChapter.class, "chapterTitle");
                }
                return chapterTitle;
            }

            @Override
            public BookInfo book() {
                if (!bookLoaded) {
                    throw new UnloadedException(BookChapter.class, "book");
                }
                return book;
            }

            @Override
            public String fromPath() {
                if (!fromPathLoaded) {
                    throw new UnloadedException(BookChapter.class, "fromPath");
                }
                return fromPath;
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
                    case 2: return chapterTitleLoaded;
                    case 3: return bookLoaded;
                    case 4: return fromPathLoaded;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id": return id != null;
                    case "chapterTitle": return chapterTitleLoaded;
                    case "book": return bookLoaded;
                    case "fromPath": return fromPathLoaded;
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
                if (chapterTitleLoaded && chapterTitle != null) {
                    hash = 31 * hash + chapterTitle.hashCode();
                }
                if (bookLoaded && book != null) {
                    hash = 31 * hash + book.hashCode();
                }
                if (fromPathLoaded && fromPath != null) {
                    hash = 31 * hash + fromPath.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = 1;
                if (id != null) {
                    hash = 31 * hash + System.identityHashCode(id);
                }
                if (chapterTitleLoaded) {
                    hash = 31 * hash + System.identityHashCode(chapterTitle);
                }
                if (bookLoaded) {
                    hash = 31 * hash + System.identityHashCode(book);
                }
                if (fromPathLoaded) {
                    hash = 31 * hash + System.identityHashCode(fromPath);
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
                boolean __chapterTitleLoaded = chapterTitleLoaded;
                if (__chapterTitleLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__chapterTitleLoaded && !Objects.equals(chapterTitle, other.chapterTitle())) {
                    return false;
                }
                boolean __bookLoaded = bookLoaded;
                if (__bookLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__bookLoaded && !Objects.equals(book, other.book())) {
                    return false;
                }
                boolean __fromPathLoaded = fromPathLoaded;
                if (__fromPathLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__fromPathLoaded && !Objects.equals(fromPath, other.fromPath())) {
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
                boolean __chapterTitleLoaded = chapterTitleLoaded;
                if (__chapterTitleLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__chapterTitleLoaded && chapterTitle != other.chapterTitle()) {
                    return false;
                }
                boolean __bookLoaded = bookLoaded;
                if (__bookLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__bookLoaded && book != other.book()) {
                    return false;
                }
                boolean __fromPathLoaded = fromPathLoaded;
                if (__fromPathLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__fromPathLoaded && fromPath != other.fromPath()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }
        }

        private static class DraftImpl extends Implementor implements DraftSpi, BookChapterDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, BookChapter base) {
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
            public BookChapterDraft setId(String id) {
                if (id == null) {
                    throw new IllegalArgumentException(
                        "'id' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.id = id;
                return this;
            }

            @Override
            public String chapterTitle() {
                return (__modified!= null ? __modified : __base).chapterTitle();
            }

            @Override
            public BookChapterDraft setChapterTitle(String chapterTitle) {
                Impl __tmpModified = __modified();
                __tmpModified.chapterTitle = chapterTitle;
                __tmpModified.chapterTitleLoaded = true;
                return this;
            }

            @Override
            public BookInfoDraft book() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).book());
            }

            @Override
            public BookInfoDraft book(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(3) || book() == null)) {
                    setBook(BookInfoDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).book());
            }

            @Override
            public BookChapterDraft setBook(BookInfo book) {
                Impl __tmpModified = __modified();
                __tmpModified.book = book;
                __tmpModified.bookLoaded = true;
                return this;
            }

            @Override
            public BookChapterDraft applyBook(DraftConsumer<BookInfoDraft> block) {
                applyBook(null, block);
                return this;
            }

            @Override
            public BookChapterDraft applyBook(BookInfo base, DraftConsumer<BookInfoDraft> block) {
                setBook(BookInfoDraft.$.produce(base, block));
                return this;
            }

            @Override
            public String fromPath() {
                return (__modified!= null ? __modified : __base).fromPath();
            }

            @Override
            public BookChapterDraft setFromPath(String fromPath) {
                Impl __tmpModified = __modified();
                __tmpModified.fromPath = fromPath;
                __tmpModified.fromPathLoaded = true;
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(int prop, Object value) {
                switch (prop) {
                    case 1: setId((String)value);break;
                    case 2: setChapterTitle((String)value);break;
                    case 3: setBook((BookInfo)value);break;
                    case 4: setFromPath((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id": setId((String)value);break;
                    case "chapterTitle": setChapterTitle((String)value);break;
                    case "book": setBook((BookInfo)value);break;
                    case "fromPath": setFromPath((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public void __use(int prop) {
                switch (prop) {
                    default: throw new IllegalArgumentException(
                                "Illegal property id: \"" + 
                                prop + 
                                "\",it does not exists or is not non-abstract formula property" + 
                                "(Only non-abstract formula property can be used)"
                            );
                }
            }

            @Override
            public void __use(String prop) {
                switch (prop) {
                    default: throw new IllegalArgumentException(
                                "Illegal property name: \"" + 
                                prop + 
                                "\",it does not exists or is not non-abstract formula property" + 
                                "(Only non-abstract formula property can be used)"
                            );
                }
            }

            @Override
            public void __unload(int prop) {
                switch (prop) {
                    case 1: __modified().id = null;break;
                    case 2: __modified().chapterTitleLoaded = false;break;
                    case 3: __modified().bookLoaded = false;break;
                    case 4: __modified().fromPathLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "id": __modified().id = null;break;
                    case "chapterTitle": __modified().chapterTitleLoaded = false;break;
                    case "book": __modified().bookLoaded = false;break;
                    case "fromPath": __modified().fromPathLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
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
                    Impl __tmpModified = __modified;
                    if (__tmpModified == null) {
                        if (base.__isLoaded(3)) {
                            BookInfo oldValue = base.book();
                            BookInfo newValue = __ctx.resolveObject(oldValue);
                            if (!ImmutableSpi.equals(oldValue, newValue, true)) {
                                setBook(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.book = __ctx.resolveObject(__tmpModified.book);
                    }
                    if (__tmpModified == null || ImmutableSpi.equals(base, __tmpModified, true)) {
                        return base;
                    }
                    return __tmpModified;
                }
                finally {
                    __resolving = false;
                }
            }

            private Impl __modified() {
                Impl __tmpModified = __modified;
                if (__tmpModified == null) {
                    __tmpModified = __base.clone();
                    __modified = __tmpModified;
                }
                return __tmpModified;
            }
        }
    }

    class MapStruct {
        private String id;

        private boolean chapterTitleLoaded;

        private String chapterTitle;

        private boolean bookLoaded;

        private BookInfo book;

        private boolean fromPathLoaded;

        private String fromPath;

        public MapStruct id(String id) {
            if (id != null) {
                this.id = id;
            }
            return this;
        }

        public MapStruct chapterTitle(String chapterTitle) {
            this.chapterTitleLoaded = true;
            this.chapterTitle = chapterTitle;
            return this;
        }

        public MapStruct book(BookInfo book) {
            this.bookLoaded = true;
            this.book = book;
            return this;
        }

        public MapStruct fromPath(String fromPath) {
            this.fromPathLoaded = true;
            this.fromPath = fromPath;
            return this;
        }

        public BookChapter build() {
            return BookChapterDraft.$.produce(draft -> {
                if (id != null) {
                    draft.setId(id);
                }
                if (chapterTitleLoaded) {
                    draft.setChapterTitle(chapterTitle);
                }
                if (bookLoaded) {
                    draft.setBook(book);
                }
                if (fromPathLoaded) {
                    draft.setFromPath(fromPath);
                }
            });
        }
    }
}
