package com.admin.services;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.admin.entities.State;

public interface StateService {
	
	public List<State> getAllStates();

	public State addState(State state);

	public State updateState(State state);
	
	public void deleteState(Integer id);
	
	public Optional<State> getStateByStateId(String stId);	
}
