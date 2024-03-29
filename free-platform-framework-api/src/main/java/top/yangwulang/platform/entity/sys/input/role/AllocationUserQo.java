package top.yangwulang.platform.entity.sys.input.role;

import lombok.Data;

import jakarta.validation.constraints.NotEmpty;

/**
 * @author yangwulang
 */
@Data
public class AllocationUserQo {

    @NotEmpty(message = "角色id不能为空")
    private String roleId;
}
