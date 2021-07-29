package com.mydemo.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig  {
	
	@Pointcut("execution(public * com.mydemo.sessiontest.service..*.*(..))")
	public void brokerAspect() {
		
	}
	
	@Around("brokerAspect()")
	public void doArro(ProceedingJoinPoint pj) {
		long start = System.currentTimeMillis();
		try {
			pj.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("消耗时间" + (start-end));

	}

}
