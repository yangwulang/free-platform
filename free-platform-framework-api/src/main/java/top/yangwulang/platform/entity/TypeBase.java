package top.yangwulang.platform.entity;

import org.babyfish.jimmer.sql.Id;
import org.babyfish.jimmer.sql.MappedSuperclass;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

/**
 * Base entity
 *
 * @author yangwulang
 */
@MappedSuperclass
public interface TypeBase extends Serializable {
    /**
     * 字典类型编码
     * @return 主键值
     */
    @Id
    @NotNull
    String id();
}
