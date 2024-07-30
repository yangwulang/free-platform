package top.yangwulang.platform.jimmer.interceptor

import cn.dev33.satoken.stp.StpUtil
import lombok.extern.slf4j.Slf4j
import org.babyfish.jimmer.ImmutableObjects
import org.babyfish.jimmer.sql.DraftInterceptor
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import top.yangwulang.platform.entity.DataTypeBaseNoStatus
import top.yangwulang.platform.entity.DataTypeBaseNoStatusDraft
import top.yangwulang.platform.entity.DataTypeBaseProps
import top.yangwulang.platform.entity.sys.User
import top.yangwulang.platform.utils.UserUtils
import java.util.*

@Slf4j
@Component
class DataTypeBaseNoStatusInterceptor : DraftInterceptor<DataTypeBaseNoStatus, DataTypeBaseNoStatusDraft> {
    private val logger: Logger = LoggerFactory.getLogger(DataTypeBaseNoStatusInterceptor::class.java)

    override fun beforeSave(draft: DataTypeBaseNoStatusDraft, original: DataTypeBaseNoStatus?) {
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
                    draft.setCreateBy(user.userCode())
                    draft.setUpdateBy(user.userCode())
                    draft.setUpdateDate(Date())
                } else {
                    draft.setUpdateDate(Date())
                    draft.setUpdateBy(user.userCode())
                }
            }
        } catch (e: Exception) {
            logger.error("全局拦截createBy异常", e)
            if (!ImmutableObjects.isLoaded(draft, DataTypeBaseProps.UPDATE_DATE)) {
                draft.setUpdateDate(Date())
                draft.setUpdateBy("system")
            }
            if (original == null) {
                draft.setUpdateDate(Date())
                draft.setCreateDate(Date())
                draft.setCreateBy("system")
                draft.setUpdateBy("system")
            }
        }
    }
}
