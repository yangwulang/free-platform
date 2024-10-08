package top.yangwulang.platform.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.yangwulang.platform.entity.sys.Company;
import top.yangwulang.platform.repository.sys.CompanyRepository;
import top.yangwulang.platform.services.CompanyService;

/**
 * @author yangwulang
 */
@Service
@Transactional
public class CompanyServiceImpl
        extends BaseServiceImpl<Company, String, CompanyRepository>
        implements CompanyService {
    public CompanyServiceImpl(@Autowired CompanyRepository repository) {
        super(repository);
    }
}
