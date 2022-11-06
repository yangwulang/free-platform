package top.yangwulang.platform.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import javax.annotation.Resource
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

abstract class BaseServiceImpl<T, ID, DTO, REPO> : BaseService<T, ID, DTO>
        where REPO : JpaRepository<T, ID>, REPO : JpaSpecificationExecutor<T> {

    @Autowired
    lateinit var repository: REPO

    override fun findList(dto: DTO): List<T> {
        return repository.findAll(createWhere(dto))
    }

    override fun findPage(dto: DTO, pageable: Pageable): Page<T> {
        return repository.findAll(createWhere(dto), pageable)
    }

    override fun findById(id: ID): T? {
        return repository.findById(id).orElse(null)
    }

    override fun delete(id: ID) {
        if (repository.existsById(id)) {
            this.repository.deleteById(id)
        }
    }

    abstract fun where(
        dto: DTO,
        root: Root<T>,
        criteriaQuery: CriteriaQuery<*>,
        cb: CriteriaBuilder,
        predicates: MutableList<Predicate>
    )

    fun createWhere(dto: DTO): Specification<T> {
        return Specification.where { root, criteriaQuery, cb ->
            val predicates = arrayListOf<Predicate>()
            where(dto, root, criteriaQuery, cb, predicates)
            criteriaQuery.where(*predicates.toTypedArray()).restriction
        }
    }
}