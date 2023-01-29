package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.Immutable;
import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.Null;

import java.time.LocalDateTime;

/**
 * 字典类型表
 * @author yangwulang
 */
@Entity
@Table(name = "sys_dict_type")
@Immutable(value = Immutable.Nullity.NULLABLE)
public interface DictType extends DataTypeBase {

    /**
     * 字典名称
     * @return 字典名称
     */
    String dictName();

    /**
     * 字典类型
     *
     * @return 字典类型
     */
    String dictType();

    /**
     * 是否系统字典
     *
     * @return 是否系统字典
     */
    boolean isSys();

}

