package com.admin.services.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.data.StateRepository;
import com.admin.entities.State;
import com.admin.services.StateService;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	StateRepository stateRepository;

	@Override
	public List<State> getAllStates() {
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

	
	@Transactional
	public Optional<State> getStateByStateId(String stId) {
		return stateRepository.findByStateId(stId);
	}

}
