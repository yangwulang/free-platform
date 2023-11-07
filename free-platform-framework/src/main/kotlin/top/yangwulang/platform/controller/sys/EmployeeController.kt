package top.yangwulang.platform.controller.sys

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.tags.Tags
import jakarta.servlet.http.HttpServletRequest
import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import top.yangwulang.platform.entity.PageHttpRequest
import top.yangwulang.platform.entity.sys.EmployeeTable
import top.yangwulang.platform.entity.sys.User
import top.yangwulang.platform.entity.sys.dto.EmployeeGetView
import top.yangwulang.platform.entity.sys.dto.EmployeeListInput
import top.yangwulang.platform.entity.sys.dto.EmployeeListView
import top.yangwulang.platform.services.EmployeeService

/**
 * @author yangwulang
 */
@RestController
@Tags(value = [Tag(name = "系统模块"), Tag(name = "员工管理")])
@RequestMapping("\${adminPath}/sys/employee")
class EmployeeController {
    @Autowired
    lateinit var employeeService: EmployeeService

    @PostMapping
    @Operation(summary = "获取员工列表")
    fun listData(@RequestBody input: EmployeeListInput, request: HttpServletRequest?): Page<EmployeeListView> {
        val table = EmployeeTable.`$`
        val repository = employeeService.repository()
        return employeeService.pager(PageHttpRequest.of(request).toPage())
            .execute(
                repository.sql()
                    .createQuery(table)
                    .whereIf(StringUtils.isNotEmpty(input.empCode)) { table.empCode().eq(input.empCode) }
                    .whereIf(StringUtils.isNotEmpty(input.empName)) { table.empName().like(input.empName) }
                    .whereIf(StringUtils.isNotEmpty(input.userName)) { table.user().userName().like(input.userName) }
                    .whereIf(StringUtils.isNotEmpty(input.email)) { table.user().email().like(input.email) }
                    .whereIf(input.status != User.STATUS_DELETE.toInt() && input.status != null) {
                        table.user().status().eq(input.status)
                    }
                    .select(table.fetch(EmployeeListView::class.java))
            )
    }

    @Operation(summary = "获取员工信息")
    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: String): EmployeeGetView? {
        return employeeService.repository().sql().findById(EmployeeGetView::class.java, id);
    }
}
