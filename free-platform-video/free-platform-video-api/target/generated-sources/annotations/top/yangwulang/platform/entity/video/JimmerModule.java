package top.yangwulang.platform.entity.video;

import org.babyfish.jimmer.sql.runtime.EntityManager;

public class JimmerModule {
    public static final EntityManager ENTITY_MANAGER = new EntityManager(
        VideoCategory.class
    );

    private JimmerModule() {
    }
}
