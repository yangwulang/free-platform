package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.Key;
import org.babyfish.jimmer.sql.Table;
import top.yangwulang.platform.entity.TypeBase;

import javax.validation.constraints.Null;

@Entity
@Table(name = "sys_file_entity")
public interface FileEntity extends TypeBase {
    @Key
    String fileMd5();

    String filePath();

    String fileContentType();

    @Null String fileMeta();
}
