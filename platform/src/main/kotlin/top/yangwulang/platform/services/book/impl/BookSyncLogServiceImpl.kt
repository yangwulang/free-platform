package top.yangwulang.platform.services.book.impl

import org.springframework.data.jpa.repository.Modifying
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import top.yangwulang.platform.entity.book.BookSyncLog
import top.yangwulang.platform.repository.book.BookSyncLogRepository
import top.yangwulang.platform.services.BaseServiceImpl
import top.yangwulang.platform.services.book.BookSyncLogService
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

@Service
class BookSyncLogServiceImpl :
    BaseServiceImpl<BookSyncLog, String, BookSyncLog, BookSyncLogRepository>(),
    BookSyncLogService {
    override fun where(
        dto: BookSyncLog,
        root: Root<BookSyncLog>,
        criteriaQuery: CriteriaQuery<*>,
        cb: CriteriaBuilder,
        predicates: MutableList<Predicate>
    ) {
        TODO("Not yet implemented")
    }

    @Transactional
    @Modifying
    override fun save(dto: BookSyncLog): BookSyncLog {
        return repository.save(dto)
    }
}