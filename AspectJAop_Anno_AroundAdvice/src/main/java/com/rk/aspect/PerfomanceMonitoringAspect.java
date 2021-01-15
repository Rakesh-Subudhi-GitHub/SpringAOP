package com.rk.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("pmAspect")
@Aspect
public class PerfomanceMonitoringAspect {

	@Around("execution(float com.rk.service.BankService.*(..))")
	public Object monito(ProceedingJoinPoint pjp)throws Throwable
	{
		long startTime=System.currentTimeMillis();
		
		Object retVal=pjp.proceed();
		
		long endTime=System.currentTimeMillis();
		
		System.out.println(pjp.getSignature()+" with args "+Arrays.deepToString(pjp.getArgs())+" has taken time is = "+(endTime-startTime)+" ms" );
		
		return retVal;
		
	}//method
}//class
