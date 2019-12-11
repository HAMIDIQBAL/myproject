package com.sathya.rms.admin.services;

import java.util.Optional;

import com.sathya.rms.admin.entities.State;

public interface StateService {
	
	public Iterable<State> getAllStates();

	public State addState(State state);

	public State updateState(State state);
	
	public void deleteState(Integer id);
	
	public Optional<State> getStateByStId(String stId);	
}