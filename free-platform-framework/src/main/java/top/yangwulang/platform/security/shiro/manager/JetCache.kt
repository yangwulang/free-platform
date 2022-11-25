package top.yangwulang.platform.security.shiro.manager

import org.apache.shiro.cache.Cache

class JetCache(
    val areaName: String
) : Cache<String, Any> {

    override fun get(p0: String?): Any {
        TODO("Not yet implemented")
    }

    override fun put(p0: String?, p1: Any?): Any {
        TODO("Not yet implemented")
    }

    override fun remove(p0: String?): Any {
        TODO("Not yet implemented")
    }

    override fun clear() {
        TODO("Not yet implemented")
    }

    override fun size(): Int {
        TODO("Not yet implemented")
    }

    override fun keys(): MutableSet<String> {
        TODO("Not yet implemented")
    }

    override fun values(): MutableCollection<Any> {
        TODO("Not yet implemented")
    }
}