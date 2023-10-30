package top.yangwulang.platform.entity;

import org.babyfish.jimmer.sql.runtime.EntityManager;

/**
 * Under normal circumstances, users do not need to use this code. 
 * This code is for compatibility with version 0.7.47 and earlier.
 */
public class JimmerModule {
    public static final EntityManager ENTITY_MANAGER = 
    EntityManager.fromResources(
        JimmerModule.class.getClassLoader(),
        it -> it.getName().startsWith("top.yangwulang.platform.entity.")
    );

    private JimmerModule() {
    }
}
