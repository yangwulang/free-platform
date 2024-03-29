package top.yangwulang.platform.entity.sys.input;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


@Data
public class LoginInput {

    @Schema(
            description = "登录编码（账号）"
    )
    @NotEmpty
    private String loginCode;
    @Schema(
            description = "密码"
    )
    @NotEmpty
    private String password;

}
