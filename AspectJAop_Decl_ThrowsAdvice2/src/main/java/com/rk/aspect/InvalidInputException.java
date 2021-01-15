package com.rk.aspect;

public class InvalidInputException extends RuntimeException {
	
	public InvalidInputException(String msg)
	{
		
		super(msg);
		System.out.println("1-param constructor in InvalidInputException  :::  ");
	}

}
