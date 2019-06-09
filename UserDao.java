package com.walletproject.corepackage.dao;

import java.util.List;

import com.walletproject.corepackage.model.User;

public interface UserDao {

	void saveUser(User user);

	List<User> findAllUser();

	void deleteUserById(String userID);

	User findById(String userID);

	void updateUser(User user);
}