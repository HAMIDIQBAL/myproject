package com.security.service;

import com.security.entities.Permission;

public interface PermissionService {
	Iterable<Permission>getAllPermissions();
	Permission addPermission(Permission permission);
	Permission updatePermission(Permission permission);
	void deletePermission(Integer id);
}
