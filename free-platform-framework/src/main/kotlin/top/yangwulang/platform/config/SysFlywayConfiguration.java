package top.yangwulang.platform.config;

import cn.hutool.extra.spring.SpringUtil;
import lombok.extern.slf4j.Slf4j;
import org.flywaydb.core.api.callback.BaseCallback;
import org.flywaydb.core.api.callback.Callback;
import org.flywaydb.core.api.callback.Context;
import org.flywaydb.core.api.callback.Event;
import org.flywaydb.core.api.output.MigrateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.flyway.FlywayProperties;
import org.springframework.context.annotation.Configuration;
import top.yangwulang.platform.entity.event.FlywayMigrateSuccessEvent;
import top.yangwulang.platform.flyway.SysFlywayStartedConfigInitCallback;

import javax.annotation.PostConstruct;

/**
 * 系统模块的flyway配置
 */
@Configuration
@Slf4j
public class SysFlywayConfiguration extends AbstractFlywayConfiguration implements ApplicationRunner {
    @Value("${spring.datasource.dbType:mysql}")
    private String dbType;

    @Autowired
    private FlywayProperties flywayProperties;

    @Override
    protected String module() {
        return "sys";
    }

    @Override
    protected String dbType() {
        return dbType;
    }

    @Override
    protected Callback[] callbacks() {
        return new Callback[] { new SysFlywayStartedConfigInitCallback()};
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (flywayProperties.isEnabled()) {
            MigrateResult migrate = buildFlyway(flywayProperties).migrate();
            log.info("更新 {} 模块，status {}, version {}", module(), migrate.success, migrate.flywayVersion);

        }
    }
}
