package top.yangwulang.platform.entity.sys.input;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;
import lombok.Data;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.sql.ast.query.specification.JSpecification;
import org.babyfish.jimmer.sql.ast.query.specification.SpecificationArgs;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.entity.sys.UserTable;

import javax.validation.constraints.NotEmpty;

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
