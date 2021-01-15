package com.rk.aspect;

import java.io.FileWriter;
import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;

public class TestDriveAuditeAspect {

/*	public void testDrive(JoinPoint jp) throws Throwable
	{
		
		//get target method args
		Object args[]=jp.getArgs();
		
		//write info to audit log file
		FileWriter file=new FileWriter("F:/CarinfoAuditfileDetails.txt",true);
		
		//write some all details in that file
		file.write(args[0]+" = model car test drive is taken under monitoring of the  "+args[1]+" executive officer in time is =  "+LocalDateTime.now()+"\n");
		
		file.flush();//Previous details are vanish
		file.close();
	}//method
	
	*/
	
	public void testDrive(JoinPoint jp,String model,float price,String executive) throws Throwable
	{
		
		//write info to audit log file
		FileWriter file=new FileWriter("F:/CarinfoAuditfileDetails.txt",true);
		
		//write some all details in that file
		file.write(model+" = model car test drive is taken under monitoring of the  "+executive+" executive officer in time is =  "+LocalDateTime.now()+"\n");
		
		file.flush();//Previous details are vanish
		file.close();
	}//method
	
}//class
