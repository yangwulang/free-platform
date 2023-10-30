package top.yangwulang.platform.jimmer.interceptor;

import cn.dev33.satoken.stp.StpUtil;
import com.alicp.jetcache.Cache;
import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.sql.DraftInterceptor;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import top.yangwulang.platform.entity.DataTypeBaseDraft;
import top.yangwulang.platform.entity.DataTypeBaseProps;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.utils.UserUtils;

import java.util.Date;

/**
 * @author yangwulang
 */
@Component
public class DataTypeBaseInterceptor implements DraftInterceptor<DataTypeBaseDraft> {
    private final Logger logger = LoggerFactory.getLogger(DataTypeBaseInterceptor.class);
    @Override
    public void beforeSave(@NotNull DataTypeBaseDraft draft, boolean isNew) {
        try (Cache<String, Object> cache = UserUtils.loginUserCache()) {
            String loginId = (String) StpUtil.getTokenInfo().getLoginId();
            User user = (User) cache.get(loginId);
            if (!ImmutableObjects.isLoaded(draft, DataTypeBaseProps.UPDATE_DATE)) {
                draft.setUpdateDate(new Date());
                draft.setUpdateBy(user.userCode());
            }
            if (isNew) {
                draft.setCreateDate(new Date());
                draft.setStatus(Integer.parseInt(DataTypeBaseDraft.STATUS_NORMAL));
                draft.setCreateBy(user.userCode());
                draft.setUpdateBy(user.userCode());
            } else {
                draft.setUpdateDate(new Date());
                draft.setUpdateBy(user.userCode());
            }
        } catch (Exception e) {
            logger.error("全局拦截createBy异常", e);
            if (!ImmutableObjects.isLoaded(draft, DataTypeBaseProps.UPDATE_DATE)) {
                draft.setUpdateDate(new Date());
            }
            if (isNew) {
                draft.setCreateDate(new Date());
                draft.setStatus(Integer.parseInt(DataTypeBaseDraft.STATUS_NORMAL));
                draft.setCreateBy("system");
                draft.setUpdateBy("system");
            }
        }
    }
}
