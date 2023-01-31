package top.yangwulang.platform.entity.video;

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

public interface VideoInfoDraft extends VideoInfo, Draft {
    VideoInfoDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    VideoInfoDraft setId(String id);

    VideoCategoryDraft category();

    VideoCategoryDraft category(boolean autoCreate);

    @OldChain
    VideoInfoDraft setCategory(VideoCategory category);

    @OldChain
    VideoInfoDraft setCategory(DraftConsumer<VideoCategoryDraft> block);

    @OldChain
    VideoInfoDraft setCategory(VideoCategory base, DraftConsumer<VideoCategoryDraft> block);

    @OldChain
    VideoInfoDraft setPlayUrl(String playUrl);

    @OldChain
    VideoInfoDraft setImgSrc(String imgSrc);

    @OldChain
    VideoInfoDraft setDesc(String desc);

    @OldChain
    VideoInfoDraft setPath(String path);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                VideoInfo.class,
                null,
                (ctx, base) -> new DraftImpl(ctx, (VideoInfo)base)
            )
            .id(1, "id", String.class)
            .keyReference(2, "category", VideoCategory.class, false)
            .add(3, "playUrl", ImmutablePropCategory.SCALAR, String.class, true)
            .add(4, "imgSrc", ImmutablePropCategory.SCALAR, String.class, true)
            .add(5, "desc", ImmutablePropCategory.SCALAR, String.class, true)
            .add(6, "path", ImmutablePropCategory.SCALAR, String.class, true)
            .build();

        private Producer() {
        }

        public VideoInfo produce(DraftConsumer<VideoInfoDraft> block) {
            return produce(null, block);
        }

        public VideoInfo produce(VideoInfo base, DraftConsumer<VideoInfoDraft> block) {
            return (VideoInfo)Internal.produce(TYPE, base, block);
        }

        public abstract static class Implementor implements VideoInfo, ImmutableSpi {
            @Override
            public Object __get(int prop) {
                switch (prop) {
                    case 1: return id();
                    case 2: return category();
                    case 3: return playUrl();
                    case 4: return imgSrc();
                    case 5: return desc();
                    case 6: return path();
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public Object __get(String prop) {
                switch (prop) {
                    case "id": return id();
                    case "category": return category();
                    case "playUrl": return playUrl();
                    case "imgSrc": return imgSrc();
                    case "desc": return desc();
                    case "path": return path();
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

            VideoCategory category;

            String playUrl;

            boolean playUrlLoaded = false;

            String imgSrc;

            boolean imgSrcLoaded = false;

            String desc;

            boolean descLoaded = false;

            String path;

            boolean pathLoaded = false;

            @Override
            public String id() {
                if (id == null) {
                    throw new UnloadedException(VideoInfo.class, "id");
                }
                return id;
            }

            @Override
            public VideoCategory category() {
                if (category == null) {
                    throw new UnloadedException(VideoInfo.class, "category");
                }
                return category;
            }

            @Override
            public String playUrl() {
                if (!playUrlLoaded) {
                    throw new UnloadedException(VideoInfo.class, "playUrl");
                }
                return playUrl;
            }

            @Override
            public String imgSrc() {
                if (!imgSrcLoaded) {
                    throw new UnloadedException(VideoInfo.class, "imgSrc");
                }
                return imgSrc;
            }

            @Override
            public String desc() {
                if (!descLoaded) {
                    throw new UnloadedException(VideoInfo.class, "desc");
                }
                return desc;
            }

            @Override
            public String path() {
                if (!pathLoaded) {
                    throw new UnloadedException(VideoInfo.class, "path");
                }
                return path;
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
                    case 2: return category != null;
                    case 3: return playUrlLoaded;
                    case 4: return imgSrcLoaded;
                    case 5: return descLoaded;
                    case 6: return pathLoaded;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id": return id != null;
                    case "category": return category != null;
                    case "playUrl": return playUrlLoaded;
                    case "imgSrc": return imgSrcLoaded;
                    case "desc": return descLoaded;
                    case "path": return pathLoaded;
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
                if (category != null) {
                    hash = 31 * hash + category.hashCode();
                }
                if (playUrlLoaded && playUrl != null) {
                    hash = 31 * hash + playUrl.hashCode();
                }
                if (imgSrcLoaded && imgSrc != null) {
                    hash = 31 * hash + imgSrc.hashCode();
                }
                if (descLoaded && desc != null) {
                    hash = 31 * hash + desc.hashCode();
                }
                if (pathLoaded && path != null) {
                    hash = 31 * hash + path.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = 1;
                if (id != null) {
                    hash = 31 * hash + System.identityHashCode(id);
                }
                if (category != null) {
                    hash = 31 * hash + System.identityHashCode(category);
                }
                if (playUrlLoaded) {
                    hash = 31 * hash + System.identityHashCode(playUrl);
                }
                if (imgSrcLoaded) {
                    hash = 31 * hash + System.identityHashCode(imgSrc);
                }
                if (descLoaded) {
                    hash = 31 * hash + System.identityHashCode(desc);
                }
                if (pathLoaded) {
                    hash = 31 * hash + System.identityHashCode(path);
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
                boolean __categoryLoaded = category != null;
                if (__categoryLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__categoryLoaded && !Objects.equals(category, other.category())) {
                    return false;
                }
                boolean __playUrlLoaded = playUrlLoaded;
                if (__playUrlLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__playUrlLoaded && !Objects.equals(playUrl, other.playUrl())) {
                    return false;
                }
                boolean __imgSrcLoaded = imgSrcLoaded;
                if (__imgSrcLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__imgSrcLoaded && !Objects.equals(imgSrc, other.imgSrc())) {
                    return false;
                }
                boolean __descLoaded = descLoaded;
                if (__descLoaded != other.__isLoaded(5)) {
                    return false;
                }
                if (__descLoaded && !Objects.equals(desc, other.desc())) {
                    return false;
                }
                boolean __pathLoaded = pathLoaded;
                if (__pathLoaded != other.__isLoaded(6)) {
                    return false;
                }
                if (__pathLoaded && !Objects.equals(path, other.path())) {
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
                boolean __categoryLoaded = category != null;
                if (__categoryLoaded != other.__isLoaded(2)) {
                    return false;
                }
                if (__categoryLoaded && category != other.category()) {
                    return false;
                }
                boolean __playUrlLoaded = playUrlLoaded;
                if (__playUrlLoaded != other.__isLoaded(3)) {
                    return false;
                }
                if (__playUrlLoaded && playUrl != other.playUrl()) {
                    return false;
                }
                boolean __imgSrcLoaded = imgSrcLoaded;
                if (__imgSrcLoaded != other.__isLoaded(4)) {
                    return false;
                }
                if (__imgSrcLoaded && imgSrc != other.imgSrc()) {
                    return false;
                }
                boolean __descLoaded = descLoaded;
                if (__descLoaded != other.__isLoaded(5)) {
                    return false;
                }
                if (__descLoaded && desc != other.desc()) {
                    return false;
                }
                boolean __pathLoaded = pathLoaded;
                if (__pathLoaded != other.__isLoaded(6)) {
                    return false;
                }
                if (__pathLoaded && path != other.path()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }
        }

        private static class DraftImpl extends Implementor implements DraftSpi, VideoInfoDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, VideoInfo base) {
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
            public VideoInfoDraft setId(String id) {
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
            public VideoCategoryDraft category() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).category());
            }

            @Override
            public VideoCategoryDraft category(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(2) || category() == null)) {
                    setCategory(VideoCategoryDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).category());
            }

            @Override
            public VideoInfoDraft setCategory(VideoCategory category) {
                if (category == null) {
                    throw new IllegalArgumentException(
                        "'category' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl modified = __modified();
                modified.category = category;
                return this;
            }

            @Override
            public VideoInfoDraft setCategory(DraftConsumer<VideoCategoryDraft> block) {
                setCategory(null, block);
                return this;
            }

            @Override
            public VideoInfoDraft setCategory(VideoCategory base,
                    DraftConsumer<VideoCategoryDraft> block) {
                setCategory(VideoCategoryDraft.$.produce(base, block));
                return this;
            }

            @Override
            public String playUrl() {
                return (__modified!= null ? __modified : __base).playUrl();
            }

            @Override
            public VideoInfoDraft setPlayUrl(String playUrl) {
                Impl modified = __modified();
                modified.playUrl = playUrl;
                modified.playUrlLoaded = true;
                return this;
            }

            @Override
            public String imgSrc() {
                return (__modified!= null ? __modified : __base).imgSrc();
            }

            @Override
            public VideoInfoDraft setImgSrc(String imgSrc) {
                Impl modified = __modified();
                modified.imgSrc = imgSrc;
                modified.imgSrcLoaded = true;
                return this;
            }

            @Override
            public String desc() {
                return (__modified!= null ? __modified : __base).desc();
            }

            @Override
            public VideoInfoDraft setDesc(String desc) {
                Impl modified = __modified();
                modified.desc = desc;
                modified.descLoaded = true;
                return this;
            }

            @Override
            public String path() {
                return (__modified!= null ? __modified : __base).path();
            }

            @Override
            public VideoInfoDraft setPath(String path) {
                Impl modified = __modified();
                modified.path = path;
                modified.pathLoaded = true;
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(int prop, Object value) {
                switch (prop) {
                    case 1: setId((String)value);break;
                    case 2: setCategory((VideoCategory)value);break;
                    case 3: setPlayUrl((String)value);break;
                    case 4: setImgSrc((String)value);break;
                    case 5: setDesc((String)value);break;
                    case 6: setPath((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id": setId((String)value);break;
                    case "category": setCategory((VideoCategory)value);break;
                    case "playUrl": setPlayUrl((String)value);break;
                    case "imgSrc": setImgSrc((String)value);break;
                    case "desc": setDesc((String)value);break;
                    case "path": setPath((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(int prop) {
                switch (prop) {
                    case 1: __modified().id = null;break;
                    case 2: __modified().category = null;break;
                    case 3: __modified().playUrlLoaded = false;break;
                    case 4: __modified().imgSrcLoaded = false;break;
                    case 5: __modified().descLoaded = false;break;
                    case 6: __modified().pathLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name: \"" + prop + "\"");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "id": __modified().id = null;break;
                    case "category": __modified().category = null;break;
                    case "playUrl": __modified().playUrlLoaded = false;break;
                    case "imgSrc": __modified().imgSrcLoaded = false;break;
                    case "desc": __modified().descLoaded = false;break;
                    case "path": __modified().pathLoaded = false;break;
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
                        if (base.__isLoaded(2)) {
                            VideoCategory oldValue = base.category();
                            VideoCategory newValue = __ctx.resolveObject(oldValue);
                            if (!ImmutableSpi.equals(oldValue, newValue, true)) {
                                setCategory(newValue);
                            }
                        }
                        modified = __modified;
                    }
                    else {
                        modified.category = __ctx.resolveObject(modified.category);
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
