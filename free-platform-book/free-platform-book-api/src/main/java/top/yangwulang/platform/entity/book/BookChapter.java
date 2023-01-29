package top.yangwulang.platform.entity.book;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.Immutable;
import org.babyfish.jimmer.pojo.AutoScalarStrategy;
import org.babyfish.jimmer.pojo.Static;
import org.babyfish.jimmer.pojo.StaticType;
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
@StaticType(alias = "forCompositeBookInput", autoScalarStrategy = AutoScalarStrategy.DECLARED)
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
    @Static(name = "bookId", idOnly = true)
    @Key
    @OnDissociate(DissociateAction.DELETE)
     BookInfo book();

    /**
     * 来源
     */
     String fromPath();
}

