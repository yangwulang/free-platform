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
@Schema(description = "书籍信息")
public interface BookInfo {
    /**
     * 小说信息主键
     */
    @Id
    @Schema(description = "书籍信息主键")
    String id();

    /**
     * 小说名称
     */
//    @NotNull
    @Schema(description = "书籍名称")
    @Null String bookName();

    /**
     * 小说作者
     */
    @Schema(description = "书籍作者")
    @Null String author();

    /**
     * 描述
     */
    @Schema(description = "描述")
    @Column(name = "`describe`")
    @Null String describe();

    /**
     * 状态 （连载，完结）
     */
    @Schema(description = "书籍状态")
    @Null String status();

    /**
     * 小说图片地址
     */
    @Schema(description = "书籍地址")
    @Null String bookImgPath();

    /**
     * 小说分类
     */
    @Schema(description = "书籍分类")
    @Null String category();

    /**
     * 小说来源
     */
    @Key
    @Schema(description = "书籍来源")
    @Null String bookFrom();

    @OneToMany(mappedBy = "book")
    @Schema(description = "章节信息")
    List<BookChapter> chapters();
}

