package top.yangwulang.platform.controller.pc

import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import top.yangwulang.platform.entity.book.vo.BookCategoryVo
import top.yangwulang.platform.services.book.BookCategoryService


@Api(tags = ["小说模块"])
@RestController
@RequestMapping("/book")
class BookCategoryController {

    @Autowired
    lateinit var bookCategoryService: BookCategoryService;

    @GetMapping("/{id}")
    @ApiOperation(value = "获取小说类型")
    @ApiImplicitParam(name = "id", value = "类型主键", required = true)
    fun get(@PathVariable("id") id: String) : BookCategoryVo? {
        return bookCategoryService.convertFactory().convertVo(bookCategoryService.findById(id))
    }

}