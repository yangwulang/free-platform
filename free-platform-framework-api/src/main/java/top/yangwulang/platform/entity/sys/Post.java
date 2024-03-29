package top.yangwulang.platform.entity.sys;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.sql.*;

import jakarta.annotation.Nullable;

import top.yangwulang.platform.entity.TypeBase;

import java.util.List;

/**
 * 岗位表
 *
 * @author yangwulang
 */
@Entity
@Table(name = "sys_post")
@Schema(description = "岗位")
public interface Post extends TypeBase {

    /**
     * 岗位编码
     *
     * @return 岗位编码
     */
    @Schema(description = "岗位编码")
    @Key
    String postCode();

    /**
     * 岗位名称
     *
     * @return 岗位名称
     */
    @Schema(description = "岗位名称")
    @Key
    String postName();

    /**
     * 岗位类型（高管、中层、低层）
     *
     * @return 高管、中层、低层 此处是字典
     */
    @Schema(description = "岗位类型（高管、中层、低层）")
    @Nullable String postType();

    /**
     * 岗位下的员工
     *
     * @return 员工
     */
    @ManyToMany(mappedBy = "posts")
    List<Employee> employees();
}

