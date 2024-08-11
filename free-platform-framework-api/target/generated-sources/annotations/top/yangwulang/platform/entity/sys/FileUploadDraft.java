package top.yangwulang.platform.entity.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.lang.CloneNotSupportedException;
import java.lang.Cloneable;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.Collections;
import java.util.Date;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.DataTypeBaseDraft;

@GeneratedBy(
        type = FileUpload.class
)
public interface FileUploadDraft extends FileUpload, DataTypeBaseDraft {
    FileUploadDraft.Producer $ = Producer.INSTANCE;

    @OldChain
    FileUploadDraft setId(String id);

    @OldChain
    FileUploadDraft setStatus(int status);

    @OldChain
    FileUploadDraft setCreateBy(String createBy);

    @OldChain
    FileUploadDraft setCreateDate(Date createDate);

    @OldChain
    FileUploadDraft setUpdateBy(String updateBy);

    @OldChain
    FileUploadDraft setUpdateDate(Date updateDate);

    @OldChain
    FileUploadDraft setRemarks(String remarks);

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

    @GeneratedBy(
            type = FileUpload.class
    )
    class Producer {
        static final Producer INSTANCE = new Producer();

        public static final int SLOT_ID = 0;

        public static final int SLOT_STATUS = 1;

        public static final int SLOT_CREATE_BY = 2;

        public static final int SLOT_CREATE_DATE = 3;

        public static final int SLOT_UPDATE_BY = 4;

        public static final int SLOT_UPDATE_DATE = 5;

        public static final int SLOT_REMARKS = 6;

        public static final int SLOT_FILE_ENTITY = 7;

        public static final int SLOT_FILE_ENTITY_ID = 8;

        public static final int SLOT_FILE_NAME = 9;

        public static final int SLOT_FILE_TYPE = 10;

        public static final int SLOT_BIZ_KEY = 11;

        public static final int SLOT_BIZ_TYPE = 12;

        public static final ImmutableType TYPE = ImmutableType
            .newBuilder(
                "0.8.150",
                FileUpload.class,
                Collections.singleton(DataTypeBaseDraft.Producer.TYPE),
                (ctx, base) -> new DraftImpl(ctx, (FileUpload)base)
            )
            .redefine("id", SLOT_ID)
            .redefine("status", SLOT_STATUS)
            .redefine("createBy", SLOT_CREATE_BY)
            .redefine("createDate", SLOT_CREATE_DATE)
            .redefine("updateBy", SLOT_UPDATE_BY)
            .redefine("updateDate", SLOT_UPDATE_DATE)
            .redefine("remarks", SLOT_REMARKS)
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

