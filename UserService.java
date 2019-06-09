package com.walletproject.corepackage.service;

import java.util.List;

import com.walletproject.corepackage.model.User;

public interface UserService {

	void saveUser(User user);

	List<User> findAllUser();

	void deleteUserById(String userID);

	User findById(String userID);

	void updateUser(User user);
}