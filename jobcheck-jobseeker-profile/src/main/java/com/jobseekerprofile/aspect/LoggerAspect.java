package com.jobseekerprofile.aspect;

import org.springframework.util.StopWatch;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MemberSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Around("execution(* com.jobcheck..*(..))")
    public Object allMethodsInfo(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MemberSignature methodSignature = (MemberSignature) proceedingJoinPoint.getSignature();

        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();

        final StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        Object result = proceedingJoinPoint.proceed();
        stopWatch.stop();

        log.info("Execution time of " + className + "." + methodName + " :: " + stopWatch.getTotalTimeMillis() + " ms");

        return result;
    }
	
	
	@AfterThrowing(value = "execution(* com.jobcheck..*(..))", throwing = "ex")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex) {
        log.error("After Throwing exception in method:" + joinPoint.getSignature());
        System.out.println("Exception is:" + ex.getMessage());
    }

	
	
	

	
}
