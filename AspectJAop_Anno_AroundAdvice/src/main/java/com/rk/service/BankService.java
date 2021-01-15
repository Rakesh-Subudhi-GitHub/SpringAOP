package com.rk.service;

import org.springframework.stereotype.Service;

@Service("bankService")
public class BankService {

	//Simple intrest method
	public  float  calculateSimpleIntrestAmount(float pAmt,float rate,float time) {
		
		System.out.println("BankService.calculateSimpleIntrestAmount(-,-,-)[target method]");
		
		return  pAmt*rate*time/100.0f;
	}//method
	
	
	//compound intrest
	public  float  calculateCompoundIntrestAmount(float pAmt,float rate,float time) {
		
		System.out.println("BankService.calculateCompoundIntrestAmount(-,-,-)[target method]");
		
		return    (float) ((pAmt* Math.pow(1+rate/100,time)))-pAmt;
	}//method

}//class
