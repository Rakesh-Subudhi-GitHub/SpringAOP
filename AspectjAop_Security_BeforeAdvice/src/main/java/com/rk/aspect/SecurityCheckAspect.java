package com.rk.aspect;


import org.aspectj.lang.JoinPoint;

import com.rk.manager.AuthenticationManager;

public class SecurityCheckAspect {

	private AuthenticationManager manager;

	public SecurityCheckAspect(AuthenticationManager manager) {
		System.out.println("1-param constructor for Secutiry Check in Aspect AOP class ::::");
		this.manager = manager;
	}
	
	//signature
	public void check(JoinPoint jp)throws Throwable
	{
		if(!manager.validate())
			throw new IllegalArgumentException("invalid Credentials");
		
	}//signature method
	
}//class
