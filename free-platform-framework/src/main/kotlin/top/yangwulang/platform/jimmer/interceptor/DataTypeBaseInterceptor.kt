package top.yangwulang.platform.jimmer.interceptor

import cn.dev33.satoken.stp.StpUtil
import org.babyfish.jimmer.ImmutableObjects
import org.babyfish.jimmer.sql.DraftInterceptor
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import top.yangwulang.platform.entity.DataTypeBase
import top.yangwulang.platform.entity.DataTypeBaseDraft
import top.yangwulang.platform.entity.DataTypeBaseProps
import top.yangwulang.platform.entity.sys.User
import top.yangwulang.platform.utils.UserUtils
import java.util.*

/**
 * @author yangwulang
 */
@Component
class DataTypeBaseInterceptor : DraftInterceptor<DataTypeBase, DataTypeBaseDraft> {
    private val logger: Logger = LoggerFactory.getLogger(DataTypeBaseInterceptor::class.java)

    override fun beforeSave(draft: DataTypeBaseDraft, original: DataTypeBase?) {
        try {
            UserUtils.loginUserCache().use { cache ->
                val loginId = StpUtil.getTokenInfo().getLoginId() as String
                val user = cache[loginId] as User
                if (!ImmutableObjects.isLoaded(draft, DataTypeBaseProps.UPDATE_DATE)) {
                    draft.setUpdateDate(Date())
                    draft.setUpdateBy(user.userCode())
                }
                if (original == null) {
                    draft.setCreateDate(Date())
                    draft.setStatus(DataTypeBaseDraft.STATUS_NORMAL.toInt())
                    draft.setCreateBy(user.userCode())
                    draft.setUpdateBy(user.userCode())
                } else {
                    draft.setUpdateDate(Date())
                    draft.setUpdateBy(user.userCode())
                }
            }
        } catch (e: Exception) {
            logger.error("全局拦截createBy异常", e)
            if (!ImmutableObjects.isLoaded(draft, DataTypeBaseProps.UPDATE_DATE)) {
                draft.setUpdateDate(Date())
            }
            if (original == null) {
                draft.setCreateDate(Date())
                draft.setStatus(DataTypeBaseDraft.STATUS_NORMAL.toInt())
                draft.setCreateBy("system")
                draft.setUpdateBy("system")
            }
        }
    }
}
