package top.yangwulang.platform.entity.sys.input;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-16T20:52:18+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
class RoleInput$ConverterImpl implements RoleInput.Converter {

    @Override
    public Role toRole(RoleInput input) {
        if ( input == null ) {
            return null;
        }

        RoleDraft.MapStruct role = new RoleDraft.MapStruct();

        return role.build();
    }
}
