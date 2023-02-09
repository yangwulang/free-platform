package top.yangwulang.platform.controller.sys;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import top.yangwulang.platform.entity.PageHttpRequest;
import top.yangwulang.platform.entity.Result;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.DictDataFetcher;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.entity.sys.DictTypeFetcher;
import top.yangwulang.platform.entity.sys.dto.DictDataInput;
import top.yangwulang.platform.entity.sys.dto.DictTypeInput;
import top.yangwulang.platform.repository.sys.DictDataRepository;
import top.yangwulang.platform.repository.sys.DictTypeRepository;

/**
 * @author yangwulang
 */
@RestController
@Tags(value = {
        @Tag(name = "系统模块"),
        @Tag(name = "字典管理"),
})
@RequestMapping("${adminPath}/sys/dict")
public class DictController {

    @Autowired
    private DictTypeRepository dictTypeRepository;

    @Autowired
    private DictDataRepository dictDataRepository;

    private final DictTypeFetcher dictTypeFetcher = DictTypeFetcher.$
            .allTableFields();

    private final DictDataFetcher dictDataFetcher = DictDataFetcher.$.allTableFields();


    @GetMapping("/dictType/{id}")
    @Operation(summary = "获取字典类型数据")
    public DictType getType(@PathVariable("id") String id) {
        return dictTypeRepository.findById(id).orElse(null);
    }

    @PostMapping("/dictType")
    @Operation(summary = "获取字典类型列表")
    public Page<DictType> listData(HttpServletRequest httpServletRequest, @RequestBody DictTypeInput dictTypeInput) {
        return dictTypeRepository.findAll(PageHttpRequest.of(httpServletRequest).toPage(), dictTypeFetcher, dictTypeInput);
    }

    @PutMapping("/dictType")
    @Operation(summary = "新增或修改字典类型")
    public DictType saveType(@RequestBody DictTypeInput dictTypeInput) {
        return dictTypeRepository.save(dictTypeInput);
    }

    @DeleteMapping("/dictType/{id}")
    @Operation(summary = "删除字典类型")
    public Result<Void> deleteType(@PathVariable("id") String id) {
        dictTypeRepository.deleteById(id);
        return new Result<Void>().success("删除成功");
    }

    @GetMapping("/dictData/{id}")
    @Operation(summary = "获取字典数据")
    public DictData getData(@PathVariable("id") String id) {
        return dictDataRepository.findNullable(id);
    }

    @PostMapping("/dictData")
    @Operation(summary = "获取字典数据列表")
    public Page<DictData> listDictData(HttpServletRequest httpServletRequest, @RequestBody DictDataInput dictDataInput) {
        return dictDataRepository.findAll(PageHttpRequest.of(httpServletRequest).toPage(), dictDataFetcher);
    }


    @PutMapping("/dictData")
    @Operation(summary = "新增或修改字典数据")
    public DictData saveType(@RequestBody DictData dictData) {
        return dictDataRepository.save(dictData);
    }

    @DeleteMapping("/dictData/{id}")
    @Operation(summary = "删除字典数据")
    public Result<Void> deleteData(@PathVariable("id") String id) {
        dictDataRepository.deleteById(id);
        return new Result<Void>().success("删除成功");
    }

}
