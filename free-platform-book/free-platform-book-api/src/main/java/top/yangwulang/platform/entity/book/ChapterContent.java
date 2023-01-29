package top.yangwulang.platform.entity.book;

import org.babyfish.jimmer.Immutable;
import org.babyfish.jimmer.pojo.Static;
import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * 章节内容
 */
@Entity
@Table(name = "chapter_content")
@Immutable(value = Immutable.Nullity.NULLABLE)
public interface ChapterContent {
    /**
     * 书籍内容id
     */
    @Id
    @NotNull
    String id();

    /**
     * 章节id
     */
    @Key
    @ManyToOne
    @Static(name = "chapter_id", idOnly = true)
    @NotNull
    BookChapter chapter();

    /**
     * 章节内容
     */
    String chapterContent();
}

