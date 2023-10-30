package top.yangwulang.platform.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.yangwulang.platform.entity.sys.OptionAnalysis;
import top.yangwulang.platform.repository.sys.OptionAnalysisRepository;
import top.yangwulang.platform.services.OptionAnalysisService;

/**
 * @author yangwulang
 */
@Service
public class OptionAnalysisServiceImpl
        extends BaseServiceImpl<OptionAnalysis, String, OptionAnalysisRepository>
        implements OptionAnalysisService {
    public OptionAnalysisServiceImpl(@Autowired OptionAnalysisRepository repository) {
        super(repository);
    }
}
