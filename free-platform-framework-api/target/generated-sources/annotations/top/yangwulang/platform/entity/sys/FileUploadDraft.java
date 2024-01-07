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
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.UnloadedException;
import org.babyfish.jimmer.internal.GeneratedBy;
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
import org.babyfish.jimmer.sql.ManyToOne;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.TypeBaseDraft;

@GeneratedBy(
        type = FileUpload.class
)
public interface FileUploadDraft extends FileUpload, TypeBaseDraft {
    FileUploadDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    FileUploadDraft setId(String id);

    @Nullable
    FileEntityDraft fileEntity();

    FileEntityDraft fileEntity(boolean autoCreate);

    @OldChain
    FileUploadDraft setFileEntity(FileEntity fileEntity);

    @OldChain
    FileUploadDraft applyFileEntity(DraftConsumer<FileEntityDraft> block);

    @OldChain
    FileUploadDraft applyFileEntity(FileEntity base, DraftConsumer<FileEntityDraft> block);

    @OldChain
    FileUploadDraft setFileEntityId(String fileEntityId);

    @OldChain
    FileUploadDraft setFileName(String fileName);

    @OldChain
    FileUploadDraft setFileType(String fileType);

    @OldChain
    FileUploadDraft setBizKey(String bizKey);

    @OldChain
    FileUploadDraft setBizType(String bizType);

    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_FILE_ENTITY = 1;

        public static final int SLOT_FILE_ENTITY_ID = 2;

        public static final int SLOT_FILE_NAME = 3;

        public static final int SLOT_FILE_TYPE = 4;

        public static final int SLOT_BIZ_KEY = 5;

