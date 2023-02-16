package top.yangwulang.platform.entity.sys.input;

import org.babyfish.jimmer.Input;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import top.yangwulang.platform.entity.sys.Role;

public class RoleInput implements Input<Role> {

    private static final RoleInput.Converter CONVERTER = Mappers.getMapper(RoleInput.Converter.class);

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
