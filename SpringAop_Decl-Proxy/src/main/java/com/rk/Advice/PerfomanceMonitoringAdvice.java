package com.rk.Advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerfomanceMonitoringAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		long startTime=System.currentTimeMillis();
		
		Object retVal=invocation.proceed();
		
		long endTime=System.currentTimeMillis();
		
		//evaluate the performance
		System.out.println(invocation.getMethod().getName()+"  with args  "+Arrays.toString(invocation.getArguments()));
		
		//time for execution
		System.out.println("Time taken for execution is :: "+(endTime-startTime)+"  milisec");
		
		return retVal;
	
	}//method

}//class
