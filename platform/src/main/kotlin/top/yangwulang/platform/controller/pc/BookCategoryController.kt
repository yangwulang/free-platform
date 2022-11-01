package top.yangwulang.platform.controller.pc

import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiImplicitParams
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import top.yangwulang.platform.entity.book.dto.BookCategoryDto
import top.yangwulang.platform.entity.book.vo.BookCategoryVo
import top.yangwulang.platform.services.Page
import top.yangwulang.platform.services.book.BookCategoryService
import javax.servlet.http.HttpServletRequest


@Api(tags = ["小说模块"])
@RestController
@RequestMapping("/book")
class BookCategoryController {

    @Autowired
    lateinit var bookCategoryService: BookCategoryService;

    @GetMapping("/{id}")
    @ApiOperation(value = "获取小说类型")
    @ApiImplicitParam(name = "id", value = "类型主键", required = true)
    fun get(@PathVariable("id") id: String): BookCategoryVo? {
        return bookCategoryService.convertFactory().convertVo(bookCategoryService.findById(id))
    }

    @PostMapping
    @ApiOperation(value = "分页获取小说类型")
    fun page(
        @RequestBody bookCategoryDto: BookCategoryDto,
        httpServletRequest: HttpServletRequest
    ): org.springframework.data.domain.Page<BookCategoryVo> {
        val page = Page(httpServletRequest)
        return bookCategoryService
            .findPage(bookCategoryDto, PageRequest.of(page.getPositionNum(), page.pageSize))
            .map {
                bookCategoryService.convertFactory().convertVo(it)
            }
    }

}