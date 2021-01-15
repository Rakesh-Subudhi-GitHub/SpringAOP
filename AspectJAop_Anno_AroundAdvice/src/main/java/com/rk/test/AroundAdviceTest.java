package com.rk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rk.service.BankService;

public class AroundAdviceTest {

	public static void main(String[] args) {
		
		//properties
		ApplicationContext ctx=null;
		
		BankService proxy=null;
		
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/rk/cfgs/applicationContext.xml");
		
		//get proxy object
		proxy=ctx.getBean("bankService",BankService.class);
		
		//invoke the method
		System.out.println("simple intrest calculate :: "+proxy.calculateSimpleIntrestAmount(10000,10,24));
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("compund intrest calculate :: "+proxy.calculateCompoundIntrestAmount(10000,10,24));
		
		//end ctx
		((AbstractApplicationContext) ctx).close();
		
	}//main
}//class
