package top.yangwulang.platform.services.sys.impl

import org.springframework.data.jpa.repository.Modifying
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import top.yangwulang.platform.entity.sys.SysMenu
import top.yangwulang.platform.repository.sys.SysMenuRepository
import top.yangwulang.platform.services.BaseServiceImpl
import top.yangwulang.platform.services.sys.SysMenuService
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

@Service
open class SysMenuServiceImpl :
    BaseServiceImpl<SysMenu, String, SysMenu, SysMenuRepository>(),
    SysMenuService {

    override fun where(
        dto: SysMenu,
        root: Root<SysMenu>,
        criteriaQuery: CriteriaQuery<*>,
        cb: CriteriaBuilder,
        predicates: MutableList<Predicate>
    ) {

    }

    @Transactional
    @Modifying
    override fun save(dto: SysMenu): SysMenu {
        return repository.save(dto)
    }
}