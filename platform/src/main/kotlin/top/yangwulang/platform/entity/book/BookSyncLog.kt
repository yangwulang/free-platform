package top.yangwulang.platform.entity.book

import org.hibernate.annotations.GenericGenerator
import java.time.Instant
import javax.persistence.*
import javax.validation.constraints.Size

/**
 * 小说同步日志
 */
@Entity
@Table(name = "book_sync_log")
open class BookSyncLog {
    @Id
    @Size(max = 64)
    @Column(name = "id", nullable = false, length = 64)
    @GeneratedValue(generator = "snowflake")
    @GenericGenerator(name = "snowflake", strategy = "top.yangwulang.platform.utils.SnowflakeGenerator")
    open var id: String? = null

    @Size(max = 64)
    @Column(name = "biz_key", length = 64)
    open var bizKey: String? = null

    @Size(max = 300)
    @Column(name = "sync_message", length = 300)
    open var syncMessage: String? = null

    @Size(max = 500)
    @Column(name = "sync_status", length = 500)
    open var syncStatus: SyncStatus? = null

    @Size(max = 500)
    @Column(name = "sync_path", length = 500)
    open var syncPath: String? = null

    @Size(max = 1000)
    @Column(name = "sync_error", length = 1000)
    open var syncError: String? = null

    @Column(name = "sync_date")
    open var syncDate: Instant? = null
}