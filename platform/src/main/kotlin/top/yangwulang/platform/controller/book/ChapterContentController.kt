package top.yangwulang.platform.controller.book

import io.swagger.annotations.Api
import io.swagger.annotations.ApiImplicitParam
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.book.ChapterContent
import top.yangwulang.platform.services.book.ChapterContentService


@Api(tags = ["小说模块", "章节内容管理"])
@RestController
@RequestMapping("/book/chapterContent")
class ChapterContentController {

    @Autowired
    private lateinit var chapterContentService: ChapterContentService


    @GetMapping("/{id}")
    @ApiOperation(value = "获取小说章节内容")
    @ApiImplicitParam(name = "id", value = "主键", required = true)
    fun get(@PathVariable("id") id: String): ChapterContent? {
        return chapterContentService.findById(id)
    }

    @GetMapping("/chapter/{id}")
    @ApiOperation(value = "获取小说章节内容")
    @ApiImplicitParam(name = "id", value = "主键", required = true)
    fun getByChapterId(@PathVariable("id") id: String): ChapterContent? {
        return chapterContentService.findByChapterId(id)
    }


    @PutMapping
    @ApiOperation(value = "新增章节内容（新增不带id，修改携带id）")
    fun add(
        @RequestBody chapterContent: ChapterContent
    ): ChapterContent? {
        return chapterContentService.save(chapterContent)
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除章节内容")
    fun delete(@PathVariable("id") id: String) {
        return chapterContentService.delete(id)
    }


    @GetMapping("/sync/{chapterId}")
    @ApiOperation(value = "同步远程章节信息")
    fun syncRemote(@PathVariable("chapterId") chapterId: String) {
        chapterContentService.syncRemoteByChapterId(chapterId)
    }

}