package com.rk.dao;

import com.rk.bo.UserDetailsBO;

public interface IAuthenticationDAO {

	public int authentication(UserDetailsBO bo);
}
