package top.yangwulang.platform.repository.sys;

import org.babyfish.jimmer.spring.repository.JRepository;
import org.springframework.stereotype.Repository;
import top.yangwulang.platform.entity.sys.OptionAnalysis;

@Repository
public interface OptionAnalysisRepository extends JRepository<OptionAnalysis, String> {

}
