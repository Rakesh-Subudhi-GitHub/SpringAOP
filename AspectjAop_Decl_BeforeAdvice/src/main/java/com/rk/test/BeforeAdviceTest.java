package com.rk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rk.service.CarShowRoom;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		
		//properties
		ApplicationContext ctx=null;
		CarShowRoom show=null;
		
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/rk/cfgs/applicationContext.xml");
		show=ctx.getBean("showRoom",CarShowRoom.class);
		
		//invoke the method
		System.out.println(show.sales("baleno",1250000,"rakesh"));
		
		//close ctx
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
