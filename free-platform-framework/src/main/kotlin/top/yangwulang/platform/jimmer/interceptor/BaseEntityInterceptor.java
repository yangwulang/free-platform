package top.yangwulang.platform.jimmer.interceptor;

import cn.dev33.satoken.stp.StpUtil;
import com.alicp.jetcache.Cache;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.sql.DraftInterceptor;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.yangwulang.platform.entity.sys.BaseEntityDraft;
import top.yangwulang.platform.entity.sys.BaseEntityProps;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.utils.UserUtils;

import java.time.LocalDateTime;

public class BaseEntityInterceptor implements DraftInterceptor<BaseEntityDraft> {
    private final Logger logger = LoggerFactory.getLogger(BaseEntityInterceptor.class);
    @Override
    public void beforeSave(@NotNull BaseEntityDraft draft, boolean isNew) {
        try (Cache<String, Object> cache = UserUtils.loginUserCache()) {
            String loginId = (String) StpUtil.getTokenInfo().getLoginId();
            User user = (User) cache.get(loginId);
            if (!ImmutableObjects.isLoaded(draft, BaseEntityProps.UPDATE_DATE)) {
                draft.setUpdateDate(LocalDateTime.now());
                draft.setUpdateBy(user.userCode());
            }
            if (isNew) {
                draft.setCreateDate(LocalDateTime.now());
                draft.setStatus("0");
                draft.setCreateBy(user.userCode());
                draft.setUpdateBy(user.userCode());
            }
        } catch (Exception e) {
            logger.error("全局拦截createBy异常", e);
            if (!ImmutableObjects.isLoaded(draft, BaseEntityProps.UPDATE_DATE)) {
                draft.setUpdateDate(LocalDateTime.now());
            }
            if (isNew) {
                draft.setCreateDate(LocalDateTime.now());
                draft.setStatus("0");
                draft.setCreateBy("system");
                draft.setUpdateBy("system");
            }
        }
    }
}
