package com.rk.service;

public class BankServiceImpl implements IBankService{

	//method
	public final float calculateSimpleIntrest(float pAmt,float rate,int time)
	{
		return pAmt*rate*time/100.0f;
		
	}//method
	
}//class
