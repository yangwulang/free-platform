package top.yangwulang.platform.repository.sys;

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import top.yangwulang.platform.entity.sys.SysDictData

interface SysDictDataRepository : JpaRepository<SysDictData, String>, JpaSpecificationExecutor<SysDictData> {
}