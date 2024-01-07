package top.yangwulang.platform.jimmer.interceptor;

import cn.dev33.satoken.stp.StpUtil;
import com.alicp.jetcache.Cache;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.sql.DraftInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import top.yangwulang.platform.entity.BaseEntityDraft;
import top.yangwulang.platform.entity.BaseEntityProps;
import top.yangwulang.platform.entity.BaseEntity;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.utils.UserUtils;

import java.time.LocalDateTime;
import java.util.Date;

@Component
public class BaseEntityInterceptor implements DraftInterceptor<BaseEntity, BaseEntityDraft> {
    private final Logger logger = LoggerFactory.getLogger(BaseEntityInterceptor.class);

    @Override
    public void beforeSave(@NotNull BaseEntityDraft draft, @Nullable BaseEntity baseEntity) {
        try (Cache<String, Object> cache = UserUtils.loginUserCache()) {
            String loginId = (String) StpUtil.getTokenInfo().getLoginId();
            User user = (User) cache.get(loginId);
            if (!ImmutableObjects.isLoaded(draft, BaseEntityProps.UPDATE_DATE)) {
                draft.setUpdateDate(new Date());
                draft.setUpdateBy(user.userCode());
            }
            if (baseEntity == null) {
                draft.setCreateDate(new Date());
                draft.setStatus(0);
                draft.setCreateBy(user.userCode());
                draft.setUpdateBy(user.userCode());
            } else {
                draft.setUpdateDate(new Date());
                draft.setUpdateBy(user.userCode());
            }
        } catch (Exception e) {
            logger.error("全局拦截createBy异常", e);
            if (!ImmutableObjects.isLoaded(draft, BaseEntityProps.UPDATE_DATE)) {
                draft.setUpdateDate(new Date());
            }
            if (baseEntity == null) {
                draft.setCreateDate(new Date());
                draft.setStatus(0);
                draft.setCreateBy("system");
                draft.setUpdateBy("system");
            }
        }
    }
}
