package com.rk.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class CommonExceptionLogger {

	public void exceptionLogger(JoinPoint jp,Exception ex)
	{
		System.out.println(ex+"  exception is raised in "+jp.getSignature()+"  having args "+Arrays.toString(jp.getArgs())+" in class "+jp.getTarget().getClass());
	}//method

}//class
