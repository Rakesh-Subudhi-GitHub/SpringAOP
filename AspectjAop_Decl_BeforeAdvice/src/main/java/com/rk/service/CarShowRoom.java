package com.rk.service;

public class CarShowRoom {

	//method
	public String sales(String model,float price,String executive) {
	
		if(model.equalsIgnoreCase("baleno") || model.equalsIgnoreCase("brize"))
			return model+"   car is sold out having "+price+" by executive :: "+executive;
		else
			return model+"car is not available for sale ";
	
	}//method
}//class
