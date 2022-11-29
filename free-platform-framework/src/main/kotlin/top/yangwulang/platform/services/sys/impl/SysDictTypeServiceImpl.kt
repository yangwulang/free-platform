package top.yangwulang.platform.services.sys.impl

import org.springframework.data.jpa.repository.Modifying
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import top.yangwulang.platform.entity.sys.SysDictType
import top.yangwulang.platform.repository.sys.SysDictTypeRepository
import top.yangwulang.platform.services.BaseServiceImpl
import top.yangwulang.platform.services.sys.SysDictTypeService
import java.util.*
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

@Service
class SysDictTypeServiceImpl :
    BaseServiceImpl<SysDictType, String, SysDictType, SysDictTypeRepository>(),
    SysDictTypeService {

    override fun where(
        dto: SysDictType,
        root: Root<SysDictType>,
        criteriaQuery: CriteriaQuery<*>,
        cb: CriteriaBuilder,
        predicates: MutableList<Predicate>
    ) {
    }

    @Transactional
    @Modifying
    override fun save(dto: SysDictType): SysDictType {
        return repository.save(dto)
    }

}