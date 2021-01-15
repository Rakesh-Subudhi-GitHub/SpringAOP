package com.rk.service;

public class ShoppingStore {

	public float billGenerate(String []items,float []prices)
	{
		boolean problem=false;
		
		if(items==null || prices==null)
		problem=true;
		
		for(float p: prices)
		{
			if(p<=0.0f)
				{
				problem=true;	
				break;
				}//if
		}//for
		
		if(problem)
		{
			throw new IllegalArgumentException("invalid inputs");
		}
		
		//calculate billAmount
		float billAmt=0.0f;
		for(float p:prices)
		{
			billAmt=billAmt+p;
		}
		
		//return
		return billAmt;
		
	}//method

}//class
