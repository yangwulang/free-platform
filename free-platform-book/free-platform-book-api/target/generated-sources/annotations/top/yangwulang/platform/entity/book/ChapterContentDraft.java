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

public interface ChapterContentDraft extends ChapterContent, Draft {
    ChapterContentDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    ChapterContentDraft setId(String id);

    BookChapterDraft chapter();

    BookChapterDraft chapter(boolean autoCreate);

    @OldChain
    ChapterContentDraft setChapter(BookChapter chapter);

    @OldChain
    ChapterContentDraft applyChapter(DraftConsumer<BookChapterDraft> block);

    @OldChain
    ChapterContentDraft applyChapter(BookChapter base, DraftConsumer<BookChapterDraft> block);

    @OldChain
    ChapterContentDraft setChapterContent(String chapterContent);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                ChapterContent.class,
                null,
                (ctx, base) -> new DraftImpl(ctx, (ChapterContent)base)
            )
            .id(1, "id", String.class)
            .keyReference(2, "chapter", BookChapter.class, false)
            .add(3, "chapterContent", ImmutablePropCategory.SCALAR, String.class, true)
            .build();

        private Producer() {
        }

        public ChapterContent produce(DraftConsumer<ChapterContentDraft> block) {
            return produce(null, block);
        }

        public ChapterContent produce(ChapterContent base,
                DraftConsumer<ChapterContentDraft> block) {
            return (ChapterContent)Internal.produce(TYPE, base, block);
        }

        public abstract static class Implementor implements ChapterContent, ImmutableSpi {
            @Override
            public Object __get(int prop) {
                switch (prop) {
                    case 1: return id();
                    case 2: return chapter();
                    case 3: return chapterContent();
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public Object __get(String prop) {
                switch (prop) {
                    case "id": return id();
                    case "chapter": return chapter();
                    case "chapterContent": return chapterContent();
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

            BookChapter chapter;

            String chapterContent;

            boolean chapterContentLoaded = false;

            @Override
            public String id() {
                if (id == null) {
                    throw new UnloadedException(ChapterContent.class, "id");
                }
                return id;
            }

            @Override
            public BookChapter chapter() {
                if (chapter == null) {
                    throw new UnloadedException(ChapterContent.class, "chapter");
                }
                return chapter;
            }

            @Override
            public String chapterContent() {
                if (!chapterContentLoaded) {
                    throw new UnloadedException(ChapterContent.class, "chapterContent");
                }
                return chapterContent;
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
                    case 2: return chapter != null;
                    case 3: return chapterContentLoaded;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id": return id != null;
                    case "chapter": return chapter != null;
                    case "chapterContent": return chapterContentLoaded;
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
                if (chapter != null) {
                    hash = 31 * hash + chapter.hashCode();
                }
                if (chapterContentLoaded && chapterContent != null) {
                    hash = 31 * hash + chapterContent.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = 1;
                if (id != null) {
                    hash = 31 * hash + System.identityHashCode(id);
                }
                if (chapter != null) {
                    hash = 31 * hash + System.identityHashCode(chapter);
                }
                if (chapterContentLoaded) {
                    hash = 31 * hash + System.identityHashCode(chapterContent);
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
                boolean __chapterLoaded = chapter != null;
                if (__chapterLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__chapterLoaded && !Objects.equals(chapter, other.chapter())) {
                    return false;
                }
                boolean __chapterContentLoaded = chapterContentLoaded;
                if (__chapterContentLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__chapterContentLoaded && !Objects.equals(chapterContent, other.chapterContent())) {
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
                boolean __chapterLoaded = chapter != null;
                if (__chapterLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__chapterLoaded && chapter != other.chapter()) {
                    return false;
                }
                boolean __chapterContentLoaded = chapterContentLoaded;
                if (__chapterContentLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__chapterContentLoaded && chapterContent != other.chapterContent()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }
        }

        private static class DraftImpl extends Implementor implements DraftSpi, ChapterContentDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, ChapterContent base) {
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
            public ChapterContentDraft setId(String id) {
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
            public BookChapterDraft chapter() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).chapter());
            }

            @Override
            public BookChapterDraft chapter(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(2) || chapter() == null)) {
                    setChapter(BookChapterDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).chapter());
            }

            @Override
            public ChapterContentDraft setChapter(BookChapter chapter) {
                if (chapter == null) {
                    throw new IllegalArgumentException(
                        "'chapter' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.chapter = chapter;
                return this;
            }

            @Override
            public ChapterContentDraft applyChapter(DraftConsumer<BookChapterDraft> block) {
                applyChapter(null, block);
                return this;
            }

            @Override
            public ChapterContentDraft applyChapter(BookChapter base,
                    DraftConsumer<BookChapterDraft> block) {
                setChapter(BookChapterDraft.$.produce(base, block));
                return this;
            }

            @Override
            public String chapterContent() {
                return (__modified!= null ? __modified : __base).chapterContent();
            }

            @Override
            public ChapterContentDraft setChapterContent(String chapterContent) {
                Impl __tmpModified = __modified();
                __tmpModified.chapterContent = chapterContent;
                __tmpModified.chapterContentLoaded = true;
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(int prop, Object value) {
                switch (prop) {
                    case 1: setId((String)value);break;
                    case 2: setChapter((BookChapter)value);break;
                    case 3: setChapterContent((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id": setId((String)value);break;
                    case "chapter": setChapter((BookChapter)value);break;
                    case "chapterContent": setChapterContent((String)value);break;
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
                    case 2: __modified().chapter = null;break;
                    case 3: __modified().chapterContentLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "id": __modified().id = null;break;
                    case "chapter": __modified().chapter = null;break;
                    case "chapterContent": __modified().chapterContentLoaded = false;break;
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
                        if (base.__isLoaded(2)) {
                            BookChapter oldValue = base.chapter();
                            BookChapter newValue = __ctx.resolveObject(oldValue);
                            if (!ImmutableSpi.equals(oldValue, newValue, true)) {
                                setChapter(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.chapter = __ctx.resolveObject(__tmpModified.chapter);
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

        private BookChapter chapter;

        private boolean chapterContentLoaded;

        private String chapterContent;

        public MapStruct id(String id) {
            if (id != null) {
                this.id = id;
            }
            return this;
        }

        public MapStruct chapter(BookChapter chapter) {
            if (chapter != null) {
                this.chapter = chapter;
            }
            return this;
        }

        public MapStruct chapterContent(String chapterContent) {
            this.chapterContentLoaded = true;
            this.chapterContent = chapterContent;
            return this;
        }

        public ChapterContent build() {
            return ChapterContentDraft.$.produce(draft -> {
                if (id != null) {
                    draft.setId(id);
                }
                if (chapter != null) {
                    draft.setChapter(chapter);
                }
                if (chapterContentLoaded) {
                    draft.setChapterContent(chapterContent);
                }
            });
        }
    }
}
