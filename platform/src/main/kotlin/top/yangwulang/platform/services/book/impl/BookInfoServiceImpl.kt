package top.yangwulang.platform.services.book.impl

import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.data.jpa.repository.Modifying
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import top.yangwulang.platform.entity.book.BookInfo
import top.yangwulang.platform.entity.book.dto.BookInfoDto
import top.yangwulang.platform.factory.BookInfoFactory
import top.yangwulang.platform.repository.book.BookInfoRepository
import top.yangwulang.platform.services.BaseServiceImpl
import top.yangwulang.platform.services.book.BookInfoService
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

@Service
class BookInfoServiceImpl :
    BaseServiceImpl<BookInfo, String, BookInfoDto, BookInfoRepository>(),
    BookInfoService {

    private val bookInfoFactory: BookInfoFactory = BookInfoFactory()

    @Transactional
    @Modifying
    override fun save(dto: BookInfoDto): BookInfo {
        return repository.save(bookInfoFactory.convertDtoToBo(dto))
    }

    @Transactional
    @Modifying
    override fun delete(id: String) {
        // TODO: 此处应该还要将关联的数据一起删除，例如章节和章节内容信息一起删除
        if (repository.existsById(id)) {
            repository.deleteById(id)
        }
    }

    override fun convertFactory(): BookInfoFactory {
        return bookInfoFactory
    }

    override fun where(
        dto: BookInfoDto,
        root: Root<BookInfo>,
        criteriaQuery: CriteriaQuery<*>,
        cb: CriteriaBuilder,
        predicates: MutableList<Predicate>
    ) {
        if (StringUtils.isNoneBlank(dto.bookName)) {
            predicates.add(cb.like(root.get("bookName"), "%" + dto.bookName + "%"))
        }
        if (StringUtils.isNoneBlank(dto.author)) {
            predicates.add(cb.like(root.get("author"), "%" + dto.author + "%"))
        }
        if (StringUtils.isNoneBlank(dto.category)) {
            predicates.add(cb.equal(root.get<String>("category"), dto.category))
        }
        if (StringUtils.isNoneBlank(dto.describe)) {
            predicates.add(cb.like(root.get("describe"), "%" + dto.describe + "%"))
        }
        if (StringUtils.isNoneBlank(dto.status)) {
            predicates.add(cb.equal(root.get<String>("status"), dto.status))
        }
    }


}