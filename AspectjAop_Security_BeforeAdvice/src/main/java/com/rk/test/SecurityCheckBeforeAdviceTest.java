package com.rk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.rk.manager.AuthenticationManager;
import com.rk.service.IBankService;

public class SecurityCheckBeforeAdviceTest {

	public static void main(String[] args) {
		
		//properties
		ApplicationContext ctx=null;
		
		IBankService service=null;
		AuthenticationManager manager=null;
		
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/rk/cfgs/applicationContext.xml");
		
		//get proxy/Service class call getBean
		service=ctx.getBean("bankService",IBankService.class);
		
		//get authenticationManager object
		manager=ctx.getBean("authManager",AuthenticationManager.class);
		
		//invoke the method
		try {
			
			//fast validate the userid
			manager.signin("raja","rani");
			
			//then withdraw money
			System.out.println(service.fetchwithdrawMoney(1000,100));
			
		  }//try
		catch(DataAccessException dae)
		{
			dae.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//close ctx
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
