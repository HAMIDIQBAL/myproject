package com.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.entities.Role;
import com.security.service.RoleService;

@RestController
public class RoleController {
	@Autowired
	RoleService roleService;
	
	@GetMapping("/getAllRoles")
	public Iterable<Role>getAllRoles(){
		return roleService.getAllRoles();
	}
	
	@PostMapping("/addRole")
	public Role addRole(@RequestBody Role role) {
		return roleService.addRole(role);
	}
	
	@PutMapping("/updateRole")
	public Role updateRole(@RequestBody Role role) {
		return roleService.updateRole(role);
	}
	
	@DeleteMapping("/deleteRole/{id}")
	public void deleteRole(@PathVariable("id")Integer id) {
		roleService.deleteRole(id);
	}
}
