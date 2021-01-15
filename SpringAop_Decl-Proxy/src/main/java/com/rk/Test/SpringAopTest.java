package com.rk.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rk.service.BankServiceImpl;
import com.rk.service.IBankService;

public class SpringAopTest {

	public static void main(String[] args) {
		
		//properties
		ApplicationContext ctx=null;
		IBankService proxyService=null;
		
		//create IOC container
		ctx= new ClassPathXmlApplicationContext("com/rk/cfgs/applicationContext.xml");
		
		//get Proxy class obj ref
		proxyService=ctx.getBean("pfb",IBankService.class);
		
		//invoke the service class method
		System.out.println("Intrest amount is :: "+proxyService.calculateSimpleIntrest(10000,2,12));
		
		//close ioc container
		((AbstractApplicationContext) ctx).close();
		
	}//main
}//class
