package com.crm.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.crm.dao.UserDao;
import com.crm.entity.User;
import com.crm.mapper.UserMapper;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Resource(name="userMapper")
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
   /**
    * 根据用户名查找用户对象
    * @return User
    */
	public User findUserByName(String username) {
		
		return userMapper.getUserByName(username);
	}

}
