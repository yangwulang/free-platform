package top.yangwulang.platform.entity.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.Collections;
import java.util.Objects;
import org.babyfish.jimmer.CircularReferenceException;
import org.babyfish.jimmer.DraftConsumer;
import org.babyfish.jimmer.GeneratedBy;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
import org.babyfish.jimmer.jackson.ImmutableModuleRequiredException;
import org.babyfish.jimmer.lang.OldChain;
import org.babyfish.jimmer.meta.ImmutablePropCategory;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.DraftContext;
import org.babyfish.jimmer.runtime.DraftSpi;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.runtime.Internal;
import org.babyfish.jimmer.runtime.Visibility;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.TypeBaseDraft;

@GeneratedBy(
        type = FileEntity.class
)
public interface FileEntityDraft extends FileEntity, TypeBaseDraft {
    FileEntityDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    FileEntityDraft setId(String id);

    @OldChain
    FileEntityDraft setFileMd5(String fileMd5);

    @OldChain
    FileEntityDraft setFilePath(String filePath);

    @OldChain
    FileEntityDraft setFileContentType(String fileContentType);

    @OldChain
    FileEntityDraft setFileMeta(String fileMeta);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_FILE_MD5 = 1;

        public static final int SLOT_FILE_PATH = 2;

        public static final int SLOT_FILE_CONTENT_TYPE = 3;

