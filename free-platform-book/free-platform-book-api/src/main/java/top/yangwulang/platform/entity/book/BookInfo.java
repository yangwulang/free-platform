package top.yangwulang.platform.entity.book;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.Immutable;
import org.babyfish.jimmer.pojo.AutoScalarStrategy;
import org.babyfish.jimmer.pojo.Static;
import org.babyfish.jimmer.pojo.StaticType;
import org.babyfish.jimmer.sql.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.List;

/**
 * 书籍信息
 */
@Entity
@Table(name = "book_info")
@Schema(name = "书籍信息")
@Immutable(value = Immutable.Nullity.NULLABLE)
@StaticType(
        alias = "composite",
        topLevelName = "CompositeBookInput",
        autoScalarStrategy = AutoScalarStrategy.DECLARED
)

public interface BookInfo {
    /**
     * 小说信息主键
     */
    @Id
    @NotNull
    String id();

    /**
     * 小说名称
     */
    @NotNull
    String bookName();

    /**
     * 小说作者
     */
     String author();

    /**
     * 描述
     */
     String describe();

    /**
     * 状态 （连载，完结）
     */
     String status();

    /**
     * 小说图片地址
     */
     String bookImgPath();

    /**
     * 小说分类
     */
     String category();

    /**
     * 小说来源
     */
     String bookFrom();

     @OneToMany(mappedBy = "book")
     @Static(alias = "composite", targetAlias = "forCompositeBookInput")
     @NotNull
     List<BookChapter> chapters();
}

