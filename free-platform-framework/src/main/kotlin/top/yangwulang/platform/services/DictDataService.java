package top.yangwulang.platform.services;

import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.entity.sys.input.DictDataInput;

public interface DictDataService {
    DictData save(DictDataInput dictDataInput);
}
