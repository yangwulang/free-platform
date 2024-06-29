package top.yangwulang.platform.services.impl;

import org.babyfish.jimmer.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.repository.sys.DictTypeRepository;
import top.yangwulang.platform.services.DictTypeService;
import top.yangwulang.platform.entity.Tables;

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

    @Override
    public <T extends View<DictType>> T findByType(String type, Class<T> fetch) {
        return repository()
                .sql()
                .createQuery(Tables.DICT_TYPE_TABLE)
                .where(Tables.DICT_TYPE_TABLE.dictType().eq(type))
                .select(Tables.DICT_TYPE_TABLE.fetch(fetch))
                .fetchOneOrNull();
    }
}
