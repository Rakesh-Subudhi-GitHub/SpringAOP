package com.rk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rk.service.BankService;

public class BankLaonIntrest {

	public static void main(String[] args) {

		//properties
		ApplicationContext ctx=null;
		
		BankService proxy=null;
		
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/rk/cfgs/applicationContext.xml");
		
		//config the proxy class BankService class 
		proxy=ctx.getBean("bankService",BankService.class);
		
		//invoke the BankService method
		System.out.println("intrest amout is :: "+proxy.calculateSimpleIntrestAmount(10000,10,10));
		
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("coumpundintrest is: "+proxy.calculateCompoundIntrestAmount(10000,10,10));
		
		//close ctx
		((AbstractApplicationContext) ctx).close();
	}//main

}//class
