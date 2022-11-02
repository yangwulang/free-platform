package top.yangwulang.platform.controller.pc

import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiOperation
import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.book.BookChapter
import top.yangwulang.platform.entity.book.dto.BookChapterDto
import top.yangwulang.platform.entity.book.vo.BookChapterVo
import top.yangwulang.platform.exception.ServiceException
import top.yangwulang.platform.services.HttpPage
import top.yangwulang.platform.services.book.BookChapterService
import javax.servlet.http.HttpServletRequest

@Api(tags = ["小说模块", "小说章节管理"])
@RestController
@RequestMapping("/book/chapter")
class BookChapterController {

    @Autowired
    lateinit var bookChapterService: BookChapterService


    @GetMapping("/{id}")
    @ApiOperation(value = "获取小说章节")
    @ApiImplicitParam(name = "id", value = "章节主键", required = true)
    fun get(@PathVariable("id") id: String): BookChapter? {
        return bookChapterService.findById(id)
    }


    @PostMapping
    @ApiOperation(value = "分页获取小说章节")
    fun page(
        @RequestBody bookChapterDto: BookChapterDto,
        httpServletRequest: HttpServletRequest
    ): Page<BookChapter> {
        if(StringUtils.isBlank(bookChapterDto.bookId)) {
            throw ServiceException("查询章节信息一定要携带 bookId!")
        }
        val httpPage = HttpPage(httpServletRequest)
        return bookChapterService
            .findPage(bookChapterDto, PageRequest.of(httpPage.getPositionNum(), httpPage.pageSize))
    }

}