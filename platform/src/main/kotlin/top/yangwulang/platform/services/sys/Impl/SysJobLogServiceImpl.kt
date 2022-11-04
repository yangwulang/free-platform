package top.yangwulang.platform.services.sys.Impl

import org.springframework.stereotype.Service
import top.yangwulang.platform.entity.sys.SysJobLog
import top.yangwulang.platform.repository.sys.SysJobLogRepository
import top.yangwulang.platform.services.BaseServiceImpl
import top.yangwulang.platform.services.sys.SysJobLogService
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

@Service
class SysJobLogServiceImpl : BaseServiceImpl<SysJobLog, String, SysJobLog, SysJobLogRepository>(), SysJobLogService {
    override fun where(
        dto: SysJobLog,
        root: Root<SysJobLog>,
        criteriaQuery: CriteriaQuery<*>,
        cb: CriteriaBuilder,
        predicates: MutableList<Predicate>
    ) {

    }

    override fun save(dto: SysJobLog): SysJobLog {
        return repository.save(dto)
    }


}