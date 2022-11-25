package top.yangwulang.platform.services

interface BaseService<T, ID, DTO> : QueryService<T, ID, DTO>, UpdateService<T, ID, DTO> {
}