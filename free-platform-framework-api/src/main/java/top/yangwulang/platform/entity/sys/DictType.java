package top.yangwulang.platform.entity.sys;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(name = "字典类型", description = "字典类型标签")
public interface DictType extends DataTypeBase {

    /**
     * 字典名称
     * @return 字典名称
     */
    @Schema(description = "字典名称")
    String dictName();

    /**
     * 字典类型
     *
     * @return 字典类型
     */
    @Schema(description = "字典类型标签")
    @Key
    String dictType();

    /**
     * 是否系统字典
     *
     * @return 是否系统字典
     */
    @Schema(description = "是否系统自带")
    @Column(name = "is_sys")
    boolean isSys();

}

