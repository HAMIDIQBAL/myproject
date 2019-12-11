package com.rms.services;
import com.rms.entities.User;

public interface UserService {
	public Iterable<User> getAllUser();
	public User addUser(User user);
	public User updateUser(User user);
	public void deleteUser(Integer id);
}
