package top.yangwulang.platform.controller.book

import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.book.BookInfo
import top.yangwulang.platform.entity.book.dto.BookInfoDto
import top.yangwulang.platform.services.HttpPage
import top.yangwulang.platform.services.book.BookInfoService
import javax.servlet.http.HttpServletRequest


@Api(tags = ["小说模块", "小说管理"])
@RestController
@RequestMapping("\${adminPath}/book/info")
class BookInfoController {
    @Autowired
    lateinit var bookInfoService: BookInfoService

    @GetMapping("/{id}")
    @ApiOperation(value = "获取小说信息")
    @ApiImplicitParam(name = "id", value = "类型主键", required = true)
    fun get(@PathVariable("id") id: String): BookInfo? {
        return bookInfoService.findById(id)
    }


    @PostMapping
    @ApiOperation(value = "分页获取小说")
    fun page(
        @RequestBody bookInfoDto: BookInfoDto,
        httpServletRequest: HttpServletRequest
    ): Page<BookInfo> {
        val httpPage = HttpPage(httpServletRequest)
        return bookInfoService
            .findPage(bookInfoDto, PageRequest.of(httpPage.getPositionNum(), httpPage.pageSize))
    }

    @PutMapping
    @ApiOperation(value = "新增或者修改小说（新增不带id，修改携带id）")
    fun add(
        @RequestBody bookInfoDto: BookInfoDto
    ): BookInfo? {
        return bookInfoService.save(bookInfoDto)
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除小说信息")
    fun delete(@PathVariable("id") id: String) {
        return bookInfoService.delete(id)
    }


    @GetMapping("/syncBookContent/{id}")
    @ApiOperation(value = "同步小说全部章节内容")
    fun syncBookContentById(@PathVariable("id") id: String) {
        bookInfoService.syncBookContent(id)
    }

}