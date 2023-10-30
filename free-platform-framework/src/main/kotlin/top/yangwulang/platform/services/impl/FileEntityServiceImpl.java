package top.yangwulang.platform.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yangwulang.platform.entity.sys.FileEntity;
import top.yangwulang.platform.repository.sys.FileEntityRepository;
import top.yangwulang.platform.services.FileEntityService;

/**
 * @author yangwulang
 */
@Service
public class FileEntityServiceImpl extends BaseServiceImpl<FileEntity,String, FileEntityRepository> implements FileEntityService {

    protected FileEntityServiceImpl(@Autowired FileEntityRepository repository) {
        super(repository);
    }


}
