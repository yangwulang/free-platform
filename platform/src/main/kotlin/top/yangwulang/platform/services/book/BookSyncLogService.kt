package top.yangwulang.platform.services.book

import top.yangwulang.platform.entity.book.BookSyncLog
import top.yangwulang.platform.services.QueryService
import top.yangwulang.platform.services.UpdateService

interface BookSyncLogService :
    QueryService<BookSyncLog, String, BookSyncLog>,
    UpdateService<BookSyncLog, String, BookSyncLog> {

}