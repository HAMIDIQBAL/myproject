package com.admin.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.admin.entities.Location;
import com.admin.services.LocationService;

@RestController
public class LocationController {
	@Autowired
	LocationService locationService;
	
	@GetMapping(path="/getAllLocation")
	public Iterable<Location> getAllLocation() {
		return locationService.getAllLocation();
	}
	
	@PostMapping(path="/addLocation")
	public Location addLocation(@RequestBody Location location) {
		return locationService.addLocation(location);
	}
	
	@PutMapping(path="/updateLocation")
	public Location updateLocation(@RequestBody Location location) {
		return locationService.updateLocation(location);
	}
	
	@DeleteMapping(path="/deleteLocation/{id}")
	public void deleteCity(@PathVariable("id") Integer id) {
		locationService.deleteLocation(id);
	}
}
