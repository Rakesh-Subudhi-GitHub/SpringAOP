package com.rk.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.rk.bo.UserDetailsBO;
import com.rk.dao.IAuthenticationDAO;
import com.rk.dto.UserDetailsDTO;

public class AuthenticationManager {

	private IAuthenticationDAO dao;
	
	public AuthenticationManager(IAuthenticationDAO dao) {
	System.out.println("1-param constructor calling AuthenticationManager calling::::");
		this.dao = dao;
	}

	private ThreadLocal<UserDetailsDTO> threadlocal= new ThreadLocal();
	
	//method for SignIN
	public void signin(String username,String password)
	{
		
		//convert username,password into UserDetails object
		UserDetailsDTO dto=new UserDetailsDTO();
		
		dto.setUsername(username);
		dto.setPassword(password);
		
		//keep ThreadLocal object
		threadlocal.set(dto);
		
	}//method
	
	//method for SignOUT
	public void signout()
	{
		threadlocal.remove();
	}
	
	//method for validation
	public boolean validate()
	{
		//get current Thread UserDetailsDTO object from threadlocal
		UserDetailsDTO dto=threadlocal.get();
		
		//converting dto to bo
		UserDetailsBO bo=new UserDetailsBO();
		
		BeanUtils.copyProperties(dto,bo);
		
		//invoke the method in auth_dao class
		int count=dao.authentication(bo);
		
		return  count==1?true:false;
	}
}//class
