package top.yangwulang.platform.entity.book;

import org.babyfish.jimmer.sql.runtime.EntityManager;

public class JimmerModule {
    public static final EntityManager ENTITY_MANAGER = new EntityManager(
        BookChapter.class,
        BookInfo.class,
        ChapterContent.class,
        BookCategory.class
    );

    private JimmerModule() {
    }
}
