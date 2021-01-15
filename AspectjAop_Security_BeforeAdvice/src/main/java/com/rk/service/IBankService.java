package com.rk.service;

public interface IBankService {

	public String fetchwithdrawMoney(long acno,double amount);
	public String fetchdepositeMoney(long acno,double amount);
}
