package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dao.base.impl.BaseDaoImpl;
import com.dao.inter.UserDao;
import com.model.User;
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	@Override
	public User findByLogin(User user) {
		List<User> userList = super.findList("from User where ucode='"+user.getUcode()+"' and password = '"+user.getPassword()+"'");
		if(userList.size()<1){
			return null;
		}
		return userList.get(0);
	}

}
