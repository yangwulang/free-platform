package top.yangwulang.platform.entity.book;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.Immutable;
import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * Entity for table "book_category"
 */
@Entity
@Table(name = "book_category")
@Schema(name = "书籍分类")
public interface BookCategory {
    /**
     * 书籍分类id
     */
    @Id
    String id();

    /**
     * 分类名称
     */
    @Null String categoryName();
}

