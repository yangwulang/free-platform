package top.yangwulang.platform.event;

import org.babyfish.jimmer.sql.event.EntityEvent;
import org.babyfish.jimmer.sql.event.EntityListener;
import org.springframework.stereotype.Component;
import top.yangwulang.platform.entity.sys.Config;
import top.yangwulang.platform.utils.ConfigUtils;

/**
 * 监听配置修改，同步修改到缓存中
 */
@Component
public class ConfigModifyListener implements EntityListener<Config> {
    @Override
    public void onChange(EntityEvent<Config> e) {
        ConfigUtils.putConfig(e.getNewEntity());
    }
}
