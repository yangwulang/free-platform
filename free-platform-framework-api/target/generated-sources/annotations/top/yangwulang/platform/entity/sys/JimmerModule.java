package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.runtime.EntityManager;

public class JimmerModule {
    public static final EntityManager ENTITY_MANAGER = new EntityManager(
        DictType.class,
        DictData.class,
        User.class
    );

    private JimmerModule() {
    }
}
