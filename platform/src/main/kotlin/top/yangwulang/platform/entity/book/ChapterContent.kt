package top.yangwulang.platform.entity.book

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import org.hibernate.annotations.GenericGenerator
import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "chapter_content")
@DynamicUpdate
@DynamicInsert
open class ChapterContent : Serializable {
    @Id
    @Column(name = "id", nullable = false, length = 64)
    @GeneratedValue(generator = "snowflake")
    @GenericGenerator(name = "snowflake", strategy = "top.yangwulang.platform.utils.SnowflakeGenerator")
    open var id: String? = null

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "chapter_id", nullable = false)
    open var chapter: BookChapter? = null

    @Lob
    @Column(name = "chapter_content")
    open var chapterContent: String? = null
}