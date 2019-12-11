package com.admin.services;
import java.util.Optional;

import com.admin.entities.State;

public interface StateService {
	
	public Iterable<State> getAllStates();

	public State addState(State state);

	public State updateState(State state);
	
	public void deleteState(Integer id);
	
	public Optional<State> getStateByStId(String stId);	
}
