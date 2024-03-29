package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.*;
import top.yangwulang.platform.entity.DataTypeBase;

import jakarta.annotation.Nullable;

@Entity
@Table(name = "sys_file_upload")
public interface FileUpload extends DataTypeBase {
    /**
     * 文件类型-图片
     */
    String FILE_TYPE_IMAGE = "image";
    /**
     * 文件类型-媒体
     */
    String FILE_TYPE_MEDIA = "media";
    /**
     * 文件类型-文件
     */
    String FILE_TYPE_FILE = "file";
    @Key
    @ManyToOne
    @OnDissociate(DissociateAction.DELETE)
    @Nullable FileEntity fileEntity();

    @IdView
    @Nullable String fileEntityId();
    
    String fileName();

    String fileType();

    @Nullable String bizKey();

    @Nullable String bizType();
}
