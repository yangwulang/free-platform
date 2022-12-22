package top.yangwulang.platform.services.sys.impl

import org.apache.commons.lang3.StringUtils
import org.springframework.data.jpa.repository.Modifying
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import top.yangwulang.platform.entity.sys.SysMenu
import top.yangwulang.platform.exception.ServiceException
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
        if (dto.parent != null && StringUtils.isNotEmpty(dto.parent.id)) {
            dto.parent = repository.findById(dto.parent.id)
                .orElseThrow {
                    throw ServiceException("找不到pid为${dto.parent.id}的父菜单！") }
        }
        return repository.save(dto)
    }
}