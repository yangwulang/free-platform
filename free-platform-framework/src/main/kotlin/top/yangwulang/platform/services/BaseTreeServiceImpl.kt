package top.yangwulang.platform.services

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

abstract class BaseTreeServiceImpl<T, ID, DTO, REPO> : BaseServiceImpl<T, ID, DTO, REPO>()
        where REPO : JpaRepository<T, ID>, REPO : JpaSpecificationExecutor<T> {
    override fun save(dto: DTO): T {
        TODO("Not yet implemented")
    }
}