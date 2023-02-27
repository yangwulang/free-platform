package top.yangwulang.platform.entity.sys.input;

import javax.annotation.processing.Generated;
import top.yangwulang.platform.entity.sys.Role;
import top.yangwulang.platform.entity.sys.RoleDraft;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-27T12:42:50+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
class RoleInput$ConverterImpl implements RoleInput.Converter {

    @Override
    public Role toRole(RoleInput input) {
        if ( input == null ) {
            return null;
        }

        RoleDraft.MapStruct role = new RoleDraft.MapStruct();

        role.roleCode( input.getRoleCode() );
        role.roleName( input.getRoleName() );
        role.roleType( input.getRoleType() );
        role.roleSort( input.getRoleSort() );
        role.sys( input.isSys() );
        role.userType( input.getUserType() );
        role.dataScope( input.getDataScope() );
        role.bizScope( input.getBizScope() );

        return role.build();
    }
}
