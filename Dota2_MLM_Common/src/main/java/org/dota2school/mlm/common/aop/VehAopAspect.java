package org.dota2school.mlm.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.dota2school.mlm.common.exception.MLMException;
import org.dota2school.mlm.common.model.Entry;
import org.dota2school.mlm.common.model.ErrorEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * app 的aop
 * @author xujq 2017-9-15
 */
@Aspect
@Component
public class VehAopAspect implements Ordered,ApplicationListener<ContextRefreshedEvent> {
    private static final Logger LOG = LoggerFactory.getLogger(VehAopAspect.class);


    @Pointcut("@annotation(org.dota2school.mlm.common.annotation.MLMAop)")
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
    public void onApplicationEvent(ContextRefreshedEvent event) {
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
