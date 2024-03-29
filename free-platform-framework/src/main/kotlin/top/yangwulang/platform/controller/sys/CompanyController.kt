package top.yangwulang.platform.controller.sys

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.tags.Tags
import jakarta.servlet.http.HttpServletRequest
import org.babyfish.jimmer.spring.repository.SpringOrders
import org.babyfish.jimmer.spring.repository.support.SpringPageFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import top.yangwulang.platform.entity.PageHttpRequest
import top.yangwulang.platform.entity.Result
import top.yangwulang.platform.entity.sys.Company
import top.yangwulang.platform.entity.sys.CompanyTable
import top.yangwulang.platform.entity.sys.dto.CompanyGetView
import top.yangwulang.platform.entity.sys.dto.CompanyListInput
import top.yangwulang.platform.entity.sys.dto.CompanyListView
import top.yangwulang.platform.entity.sys.dto.CompanySaveInput
import top.yangwulang.platform.services.CompanyService


@RestController
@RequestMapping("\${adminPath}/sys/company")
@Tags(value = [Tag(name = "系统模块"), Tag(name = "企业管理")])
class CompanyController {
    @Autowired
    lateinit var companyService: CompanyService

    @GetMapping("/{id}")
    @Operation(summary = "获取企业详情")
    fun get(@PathVariable("id") id: String): CompanyGetView? {
        return companyService.repository().sql().findById(CompanyGetView::class.java, id)
    }

    @PostMapping
    @Operation(summary = "获取企业列表")
    fun listData(
        @RequestBody companyListInput: CompanyListInput,
        request: HttpServletRequest?
    ): Page<CompanyListView> {
        val repository = companyService.repository()
        val page = PageHttpRequest.of(request).toPage()
        val table = CompanyTable.`$`
        return repository.sql()
            .createQuery(table)
            .orderBy(SpringOrders.toOrders(table, page.sort).asList())
            .where(table.parentId().isNull)
            .select(table.fetch(CompanyListView::class.java))
            .fetchPage(page.pageNumber, page.pageSize, SpringPageFactory.getInstance())
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除企业")
    fun delete(@PathVariable("id") id: String): Result<Void> {
        companyService.deleteById(id);
        return Result<Void>().success("删除成功")
    }

    @PutMapping
    @Operation(summary = "新增或修改企业信息")
    fun save(@RequestBody input: CompanySaveInput): Result<Company> {
        return Result<Company>()
            .success(companyService.save(input))
            .apply {
                message = "操作成功"
            }
    }


}