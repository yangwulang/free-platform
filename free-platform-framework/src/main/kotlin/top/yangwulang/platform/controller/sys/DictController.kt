package top.yangwulang.platform.controller.sys

import cn.dev33.satoken.annotation.SaCheckPermission
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.tags.Tags
import jakarta.servlet.http.HttpServletRequest
import org.babyfish.jimmer.spring.repository.support.SpringPageFactory
import org.babyfish.jimmer.sql.ast.Predicate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*
import top.yangwulang.platform.entity.PageHttpRequest
import top.yangwulang.platform.entity.Result
import top.yangwulang.platform.entity.sys.DictDataTable
import top.yangwulang.platform.entity.sys.DictTypeTable
import top.yangwulang.platform.entity.sys.dto.*
import top.yangwulang.platform.services.DictDataService
import top.yangwulang.platform.services.DictTypeService

/**
 * @author yangwulang
 */
@RestController
@Tags(value = [Tag(name = "系统模块"), Tag(name = "字典管理")])
@RequestMapping("\${adminPath}/sys/dict")
class DictController {
    @Autowired
    lateinit var dictTypeService: DictTypeService

    @Autowired
    lateinit var dictDataService: DictDataService

    @SaCheckPermission(value = ["sys:dictType:view"])
    @GetMapping("/dictType/{id}")
    @Operation(summary = "获取字典类型数据")
    fun getType(@PathVariable("id") id: String): DictTypeGetView? {
        return dictTypeService.repository().sql().findById(DictTypeGetView::class.java, id)
    }

    @SaCheckPermission(value = ["sys:dictType:view"])
    @PostMapping("/dictType")
    @Operation(summary = "获取字典类型列表")
    fun listData(
        httpServletRequest: HttpServletRequest?,
        @RequestBody listSpecification: DictTypeListSpecification
    ): Page<DictTypeListView> {
        val repository = dictTypeService.repository()
        val page = PageHttpRequest.of(httpServletRequest).toPage()
        val table = DictTypeTable.`$`
        return repository.sql()
            .createQuery(table)
            .where(listSpecification)
            .select(table.fetch(DictTypeListView::class.java))
            .fetchPage(page.pageNumber, page.pageSize, SpringPageFactory.getInstance())
    }

    @PutMapping("/dictType")
    @Operation(summary = "新增或修改字典类型")
    fun saveType(@RequestBody dictTypeInput: DictSaveInput): Result<Void> {
        dictTypeService.save(dictTypeInput)
        return Result<Void>().success("操作成功")
    }

    @DeleteMapping("/dictType/{id}")
    @Operation(summary = "删除字典类型")
    fun deleteType(@PathVariable("id") id: String): Result<Void> {
        dictTypeService.deleteById(id)
        return Result<Void>().success("删除成功")
    }

    @GetMapping("/dictData/{id}")
    @Operation(summary = "获取字典数据")
    fun getData(@PathVariable("id") id: String): DictDataGetView? {
        return dictDataService.repository().sql().findById(DictDataGetView::class.java, id)
    }

    @PostMapping("/dictData")
    @Operation(summary = "获取字典数据列表")
    fun listDictData(
        httpServletRequest: HttpServletRequest?,
        @RequestBody dictDataInput: DictDataListInput
    ): List<DictDataListView> {
        val table = DictDataTable.`$`
        return dictDataService.repository().sql().createQuery(table)
            .where(
                Predicate.and(
                    table.parentId().isNull,
                    table.dictType().id().eq(dictDataInput.dictTypeId)
                )
            )
            .select(table.fetch(DictDataListView::class.java)).execute()
    }

    @PutMapping("/dictData")
    @Operation(summary = "新增或修改字典数据")
    fun saveData(@RequestBody dictData: DictDataSaveInput): Result<Void> {
        dictDataService.save(dictData)
        return Result<Void>().success("操作成功")
    }

    @DeleteMapping("/dictData/{id}")
    @Operation(summary = "删除字典数据")
    fun deleteData(@PathVariable("id") id: String): Result<Void> {
        dictDataService.deleteById(id)
        return Result<Void>().success("删除成功")
    }
}
