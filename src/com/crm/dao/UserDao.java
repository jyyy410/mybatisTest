package com.crm.dao;

import com.crm.entity.User;


public interface UserDao {
	
      public User findUserByName(String username) ;
}
