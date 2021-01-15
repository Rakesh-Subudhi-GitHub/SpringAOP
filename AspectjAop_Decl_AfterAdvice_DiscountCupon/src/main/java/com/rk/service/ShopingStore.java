package com.rk.service;

public class ShopingStore {

	//method
	public float shopping(String item[],float price[])
	{
		float billAmt=0.0f;
		
		//total billAmt
		for(float p: price)
		{
			billAmt=billAmt+p;
		}
		System.out.println(billAmt);
		return billAmt;
	}//method
}//class
