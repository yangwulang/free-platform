package top.yangwulang.platform.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import top.yangwulang.platform.entity.sys.AreaTable
import top.yangwulang.platform.entity.sys.UserTable
import top.yangwulang.platform.security.datascope.DataScopeChain
import top.yangwulang.platform.security.datascope.DataScopeManager

/**
 * @author yangwulang
 */
@Configuration
open class DataScopeConfiguration {
    @Bean
    open fun userDataScopeManager(
        @Autowired(required = false) userDataScopeChain: List<DataScopeChain<UserTable>?>?
    ): DataScopeManager<UserTable> {
        val dataScopeManager = DataScopeManager<UserTable>()
        userDataScopeChain?.let {
            dataScopeManager.addAll(it)
        }
        return dataScopeManager
    }

    @Bean
    open fun areaDataScopeManager(
        @Autowired(required = false) chains: List<DataScopeChain<AreaTable>?>?
    ): DataScopeManager<AreaTable> {
        val areaTableDataScopeManager = DataScopeManager<AreaTable>()
        chains?.let {
            areaTableDataScopeManager.addAll(it)
        }
        return areaTableDataScopeManager
    }
}
