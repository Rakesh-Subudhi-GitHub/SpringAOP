package com.rk.aspect;

import java.io.File;
import java.io.FileWriter;

import org.aspectj.lang.JoinPoint;

public class DiscountCuponAdvice {

	public void cupon(JoinPoint jp,float billAmt) throws Throwable
	{
		String cuponMsg=null;
		
		//generate Cupon msg
		if(billAmt<1000)
			cuponMsg="Avail 5% Discount cupon";
		
		else if(billAmt<2000)
			cuponMsg="Avail 10% Discount cupon";
		
		else if(billAmt<3000)
			cuponMsg="Avail 15% Discount cupon";
		
		else
			cuponMsg="Avail 20% Discount cupon";
		
		//generate cupon 
		FileWriter file=new FileWriter("F:/CuponMsg.txt",true);
		
		//write
		file.write(cuponMsg+"\n");
		
		file.flush();
		file.close();
		
	}//method
}
