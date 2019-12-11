package com.sathya.rms.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sathya.rms.admin.entities.Restaurant;
import com.sathya.rms.admin.services.RestaurantService;
@RestController
public class RestaurantController {
	@Autowired
	RestaurantService restaurantService;
	
	@GetMapping("/getAllRestaurant")
	public Iterable<Restaurant> getAllRestaurant(){
		return restaurantService.getAllRestaurant();
	}
	
	@PostMapping("/addRestaurant")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.addRestaurant(restaurant);
	}
	
	@PutMapping("/updateRestaurant")
	public Restaurant updateRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.updateRestaurant(restaurant);
	}
	
	@DeleteMapping("/deleteRestaurant/{id}")
	public void deleteRestaurant(@PathVariable int id){
		restaurantService.deleteRestaurant(id);
	}
}
