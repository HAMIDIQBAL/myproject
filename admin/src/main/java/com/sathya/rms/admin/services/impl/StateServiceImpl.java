package com.sathya.rms.admin.services.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.StateRepository;
import com.sathya.rms.admin.entities.State;
import com.sathya.rms.admin.services.StateService;

@Service
public class StateServiceImpl implements StateService {
	
	@Autowired
	StateRepository stateRepository;
	
	
	public Iterable<State> getAllStates() {
		return stateRepository.findAll();
	}
	@Transactional
	public State addState(State state) {
		return stateRepository.save(state);
	}
	@Transactional
	public State updateState(State state) {
		return stateRepository.save(state);
	}
	@Transactional
	public void deleteState(Integer id) {
		stateRepository.deleteById(id);
	}
	@Override
	public Optional<State> getStateByStId(String stId) {
		return stateRepository.findByStId(stId);
	}
}
