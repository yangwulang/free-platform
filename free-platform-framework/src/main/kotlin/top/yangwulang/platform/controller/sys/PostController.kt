package top.yangwulang.platform.controller.sys

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.tags.Tags
import jakarta.servlet.http.HttpServletRequest
import org.apache.commons.lang3.StringUtils
import org.babyfish.jimmer.spring.repository.support.SpringPageFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.PageHttpRequest
import top.yangwulang.platform.entity.Tables
import top.yangwulang.platform.entity.sys.Post
import top.yangwulang.platform.entity.sys.PostTable
import top.yangwulang.platform.entity.sys.dto.PostGetView
import top.yangwulang.platform.entity.sys.dto.PostListInput
import top.yangwulang.platform.entity.sys.dto.PostListSpecification
import top.yangwulang.platform.entity.sys.dto.PostListView
import top.yangwulang.platform.entity.sys.dto.PostSaveInput
import top.yangwulang.platform.services.PostService


@RestController
@Tags(value = [Tag(name = "系统模块"), Tag(name = "岗位管理")])
@RequestMapping("\${adminPath}/sys/post")
class PostController {
    @Autowired
    lateinit var postService: PostService

    @GetMapping("/{id}")
    @Operation(summary = "获取岗位信息")
    operator fun get(@PathVariable("id") id: String?): PostGetView? {
        return postService.repository().sql().findById(PostGetView::class.java, id)
    }

    @PostMapping
    @Operation(summary = "获取岗位列表")
    fun listData(request: HttpServletRequest?, @RequestBody input: PostListSpecification): Page<PostListView> {
        val repository = postService.repository()
        val page = PageHttpRequest.of(request).toPage()
        val table = Tables.POST_TABLE
        return repository.sql()
            .createQuery(table)
            .where(input)
            .select(table.fetch(PostListView::class.java))
            .fetchPage(page.pageNumber, page.pageSize, SpringPageFactory.getInstance())
    }

    @PutMapping
    @Operation(summary = "新增或修改岗位")
    fun save(@RequestBody input: PostSaveInput): Post {
        return postService.save(input)
    }
}