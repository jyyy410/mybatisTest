package com.crm.service;

import com.crm.entity.User;


public interface UserService {
	
   public User checkLogin(String username,String password);
}
