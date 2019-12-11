package com.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.data.ShiftTypeRepository;
import com.rms.entities.ShiftType;

@RestController
public class ShiftTypeControllers {
	@Autowired
	ShiftTypeRepository shiftTypeRepository;
	
	@GetMapping("/getShiftDetails")
	public Iterable<ShiftType> getShiftDetails(){
		return shiftTypeRepository.findAll();
	}
	
	@PostMapping("/addShift")
	public ShiftType addShift(@RequestBody ShiftType shiftType) {
		return shiftTypeRepository.save(shiftType);
	}
	
	@PutMapping("/updateShift")
	public ShiftType updateShift(@RequestBody ShiftType shiftType) {
		return shiftTypeRepository.save(shiftType);
	}
	
	@DeleteMapping("/deleteShift/{id}")
	public void deleteShift(@PathVariable("id") int id) {
		shiftTypeRepository.deleteById(id);
	}

}
