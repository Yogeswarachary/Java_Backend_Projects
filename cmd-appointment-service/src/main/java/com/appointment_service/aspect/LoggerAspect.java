package com.appointment_service.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MemberSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggerAspect {
	 private final Logger log = LoggerFactory.getLogger(this.getClass());
	 
	 @Around("execution(* com.pratian.appointmentservices..*(..))")
	 public Object profileAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		 MemberSignature methodSignature = (MemberSignature) proceedingJoinPoint.getSignature();
		 
		 //Get intercepted method details
		 String className = methodSignature.getDeclaringType().getSimpleName();
		 String methodName = methodSignature.getName();
		 
		 final StopWatch stopWatch = new StopWatch();
		 
		 //Measure method execution time
		 stopWatch.start();
		 Object result = proceedingJoinPoint.proceed();
		 stopWatch.stop();
		 
		 //Log method execution time
		 log.info("Execution time of "+ className +"."+methodName +" ::"+ stopWatch.getTotalTimeMillis()+" ms");
		 return result;
	 }
} 
