package com.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.entities.Permission;
import com.security.service.PermissionService;

@RestController
public class PermissionController {
	@Autowired
	PermissionService permissionService;
	
	@GetMapping("/getAllpermissions")
	public Iterable<Permission>getAllpermissions(){
		return permissionService.getAllPermissions();
	}
	
	@PostMapping("/addPermission")
	public Permission addPermission(@RequestBody Permission permission) {
		return permissionService.addPermission(permission);
	}
	
	@PutMapping("/updatepermission")
	public Permission updatePermission(@RequestBody Permission permission) {
		return permissionService.updatePermission(permission);
	}
	
	@DeleteMapping("/deletepermission/{id}")
	public void deletePermission(@PathVariable("id")Integer id) {
		permissionService.deletePermission(id);
	}
}
