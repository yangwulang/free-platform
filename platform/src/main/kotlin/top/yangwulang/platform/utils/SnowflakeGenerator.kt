package top.yangwulang.platform.utils

import cn.hutool.core.util.IdUtil
import org.hibernate.engine.spi.SharedSessionContractImplementor
import org.hibernate.id.Configurable
import org.hibernate.id.IdentifierGenerator
import org.hibernate.service.ServiceRegistry
import org.hibernate.type.Type
import java.io.Serializable
import java.util.*

class SnowflakeGenerator : IdentifierGenerator,Configurable {
    override fun generate(session: SharedSessionContractImplementor?, o: Any?): Serializable {
        return IdUtil.getSnowflakeNextIdStr()
    }

    override fun configure(type: Type?, params: Properties?, serviceRegistry: ServiceRegistry?) {

    }
}