package com.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.entities.User;
import com.rms.services.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	

	@GetMapping(path="/getAllUser")
	public Iterable<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@DeleteMapping(path="deleteUser/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		userService.deleteUser(id);
	}
	
	@PostMapping(path="/addUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PutMapping(path="/updateUser")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
}
