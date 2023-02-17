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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor // 加上该注解解决问题
@Schema(description = "角色dto")
public class RoleInput implements Input<Role> {

    private static final RoleInput.Converter CONVERTER = Mappers.getMapper(RoleInput.Converter.class);


    private String roleCode;
    private String roleName;

    private String roleType;
    private BigDecimal roleSort;
    private boolean isSys;

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
