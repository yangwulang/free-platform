package top.yangwulang.platform.entity.sys.dto;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import java.util.Objects;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.FileEntity;
import top.yangwulang.platform.entity.sys.FileEntityDraft;
import top.yangwulang.platform.entity.sys.FileEntityFetcher;
import top.yangwulang.platform.entity.sys.FileUpload;
import top.yangwulang.platform.entity.sys.FileUploadDraft;
import top.yangwulang.platform.entity.sys.FileUploadFetcher;

@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/FileUpload.dto"
)
public class FileUploadView implements View<FileUpload> {
    public static final DtoMetadata<FileUpload, FileUploadView> METADATA = 
        new DtoMetadata<FileUpload, FileUploadView>(
            FileUploadFetcher.$
                .createBy()
                .createDate()
                .updateBy()
                .updateDate()
                .remarks()
                .fileName()
                .fileType()
                .bizKey()
                .bizType()
                .fileEntity(TargetOf_fileEntity.METADATA.getFetcher()),
            FileUploadView::new
    );

    private static final DtoPropAccessor FILE_ENTITY_ACCESSOR = new DtoPropAccessor(
        true,
        new int[] { FileUploadDraft.Producer.SLOT_FILE_ENTITY },
        DtoPropAccessor.<FileEntity, TargetOf_fileEntity>objectReferenceGetter(TargetOf_fileEntity::new),
        DtoPropAccessor.objectReferenceSetter(TargetOf_fileEntity::toEntity)
    );

    private String id;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String fileName;

    private String fileType;

    private String bizKey;

    private String bizType;

    private TargetOf_fileEntity fileEntity;

    public FileUploadView() {
    }

