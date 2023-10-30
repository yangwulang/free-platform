package top.yangwulang.platform.entity.sys;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.Table;
import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.Key;

import javax.validation.constraints.Null;

import top.yangwulang.platform.entity.DataTypeBaseNoStatus;

/**
 * 参数配置表
 *
 * @author yangwulang
 */
@Table(name = "sys_config")
@Entity
public interface Config extends DataTypeBaseNoStatus {

    /**
     * 名称
     *
     * @return 配置名称
     */
    @Schema(description = "配置名称")
    String configName();

    /**
     * 参数键
     *
     * @return 键
     */
    @Schema(description = "参数键")
    @Key
    String configKey();

    /**
     * 参数值
     *
     * @return 值
     */
    @Schema(description = "参数值")
    @Null String configValue();


}

