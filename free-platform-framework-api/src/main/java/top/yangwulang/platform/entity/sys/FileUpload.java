package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.*;
import top.yangwulang.platform.entity.TypeBase;

import javax.validation.constraints.Null;

@Entity
@Table(name = "sys_file_upload")
public interface FileUpload extends TypeBase {
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
    @Null FileEntity fileEntity();

    @IdView
    @Null String fileEntityId();
    
    String fileName();

    String fileType();

    @Null String bizKey();

    @Null String bizType();
}
