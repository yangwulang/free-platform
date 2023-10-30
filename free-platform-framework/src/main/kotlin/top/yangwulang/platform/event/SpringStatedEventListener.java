package top.yangwulang.platform.event;

import org.jetbrains.annotations.NotNull;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import top.yangwulang.platform.config.AbstractFlywayConfiguration;
import top.yangwulang.platform.entity.event.FlywayMigrateSuccessEvent;
import top.yangwulang.platform.utils.ConfigUtils;

/**
 * @author yangwulang
 */
@Component
public class SpringStatedEventListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(@NotNull ApplicationStartedEvent event) {
        ConfigUtils.initCache();
    }
}
