package top.yangwulang.platform.factory

import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers
import top.yangwulang.platform.entity.sys.SysUser
import top.yangwulang.platform.entity.sys.vo.UserVo

@Mapper(componentModel = "spring")
interface UserFactory {

    fun convertToVo(sysUser: SysUser): UserVo

}