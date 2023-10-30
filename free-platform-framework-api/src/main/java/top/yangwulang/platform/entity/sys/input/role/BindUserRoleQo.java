package top.yangwulang.platform.entity.sys.input.role;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author yangwulang
 */
@Data
public class BindUserRoleQo {
    @Schema(description = "角色id")
    private String roleId;
    @Schema(description = "用户id")
    private String userId;
}
