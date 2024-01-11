package top.yangwulang.platform.controller.sys

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.tags.Tags
import jakarta.servlet.http.HttpServletRequest
import okhttp3.internal.notify
import org.apache.commons.lang3.StringUtils
import org.babyfish.jimmer.ImmutableObjects
import org.babyfish.jimmer.client.meta.Prop
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.Objects
import top.yangwulang.platform.entity.PageHttpRequest
import top.yangwulang.platform.entity.Result
import top.yangwulang.platform.entity.Tables
import top.yangwulang.platform.entity.sys.Employee
import top.yangwulang.platform.entity.sys.EmployeeTable
import top.yangwulang.platform.entity.sys.User
import top.yangwulang.platform.entity.sys.dto.EmployeeGetView
import top.yangwulang.platform.entity.sys.dto.EmployeeListInput
import top.yangwulang.platform.entity.sys.dto.EmployeeListSpecification
import top.yangwulang.platform.entity.sys.dto.EmployeeListView
import top.yangwulang.platform.entity.sys.dto.EmployeeSaveInput
import top.yangwulang.platform.services.EmployeeService
import top.yangwulang.platform.utils.ConfigUtils
import top.yangwulang.platform.utils.UserUtils

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
    fun listData(
        @RequestBody specification: EmployeeListSpecification,
        request: HttpServletRequest?
    ): Page<EmployeeListView> {
        val repository = employeeService.repository()
        return employeeService.pager(PageHttpRequest.of(request).toPage())
            .execute(
                repository.sql()
                    .createQuery(Tables.EMPLOYEE_TABLE)
                    .where(specification)
                    .whereIf(
                        specification.status != User.STATUS_DELETE.toInt()
                                && specification.status != null
                    ) {
                        Tables.EMPLOYEE_TABLE.user().status().eq(specification.status)
                    }
                    .select(Tables.EMPLOYEE_TABLE.fetch(EmployeeListView::class.java))
            )
    }

    @Operation(summary = "获取员工信息")
    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: String): EmployeeGetView? {
        return employeeService.repository().sql().findById(EmployeeGetView::class.java, id);
    }

    @PutMapping
    @Operation(summary = "新增或修改员工信息")
    fun save(@RequestBody input: EmployeeSaveInput): Result<Employee> {
        if (StringUtils.isEmpty(input.mgrType)) {
            input.mgrType = User.USER_TYPE_SIMPLE_USER
        }
        input.userWeight = input.userWeight ?: 10
        val employee = Objects.createEmployee(input.toEntity()) { employeeDraft ->
            employeeDraft.applyUser(employeeDraft.user()) { userDraft ->
                val useDefaultValue = ConfigUtils.getConfigValueBoolean("sys.useDefaultPassword")
                if (useDefaultValue && !ImmutableObjects.isLoaded(userDraft, "password")) {
                    val configValue = ConfigUtils.getConfigValue("sys.defaultPassword")
                    userDraft.setPassword(UserUtils.encryptPassword(configValue))
                }
            }
        }
        return Result<Employee>()
            .success(employeeService.save(employee))
            .apply {
                message = "操作成功"
            }
    }
}
