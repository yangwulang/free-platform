package top.yangwulang.platform.entity.book;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.Immutable;
import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * 书籍章节
 */
@Entity
@Table(name = "book_chapter")
@Schema(name = "书籍章节")
@Immutable(value = Immutable.Nullity.NULLABLE)
public interface BookChapter {
    /**
     * 章节id
     */
    @Id
    @NotNull
    String id();

    /**
     * 章节标题
     */
     String chapterTitle();

    /**
     * 书籍id
     */
    @ManyToOne
    @Key
    @OnDissociate(DissociateAction.DELETE)
     BookInfo book();

    /**
     * 来源
     */
    @Key
     String fromPath();
}