    public FileUploadView(@NotNull FileUpload base) {
        this.id = base.id();
        this.createBy = base.createBy();
        this.createDate = base.createDate();
        this.updateBy = base.updateBy();
        this.updateDate = base.updateDate();
        this.remarks = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(FileUploadDraft.Producer.SLOT_REMARKS)) ? base.remarks() : null;
        this.fileName = base.fileName();
        this.fileType = base.fileType();
        this.bizKey = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(FileUploadDraft.Producer.SLOT_BIZ_KEY)) ? base.bizKey() : null;
        this.bizType = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(FileUploadDraft.Producer.SLOT_BIZ_TYPE)) ? base.bizType() : null;
        this.fileEntity = FILE_ENTITY_ACCESSOR.get(base);
    }

    /**
     * 字典类型编码
     * @return 主键值
     */
    @NotNull
    public String getId() {
        if (id == null) {
            throw new IllegalStateException("The property \"id\" is not specified");
        }
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

    /**
     * 创建者
     *
     * @return 创建者
     */
    @NotNull
    public String getCreateBy() {
        if (createBy == null) {
            throw new IllegalStateException("The property \"createBy\" is not specified");
        }
        return createBy;
    }

    public void setCreateBy(@NotNull String createBy) {
        this.createBy = createBy;
    }

    /**
     * 创建时间
     *
     * @return 创建时间
     */
    @NotNull
    public Date getCreateDate() {
        if (createDate == null) {
            throw new IllegalStateException("The property \"createDate\" is not specified");
        }
        return createDate;
    }

    public void setCreateDate(@NotNull Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 更新者
     *
     * @return 更新者
     */
    @NotNull
    public String getUpdateBy() {
        if (updateBy == null) {
            throw new IllegalStateException("The property \"updateBy\" is not specified");
        }
        return updateBy;
    }

    public void setUpdateBy(@NotNull String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 更新时间
     *
     * @return 更新时间
     */
    @NotNull
    public Date getUpdateDate() {
        if (updateDate == null) {
            throw new IllegalStateException("The property \"updateDate\" is not specified");
        }
        return updateDate;
    }

    public void setUpdateDate(@NotNull Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 备注信息
     *
     * @return 备注信息
     */
    @Nullable
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(@Nullable String remarks) {
        this.remarks = remarks;
    }

    @NotNull
    public String getFileName() {
        if (fileName == null) {
            throw new IllegalStateException("The property \"fileName\" is not specified");
        }
        return fileName;
    }

    public void setFileName(@NotNull String fileName) {
        this.fileName = fileName;
    }

    @NotNull
    public String getFileType() {
        if (fileType == null) {
            throw new IllegalStateException("The property \"fileType\" is not specified");
        }
        return fileType;
    }

    public void setFileType(@NotNull String fileType) {
        this.fileType = fileType;
    }

    @Nullable
    public String getBizKey() {
        return bizKey;
    }

    public void setBizKey(@Nullable String bizKey) {
        this.bizKey = bizKey;
    }

    @Nullable
    public String getBizType() {
        return bizType;
    }

    public void setBizType(@Nullable String bizType) {
        this.bizType = bizType;
    }

    @Nullable
    public TargetOf_fileEntity getFileEntity() {
        return fileEntity;
    }

    public void setFileEntity(@Nullable TargetOf_fileEntity fileEntity) {
        this.fileEntity = fileEntity;
    }

    @Override
    public FileUpload toEntity() {
        return FileUploadDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setCreateBy(createBy);
            __draft.setCreateDate(createDate);
            __draft.setUpdateBy(updateBy);
            __draft.setUpdateDate(updateDate);
            __draft.setRemarks(remarks);
            __draft.setFileName(fileName);
            __draft.setFileType(fileType);
            __draft.setBizKey(bizKey);
            __draft.setBizType(bizType);
            FILE_ENTITY_ACCESSOR.set(__draft, fileEntity);
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(createBy);
        hash = hash * 31 + Objects.hashCode(createDate);
        hash = hash * 31 + Objects.hashCode(updateBy);
        hash = hash * 31 + Objects.hashCode(updateDate);
        hash = hash * 31 + Objects.hashCode(remarks);
        hash = hash * 31 + Objects.hashCode(fileName);
        hash = hash * 31 + Objects.hashCode(fileType);
        hash = hash * 31 + Objects.hashCode(bizKey);
        hash = hash * 31 + Objects.hashCode(bizType);
        hash = hash * 31 + Objects.hashCode(fileEntity);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        FileUploadView other = (FileUploadView) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(createBy, other.createBy)) {
            return false;
        }
        if (!Objects.equals(createDate, other.createDate)) {
            return false;
        }
        if (!Objects.equals(updateBy, other.updateBy)) {
            return false;
        }
        if (!Objects.equals(updateDate, other.updateDate)) {
            return false;
        }
        if (!Objects.equals(remarks, other.remarks)) {
            return false;
        }
        if (!Objects.equals(fileName, other.fileName)) {
            return false;
        }
        if (!Objects.equals(fileType, other.fileType)) {
            return false;
        }
        if (!Objects.equals(bizKey, other.bizKey)) {
            return false;
        }
        if (!Objects.equals(bizType, other.bizType)) {
            return false;
        }
        if (!Objects.equals(fileEntity, other.fileEntity)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FileUploadView").append('(');
        builder.append("id=").append(id);
        builder.append(", createBy=").append(createBy);
        builder.append(", createDate=").append(createDate);
        builder.append(", updateBy=").append(updateBy);
        builder.append(", updateDate=").append(updateDate);
        builder.append(", remarks=").append(remarks);
        builder.append(", fileName=").append(fileName);
        builder.append(", fileType=").append(fileType);
        builder.append(", bizKey=").append(bizKey);
        builder.append(", bizType=").append(bizType);
        builder.append(", fileEntity=").append(fileEntity);
        builder.append(')');
        return builder.toString();
    }

    @GeneratedBy
    public static class TargetOf_fileEntity implements View<FileEntity> {
        public static final DtoMetadata<FileEntity, TargetOf_fileEntity> METADATA = 
            new DtoMetadata<FileEntity, TargetOf_fileEntity>(
                FileEntityFetcher.$
                    .fileMd5()
                    .filePath()
                    .fileContentType()
                    .fileMeta(),
                TargetOf_fileEntity::new
        );

        private String id;

        private String fileMd5;

        private String filePath;

        private String fileContentType;

        private String fileMeta;

        public TargetOf_fileEntity() {
        }

        public TargetOf_fileEntity(@NotNull FileEntity base) {
            this.id = base.id();
            this.fileMd5 = base.fileMd5();
            this.filePath = base.filePath();
            this.fileContentType = base.fileContentType();
            this.fileMeta = ((ImmutableSpi)base).__isLoaded(PropId.byIndex(FileEntityDraft.Producer.SLOT_FILE_META)) ? base.fileMeta() : null;
        }

        /**
         * 字典类型编码
         * @return 主键值
         */
        @NotNull
        public String getId() {
            if (id == null) {
                throw new IllegalStateException("The property \"id\" is not specified");
            }
            return id;
        }

        public void setId(@NotNull String id) {
            this.id = id;
        }

        @NotNull
        public String getFileMd5() {
            if (fileMd5 == null) {
                throw new IllegalStateException("The property \"fileMd5\" is not specified");
            }
            return fileMd5;
        }

        public void setFileMd5(@NotNull String fileMd5) {
            this.fileMd5 = fileMd5;
        }

        @NotNull
        public String getFilePath() {
            if (filePath == null) {
                throw new IllegalStateException("The property \"filePath\" is not specified");
            }
            return filePath;
        }

        public void setFilePath(@NotNull String filePath) {
            this.filePath = filePath;
        }

        @NotNull
        public String getFileContentType() {
            if (fileContentType == null) {
                throw new IllegalStateException("The property \"fileContentType\" is not specified");
            }
            return fileContentType;
        }

        public void setFileContentType(@NotNull String fileContentType) {
            this.fileContentType = fileContentType;
        }

        @Nullable
        public String getFileMeta() {
            return fileMeta;
        }

        public void setFileMeta(@Nullable String fileMeta) {
            this.fileMeta = fileMeta;
        }

        @Override
        public FileEntity toEntity() {
            return FileEntityDraft.$.produce(__draft -> {
                __draft.setId(id);
                __draft.setFileMd5(fileMd5);
                __draft.setFilePath(filePath);
                __draft.setFileContentType(fileContentType);
                __draft.setFileMeta(fileMeta);
            });
        }

        @Override
        public int hashCode() {
            int hash = Objects.hashCode(id);
            hash = hash * 31 + Objects.hashCode(fileMd5);
            hash = hash * 31 + Objects.hashCode(filePath);
            hash = hash * 31 + Objects.hashCode(fileContentType);
            hash = hash * 31 + Objects.hashCode(fileMeta);
            return hash;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            TargetOf_fileEntity other = (TargetOf_fileEntity) o;
            if (!Objects.equals(id, other.id)) {
                return false;
            }
            if (!Objects.equals(fileMd5, other.fileMd5)) {
                return false;
            }
            if (!Objects.equals(filePath, other.filePath)) {
                return false;
            }
            if (!Objects.equals(fileContentType, other.fileContentType)) {
                return false;
            }
            if (!Objects.equals(fileMeta, other.fileMeta)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("FileUploadView.TargetOf_fileEntity").append('(');
            builder.append("id=").append(id);
            builder.append(", fileMd5=").append(fileMd5);
            builder.append(", filePath=").append(filePath);
            builder.append(", fileContentType=").append(fileContentType);
            builder.append(", fileMeta=").append(fileMeta);
            builder.append(')');
            return builder.toString();
        }
    }
}
