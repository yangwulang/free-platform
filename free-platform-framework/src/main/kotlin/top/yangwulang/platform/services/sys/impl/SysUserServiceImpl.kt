package top.yangwulang.platform.services.sys.impl

import org.springframework.data.jpa.domain.Specification
import org.springframework.stereotype.Service
import top.yangwulang.platform.entity.sys.SysUser
import top.yangwulang.platform.repository.sys.SysUserRepository
import top.yangwulang.platform.services.BaseServiceImpl
import top.yangwulang.platform.services.sys.SysUserService
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root


@Service
class SysUserServiceImpl :
    BaseServiceImpl<SysUser, String, SysUser, SysUserRepository>(),
    SysUserService {
    override fun where(
        dto: SysUser,
        root: Root<SysUser>,
        criteriaQuery: CriteriaQuery<*>,
        cb: CriteriaBuilder,
        predicates: MutableList<Predicate>
    ) {
        TODO("Not yet implemented")
    }

    override fun findByUserName(userName: String): SysUser? {
        return repository.findOne(
            Specification.where { root, criteriaQuery, cb ->
                val predicates = arrayListOf<Predicate>()
                predicates.add(cb.equal(root.get<String>("loginCode"), userName))
                criteriaQuery.where(*predicates.toTypedArray()).restriction
            }
        ).orElse(null);
    }

    override fun save(dto: SysUser): SysUser {
        TODO("Not yet implemented")
    }
}