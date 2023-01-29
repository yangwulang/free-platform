package top.yangwulang.platform.entity.book;

import org.babyfish.jimmer.pojo.Static;
import org.babyfish.jimmer.sql.*;

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
    @Static(name = "chapter_id", idOnly = true)
    BookChapter chapter();

    /**
     * 章节内容
     */
    @Null String chapterContent();
}

