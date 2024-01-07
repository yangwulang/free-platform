package top.yangwulang.platform.flyway;

import lombok.extern.slf4j.Slf4j;
import org.flywaydb.core.api.callback.BaseCallback;
import org.flywaydb.core.api.callback.Callback;
import org.flywaydb.core.api.callback.Context;
import org.flywaydb.core.api.callback.Event;
import top.yangwulang.platform.utils.ConfigUtils;

/**
 * flyway执行完成后初始化缓存
 *
 * @author yangwulang
 */
@Slf4j
public class SysFlywayStartedConfigInitCallback extends BaseCallback implements Callback {
    @Override
    public void handle(Event event, Context context) {
        if (event.equals(Event.AFTER_MIGRATE)) {
            log.debug("---------- 数据库脚本合并完成，开始缓存初始化 ----------");
            ConfigUtils.initCache();
            log.debug("---------- 数据库脚本合并完成，缓存初始化结束 ----------");
        }
    }

    @Override
    public String getCallbackName() {
        return "sysFlywayInitConfigCallback";
    }
}
