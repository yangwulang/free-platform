package top.yangwulang.platform.book
/*

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.jpa.domain.Specification
import org.springframework.mock.web.MockHttpServletRequest
import top.yangwulang.platform.controller.book.ChapterContentController
import top.yangwulang.platform.services.book.BookChapterService
import top.yangwulang.platform.services.book.ChapterContentService
import javax.persistence.criteria.Predicate

@SpringBootTest
class ChapterContentTest {
    private val logger: Logger = LoggerFactory.getLogger(ChapterContentTest::class.java)


    @Autowired
    private lateinit var chapterContentService: ChapterContentService

    @Autowired
    private lateinit var bookChapterService: BookChapterService

    @Autowired
    private lateinit var controller: ChapterContentController
    lateinit var httpServletRequest: MockHttpServletRequest


    @BeforeEach
    fun before() {
        httpServletRequest = MockHttpServletRequest()
        httpServletRequest.addParameter("pageNum", "2")
    }

    @Test
    fun contextLoads() {
    }

    @Test
    fun testRemote() {
        val where = Specification.where<BookChapter> { root, criteriaQuery, cb ->
            val predicates = arrayListOf<Predicate>()
            predicates.add(cb.equal(root.get<BookInfo>("book").get<String>("id"), "1586603095719792640"))
            criteriaQuery.where(*predicates.toTypedArray()).restriction
        }
        val chapters = bookChapterService.findList(where)
        chapters.forEach {
            chapterContentService.syncRemoteByChapterId(it.id!!)
        }
        logger.info("{}", chapters)
    }

}*/
