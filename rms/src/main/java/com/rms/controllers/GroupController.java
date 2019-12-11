package com.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.entities.Group;
import com.rms.services.GroupService;

@RestController
public class GroupController {
	@Autowired
	GroupService groupService;
	
	@GetMapping(path="/getAllGroup")
	public Iterable<Group> getAllGroup(){
		return groupService.getAllGroup();
	}
	
	@DeleteMapping(path="deleteGroup/{id}")
	public void deleteGroup(@PathVariable("id") Integer id) {
		groupService.deleteGroup(id);
	}
	
	@PostMapping(path="/addGroup")
	public Group addGroup(@RequestBody Group group) {
		return groupService.addGroup(group);
	}
	
	@PutMapping(path="/updateGroup")
	public Group updateGroup(@RequestBody Group group) {
		return groupService.updateGroup(group);
	}
}