        public static final int SLOT_BIZ_TYPE = 6;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.69",
                FileUpload.class,
                Collections.singleton(TypeBaseDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (FileUpload)base)
            )
            .redefine("id", SLOT_ID)
            .keyReference(SLOT_FILE_ENTITY, "fileEntity", ManyToOne.class, FileEntity.class, true)
            .add(SLOT_FILE_ENTITY_ID, "fileEntityId", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_FILE_NAME, "fileName", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_FILE_TYPE, "fileType", ImmutablePropCategory.SCALAR, String.class, false)
            .add(SLOT_BIZ_KEY, "bizKey", ImmutablePropCategory.SCALAR, String.class, true)
            .add(SLOT_BIZ_TYPE, "bizType", ImmutablePropCategory.SCALAR, String.class, true)
            .build();

        private Producer() {
        }

        public FileUpload produce(DraftConsumer<FileUploadDraft> block) {
            return produce(null, block);
        }

        public FileUpload produce(FileUpload base, DraftConsumer<FileUploadDraft> block) {
            return (FileUpload)Internal.produce(TYPE, base, block);
        }

        public abstract interface Implementor extends FileUpload, ImmutableSpi {
            @Override
            default Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_ID:
                    		return id();
                    case SLOT_FILE_ENTITY:
                    		return fileEntity();
                    case SLOT_FILE_ENTITY_ID:
                    		return fileEntityId();
                    case SLOT_FILE_NAME:
                    		return fileName();
                    case SLOT_FILE_TYPE:
                    		return fileType();
                    case SLOT_BIZ_KEY:
                    		return bizKey();
                    case SLOT_BIZ_TYPE:
                    		return bizType();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.FileUpload\": \"" + prop + "\"");
                }
            }

            @Override
            default Object __get(String prop) {
                switch (prop) {
                    case "id":
                    		return id();
                    case "fileEntity":
                    		return fileEntity();
                    case "fileEntityId":
                    		return fileEntityId();
                    case "fileName":
                    		return fileName();
                    case "fileType":
                    		return fileType();
                    case "bizKey":
                    		return bizKey();
                    case "bizType":
                    		return bizType();
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.FileUpload\": \"" + prop + "\"");
                }
            }

            @JsonIgnore
            default String getId() {
                return id();
            }

            @JsonIgnore
            default FileEntity getFileEntity() {
                return fileEntity();
            }

            @JsonIgnore
            default String getFileEntityId() {
                return fileEntityId();
            }

            @JsonIgnore
            default String getFileName() {
                return fileName();
            }

            @JsonIgnore
            default String getFileType() {
                return fileType();
            }

            @JsonIgnore
            default String getBizKey() {
                return bizKey();
            }

            @JsonIgnore
            default String getBizType() {
                return bizType();
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

            FileEntity __fileEntityValue;

            boolean __fileEntityLoaded = false;

            String __fileNameValue;

            String __fileTypeValue;

            String __bizKeyValue;

            boolean __bizKeyLoaded = false;

            String __bizTypeValue;

            boolean __bizTypeLoaded = false;

            Impl() {
                __visibility = Visibility.of(7);
                __visibility.show(SLOT_FILE_ENTITY_ID, false);
            }

            @Override
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(FileUpload.class, "id");
                }
                return __idValue;
            }

            @Override
            @Nullable
            public FileEntity fileEntity() {
                if (!__fileEntityLoaded) {
                    throw new UnloadedException(FileUpload.class, "fileEntity");
                }
                return __fileEntityValue;
            }

            @Override
            @Nullable
            public String fileEntityId() {
                FileEntity __target = fileEntity();
                return __target != null ? __target.id() : null;
            }

            @Override
            public String fileName() {
                if (__fileNameValue == null) {
                    throw new UnloadedException(FileUpload.class, "fileName");
                }
                return __fileNameValue;
            }

            @Override
            public String fileType() {
                if (__fileTypeValue == null) {
                    throw new UnloadedException(FileUpload.class, "fileType");
                }
                return __fileTypeValue;
            }

            @Override
            @Nullable
            public String bizKey() {
                if (!__bizKeyLoaded) {
                    throw new UnloadedException(FileUpload.class, "bizKey");
                }
                return __bizKeyValue;
            }

            @Override
            @Nullable
            public String bizType() {
                if (!__bizTypeLoaded) {
                    throw new UnloadedException(FileUpload.class, "bizType");
                }
                return __bizTypeValue;
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
                    case SLOT_FILE_ENTITY:
                    		return __fileEntityLoaded;
                    case SLOT_FILE_ENTITY_ID:
                    		return __isLoaded(PropId.byIndex(SLOT_FILE_ENTITY)) && (fileEntity() == null || 
                            	((ImmutableSpi)fileEntity()).__isLoaded(PropId.byIndex(FileEntityDraft.Producer.SLOT_ID)));
                    case SLOT_FILE_NAME:
                    		return __fileNameValue != null;
                    case SLOT_FILE_TYPE:
                    		return __fileTypeValue != null;
                    case SLOT_BIZ_KEY:
                    		return __bizKeyLoaded;
                    case SLOT_BIZ_TYPE:
                    		return __bizTypeLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.FileUpload\": \"" + prop + "\"");
                }
            }

            @Override
            public boolean __isLoaded(String prop) {
                switch (prop) {
                    case "id":
                    		return __idValue != null;
                    case "fileEntity":
                    		return __fileEntityLoaded;
                    case "fileEntityId":
                    		return __isLoaded(PropId.byIndex(SLOT_FILE_ENTITY)) && (fileEntity() == null || 
                            	((ImmutableSpi)fileEntity()).__isLoaded(PropId.byIndex(FileEntityDraft.Producer.SLOT_ID)));
                    case "fileName":
                    		return __fileNameValue != null;
                    case "fileType":
                    		return __fileTypeValue != null;
                    case "bizKey":
                    		return __bizKeyLoaded;
                    case "bizType":
                    		return __bizTypeLoaded;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.FileUpload\": \"" + prop + "\"");
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
                    case SLOT_FILE_ENTITY:
                    		return __visibility.visible(SLOT_FILE_ENTITY);
                    case SLOT_FILE_ENTITY_ID:
                    		return __visibility.visible(SLOT_FILE_ENTITY_ID);
                    case SLOT_FILE_NAME:
                    		return __visibility.visible(SLOT_FILE_NAME);
                    case SLOT_FILE_TYPE:
                    		return __visibility.visible(SLOT_FILE_TYPE);
                    case SLOT_BIZ_KEY:
                    		return __visibility.visible(SLOT_BIZ_KEY);
                    case SLOT_BIZ_TYPE:
                    		return __visibility.visible(SLOT_BIZ_TYPE);
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
                    case "fileEntity":
                    		return __visibility.visible(SLOT_FILE_ENTITY);
                    case "fileEntityId":
                    		return __visibility.visible(SLOT_FILE_ENTITY_ID);
                    case "fileName":
                    		return __visibility.visible(SLOT_FILE_NAME);
                    case "fileType":
                    		return __visibility.visible(SLOT_FILE_TYPE);
                    case "bizKey":
                    		return __visibility.visible(SLOT_BIZ_KEY);
                    case "bizType":
                    		return __visibility.visible(SLOT_BIZ_TYPE);
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
                if (__fileEntityLoaded && __fileEntityValue != null) {
                    hash = 31 * hash + __fileEntityValue.hashCode();
                }
                if (__fileNameValue != null) {
                    hash = 31 * hash + __fileNameValue.hashCode();
                }
                if (__fileTypeValue != null) {
                    hash = 31 * hash + __fileTypeValue.hashCode();
                }
                if (__bizKeyLoaded && __bizKeyValue != null) {
                    hash = 31 * hash + __bizKeyValue.hashCode();
                }
                if (__bizTypeLoaded && __bizTypeValue != null) {
                    hash = 31 * hash + __bizTypeValue.hashCode();
                }
                return hash;
            }

            private int __shallowHashCode() {
                int hash = __visibility != null ? __visibility.hashCode() : 0;
                if (__idValue != null) {
                    hash = 31 * hash + System.identityHashCode(__idValue);
                }
                if (__fileEntityLoaded) {
                    hash = 31 * hash + System.identityHashCode(__fileEntityValue);
                }
                if (__fileNameValue != null) {
                    hash = 31 * hash + System.identityHashCode(__fileNameValue);
                }
                if (__fileTypeValue != null) {
                    hash = 31 * hash + System.identityHashCode(__fileTypeValue);
                }
                if (__bizKeyLoaded) {
                    hash = 31 * hash + System.identityHashCode(__bizKeyValue);
                }
                if (__bizTypeLoaded) {
                    hash = 31 * hash + System.identityHashCode(__bizTypeValue);
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
                if (__isVisible(PropId.byIndex(SLOT_FILE_ENTITY)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_ENTITY))) {
                    return false;
                }
                boolean __fileEntityLoaded = this.__fileEntityLoaded;
                if (__fileEntityLoaded != __other.__isLoaded(PropId.byIndex(SLOT_FILE_ENTITY))) {
                    return false;
                }
                if (__fileEntityLoaded && !Objects.equals(__fileEntityValue, __other.fileEntity())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FILE_ENTITY_ID)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_ENTITY_ID))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FILE_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_NAME))) {
                    return false;
                }
                boolean __fileNameLoaded = __fileNameValue != null;
                if (__fileNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_FILE_NAME))) {
                    return false;
                }
                if (__fileNameLoaded && !Objects.equals(__fileNameValue, __other.fileName())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FILE_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_TYPE))) {
                    return false;
                }
                boolean __fileTypeLoaded = __fileTypeValue != null;
                if (__fileTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_FILE_TYPE))) {
                    return false;
                }
                if (__fileTypeLoaded && !Objects.equals(__fileTypeValue, __other.fileType())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_BIZ_KEY)) != __other.__isVisible(PropId.byIndex(SLOT_BIZ_KEY))) {
                    return false;
                }
                boolean __bizKeyLoaded = this.__bizKeyLoaded;
                if (__bizKeyLoaded != __other.__isLoaded(PropId.byIndex(SLOT_BIZ_KEY))) {
                    return false;
                }
                if (__bizKeyLoaded && !Objects.equals(__bizKeyValue, __other.bizKey())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_BIZ_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_BIZ_TYPE))) {
                    return false;
                }
                boolean __bizTypeLoaded = this.__bizTypeLoaded;
                if (__bizTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_BIZ_TYPE))) {
                    return false;
                }
                if (__bizTypeLoaded && !Objects.equals(__bizTypeValue, __other.bizType())) {
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
                if (__isVisible(PropId.byIndex(SLOT_FILE_ENTITY)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_ENTITY))) {
                    return false;
                }
                boolean __fileEntityLoaded = this.__fileEntityLoaded;
                if (__fileEntityLoaded != __other.__isLoaded(PropId.byIndex(SLOT_FILE_ENTITY))) {
                    return false;
                }
                if (__fileEntityLoaded && __fileEntityValue != __other.fileEntity()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FILE_ENTITY_ID)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_ENTITY_ID))) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FILE_NAME)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_NAME))) {
                    return false;
                }
                boolean __fileNameLoaded = __fileNameValue != null;
                if (__fileNameLoaded != __other.__isLoaded(PropId.byIndex(SLOT_FILE_NAME))) {
                    return false;
                }
                if (__fileNameLoaded && __fileNameValue != __other.fileName()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_FILE_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_FILE_TYPE))) {
                    return false;
                }
                boolean __fileTypeLoaded = __fileTypeValue != null;
                if (__fileTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_FILE_TYPE))) {
                    return false;
                }
                if (__fileTypeLoaded && __fileTypeValue != __other.fileType()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_BIZ_KEY)) != __other.__isVisible(PropId.byIndex(SLOT_BIZ_KEY))) {
                    return false;
                }
                boolean __bizKeyLoaded = this.__bizKeyLoaded;
                if (__bizKeyLoaded != __other.__isLoaded(PropId.byIndex(SLOT_BIZ_KEY))) {
                    return false;
                }
                if (__bizKeyLoaded && __bizKeyValue != __other.bizKey()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_BIZ_TYPE)) != __other.__isVisible(PropId.byIndex(SLOT_BIZ_TYPE))) {
                    return false;
                }
                boolean __bizTypeLoaded = this.__bizTypeLoaded;
                if (__bizTypeLoaded != __other.__isLoaded(PropId.byIndex(SLOT_BIZ_TYPE))) {
                    return false;
                }
                if (__bizTypeLoaded && __bizTypeValue != __other.bizType()) {
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

        private static class DraftImpl implements Implementor, DraftSpi, FileUploadDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            DraftImpl(DraftContext ctx, FileUpload base) {
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
            public FileUploadDraft setId(String id) {
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
            @Nullable
            public FileEntityDraft fileEntity() {
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).fileEntity());
            }

            @Override
            public FileEntityDraft fileEntity(boolean autoCreate) {
                if (autoCreate && (!__isLoaded(PropId.byIndex(SLOT_FILE_ENTITY)) || fileEntity() == null)) {
                    setFileEntity(FileEntityDraft.$.produce(null, null));
                }
                return __ctx.toDraftObject((__modified!= null ? __modified : __base).fileEntity());
            }

            @Override
            public FileUploadDraft setFileEntity(FileEntity fileEntity) {
                Impl __tmpModified = __modified();
                __tmpModified.__fileEntityValue = fileEntity;
                __tmpModified.__fileEntityLoaded = true;
                return this;
            }

            @Override
            public FileUploadDraft applyFileEntity(DraftConsumer<FileEntityDraft> block) {
                applyFileEntity(null, block);
                return this;
            }

            @Override
            public FileUploadDraft applyFileEntity(FileEntity base,
                    DraftConsumer<FileEntityDraft> block) {
                setFileEntity(FileEntityDraft.$.produce(base, block));
                return this;
            }

            @Override
            @Nullable
            public String fileEntityId() {
                FileEntity __target = fileEntity();
                return __target != null ? __target.id() : null;
            }

            @Override
            public FileUploadDraft setFileEntityId(String fileEntityId) {
                if (fileEntityId != null) {
                    setFileEntity(ImmutableObjects.makeIdOnly(FileEntity.class, fileEntityId));
                } else {
                    setFileEntity(null);
                }
                return this;
            }

            @Override
            public String fileName() {
                return (__modified!= null ? __modified : __base).fileName();
            }

            @Override
            public FileUploadDraft setFileName(String fileName) {
                if (fileName == null) {
                    throw new IllegalArgumentException(
                        "'fileName' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__fileNameValue = fileName;
                return this;
            }

            @Override
            public String fileType() {
                return (__modified!= null ? __modified : __base).fileType();
            }

            @Override
            public FileUploadDraft setFileType(String fileType) {
                if (fileType == null) {
                    throw new IllegalArgumentException(
                        "'fileType' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__fileTypeValue = fileType;
                return this;
            }

            @Override
            @Nullable
            public String bizKey() {
                return (__modified!= null ? __modified : __base).bizKey();
            }

            @Override
            public FileUploadDraft setBizKey(String bizKey) {
                Impl __tmpModified = __modified();
                __tmpModified.__bizKeyValue = bizKey;
                __tmpModified.__bizKeyLoaded = true;
                return this;
            }

            @Override
            @Nullable
            public String bizType() {
                return (__modified!= null ? __modified : __base).bizType();
            }

            @Override
            public FileUploadDraft setBizType(String bizType) {
                Impl __tmpModified = __modified();
                __tmpModified.__bizTypeValue = bizType;
                __tmpModified.__bizTypeLoaded = true;
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
                    case SLOT_FILE_ENTITY:
                    		setFileEntity((FileEntity)value);break;
                    case SLOT_FILE_ENTITY_ID:
                    		setFileEntityId((String)value);break;
                    case SLOT_FILE_NAME:
                    		setFileName((String)value);break;
                    case SLOT_FILE_TYPE:
                    		setFileType((String)value);break;
                    case SLOT_BIZ_KEY:
                    		setBizKey((String)value);break;
                    case SLOT_BIZ_TYPE:
                    		setBizType((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.FileUpload\": \"" + prop + "\"");
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public void __set(String prop, Object value) {
                switch (prop) {
                    case "id":
                    		setId((String)value);break;
                    case "fileEntity":
                    		setFileEntity((FileEntity)value);break;
                    case "fileEntityId":
                    		setFileEntityId((String)value);break;
                    case "fileName":
                    		setFileName((String)value);break;
                    case "fileType":
                    		setFileType((String)value);break;
                    case "bizKey":
                    		setBizKey((String)value);break;
                    case "bizType":
                    		setBizType((String)value);break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.FileUpload\": \"" + prop + "\"");
                }
            }

            @Override
            public void __show(PropId prop, boolean visible) {
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(7);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_ID:
                    		__visibility.show(SLOT_ID, visible);break;
                    case SLOT_FILE_ENTITY:
                    		__visibility.show(SLOT_FILE_ENTITY, visible);break;
                    case SLOT_FILE_ENTITY_ID:
                    		__visibility.show(SLOT_FILE_ENTITY_ID, visible);break;
                    case SLOT_FILE_NAME:
                    		__visibility.show(SLOT_FILE_NAME, visible);break;
                    case SLOT_FILE_TYPE:
                    		__visibility.show(SLOT_FILE_TYPE, visible);break;
                    case SLOT_BIZ_KEY:
                    		__visibility.show(SLOT_BIZ_KEY, visible);break;
                    case SLOT_BIZ_TYPE:
                    		__visibility.show(SLOT_BIZ_TYPE, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property id for \"top.yangwulang.platform.entity.sys.FileUpload\": \"" + 
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
                    __modified().__visibility = __visibility = Visibility.of(7);
                }
                switch (prop) {
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
                    case "fileEntity":
                    		__visibility.show(SLOT_FILE_ENTITY, visible);break;
                    case "fileEntityId":
                    		__visibility.show(SLOT_FILE_ENTITY_ID, visible);break;
                    case "fileName":
                    		__visibility.show(SLOT_FILE_NAME, visible);break;
                    case "fileType":
                    		__visibility.show(SLOT_FILE_TYPE, visible);break;
                    case "bizKey":
                    		__visibility.show(SLOT_BIZ_KEY, visible);break;
                    case "bizType":
                    		__visibility.show(SLOT_BIZ_TYPE, visible);break;
                    default: throw new IllegalArgumentException(
                                "Illegal property name for \"top.yangwulang.platform.entity.sys.FileUpload\": \"" + 
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
                    case SLOT_FILE_ENTITY:
                    		__modified().__fileEntityLoaded = false;break;
                    case SLOT_FILE_ENTITY_ID:
                    		__unload(PropId.byIndex(SLOT_FILE_ENTITY));break;
                    case SLOT_FILE_NAME:
                    		__modified().__fileNameValue = null;break;
                    case SLOT_FILE_TYPE:
                    		__modified().__fileTypeValue = null;break;
                    case SLOT_BIZ_KEY:
                    		__modified().__bizKeyLoaded = false;break;
                    case SLOT_BIZ_TYPE:
                    		__modified().__bizTypeLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property id for \"top.yangwulang.platform.entity.sys.FileUpload\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
                }
            }

            @Override
            public void __unload(String prop) {
                switch (prop) {
                    case "id":
                    		__modified().__idValue = null;break;
                    case "fileEntity":
                    		__modified().__fileEntityLoaded = false;break;
                    case "fileEntityId":
                    		__unload(PropId.byIndex(SLOT_FILE_ENTITY));break;
                    case "fileName":
                    		__modified().__fileNameValue = null;break;
                    case "fileType":
                    		__modified().__fileTypeValue = null;break;
                    case "bizKey":
                    		__modified().__bizKeyLoaded = false;break;
                    case "bizType":
                    		__modified().__bizTypeLoaded = false;break;
                    default: throw new IllegalArgumentException("Illegal property name for \"top.yangwulang.platform.entity.sys.FileUpload\": \"" + prop + "\", it does not exist or its loaded state is not controllable");
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
                        if (base.__isLoaded(PropId.byIndex(SLOT_FILE_ENTITY))) {
                            FileEntity oldValue = base.fileEntity();
                            FileEntity newValue = __ctx.resolveObject(oldValue);
                            if (oldValue != newValue) {
                                setFileEntity(newValue);
                            }
                        }
                        __tmpModified = __modified;
                    }
                    else {
                        __tmpModified.__fileEntityValue = __ctx.resolveObject(__tmpModified.__fileEntityValue);
                    }
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

        private boolean __fileEntityLoaded;

        private FileEntity fileEntity;

        private String fileName;

        private String fileType;

        private boolean __bizKeyLoaded;

        private String bizKey;

        private boolean __bizTypeLoaded;

        private String bizType;

        public MapStruct id(String id) {
            this.id = id;
            return this;
        }

        public MapStruct fileEntity(FileEntity fileEntity) {
            this.__fileEntityLoaded = true;
            this.fileEntity = fileEntity;
            return this;
        }

        public MapStruct fileEntityId(String fileEntityId) {
            this.__fileEntityLoaded = true;
            if (fileEntityId == null) {
                this.fileEntity = null;
            } else {
                this.fileEntity = ImmutableObjects.makeIdOnly(FileEntity.class, fileEntityId);
            }
            return this;
        }

        public MapStruct fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public MapStruct fileType(String fileType) {
            this.fileType = fileType;
            return this;
        }

        public MapStruct bizKey(String bizKey) {
            this.__bizKeyLoaded = true;
            this.bizKey = bizKey;
            return this;
        }

        public MapStruct bizType(String bizType) {
            this.__bizTypeLoaded = true;
            this.bizType = bizType;
            return this;
        }

        public FileUpload build() {
            return FileUploadDraft.$.produce(draft -> {
                if (id != null) {
                    draft.setId(id);
                }
                if (__fileEntityLoaded) {
                    draft.setFileEntity(fileEntity);
                }
                if (fileName != null) {
                    draft.setFileName(fileName);
                }
                if (fileType != null) {
                    draft.setFileType(fileType);
                }
                if (__bizKeyLoaded) {
                    draft.setBizKey(bizKey);
                }
                if (__bizTypeLoaded) {
                    draft.setBizType(bizType);
                }
            });
        }
    }
}
