package top.yangwulang.platform.event;

import org.babyfish.jimmer.sql.event.EntityEvent;
import org.babyfish.jimmer.sql.event.EntityListener;
import org.springframework.stereotype.Component;
import top.yangwulang.platform.entity.sys.DictData;

/**
 * @author yangwulang
 */
//@Component
public class DictEventListener implements EntityListener<DictData> {
    @Override
    public void onChange(EntityEvent<DictData> e) {
    }
}
