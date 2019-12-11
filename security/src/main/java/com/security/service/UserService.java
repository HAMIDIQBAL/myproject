package com.security.service;

import com.security.entities.User;

public interface UserService {
	Iterable<User>getAllUsers();
	User addUser(User user);
	User updateUser(User user);
	void deleteUser(Integer id);
}
