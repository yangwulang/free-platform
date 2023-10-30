package top.yangwulang.platform.entity.sys.input.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.babyfish.jimmer.Input;
import org.babyfish.jimmer.sql.Id;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.sys.User;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Schema(description = "用户保存实体")
public class UserSaveInput implements Input<User> {
    private static final UserSaveInput.Converter CONVERTER = Mappers.getMapper(UserSaveInput.Converter.class);

    @Schema(description = "用户编码,用户id,为空则新增，不为空则修改")
    private String userCode;

    @NotEmpty(message = "登陆编码不能为空")
    @Schema(description = "登陆编码，用户登陆的账号", requiredMode = Schema.RequiredMode.REQUIRED)
    private String loginCode;

    @Schema(description = "用户名")
    private String userName;

    @Schema(description = "手机")
    private String mobile;

    @Schema(description = "邮件")
    private String email;

    @Schema(description = "性别")
    private String sex;

    @Schema(description = "个性签名")
    private String sign;

    @NotEmpty(message = "用户类型不能为空")
    @Schema(description = "用户类型", requiredMode = Schema.RequiredMode.REQUIRED)
    private String userType;

    @NotNull
    @Schema(description = "用户权重", requiredMode = Schema.RequiredMode.REQUIRED)
    private Integer userWeight;

    @NotNull
    @Schema(description = "管理员类型", requiredMode = Schema.RequiredMode.REQUIRED)
    private String mgrType;

    @Override
    public User toEntity() {
        return CONVERTER.toUser(this);
    }

    @Mapper
    interface Converter {

        @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        User toUser(UserSaveInput input);

    }
}
