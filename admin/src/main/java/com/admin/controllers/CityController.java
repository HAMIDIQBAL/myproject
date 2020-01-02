package com.admin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.entities.City;
import com.admin.services.CityService;

@RestController
public class CityController {

	@Autowired
	CityService cityService;

	@GetMapping(path = "/getAllCity")
	public List<City> getAllCities() {
		return cityService.getAllCity();
	}

	@PostMapping(path = "/addCity") 
	public City addCity(@RequestBody City city) {
		return cityService.addCity(city);
	}
	
	@PutMapping(path = "/updateCity")
	public City updateCity(@RequestBody City city) {
		return cityService.updateCity(city);
	}

	@DeleteMapping(path = "/deleteCity/{id}")
	public void deleteCity(@PathVariable("id") Integer id) {
		cityService.deleteCity(id);
	}

}