package top.yangwulang.platform.entity.sys;

import org.babyfish.jimmer.sql.runtime.EntityManager;

public class JimmerModule {
    public static final EntityManager ENTITY_MANAGER = new EntityManager(
        DictType.class,
        User.class,
        Menu.class,
        DictData.class,
        Role.class
    );

    private JimmerModule() {
    }
}
