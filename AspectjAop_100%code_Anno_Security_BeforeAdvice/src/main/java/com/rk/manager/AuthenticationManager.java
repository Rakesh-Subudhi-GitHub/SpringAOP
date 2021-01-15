package com.rk.manager;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rk.bo.UserDetailsBO;
import com.rk.dao.IAuthenticationDAO;
import com.rk.dto.UserDetailsDTO;

@Component("authManager")
public class AuthenticationManager {

	@Autowired
	private IAuthenticationDAO dao;
	
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
