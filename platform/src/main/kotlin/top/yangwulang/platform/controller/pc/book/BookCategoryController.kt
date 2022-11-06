package top.yangwulang.platform.controller.pc.book

import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import top.yangwulang.platform.entity.book.dto.BookCategoryDto
import top.yangwulang.platform.entity.book.vo.BookCategoryVo
import top.yangwulang.platform.services.HttpPage
import top.yangwulang.platform.services.book.BookCategoryService
import javax.servlet.http.HttpServletRequest


@Api(tags = ["小说模块", "小说类型管理"])
@RestController
@RequestMapping("/book/category")
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
    ): Page<BookCategoryVo> {
        val httpPage = HttpPage(httpServletRequest)
        return bookCategoryService
            .findPage(bookCategoryDto, PageRequest.of(httpPage.getPositionNum(), httpPage.pageSize))
            .map {
                bookCategoryService.convertFactory().convertVo(it)
            }
    }

    @PutMapping
    @ApiOperation(value = "新增或者修改小说类型（新增不带id，修改携带id）")
    fun add(
        @RequestBody bookCategoryDto: BookCategoryDto
    ): BookCategoryVo? {
        return bookCategoryService.convertFactory()
            .convertVo(bookCategoryService.save(bookCategoryDto))
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除小说类型")
    fun delete(@PathVariable("id") id: String) {
        return bookCategoryService.delete(id)
    }

}