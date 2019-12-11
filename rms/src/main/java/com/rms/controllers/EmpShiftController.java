package com.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.entities.EmpShift;
import com.rms.services.EmpShiftService;

@RestController
public class EmpShiftController {
	@Autowired
	EmpShiftService empShiftService;
	
	@GetMapping("/getAllEmpShift")
	public Iterable<EmpShift>getAllEmpShift(){
		return empShiftService.getAllEmpShift();
	}
	
	@PostMapping("/addEmpShift")
	public EmpShift addEmpShift(@RequestBody EmpShift empShift) {
		return empShiftService.addEmpShift(empShift);
	}
	
	@PutMapping("/updateEmpShift")
	public EmpShift updateEmpShift(@RequestBody EmpShift empShift) {
		return empShiftService.updateEmpShift(empShift);
	}
	
	@DeleteMapping("/deleteEmpShift/{id}")
	public void deleteEmpShift(@PathVariable("id") int id) {
		empShiftService.deleteEmpShift(id);
	}

}
