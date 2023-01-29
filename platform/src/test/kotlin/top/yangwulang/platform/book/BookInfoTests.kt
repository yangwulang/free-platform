package top.yangwulang.platform.book
/*

import com.alibaba.fastjson.JSON
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.mock.web.MockHttpServletRequest
import org.springframework.test.annotation.Rollback
import top.yangwulang.platform.controller.book.BookInfoController
import top.yangwulang.platform.entity.book.dto.BookInfoDto
import top.yangwulang.platform.services.book.BookInfoService

@SpringBootTest
class BookInfoTests {
    private val logger: Logger = LoggerFactory.getLogger(BookInfoTests::class.java)


    @Autowired
    private lateinit var bookInfoService: BookInfoService

    @Autowired
    private lateinit var bookInfoController: BookInfoController
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
    fun testFindPage() {
        val bookInfoDto = BookInfoDto()
        val page = bookInfoController.page(bookInfoDto, httpServletRequest)
        logger.info("请求到 {}", page)
    }

    @Test
    @Rollback
    fun testAdd() {
        val bookInfoDto = BookInfoDto()
        bookInfoDto.bookName = "测试小说新增"
        bookInfoDto.author = "yangwulang"
        val add = bookInfoController.add(bookInfoDto)
        assert(add?.id != null)
        logger.info("新增成功 {}", JSON.toJSONString(add))
    }

}*/
