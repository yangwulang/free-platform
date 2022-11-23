package top.yangwulang.platform.controller.book

import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiOperation
import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.book.BookChapter
import top.yangwulang.platform.entity.book.BookInfo
import top.yangwulang.platform.entity.book.dto.BookChapterDto
import top.yangwulang.platform.entity.book.dto.BookInfoDto
import top.yangwulang.platform.entity.book.vo.BookChapterVo
import top.yangwulang.platform.exception.ServiceException
import top.yangwulang.platform.services.HttpPage
import top.yangwulang.platform.services.book.BookChapterService
import javax.servlet.http.HttpServletRequest

@Api(tags = ["小说模块", "小说章节管理"])
@RestController
@RequestMapping("\${adminPath}/book/chapter")
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
        @RequestBody bookChapterDto: BookChapter,
        httpServletRequest: HttpServletRequest
    ): Page<BookChapter> {
        if(bookChapterDto.book != null && StringUtils.isBlank(bookChapterDto.book!!.id)) {
            throw ServiceException("查询章节信息一定要携带 bookId!")
        }
        val httpPage = HttpPage(httpServletRequest)
        return bookChapterService
            .findPage(bookChapterDto, PageRequest.of(httpPage.getPositionNum(), httpPage.pageSize))
    }

    @PutMapping
    @ApiOperation(value = "新增或者修改小说章节信息（新增不带id，修改携带id）")
    fun add(
        @RequestBody bookChapterDto: BookChapter
    ): BookChapter? {
        return bookChapterService.save(bookChapterDto)
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除小说章节")
    fun delete(@PathVariable("id") id: String) {
        return bookChapterService.delete(id)
    }

}