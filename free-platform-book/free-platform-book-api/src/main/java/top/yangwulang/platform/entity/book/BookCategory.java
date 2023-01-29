package top.yangwulang.platform.entity.book;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.Immutable;
import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.NotNull;

/**
 * Entity for table "book_category"
 */
@Entity
@Table(name = "book_category")
@Schema(name = "书籍分类")
@Immutable(value = Immutable.Nullity.NULLABLE)
public interface BookCategory {
    /**
     * 书籍分类id
     */
    @Id
    @NotNull
    String id();

    /**
     * 分类名称
     */
    String categoryName();
}

