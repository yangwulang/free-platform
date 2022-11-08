package top.yangwulang.platform.services

/**
 * service层顶级的通用修改接口(删除也算修改)
 * @author yangwulang
 */
interface UpdateService<T, ID, DTO> {
    fun save(dto: DTO) : T

    fun delete(id: ID)

}