        @GeneratedBy(
                type = FileUpload.class
        )
        @JsonPropertyOrder({"dummyPropForJacksonError__", "id", "status", "createBy", "createDate", "updateBy", "updateDate", "remarks", "fileEntity", "fileEntityId", "fileName", "fileType", "bizKey", "bizType"})
        public abstract interface Implementor extends FileUpload, ImmutableSpi {
            @Override
            default Object __get(PropId prop) {
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		return __get(prop.asName());
                    case SLOT_ID:
                    		return id();
                    case SLOT_STATUS:
                    		return (Integer)status();
                    case SLOT_CREATE_BY:
                    		return createBy();
                    case SLOT_CREATE_DATE:
                    		return createDate();
                    case SLOT_UPDATE_BY:
                    		return updateBy();
                    case SLOT_UPDATE_DATE:
                    		return updateDate();
                    case SLOT_REMARKS:
                    		return remarks();
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
                    case "status":
                    		return (Integer)status();
                    case "createBy":
                    		return createBy();
                    case "createDate":
                    		return createDate();
                    case "updateBy":
                    		return updateBy();
                    case "updateDate":
                    		return updateDate();
                    case "remarks":
                    		return remarks();
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

            @NotNull
            default String getId() {
                return id();
            }

            @Schema(
                    description = "状态"
            )
            default int getStatus() {
                return status();
            }

            @NotNull
            default String getCreateBy() {
                return createBy();
            }

            @NotNull
            default Date getCreateDate() {
                return createDate();
            }

            @NotNull
            default String getUpdateBy() {
                return updateBy();
            }

            @NotNull
            default Date getUpdateDate() {
                return updateDate();
            }

            @Nullable
            default String getRemarks() {
                return remarks();
            }

            @jakarta.annotation.Nullable
            default FileEntity getFileEntity() {
                return fileEntity();
            }

            @jakarta.annotation.Nullable
            default String getFileEntityId() {
                return fileEntityId();
            }

            default String getFileName() {
                return fileName();
            }

            default String getFileType() {
                return fileType();
            }

            @jakarta.annotation.Nullable
            default String getBizKey() {
                return bizKey();
            }

            @jakarta.annotation.Nullable
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

        @GeneratedBy(
                type = FileUpload.class
        )
        private static class Impl implements Implementor, Cloneable, Serializable {
            private Visibility __visibility;

            String __idValue;

            int __statusValue;

            boolean __statusLoaded = false;

            String __createByValue;

            Date __createDateValue;

            String __updateByValue;

            Date __updateDateValue;

            String __remarksValue;

            boolean __remarksLoaded = false;

            FileEntity __fileEntityValue;

            boolean __fileEntityLoaded = false;

            String __fileNameValue;

            String __fileTypeValue;

            String __bizKeyValue;

            boolean __bizKeyLoaded = false;

            String __bizTypeValue;

            boolean __bizTypeLoaded = false;

            Impl() {
                __visibility = Visibility.of(13);
                __visibility.show(SLOT_FILE_ENTITY_ID, false);
            }

            @Override
            @JsonIgnore
            public String id() {
                if (__idValue == null) {
                    throw new UnloadedException(FileUpload.class, "id");
                }
                return __idValue;
            }

            @Override
            @JsonIgnore
            public int status() {
                if (!__statusLoaded) {
                    throw new UnloadedException(FileUpload.class, "status");
                }
                return __statusValue;
            }

            @Override
            @JsonIgnore
            public String createBy() {
                if (__createByValue == null) {
                    throw new UnloadedException(FileUpload.class, "createBy");
                }
                return __createByValue;
            }

            @Override
            @JsonIgnore
            public Date createDate() {
                if (__createDateValue == null) {
                    throw new UnloadedException(FileUpload.class, "createDate");
                }
                return __createDateValue;
            }

            @Override
            @JsonIgnore
            public String updateBy() {
                if (__updateByValue == null) {
                    throw new UnloadedException(FileUpload.class, "updateBy");
                }
                return __updateByValue;
            }

            @Override
            @JsonIgnore
            public Date updateDate() {
                if (__updateDateValue == null) {
                    throw new UnloadedException(FileUpload.class, "updateDate");
                }
                return __updateDateValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String remarks() {
                if (!__remarksLoaded) {
                    throw new UnloadedException(FileUpload.class, "remarks");
                }
                return __remarksValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public FileEntity fileEntity() {
                if (!__fileEntityLoaded) {
                    throw new UnloadedException(FileUpload.class, "fileEntity");
                }
                return __fileEntityValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String fileEntityId() {
                FileEntity __target = fileEntity();
                return __target != null ? __target.id() : null;
            }

            @Override
            @JsonIgnore
            public String fileName() {
                if (__fileNameValue == null) {
                    throw new UnloadedException(FileUpload.class, "fileName");
                }
                return __fileNameValue;
            }

            @Override
            @JsonIgnore
            public String fileType() {
                if (__fileTypeValue == null) {
                    throw new UnloadedException(FileUpload.class, "fileType");
                }
                return __fileTypeValue;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String bizKey() {
                if (!__bizKeyLoaded) {
                    throw new UnloadedException(FileUpload.class, "bizKey");
                }
                return __bizKeyValue;
            }

            @Override
            @JsonIgnore
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
                    case SLOT_STATUS:
                    		return __statusLoaded;
                    case SLOT_CREATE_BY:
                    		return __createByValue != null;
                    case SLOT_CREATE_DATE:
                    		return __createDateValue != null;
                    case SLOT_UPDATE_BY:
                    		return __updateByValue != null;
                    case SLOT_UPDATE_DATE:
                    		return __updateDateValue != null;
                    case SLOT_REMARKS:
                    		return __remarksLoaded;
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
                    case "status":
                    		return __statusLoaded;
                    case "createBy":
                    		return __createByValue != null;
                    case "createDate":
                    		return __createDateValue != null;
                    case "updateBy":
                    		return __updateByValue != null;
                    case "updateDate":
                    		return __updateDateValue != null;
                    case "remarks":
                    		return __remarksLoaded;
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
                    case SLOT_STATUS:
                    		return __visibility.visible(SLOT_STATUS);
                    case SLOT_CREATE_BY:
                    		return __visibility.visible(SLOT_CREATE_BY);
                    case SLOT_CREATE_DATE:
                    		return __visibility.visible(SLOT_CREATE_DATE);
                    case SLOT_UPDATE_BY:
                    		return __visibility.visible(SLOT_UPDATE_BY);
                    case SLOT_UPDATE_DATE:
                    		return __visibility.visible(SLOT_UPDATE_DATE);
                    case SLOT_REMARKS:
                    		return __visibility.visible(SLOT_REMARKS);
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
                    case "status":
                    		return __visibility.visible(SLOT_STATUS);
                    case "createBy":
                    		return __visibility.visible(SLOT_CREATE_BY);
                    case "createDate":
                    		return __visibility.visible(SLOT_CREATE_DATE);
                    case "updateBy":
                    		return __visibility.visible(SLOT_UPDATE_BY);
                    case "updateDate":
                    		return __visibility.visible(SLOT_UPDATE_DATE);
                    case "remarks":
                    		return __visibility.visible(SLOT_REMARKS);
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
                if (__statusLoaded) {
                    hash = 31 * hash + Integer.hashCode(__statusValue);
                }
                if (__createByValue != null) {
                    hash = 31 * hash + __createByValue.hashCode();
                }
                if (__createDateValue != null) {
                    hash = 31 * hash + __createDateValue.hashCode();
                }
                if (__updateByValue != null) {
                    hash = 31 * hash + __updateByValue.hashCode();
                }
                if (__updateDateValue != null) {
                    hash = 31 * hash + __updateDateValue.hashCode();
                }
                if (__remarksLoaded && __remarksValue != null) {
                    hash = 31 * hash + __remarksValue.hashCode();
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
                if (__statusLoaded) {
                    hash = 31 * hash + Integer.hashCode(__statusValue);
                }
                if (__createByValue != null) {
                    hash = 31 * hash + System.identityHashCode(__createByValue);
                }
                if (__createDateValue != null) {
                    hash = 31 * hash + System.identityHashCode(__createDateValue);
                }
                if (__updateByValue != null) {
                    hash = 31 * hash + System.identityHashCode(__updateByValue);
                }
                if (__updateDateValue != null) {
                    hash = 31 * hash + System.identityHashCode(__updateDateValue);
                }
                if (__remarksLoaded) {
                    hash = 31 * hash + System.identityHashCode(__remarksValue);
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
                if (__isVisible(PropId.byIndex(SLOT_STATUS)) != __other.__isVisible(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                boolean __statusLoaded = this.__statusLoaded;
                if (__statusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                if (__statusLoaded && __statusValue != __other.status()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                boolean __createByLoaded = __createByValue != null;
                if (__createByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                if (__createByLoaded && !Objects.equals(__createByValue, __other.createBy())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                boolean __createDateLoaded = __createDateValue != null;
                if (__createDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                if (__createDateLoaded && !Objects.equals(__createDateValue, __other.createDate())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                boolean __updateByLoaded = __updateByValue != null;
                if (__updateByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                if (__updateByLoaded && !Objects.equals(__updateByValue, __other.updateBy())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                boolean __updateDateLoaded = __updateDateValue != null;
                if (__updateDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                if (__updateDateLoaded && !Objects.equals(__updateDateValue, __other.updateDate())) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REMARKS)) != __other.__isVisible(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                boolean __remarksLoaded = this.__remarksLoaded;
                if (__remarksLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                if (__remarksLoaded && !Objects.equals(__remarksValue, __other.remarks())) {
                    return false;
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
                if (__isVisible(PropId.byIndex(SLOT_STATUS)) != __other.__isVisible(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                boolean __statusLoaded = this.__statusLoaded;
                if (__statusLoaded != __other.__isLoaded(PropId.byIndex(SLOT_STATUS))) {
                    return false;
                }
                if (__statusLoaded && __statusValue != __other.status()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                boolean __createByLoaded = __createByValue != null;
                if (__createByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_BY))) {
                    return false;
                }
                if (__createByLoaded && __createByValue != __other.createBy()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_CREATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                boolean __createDateLoaded = __createDateValue != null;
                if (__createDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_CREATE_DATE))) {
                    return false;
                }
                if (__createDateLoaded && __createDateValue != __other.createDate()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_BY)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                boolean __updateByLoaded = __updateByValue != null;
                if (__updateByLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_BY))) {
                    return false;
                }
                if (__updateByLoaded && __updateByValue != __other.updateBy()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_UPDATE_DATE)) != __other.__isVisible(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                boolean __updateDateLoaded = __updateDateValue != null;
                if (__updateDateLoaded != __other.__isLoaded(PropId.byIndex(SLOT_UPDATE_DATE))) {
                    return false;
                }
                if (__updateDateLoaded && __updateDateValue != __other.updateDate()) {
                    return false;
                }
                if (__isVisible(PropId.byIndex(SLOT_REMARKS)) != __other.__isVisible(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                boolean __remarksLoaded = this.__remarksLoaded;
                if (__remarksLoaded != __other.__isLoaded(PropId.byIndex(SLOT_REMARKS))) {
                    return false;
                }
                if (__remarksLoaded && __remarksValue != __other.remarks()) {
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

        @GeneratedBy(
                type = FileUpload.class
        )
        private static class DraftImpl implements Implementor, DraftSpi, FileUploadDraft {
            private DraftContext __ctx;

            private Impl __base;

            private Impl __modified;

            private boolean __resolving;

            private FileUpload __resolved;

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
                return ImmutableObjects.toString(this);
            }

            @Override
            @JsonIgnore
            public String id() {
                return (__modified!= null ? __modified : __base).id();
            }

            @Override
            public FileUploadDraft setId(String id) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
            @JsonIgnore
            public int status() {
                return (__modified!= null ? __modified : __base).status();
            }

            @Override
            public FileUploadDraft setStatus(int status) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__statusValue = status;
                __tmpModified.__statusLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            public String createBy() {
                return (__modified!= null ? __modified : __base).createBy();
            }

            @Override
            public FileUploadDraft setCreateBy(String createBy) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (createBy == null) {
                    throw new IllegalArgumentException(
                        "'createBy' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__createByValue = createBy;
                return this;
            }

            @Override
            @JsonIgnore
            public Date createDate() {
                return (__modified!= null ? __modified : __base).createDate();
            }

            @Override
            public FileUploadDraft setCreateDate(Date createDate) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (createDate == null) {
                    throw new IllegalArgumentException(
                        "'createDate' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__createDateValue = createDate;
                return this;
            }

            @Override
            @JsonIgnore
            public String updateBy() {
                return (__modified!= null ? __modified : __base).updateBy();
            }

            @Override
            public FileUploadDraft setUpdateBy(String updateBy) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (updateBy == null) {
                    throw new IllegalArgumentException(
                        "'updateBy' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__updateByValue = updateBy;
                return this;
            }

            @Override
            @JsonIgnore
            public Date updateDate() {
                return (__modified!= null ? __modified : __base).updateDate();
            }

            @Override
            public FileUploadDraft setUpdateDate(Date updateDate) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (updateDate == null) {
                    throw new IllegalArgumentException(
                        "'updateDate' cannot be null, please specify non-null value or use nullable annotation to decorate this property"
                    );
                }
                Impl __tmpModified = __modified();
                __tmpModified.__updateDateValue = updateDate;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String remarks() {
                return (__modified!= null ? __modified : __base).remarks();
            }

            @Override
            public FileUploadDraft setRemarks(String remarks) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__remarksValue = remarks;
                __tmpModified.__remarksLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
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
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
            @JsonIgnore
            @Nullable
            public String fileEntityId() {
                FileEntity __target = fileEntity();
                return __target != null ? __target.id() : null;
            }

            @Override
            public FileUploadDraft setFileEntityId(String fileEntityId) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                if (fileEntityId != null) {
                    setFileEntity(ImmutableObjects.makeIdOnly(FileEntity.class, fileEntityId));
                } else {
                    setFileEntity(null);
                }
                return this;
            }

            @Override
            @JsonIgnore
            public String fileName() {
                return (__modified!= null ? __modified : __base).fileName();
            }

            @Override
            public FileUploadDraft setFileName(String fileName) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
            @JsonIgnore
            public String fileType() {
                return (__modified!= null ? __modified : __base).fileType();
            }

            @Override
            public FileUploadDraft setFileType(String fileType) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
            @JsonIgnore
            @Nullable
            public String bizKey() {
                return (__modified!= null ? __modified : __base).bizKey();
            }

            @Override
            public FileUploadDraft setBizKey(String bizKey) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Impl __tmpModified = __modified();
                __tmpModified.__bizKeyValue = bizKey;
                __tmpModified.__bizKeyLoaded = true;
                return this;
            }

            @Override
            @JsonIgnore
            @Nullable
            public String bizType() {
                return (__modified!= null ? __modified : __base).bizType();
            }

            @Override
            public FileUploadDraft setBizType(String bizType) {
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
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
                    case SLOT_STATUS:
                    		if (value == null) throw new IllegalArgumentException("'status' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setStatus((Integer)value);
                            break;
                    case SLOT_CREATE_BY:
                    		setCreateBy((String)value);break;
                    case SLOT_CREATE_DATE:
                    		setCreateDate((Date)value);break;
                    case SLOT_UPDATE_BY:
                    		setUpdateBy((String)value);break;
                    case SLOT_UPDATE_DATE:
                    		setUpdateDate((Date)value);break;
                    case SLOT_REMARKS:
                    		setRemarks((String)value);break;
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
                    case "status":
                    		if (value == null) throw new IllegalArgumentException("'status' cannot be null, if you want to set null, please use any annotation whose simple name is \"Nullable\" to decorate the property");
                            setStatus((Integer)value);
                            break;
                    case "createBy":
                    		setCreateBy((String)value);break;
                    case "createDate":
                    		setCreateDate((Date)value);break;
                    case "updateBy":
                    		setUpdateBy((String)value);break;
                    case "updateDate":
                    		setUpdateDate((Date)value);break;
                    case "remarks":
                    		setRemarks((String)value);break;
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
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(13);
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__show(prop.asName(), visible);
                    return;
                    case SLOT_ID:
                    		__visibility.show(SLOT_ID, visible);break;
                    case SLOT_STATUS:
                    		__visibility.show(SLOT_STATUS, visible);break;
                    case SLOT_CREATE_BY:
                    		__visibility.show(SLOT_CREATE_BY, visible);break;
                    case SLOT_CREATE_DATE:
                    		__visibility.show(SLOT_CREATE_DATE, visible);break;
                    case SLOT_UPDATE_BY:
                    		__visibility.show(SLOT_UPDATE_BY, visible);break;
                    case SLOT_UPDATE_DATE:
                    		__visibility.show(SLOT_UPDATE_DATE, visible);break;
                    case SLOT_REMARKS:
                    		__visibility.show(SLOT_REMARKS, visible);break;
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
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                Visibility __visibility = (__modified!= null ? __modified : __base).__visibility;
                if (__visibility == null) {
                    if (visible) {
                        return;
                    }
                    __modified().__visibility = __visibility = Visibility.of(13);
                }
                switch (prop) {
                    case "id":
                    		__visibility.show(SLOT_ID, visible);break;
                    case "status":
                    		__visibility.show(SLOT_STATUS, visible);break;
                    case "createBy":
                    		__visibility.show(SLOT_CREATE_BY, visible);break;
                    case "createDate":
                    		__visibility.show(SLOT_CREATE_DATE, visible);break;
                    case "updateBy":
                    		__visibility.show(SLOT_UPDATE_BY, visible);break;
                    case "updateDate":
                    		__visibility.show(SLOT_UPDATE_DATE, visible);break;
                    case "remarks":
                    		__visibility.show(SLOT_REMARKS, visible);break;
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
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                int __propIndex = prop.asIndex();
                switch (__propIndex) {
                    case -1:
                    		__unload(prop.asName());
                    return;
                    case SLOT_ID:
                    		__modified().__idValue = null;break;
                    case SLOT_STATUS:
                    		__modified().__statusLoaded = false;break;
                    case SLOT_CREATE_BY:
                    		__modified().__createByValue = null;break;
                    case SLOT_CREATE_DATE:
                    		__modified().__createDateValue = null;break;
                    case SLOT_UPDATE_BY:
                    		__modified().__updateByValue = null;break;
                    case SLOT_UPDATE_DATE:
                    		__modified().__updateDateValue = null;break;
                    case SLOT_REMARKS:
                    		__modified().__remarksLoaded = false;break;
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
                if (__resolved != null) {
                    throw new IllegalStateException("The current draft has been resolved so it cannot be modified");
                }
                switch (prop) {
                    case "id":
                    		__modified().__idValue = null;break;
                    case "status":
                    		__modified().__statusLoaded = false;break;
                    case "createBy":
                    		__modified().__createByValue = null;break;
                    case "createDate":
                    		__modified().__createDateValue = null;break;
                    case "updateBy":
                    		__modified().__updateByValue = null;break;
                    case "updateDate":
                    		__modified().__updateDateValue = null;break;
                    case "remarks":
                    		__modified().__remarksLoaded = false;break;
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
                if (__resolved != null) {
                    return __resolved;
                }
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
                        this.__resolved = base;
                        return base;
                    }
                    this.__resolved = __tmpModified;
                    return __tmpModified;
                }
                finally {
                    __resolving = false;
                }
            }

            @Override
            public boolean __isResolved() {
                return __resolved != null;
            }

            Impl __modified() {
                Impl __tmpModified = __modified;
                if (__tmpModified == null) {
                    __tmpModified = __base.clone();
                    __modified = __tmpModified;
                }
                return __tmpModified;
            }
        }
    }

    @GeneratedBy(
            type = FileUpload.class
    )
    class Builder {
        private final Producer.DraftImpl __draft;

        public Builder() {
            __draft = new Producer.DraftImpl(null, null);
            __draft.__show(PropId.byIndex(Producer.SLOT_FILE_ENTITY), false);
            __draft.__show(PropId.byIndex(Producer.SLOT_FILE_ENTITY_ID), false);
        }

        @NotNull
        public Builder id(String id) {
            if (id != null) {
                __draft.setId(id);
            }
            return this;
        }

        @Schema(
                description = "状态"
        )
        public Builder status(Integer status) {
            if (status != null) {
                __draft.setStatus(status);
            }
            return this;
        }

        @NotNull
        public Builder createBy(String createBy) {
            if (createBy != null) {
                __draft.setCreateBy(createBy);
            }
            return this;
        }

        @NotNull
        public Builder createDate(Date createDate) {
            if (createDate != null) {
                __draft.setCreateDate(createDate);
            }
            return this;
        }

        @NotNull
        public Builder updateBy(String updateBy) {
            if (updateBy != null) {
                __draft.setUpdateBy(updateBy);
            }
            return this;
        }

        @NotNull
        public Builder updateDate(Date updateDate) {
            if (updateDate != null) {
                __draft.setUpdateDate(updateDate);
            }
            return this;
        }

        @Nullable
        public Builder remarks(String remarks) {
            __draft.setRemarks(remarks);
            return this;
        }

        @jakarta.annotation.Nullable
        public Builder fileEntity(FileEntity fileEntity) {
            __draft.setFileEntity(fileEntity);
            __draft.__show(PropId.byIndex(Producer.SLOT_FILE_ENTITY), true);
            return this;
        }

        @jakarta.annotation.Nullable
        public Builder fileEntityId(String fileEntityId) {
            __draft.setFileEntityId(fileEntityId);
            __draft.__show(PropId.byIndex(Producer.SLOT_FILE_ENTITY_ID), true);
            return this;
        }

        public Builder fileName(String fileName) {
            if (fileName != null) {
                __draft.setFileName(fileName);
            }
            return this;
        }

        public Builder fileType(String fileType) {
            if (fileType != null) {
                __draft.setFileType(fileType);
            }
            return this;
        }

        @jakarta.annotation.Nullable
        public Builder bizKey(String bizKey) {
            __draft.setBizKey(bizKey);
            return this;
        }

        @jakarta.annotation.Nullable
        public Builder bizType(String bizType) {
            __draft.setBizType(bizType);
            return this;
        }

        public FileUpload build() {
            return (FileUpload)__draft.__modified();
        }
    }
}
