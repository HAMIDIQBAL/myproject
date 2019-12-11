package com.security.service;

import com.security.entities.Role;

public interface RoleService {
	Iterable<Role>getAllRoles();
	Role addRole(Role role);
	Role updateRole(Role role);
	void deleteRole(Integer id);
}
