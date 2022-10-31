package top.yangwulang.platform.entity.book

import org.hibernate.annotations.GenericGenerator
import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "book_category")
open class BookCategory : Serializable {
    @Id
    @Column(name = "id", length = 64)
    @GeneratedValue(generator = "snowflake")
    @GenericGenerator(name = "snowflake", strategy = "top.yangwulang.platform.utils.SnowflakeGenerator")
    open var id: String? = null

    @Column(name = "category_name", length = 500)
    open var categoryName: String? = null
}