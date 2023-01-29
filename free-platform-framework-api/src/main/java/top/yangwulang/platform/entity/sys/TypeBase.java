package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.Id;
import org.babyfish.jimmer.sql.MappedSuperclass;

import javax.validation.constraints.NotNull;

/**
 * Base entity for table "sys_dict_type"
 *
 * @author yangwulang
 */
@MappedSuperclass
public interface TypeBase {
    /**
     * 字典类型编码
     * @return 主键值
     */
    @Id
    @NotNull
    String id();
}
