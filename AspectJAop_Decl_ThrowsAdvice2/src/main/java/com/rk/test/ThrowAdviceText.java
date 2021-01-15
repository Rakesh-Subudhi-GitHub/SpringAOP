package com.rk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rk.service.ShoppingStore;

public class ThrowAdviceText {

	public static void main(String[] args) {
		
			//properties
			ApplicationContext ctx=null;
			
			ShoppingStore proxy=null;
			
			//create IOC container
			ctx= new ClassPathXmlApplicationContext("com/rk/cfgs/applicationContext.xml");
			
			//get proxy class obj
			proxy=ctx.getBean("shopping",ShoppingStore.class);
			
			//invoke the method
			try {
				System.out.println("Bill Amount::  "+proxy.billGenerate(new String[] {"xmax","tree","shoose"}, 
																															new float [] {0.0f,200.0f,5500.0f} ) );
			}//try
			catch (Exception e) {
				e.printStackTrace();
			}
	}//main
}//class
