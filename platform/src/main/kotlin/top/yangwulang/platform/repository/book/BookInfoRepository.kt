package top.yangwulang.platform.repository.book;

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import top.yangwulang.platform.entity.book.BookInfo

interface BookInfoRepository : JpaRepository<BookInfo, String>, JpaSpecificationExecutor<BookInfo> {
}