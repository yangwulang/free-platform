package top.yangwulang.platform.entity.book;

import org.babyfish.jimmer.Immutable;
import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * 章节内容
 */
@Entity
@Table(name = "chapter_content")
public interface ChapterContent {
    /**
     * 书籍内容id
     */
    @Id
    String id();

    /**
     * 章节id
     */
    @Key
    @ManyToOne
    BookChapter chapter();

    /**
     * 章节内容
     */
    @Null String chapterContent();
}

