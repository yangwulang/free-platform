package top.yangwulang.platform.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.repository.sys.DictTypeRepository;
import top.yangwulang.platform.services.DictTypeService;

/**
 * @author yangwulang
 */
@Service
public class DictTypeServiceImpl
        extends BaseServiceImpl<DictType, String, DictTypeRepository>
        implements DictTypeService {
    public DictTypeServiceImpl(@Autowired DictTypeRepository repository) {
        super(repository);
    }
}
