package com.rk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rk.bo.UserDetailsBO;

public class AuthenticationDAOImpl implements IAuthenticationDAO{

	//sql
	private static final String AUTH_QUERY="SELECT COUNT(*) FROM LOGIN WHERE USERID=? AND PASSWORD=?";
	
	private JdbcTemplate jt;
	
	public AuthenticationDAOImpl(JdbcTemplate jt) {
		System.out.println("1-param constructor in authontication");
		this.jt = jt;
	}


	@Override
	public int authentication(UserDetailsBO bo) {
	
		int value=jt.queryForObject(AUTH_QUERY,
																		Integer.class ,  //returning value class
																				bo.getUsername() , bo.getPassword() ); //set param
		
		return value;
		
	}//method

}//class
