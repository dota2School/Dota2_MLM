package org.dota2school.mlm.wx.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.dota2school.mlm.wx.exception.MLMException;
import org.dota2school.mlm.wx.model.Entry;
import org.dota2school.mlm.wx.model.ErrorEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * app 的aop
 * @author Xuxue1 2017-9-15
 */
@Aspect
@Component
public class VehAopAspect implements Ordered {
    private static final Logger LOG = LoggerFactory.getLogger(VehAopAspect.class);


    @Pointcut("@annotation(org.dota2school.mlm.wx.annotation.MLMAop)")
    public void MlmAopAspect() {

    }

    /**
     * 方法执行之前
     * @param joinPoint 目标类连接点对象
     */
    @Before("MlmAopAspect()")
    public void beforeAop(JoinPoint joinPoint) {
        LOG.info("Process {}",joinPoint.getSignature());
        LOG.info("Args {} ", Arrays.toString(joinPoint.getArgs()));
    }

    @Around("MlmAopAspect()")
    public Entry aroundAop(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
       try{
           return (Entry) proceedingJoinPoint.proceed();
       }catch (MLMException veh){
            LOG.warn("Failed  process {}",proceedingJoinPoint.getSignature(),veh);
            return new ErrorEntry(veh);
       }catch (Throwable ex){
           LOG.warn("Failed  process {}",proceedingJoinPoint.getSignature(),ex);
           return new ErrorEntry(ex);
       }
    }

    @After("MlmAopAspect()")
    public void afterAop(JoinPoint joinPoint) {
        LOG.info("After {}",joinPoint.getSignature());
    }


    @Override
    public int getOrder() {
        return 1;
    }
}
