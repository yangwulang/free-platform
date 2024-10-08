package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.Column;
import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.Key;
import org.babyfish.jimmer.sql.Table;
import top.yangwulang.platform.entity.TypeBase;

import jakarta.annotation.Nullable;

@Entity
@Table(name = "sys_file_entity")
public interface FileEntity extends TypeBase {
    @Key
    @Column(name = "file_md_5")
    String fileMd5();

    String filePath();

    String fileContentType();

    @Nullable String fileMeta();
}
