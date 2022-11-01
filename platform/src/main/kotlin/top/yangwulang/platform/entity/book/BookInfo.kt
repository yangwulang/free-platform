package top.yangwulang.platform.entity.book

import lombok.ToString
import org.hibernate.annotations.GenericGenerator
import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "book_info")
@ToString
open class BookInfo : Serializable {
    @Id
    @GeneratedValue(generator = "snowflake")
    @GenericGenerator(name = "snowflake", strategy = "top.yangwulang.platform.utils.SnowflakeGenerator")
    @Column(name = "id", nullable = false, length = 64)
    open var id: String? = null

    @Column(name = "book_name", nullable = false, length = 500)
    open var bookName: String? = null

    @Column(name = "author", length = 500)
    open var author: String? = null

    @Column(name = "`describe`", length = 5000)
    open var describe: String? = null

    @Column(name = "status", length = 50)
    open var status: String? = null

    @Column(name = "book_img_path", length = 500)
    open var bookImgPath: String? = null

    @Column(name = "category", length = 200)
    open var category: String? = null

    @Column(name = "book_from", length = 2000)
    open var bookFrom: String? = null
}