package top.yangwulang.platform.controller.sys

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.tags.Tags
import org.babyfish.jimmer.sql.ast.Predicate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.Tables
import top.yangwulang.platform.entity.sys.Area
import top.yangwulang.platform.entity.sys.AreaTable
import top.yangwulang.platform.entity.sys.dto.AreaGetView
import top.yangwulang.platform.entity.sys.dto.AreaListSpecification
import top.yangwulang.platform.entity.sys.dto.AreaListView
import top.yangwulang.platform.entity.sys.input.area.AreaSaveInput
import top.yangwulang.platform.services.AreaService

/**
 * @author yangwulang
 */
@RestController
@Tags(value = [Tag(name = "系统模块"), Tag(name = "区域管理")])
@RequestMapping("\${adminPath}/sys/area")
class AreaController {
    @Autowired
    lateinit var areaService: AreaService

    @PostMapping
    @Operation(summary = "获取区域列表")
    fun listData(@RequestBody areaQo: AreaListSpecification): List<AreaListView> {
        val query = areaService.repository().sql().createQuery(Tables.AREA_TABLE)
        areaService.dataScopeManager<AreaTable>().filter(query)
        return query
            .where(Tables.AREA_TABLE.parentId().isNull)
            .where(areaQo)
            .select(Tables.AREA_TABLE.fetch(AreaListView::class.java))
            .execute()
    }

    @GetMapping("/{id}")
    @Operation(summary = "获取区域详情")
    operator fun get(@PathVariable(value = "id") id: String): AreaGetView? {
        return areaService.repository().sql().findById(AreaGetView::class.java, id)
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "删除区域")
    fun delete(@PathVariable(value = "id") id: String) {
        areaService.deleteById(id)
    }

    @PutMapping
    @Operation(summary = "修改或新增区域")
    fun save(@RequestBody input: AreaSaveInput): Area {
        return areaService.save(input)
    }
}
