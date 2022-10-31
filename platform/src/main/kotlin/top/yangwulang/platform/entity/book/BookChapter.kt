package top.yangwulang.platform.entity.book

import org.hibernate.annotations.GenericGenerator
import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "book_chapter")
open class BookChapter : Serializable {
    @Id
    @Column(name = "id", nullable = false, length = 64)
    @GeneratedValue(generator = "snowflake")
    @GenericGenerator(name = "snowflake", strategy = "top.yangwulang.platform.utils.SnowflakeGenerator")
    open var id: String? = null

    @Column(name = "chapter_title", length = 2000)
    open var chapterTitle: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    open var book: top.yangwulang.platform.entity.book.BookInfo? = null

    @Column(name = "from_path", length = 2000)
    open var fromPath: String? = null
}