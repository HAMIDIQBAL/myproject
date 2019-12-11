package com.security.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.data.RoleRepository;
import com.security.entities.Role;
import com.security.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleRepository roleRepository;

	@Override
	public Iterable<Role> getAllRoles() {
		return roleRepository.findAll();
	}

	@Transactional
	public Role addRole(Role role) {
		return roleRepository.save(role);
	}

	@Transactional
	public Role updateRole(Role role) {
		return roleRepository.save(role);
	}

	@Transactional
	public void deleteRole(Integer id) {
		roleRepository.deleteById(id);
	}

}
