package com.rk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rk.service.ShopingStore;

public class AfterAdviceTest {

	public static void main(String[] args) {

	//properties
	ApplicationContext ctx=null;
	
	ShopingStore proxy=null;
	
	//create IOC container
	ctx=new ClassPathXmlApplicationContext("com/rk/cfgs/applicationContext.xml");
	
	//get proxy class object
	proxy=ctx.getBean("shoping",ShopingStore.class);
	
	//invoke the method
	System.out.println("BillAMOUNT is :: ");
	proxy.shopping(new String[] {"paint","shart","trouser"} ,
									new float[] {100f,200f,300f});
	
	
	//close ctx
	((AbstractApplicationContext) ctx).close();
	
	}//method
	
}//class
