package top.yangwulang.platform.entity.sys.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangwulang
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Schema(description = "角色菜单vo")
public class RoleMenuVo {
    @Schema(description = "角色编码")
    private String roleCode;
    @Schema(description = "角色所拥有的菜单id")
    private List<String> menuIds = new ArrayList<>();
}
