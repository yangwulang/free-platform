package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.runtime.EntityManager;

public class JimmerModule {
    public static final EntityManager ENTITY_MANAGER = new EntityManager(
        User.class,
        DictData.class,
        DictType.class
    );

    private JimmerModule() {
    }
}
