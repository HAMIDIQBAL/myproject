package com.rms.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.data.UserRepository;
import com.rms.entities.User;
import com.rms.services.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public Iterable<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Transactional
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Transactional
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Transactional
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

}
