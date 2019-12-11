package com.rms.services;

import com.rms.entities.Group;

public interface GroupService {
	public Iterable<Group> getAllGroup();
	public Group addGroup(Group group);
	public Group updateGroup(Group group);
	public void deleteGroup(Integer id);
}
