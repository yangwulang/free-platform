package top.yangwulang.platform.services

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

/**
 * 对 BaseService 接口进行封装方法，形成统一CRUD的结构，避免写重复代码
 *
 * @author yangwulang
 */
abstract class BaseServiceImpl<T, ID, DTO, REPO> : BaseService<T, ID, DTO>
        where REPO : JpaRepository<T, ID>, REPO : JpaSpecificationExecutor<T> {

    @Autowired
    lateinit var repository: REPO

    val logger: Logger = LoggerFactory.getLogger(this.javaClass)

    override fun findList(dto: DTO): List<T> {
        return repository.findAll(createWhere(dto))
    }

    override fun findList(spec: Specification<T>): List<T> {
        return repository.findAll(spec)
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

    /**
     * 此处添加条件，当调用findList或者findPage时会默认使用此方法的 predicates 条件进行过滤数据
     */
    abstract fun where(
        dto: DTO,
        root: Root<T>,
        criteriaQuery: CriteriaQuery<*>,
        cb: CriteriaBuilder,
        predicates: MutableList<Predicate>
    )

    /**
     * 创建where条件,用于条件查询
     */
    fun createWhere(dto: DTO): Specification<T> {
        return Specification.where { root, criteriaQuery, cb ->
            val predicates = arrayListOf<Predicate>()
            where(dto, root, criteriaQuery, cb, predicates)
            criteriaQuery.where(*predicates.toTypedArray()).restriction
        }
    }
}