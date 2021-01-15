package com.rk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.dao.IBankDAO;

@Service("bankService")
public class BankServiceImpl implements IBankService {

	@Autowired
	private IBankDAO dao;
	
	@Override
	public String fetchwithdrawMoney(long acno, double amount) {
		
		//invoke the method
		int count=dao.withdraw(acno, amount);
		
		if(count==0)
		return "Money withdraw not Succesfully ! and amount is = "+amount ;
		else
			return "Money withdraw Succesfully ! and amount is = "+amount ;
	
	}//method

	@Override
	public String fetchdepositeMoney(long acno, double amount) {
		//invoke the method
				int count=dao.deposite(acno, amount);
				
				if(count==0)
				return "Money deposite not Succesfully ! and amount is = "+amount ;
				else
					return "Money deposite Succesfully ! and amount is = "+amount ;
	}//method

}//class
