package top.yangwulang.platform.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.yangwulang.platform.entity.sys.Employee;
import top.yangwulang.platform.repository.sys.EmployeeRepository;
import top.yangwulang.platform.services.EmployeeService;

/**
 * @author yangwulang
 */
@Service
@Transactional
public class EmployeeServiceImpl
        extends BaseServiceImpl<Employee, String, EmployeeRepository>
        implements EmployeeService {
    public EmployeeServiceImpl(@Autowired EmployeeRepository repository) {
        super(repository);
    }
}
