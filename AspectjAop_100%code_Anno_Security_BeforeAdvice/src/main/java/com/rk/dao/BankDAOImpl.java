package com.rk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bankDao")
public class BankDAOImpl implements IBankDAO {

	//sql
	private static final String WithDraw_Query="UPDATE BANK_ACCOUNT SET BALANCE=BALANCE-? WHERE ACNO=? ";
				//UPDATE BANK_ACCOUNT SET BALANCE=BALANCE-? WHERE ACNO=?  BALANCE
	private static final String Deposite_Query="UPDATE BANK_ACCOUNT SET BALANCE=BALANCE+? WHERE ACNO=? ";
	
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int withdraw(long acno, double amount) {
		System.out.println("Withdraw method called::::");
		
		//properties
		int count=0;
		
		//execute query
		count=jt.update(WithDraw_Query,amount,acno);
		
		return count;
		
	}//method

	@Override
	public int deposite(long acno, double amount) {
		//properties
				int count=0;
				
				//execute query
				count=jt.update(Deposite_Query,amount,acno);
				
				return count;
	}//method

}//class
