package top.yangwulang.platform.entity.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author yangwulang
 */
public class FlywayMigrateSuccessEvent extends ApplicationEvent {
    private final String module;

    public FlywayMigrateSuccessEvent(Object source, String module) {
        super(source);
        this.module = module;
    }

    public String getModule() {
        return module;
    }
}
