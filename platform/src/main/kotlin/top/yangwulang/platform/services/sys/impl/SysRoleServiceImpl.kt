package top.yangwulang.platform.services.sys.impl

import org.springframework.data.jpa.repository.Modifying
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import top.yangwulang.platform.entity.sys.SysRole
import top.yangwulang.platform.repository.sys.SysRoleRepository
import top.yangwulang.platform.services.BaseServiceImpl
import top.yangwulang.platform.services.sys.SysRoleService
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

@Service
class SysRoleServiceImpl :
    BaseServiceImpl<SysRole, String, SysRole, SysRoleRepository>(),
    SysRoleService {

    override fun where(
        dto: SysRole,
        root: Root<SysRole>,
        criteriaQuery: CriteriaQuery<*>,
        cb: CriteriaBuilder,
        predicates: MutableList<Predicate>
    ) {
        TODO("Not yet implemented")
    }

    override fun findRoleListByUsername(userName: String): Set<String> {
        return setOf("")
    }

    override fun findPermissionsByRole(role: String): Set<String> {
        return setOf("user")
    }

    @Modifying
    @Transactional
    override fun save(dto: SysRole): SysRole {
        TODO("Not yet implemented")
    }
}