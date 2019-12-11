package com.security.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.data.UserRepository;
import com.security.entities.User;
import com.security.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	@Override
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Transactional
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Transactional
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Transactional
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);

	}

}
