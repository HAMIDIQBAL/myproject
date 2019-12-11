package com.rms.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.data.GroupRepositotry;
import com.rms.entities.Group;
import com.rms.services.GroupService;
@Service
public class GroupServiceImpl implements GroupService {
	@Autowired
	GroupRepositotry groupRepositotry;
	
	@Override
	public Iterable<Group> getAllGroup() {
		return groupRepositotry.findAll();
	}

	@Transactional
	public Group addGroup(Group group) {
		return groupRepositotry.save(group);
	}

	@Transactional
	public Group updateGroup(Group group) {
		return groupRepositotry.save(group);
	}

	@Transactional
	public void deleteGroup(Integer id) {
		groupRepositotry.deleteById(id);
	}

}
