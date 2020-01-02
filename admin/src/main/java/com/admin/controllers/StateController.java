package com.admin.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.admin.entities.State;
import com.admin.services.StateService;

@RestController
@CrossOrigin
public class StateController {
	@Autowired
	StateService stateService;
	
	@GetMapping(path = "/getAllStates") 
	public List<State> getAllStates(){
		return stateService.getAllStates();
	}
	
	@PostMapping(path = "/addState") 
	public State addNewState(@RequestBody State state){
		return stateService.addState(state);	
	}
	
	@PostMapping(path = "/getStateByStId") 
	public Optional<State> getStatesbystateId(@RequestBody State state){
		return stateService.getStateByStateId(state.getStateId());	
	}
	
	
	@PutMapping(path="/updateState")
	public State updateState(@RequestBody State state) {
		return stateService.updateState(state);
	}
	
	@DeleteMapping(path = "/deleteState/{id}")
	public void deleteState(@PathVariable("id") Integer id) {
		stateService.deleteState(id);
	}

}
