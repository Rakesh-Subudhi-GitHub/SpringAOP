package com.rk.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rk.manager.AuthenticationManager;

@Component("securityCheckAspect")
@Aspect
public class SecurityCheckAspect {

	@Autowired
	private AuthenticationManager manager;
	
	@Before("execution(java.lang.String com.rk.service.BankServiceImpl.*(..))")
	//signature
	public void check(JoinPoint jp)throws Throwable
	{
		if(!manager.validate())
			throw new IllegalArgumentException("invalid Credentials");
		
	}//signature method
	
}//class
