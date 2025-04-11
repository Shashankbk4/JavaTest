package com.fmc.aspect;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogCarTime {
    
	private Logger logger=Logger.getLogger(LogCarTime.class.getName());
    
	@Around("execution(* com.fmc.Car.start(..))")
	public void log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		logger.info(proceedingJoinPoint.getSignature().toString() + ":- method execution start ");
	Instant start=Instant.now();
	proceedingJoinPoint.proceed();
	Instant finish=Instant.now();
	long timeElapsed=Duration.between(start,finish).toMillis();
	logger.info("time took to execute the metod :- "+timeElapsed);
	logger.info(proceedingJoinPoint.getSignature().toString() + ":- method execution end");
	
	}
}
