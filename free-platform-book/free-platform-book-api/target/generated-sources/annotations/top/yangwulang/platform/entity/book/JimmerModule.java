package top.yangwulang.platform.entity.book;

import org.babyfish.jimmer.sql.runtime.EntityManager;

public class JimmerModule {
    public static final EntityManager ENTITY_MANAGER = new EntityManager(
        ChapterContent.class,
        BookChapter.class,
        BookCategory.class,
        BookInfo.class
    );

    private JimmerModule() {
    }
}
