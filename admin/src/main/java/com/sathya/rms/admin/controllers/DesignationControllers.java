package com.sathya.rms.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sathya.rms.admin.entities.Designation;
import com.sathya.rms.admin.services.DesignationService;

@RestController
public class DesignationControllers {
	@Autowired
	DesignationService designationService;
	
	@GetMapping("/getAllDesignation")
	public Iterable<Designation> getAllDesignation(){
		return designationService.getAllDesignation();
	}
	
	@PostMapping("/addDesignation")
	public Designation addDesignation(@RequestBody Designation designation) {
		return designationService.addDesignation(designation);
	}
	
	@PutMapping("/updateDesignation")
	public Designation updateDesignation(@RequestBody Designation designation) {
		return designationService.updateDesignation(designation);
	}
	
	@DeleteMapping("/deleteDesignation/{id}")
	public void deleteDesignation(@PathVariable("id") int id) {
		designationService.deleteDesignation(id);
	}

}
