package com.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rms.entities.RestDining;
import com.rms.services.RestDiningService;

@RestController
public class RestDiningController {
	
	@Autowired
	RestDiningService restDiningService;
	
	@GetMapping("/getAllRestDining")
	public Iterable<RestDining>getAllRestDining(){
		return restDiningService.getAllRestDining();
	}
	
	@PostMapping("/addRestDining")
	public RestDining addRestDining(@RequestBody RestDining restDining) {
		return restDiningService.addRestDining(restDining);
	}

	@PutMapping("/updateRestDining")
	public RestDining updateRestDining(@RequestBody RestDining restDining) {
		return restDiningService.updateRestDining(restDining);
	}
	
	@DeleteMapping("/deleteRestDining/{id}")
	public void deleteRestDining(@PathVariable("id")int id) {
		restDiningService.deleteRestDining(id);
	}
}
