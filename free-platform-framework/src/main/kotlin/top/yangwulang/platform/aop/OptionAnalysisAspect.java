package top.yangwulang.platform.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.yangwulang.platform.annotation.OptionAnalysis;
import top.yangwulang.platform.entity.sys.OptionAnalysisDraft;
import top.yangwulang.platform.entity.sys.User;
import top.yangwulang.platform.services.OptionAnalysisService;
import top.yangwulang.platform.utils.ServletUtils;
import top.yangwulang.platform.utils.UserUtils;

import java.util.Date;

/**
 * @author yangwulang
 */
@Slf4j
@Aspect
@Component
public class OptionAnalysisAspect {

    @Autowired
    private OptionAnalysisService optionAnalysisService;

    @Pointcut("@annotation(top.yangwulang.platform.annotation.OptionAnalysis)")
    public void optionAnalysisPointCut() {
    }


    @Before("optionAnalysisPointCut()")
    public void optionAnalysisPointCutAround(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        OptionAnalysis optionAnalysis = signature.getMethod().getAnnotation(OptionAnalysis.class);
        User optionUser = UserUtils.getCurrentUser();
        String clientIP = ServletUtils.getClientIP(ServletUtils.getCurrentServletRequest());
        top.yangwulang.platform.entity.sys.OptionAnalysis produce = OptionAnalysisDraft.$.produce(it ->
                it.setCreateDate(new Date())
                        .setEventCode(optionAnalysis.eventCode())
                        .setEventName(optionAnalysis.eventName())
                        .setOptionUser(optionUser)
                        .setIpAddress(clientIP)
        );
        optionAnalysisService.save(produce);
        log.info("分析操作 code: {} name: {}", optionAnalysis.eventCode(), optionAnalysis.eventName());
    }

}
