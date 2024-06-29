package top.yangwulang.platform.services;

import org.babyfish.jimmer.View;
import top.yangwulang.platform.entity.sys.DictType;
import top.yangwulang.platform.repository.sys.DictTypeRepository;

/**
 * @author yangwulang
 */
public interface DictTypeService extends BaseService<DictType, String, DictTypeRepository> {
    /**
     * 根据类型查找特定形状的字典
     *
     * @param type  字典类型
     * @param fetch 形状
     * @param <T>   形状泛型
     * @return 查找的数据
     */
    <T extends View<DictType>> T findByType(String type, Class<T> fetch);
}