        public static final int SLOT_FILE_META = 4;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.42",
                FileEntity.class,
                Collections.singleton(TypeBaseDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (FileEntity)base)
            )
            .redefine("id", SLOT_ID)
            .key(SLOT_FILE_MD5, "fileMd5", String.class, false)
            .add(SLOT_FILE_PATH, "filePath", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_FILE_CONTENT_TYPE, "fileContentType", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_FILE_META, "fileMeta", ImmutablePropCategory.SCALAR, String.class, true)
            .build();

        private Producer() {
        }

        public FileEntity produce(DraftConsumer<FileEntityDraft> block) {
            return produce(null, block);
        }

        public FileEntity produce(FileEntity base, DraftConsumer<FileEntityDraft> block) {
            return (FileEntity)Internal.produce(TYPE, base, block);
        }

        public abstract interface Implementor extends FileEntity, ImmutableSpi {
            @Override
            default Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_ID:
                    		return id();
                    case SLOT_FILE_MD5:
                    		return fileMd5();
                    case SLOT_FILE_PATH:
                    		return filePath();
                    case SLOT_FILE_CONTENT_TYPE:
                    		return fileContentType();
                    case SLOT_FILE_META:
                    		return fileMeta();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.FileEntity\": \"" + prop + "\"");
                }
            }

            @Override
            default Object __get(String prop) {
                switch (prop) {
                    case "id":
                    		return id();
                    case "fileMd5":
                    		return fileMd5();
                    case "filePath":
                    		return filePath();
                    case "fileContentType":
                    		return fileContentType();
                    case "fileMeta":
                    		return fileMeta();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.FileEntity\": \"" + prop + "\"");
                }
            }

            @JsonIgnore
            default String getId() {
                return id();
            }

            @JsonIgnore
            default String getFileMd5() {
                return fileMd5();
            }

            @JsonIgnore
            default String getFilePath() {
                return filePath();
            }

            @JsonIgnore
            default String getFileContentType() {
                return fileContentType();
            }

            @JsonIgnore
            default String getFileMeta() {
                return fileMeta();
            }

            @Override
            default ImmutableType __type() {
                return TYPE;
            }

            default int getDummyPropForJacksonError__() {
                throw new ImmutableModuleRequiredException();
            }
        }

        private static class Impl implements Implementor, Cloneable, Serializable {
            private Visibility __visibility;

            String __idValue;

            String __fileMd5Value;

            String __filePathValue;

            String __fileContentTypeValue;

            String __fileMetaValue;

            boolean __fileMetaLoaded = false;

            @Override
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(FileEntity.class, "id");
                }
                return __idValue;
            }

            @Override
            public String fileMd5() {
                if (__fileMd5Value == null) {
                    throw new UnloadedException(FileEntity.class, "fileMd5");
                }
                return __fileMd5Value;
            }

            @Override
            public String filePath() {
                if (__filePathValue == null) {
                    throw new UnloadedException(FileEntity.class, "filePath");
                }
                return __filePathValue;
            }

            @Override
            public String fileContentType() {
                if (__fileContentTypeValue == null) {
                    throw new UnloadedException(FileEntity.class, "fileContentType");
                }
                return __fileContentTypeValue;
            }

            @Override
            @Nullable
            public String fileMeta() {
                if (!__fileMetaLoaded) {
                    throw new UnloadedException(FileEntity.class, "fileMeta");
                }
                return __fileMetaValue;
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
            public boolean __isLoaded(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __isLoaded(prop.asName());
                    case SLOT_ID:
                    		return __idValue != null;
                    case SLOT_FILE_MD5:
                    		return __fileMd5Value != null;
                    case SLOT_FILE_PATH:
                    		return __filePathValue != null;
                    case SLOT_FILE_CONTENT_TYPE:
                    		return __fileContentTypeValue != null;
                    case SLOT_FILE_META:
                    		return __fileMetaLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.FileEntity\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id":
                    		return __idValue != null;
                    case "fileMd5":
                    		return __fileMd5Value != null;
                    case "filePath":
                    		return __filePathValue != null;
                    case "fileContentType":
                    		return __fileContentTypeValue != null;
                    case "fileMeta":
                    		return __fileMetaLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.FileEntity\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isVisible(PropId prop) {
                if (__visibility == null) {
                    return true;
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __isVisible(prop.asName());
                    case SLOT_ID:
                    		return __visibility.visible(SLOT_ID);
                    case SLOT_FILE_MD5:
                    		return __visibility.visible(SLOT_FILE_MD5);
                    case SLOT_FILE_PATH:
                    		return __visibility.visible(SLOT_FILE_PATH);
                    case SLOT_FILE_CONTENT_TYPE:
                    		return __visibility.visible(SLOT_FILE_CONTENT_TYPE);
                    case SLOT_FILE_META:
                    		return __visibility.visible(SLOT_FILE_META);
                    default: return true;
                }
            }

            @Override
            public boolean __isVisible(String prop) {
                if (__visibility == null) {
                    return true;
                }
                switch (prop) {
                    case "id":
                    		return __visibility.visible(SLOT_ID);
                    case "fileMd5":
                    		return __visibility.visible(SLOT_FILE_MD5);
                    case "filePath":
                    		return __visibility.visible(SLOT_FILE_PATH);
                    case "fileContentType":
                    		return __visibility.visible(SLOT_FILE_CONTENT_TYPE);
                    case "fileMeta":
                    		return __visibility.visible(SLOT_FILE_META);
                    default: return true;
                }
            }

            @Override
            public int hashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + __idValue.hashCode();
                    // If entity-id is loaded, return directly
                    return hash;
                }
                if (__fileMd5Value != null) {
                    hash = 31 * hash + __fileMd5Value.hashCode();
                }
                if (__filePathValue != null) {
                    hash = 31 * hash + __filePathValue.hashCode();
                }
                if (__fileContentTypeValue != null) {
                    hash = 31 * hash + __fileContentTypeValue.hashCode();
                }
                if (__fileMetaLoaded && __fileMetaValue != null) {
                    hash = 31 * hash + __fileMetaValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + System.identityHashCode(__idValue);
                }
                if (__fileMd5Value != null) {
                    hash = 31 * hash + System.identityHashCode(__fileMd5Value);
                }
                if (__filePathValue != null) {
                    hash = 31 * hash + System.identityHashCode(__filePathValue);
                }
                if (__fileContentTypeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__fileContentTypeValue);
                }
                if (__fileMetaLoaded) {
                    hash = 31 * hash + System.identityHashCode(__fileMetaValue);
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
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                boolean __idLoaded = __idValue != null;
                if (__idLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                if (__idLoaded) {
                    // If entity-id is loaded, return directly
                    return Objects.equals(__idValue, __other.id());
                }
                if (__isVisible(PropId.byIndex(SLOT_FILE_MD5)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_MD5))) {
                    return false;
                }
                boolean __fileMd5Loaded = __fileMd5Value != null;
                if (__fileMd5Loaded != __other.__isLoaded(PropId.byIndex(SLOT_FILE_MD5))) {
                    return false;
                }
                if (__fileMd5Loaded && !Objects.equals(__fileMd5Value, __other.fileMd5())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FILE_PATH)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_PATH))) {
                    return false;
                }
                boolean __filePathLoaded = __filePathValue != null;
                if (__filePathLoaded != __other.__isLoaded(PropId.byIndex(SLOT_FILE_PATH))) {
                    return false;
                }
                if (__filePathLoaded && !Objects.equals(__filePathValue, __other.filePath())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FILE_CONTENT_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_CONTENT_TYPE))) {
                    return false;
                }
                boolean __fileContentTypeLoaded = __fileContentTypeValue != null;
                if (__fileContentTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_FILE_CONTENT_TYPE))) {
                    return false;
                }
                if (__fileContentTypeLoaded && !Objects.equals(__fileContentTypeValue, __other.fileContentType())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FILE_META)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_META))) {
                    return false;
                }
                boolean __fileMetaLoaded = this.__fileMetaLoaded;
                if (__fileMetaLoaded != __other.__isLoaded(PropId.byIndex(SLOT_FILE_META))) {
                    return false;
                }
                if (__fileMetaLoaded && !Objects.equals(__fileMetaValue, __other.fileMeta())) {
                    return false;
                }
                return true;
            }

            private boolean __shallowEquals(Object obj) {
                if (obj == null || !(obj instanceof Implementor)) {
                    return false;
                }
                Implementor __other = (Implementor)obj;
                if (__isVisible(PropId.byIndex(SLOT_ID)) != __other.__isVisible(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                boolean __idLoaded = __idValue != null;
                if (__idLoaded != __other.__isLoaded(PropId.byIndex(SLOT_ID))) {
                    return false;
                }
                if (__idLoaded && __idValue != __other.id()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FILE_MD5)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_MD5))) {
                    return false;
                }
                boolean __fileMd5Loaded = __fileMd5Value != null;
                if (__fileMd5Loaded != __other.__isLoaded(PropId.byIndex(SLOT_FILE_MD5))) {
                    return false;
                }
                if (__fileMd5Loaded && __fileMd5Value != __other.fileMd5()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FILE_PATH)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_PATH))) {
                    return false;
                }
                boolean __filePathLoaded = __filePathValue != null;
                if (__filePathLoaded != __other.__isLoaded(PropId.byIndex(SLOT_FILE_PATH))) {
                    return false;
                }
                if (__filePathLoaded && __filePathValue != __other.filePath()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FILE_CONTENT_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_CONTENT_TYPE))) {
                    return false;
                }
                boolean __fileContentTypeLoaded = __fileContentTypeValue != null;
                if (__fileContentTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_FILE_CONTENT_TYPE))) {
                    return false;
                }
                if (__fileContentTypeLoaded && __fileContentTypeValue != __other.fileContentType()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FILE_META)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_META))) {
                    return false;
                }
                boolean __fileMetaLoaded = this.__fileMetaLoaded;
                if (__fileMetaLoaded != __other.__isLoaded(PropId.byIndex(SLOT_FILE_META))) {
                    return false;
                }
                if (__fileMetaLoaded && __fileMetaValue != __other.fileMeta()) {
                    return false;
                }
                return true;
            }

            @Override
            public boolean __equals(Object obj, boolean shallow) {
                return shallow ? __shallowEquals(obj) : equals(obj);
            }

            @Override
            public String toString() {
                return ImmutableObjects.toString(this);
            }
        }

        private static class DraftImpl implements Implementor, DraftSpi, FileEntityDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, FileEntity base) {
                __ctx = ctx;
                if (base != null) {
                    __base = (Impl)base;
                }
                else {
                    __modified = new Impl();
                }
            }

            @Override
            public boolean __isLoaded(PropId prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isLoaded(String prop) {
                return (__modified!= null ? __modified : __base).__isLoaded(prop);
            }

            @Override
            public boolean __isVisible(PropId prop) {
                return (__modified!= null ? __modified : __base).__isVisible(prop);
            }

            @Override
            public boolean __isVisible(String prop) {
                return (__modified!= null ? __modified : __base).__isVisible(prop);
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
            public String toString() {
                return ImmutableObjects.toString((__modified!= null ? __modified : __base));
            }

            @Override
            public String id() {
                return (__modified!= null ? __modified : __base).id();
            }

            @Override
            public FileEntityDraft setId(String id) {
                if (id == null) {
                    throw new IllegalArgumentException(
                        "'id' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__idValue = id;
                return this;
            }

            @Override
            public String fileMd5() {
                return (__modified!= null ? __modified : __base).fileMd5();
            }

            @Override
            public FileEntityDraft setFileMd5(String fileMd5) {
                if (fileMd5 == null) {
                    throw new IllegalArgumentException(
                        "'fileMd5' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__fileMd5Value = fileMd5;
                return this;
            }

            @Override
            public String filePath() {
                return (__modified!= null ? __modified : __base).filePath();
            }

            @Override
            public FileEntityDraft setFilePath(String filePath) {
                if (filePath == null) {
                    throw new IllegalArgumentException(
                        "'filePath' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__filePathValue = filePath;
                return this;
            }

            @Override
            public String fileContentType() {
                return (__modified!= null ? __modified : __base).fileContentType();
            }

            @Override
            public FileEntityDraft setFileContentType(String fileContentType) {
                if (fileContentType == null) {
                    throw new IllegalArgumentException(
                        "'fileContentType' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__fileContentTypeValue = fileContentType;
                return this;
            }

            @Override
            @Nullable
            public String fileMeta() {
                return (__modified!= null ? __modified : __base).fileMeta();
            }

            @Override
            public FileEntityDraft setFileMeta(String fileMeta) {
                Impl __tmpModified = __modified();
                __tmpModified.__fileMetaValue = fileMeta;
                __tmpModified.__fileMetaLoaded = true;
                return this;
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(PropId prop, Object value) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__set(prop.asName(), value);
                    return;
                    case SLOT_ID:
                    		setId((String)value);break;
                    case SLOT_FILE_MD5:
                    		setFileMd5((String)value);break;
                    case SLOT_FILE_PATH:
                    		setFilePath((String)value);break;
                    case SLOT_FILE_CONTENT_TYPE:
                    		setFileContentType((String)value);break;
                    case SLOT_FILE_META:
                    		setFileMeta((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.FileEntity\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id":
                    		setId((String)value);break;
                    case "fileMd5":
                    		setFileMd5((String)value);break;
                    case "filePath":
                    		setFilePath((String)value);break;
                    case "fileContentType":
                    		setFileContentType((String)value);break;
                    case "fileMeta":
                    		setFileMeta((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.FileEntity\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(5);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_ID:
                    		__visibility.show(SLOT_ID, visible);break;
                    case SLOT_FILE_MD5:
                    		__visibility.show(SLOT_FILE_MD5, visible);break;
                    case SLOT_FILE_PATH:
                    		__visibility.show(SLOT_FILE_PATH, visible);break;
                    case SLOT_FILE_CONTENT_TYPE:
                    		__visibility.show(SLOT_FILE_CONTENT_TYPE, visible);break;
                    case SLOT_FILE_META:
                    		__visibility.show(SLOT_FILE_META, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.sys.FileEntity\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __show(String prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(5);
                }
                switch (prop) {
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
                    case "fileMd5":
                    		__visibility.show(SLOT_FILE_MD5, visible);break;
                    case "filePath":
                    		__visibility.show(SLOT_FILE_PATH, visible);break;
                    case "fileContentType":
                    		__visibility.show(SLOT_FILE_CONTENT_TYPE, visible);break;
                    case "fileMeta":
                    		__visibility.show(SLOT_FILE_META, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.sys.FileEntity\": \"" + 
                                prop + 
                                "\",it does not exists"
                            );
                }
            }

            @Override
            public void __unload(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__unload(prop.asName());
                    return;
                    case SLOT_ID:
                    		__modified().__idValue = null;break;
                    case SLOT_FILE_MD5:
                    		__modified().__fileMd5Value = null;break;
                    case SLOT_FILE_PATH:
                    		__modified().__filePathValue = null;break;
                    case SLOT_FILE_CONTENT_TYPE:
                    		__modified().__fileContentTypeValue = null;break;
                    case SLOT_FILE_META:
                    		__modified().__fileMetaLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.FileEntity\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "id":
                    		__modified().__idValue = null;break;
                    case "fileMd5":
                    		__modified().__fileMd5Value = null;break;
                    case "filePath":
                    		__modified().__filePathValue = null;break;
                    case "fileContentType":
                    		__modified().__fileContentTypeValue = null;break;
                    case "fileMeta":
                    		__modified().__fileMetaLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.FileEntity\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                    if (__base != null && __tmpModified == null) {
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

        private String fileMd5;

        private String filePath;

        private String fileContentType;

        private boolean __fileMetaLoaded;

        private String fileMeta;

        public MapStruct id(String id) {
            this.id = id;
            return this;
        }

        public MapStruct fileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
            return this;
        }

        public MapStruct filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        public MapStruct fileContentType(String fileContentType) {
            this.fileContentType = fileContentType;
            return this;
        }

        public MapStruct fileMeta(String fileMeta) {
            this.__fileMetaLoaded = true;
            this.fileMeta = fileMeta;
            return this;
        }

        public FileEntity build() {
            return FileEntityDraft.$.produce(draft -> {
                if (id != null) {
                    draft.setId(id);
                }
                if (fileMd5 != null) {
                    draft.setFileMd5(fileMd5);
                }
                if (filePath != null) {
                    draft.setFilePath(filePath);
                }
                if (fileContentType != null) {
                    draft.setFileContentType(fileContentType);
                }
                if (__fileMetaLoaded) {
                    draft.setFileMeta(fileMeta);
                }
            });
        }
    }
}
