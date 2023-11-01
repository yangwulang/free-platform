package top.yangwulang.platform.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yangwulang.platform.entity.sys.DictData;
import top.yangwulang.platform.repository.sys.DictDataRepository;
import top.yangwulang.platform.services.DictDataService;

@Service
public class DictDataServiceImpl extends BaseServiceImpl<DictData, String, DictDataRepository> implements DictDataService {

    protected DictDataServiceImpl(@Autowired DictDataRepository repository) {
        super(repository);
    }

}
