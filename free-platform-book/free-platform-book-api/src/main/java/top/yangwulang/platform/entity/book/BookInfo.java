package top.yangwulang.platform.entity.book;

import io.swagger.v3.oas.annotations.media.Schema;
import org.babyfish.jimmer.Immutable;
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
    @Column(name = "`describe`")
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
    @Key
    String bookFrom();

    @OneToMany(mappedBy = "book")
    @NotNull
    List<BookChapter> chapters();
}

