package top.yangwulang.platform.controller.sys

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.tags.Tags
import jakarta.servlet.http.HttpServletRequest
import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.PageHttpRequest
import top.yangwulang.platform.entity.Result
import top.yangwulang.platform.entity.sys.ConfigTable
import top.yangwulang.platform.entity.sys.dto.*
import top.yangwulang.platform.exception.ServiceException
import top.yangwulang.platform.services.ConfigService


@RestController
@Tags(value = [Tag(name = "系统模块"), Tag(name = "配置管理")])
@RequestMapping("\${adminPath}/sys/config")
class ConfigController {
    @Autowired
    lateinit var configService: ConfigService

    @GetMapping("/{id}")
    @Operation(summary = "获取配置信息")
    fun get(@PathVariable("id") id: String): ConfigGetView? {
        return configService.repository().sql()
            .findById(ConfigGetView::class.java, id)
    }

    @PostMapping
    @Operation(summary = "获取配置列表")
    fun listData(@RequestBody input: ConfigListInput, request: HttpServletRequest?): Page<ConfigListView> {
        val table = ConfigTable.`$`
        val repository = configService.repository()
        return repository.pager(PageHttpRequest.of(request).toPage())
            .execute(
                repository.sql()
                    .createQuery(table)
                    .whereIf(StringUtils.isNotEmpty(input.configName)) { table.configName().like(input.configName) }
                    .whereIf(StringUtils.isNotEmpty(input.configKey)) { table.configKey().like(input.configKey) }
                    .whereIf(StringUtils.isNotEmpty(input.configValue)) { table.configValue().like(input.configValue) }
                    .select(table.fetch(ConfigListView::class.java))
            )
    }

    @PutMapping
    @Operation(summary = "保存或修改配置")
    fun save(@RequestBody roleInput: ConfigSaveInput): Result<ConfigSaveView> {
        val save = configService.save(roleInput)
        return Result<ConfigSaveView>().success("修改成功").apply {
            result = ConfigSaveView(
                configService.findById(save.id())
                    .orElseThrow { ServiceException("修改失败") }
            )
        }
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除配置信息")
    fun delete(@PathVariable("id") id: String): Result<Void> {
        configService.deleteById(id)
        return Result<Void>().success("删除成功")
    }
}
