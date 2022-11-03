package top.yangwulang.platform.repository.sys;

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import top.yangwulang.platform.entity.sys.SysJob
import top.yangwulang.platform.entity.sys.SysJobId

interface SysJobRepository : JpaRepository<SysJob, SysJobId>, JpaSpecificationExecutor<SysJob> {
}