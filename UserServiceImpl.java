package com.walletproject.corepackage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.walletproject.corepackage.dao.UserDao;
import com.walletproject.corepackage.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	public void saveUser(User user) {
		dao.saveUser(user);
	}

	public List<User> findAllEmployees() {
		return dao.findAllUser();
	}

	public void deleteUserById(String userID) {
		dao.deleteUserById(userID);
	}

	/*public User findById(Long userID) {
		return dao.findById(userID);
	}*/

	public void updateUser(User user) {
		dao.updateUser(user);
	}

	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return dao.findAllUser();
		
	}

	public User findById(String userID) {
		return dao.findById(userID);
	}

	/*public User findById(Long userID) {
		return dao.findById(userID);
	}*/

}