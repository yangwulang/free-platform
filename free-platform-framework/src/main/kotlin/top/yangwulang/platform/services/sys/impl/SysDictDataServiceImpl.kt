package top.yangwulang.platform.services.sys.impl

import org.springframework.data.jpa.repository.Modifying
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import top.yangwulang.platform.entity.sys.SysDictData
import top.yangwulang.platform.repository.sys.SysDictDataRepository
import top.yangwulang.platform.services.BaseServiceImpl
import top.yangwulang.platform.services.sys.SysDictDataService
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

@Service
class SysDictDataServiceImpl :
    BaseServiceImpl<SysDictData, String, SysDictData, SysDictDataRepository>(),
    SysDictDataService {

    override fun where(
        dto: SysDictData,
        root: Root<SysDictData>,
        criteriaQuery: CriteriaQuery<*>,
        cb: CriteriaBuilder,
        predicates: MutableList<Predicate>
    ) {
    }

    override fun getTree(id: String): Any? {
        return null
    }

    @Transactional
    @Modifying
    override fun save(dto: SysDictData): SysDictData {
        return repository.save(dto)
    }
}