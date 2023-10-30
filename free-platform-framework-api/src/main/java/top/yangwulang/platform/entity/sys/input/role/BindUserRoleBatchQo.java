package top.yangwulang.platform.entity.sys.input.role;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * @author yangwulang
 */
@Data
public class BindUserRoleBatchQo {
    @Schema(description = "角色id")
    private String roleId;
    @Schema(description = "待授权的ids")
    private List<String> userId;
}
