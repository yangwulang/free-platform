package top.yangwulang.platform.services

interface UpdateService<T, ID, DTO> {
    fun save(dto: DTO) : T

    fun delete(id: ID)

}