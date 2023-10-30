package top.yangwulang.platform.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yangwulang.platform.entity.sys.Area;
import top.yangwulang.platform.repository.sys.AreaRepository;
import top.yangwulang.platform.services.AreaService;

/**
 * @author yangwulang
 */
@Service
public class AreaServiceImpl extends BaseServiceImpl<Area,String, AreaRepository> implements AreaService {
    public AreaServiceImpl(@Autowired AreaRepository repository) {
        super(repository);
    }
}
