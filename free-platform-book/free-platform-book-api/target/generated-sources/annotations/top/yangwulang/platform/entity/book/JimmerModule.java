package top.yangwulang.platform.entity.book;

import org.babyfish.jimmer.sql.runtime.EntityManager;

public class JimmerModule {
    public static final EntityManager ENTITY_MANAGER = new EntityManager(
        BookInfo.class
    );

    private JimmerModule() {
    }
}
