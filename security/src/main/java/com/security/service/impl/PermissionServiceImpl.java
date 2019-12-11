package com.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.data.PermissionRepository;
import com.security.entities.Permission;
import com.security.service.PermissionService;
@Service
public class PermissionServiceImpl implements PermissionService {
	@Autowired
	PermissionRepository permissionRepository;

	@Override
	public Iterable<Permission> getAllPermissions() {
		return permissionRepository.findAll();
	}

	@Override
	public Permission addPermission(Permission permission) {
		return permissionRepository.save(permission);
	}

	@Override
	public Permission updatePermission(Permission permission) {
		return permissionRepository.save(permission);
	}

	@Override
	public void deletePermission(Integer id) {
		permissionRepository.deleteById(id);
	}

}
