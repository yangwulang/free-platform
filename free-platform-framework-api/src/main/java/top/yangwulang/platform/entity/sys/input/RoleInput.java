package top.yangwulang.platform.entity.sys.input;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.babyfish.jimmer.Input;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.sys.Role;

import java.math.BigDecimal;

/**
 * 角色保存入参
 *
 * @author yangwulang
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "角色dto")
public class RoleInput implements Input<Role> {

    private static final RoleInput.Converter CONVERTER = Mappers.getMapper(RoleInput.Converter.class);


    @Schema(description = "角色编码")
    private String roleCode;
    @Schema(description = "角色名称")
    private String roleName;
    @Schema(description = "角色类型")
    private String roleType;
    @Schema(description = "排序")
    private BigDecimal roleSort;
    @Schema(description = "是否系统内置")
    private boolean isSys;
    @Schema(description = "用户类型")
    private String userType;
    private String dataScope;
    private String bizScope;

    @Override
    public Role toEntity() {
        return CONVERTER.toRole(this);
    }

    @Mapper
    interface Converter {

        @BeanMapping(unmappedTargetPolicy = ReportingPolicy.IGNORE)
        Role toRole(RoleInput input);

    }
}
