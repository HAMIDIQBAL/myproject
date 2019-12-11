package com.rms.data;

import org.springframework.data.repository.CrudRepository;

import com.rms.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
