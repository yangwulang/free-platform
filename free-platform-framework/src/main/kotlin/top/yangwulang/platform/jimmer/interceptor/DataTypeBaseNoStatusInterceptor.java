package top.yangwulang.platform.jimmer.interceptor;

import cn.dev33.satoken.stp.StpUtil;
import com.alicp.jetcache.Cache;
import lombok.extern.slf4j.Slf4j;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.sql.DraftInterceptor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import top.yangwulang.platform.entity.DataTypeBaseNoStatusDraft;
import top.yangwulang.platform.entity.DataTypeBaseProps;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.utils.UserUtils;

import java.time.LocalDateTime;
import java.util.Date;

@Slf4j
@Component
public class DataTypeBaseNoStatusInterceptor implements DraftInterceptor<DataTypeBaseNoStatusDraft> {
    @Override
    public void beforeSave(@NotNull DataTypeBaseNoStatusDraft draft, boolean isNew) {
        try (Cache<String, Object> cache = UserUtils.loginUserCache()) {
            String loginId = (String) StpUtil.getTokenInfo().getLoginId();
            User user = (User) cache.get(loginId);
            if (!ImmutableObjects.isLoaded(draft, DataTypeBaseProps.UPDATE_DATE)) {
                draft.setUpdateDate(new Date());
                draft.setUpdateBy(user.userCode());
            }
            if (isNew) {
                draft.setCreateDate(new Date());
                draft.setCreateBy(user.userCode());
                draft.setUpdateBy(user.userCode());
                draft.setUpdateDate(new Date());
            } else {
                draft.setUpdateDate(new Date());
                draft.setUpdateBy(user.userCode());
            }
        } catch (Exception e) {
            log.error("全局拦截createBy异常", e);
            if (!ImmutableObjects.isLoaded(draft, DataTypeBaseProps.UPDATE_DATE)) {
                draft.setUpdateDate(new Date());
                draft.setUpdateBy("system");
            }
            if (isNew) {
                draft.setUpdateDate(new Date());
                draft.setCreateDate(new Date());
                draft.setCreateBy("system");
                draft.setUpdateBy("system");
            }
        }
    }
}
