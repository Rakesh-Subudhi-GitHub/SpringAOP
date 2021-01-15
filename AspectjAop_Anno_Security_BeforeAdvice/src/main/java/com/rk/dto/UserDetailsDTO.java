package com.rk.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDetailsDTO implements Serializable {

	//properties
	private String username;
	private String password;
	
}
