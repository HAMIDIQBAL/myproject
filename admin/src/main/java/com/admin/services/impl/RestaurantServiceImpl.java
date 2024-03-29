package com.admin.services.impl;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.data.RestaurantRepository;
import com.admin.entities.Restaurant;
import com.admin.services.RestaurantService;
@Service
public class RestaurantServiceImpl implements RestaurantService {
	@Autowired
	RestaurantRepository restaurantRepository;
	
	@Override
	public Iterable<Restaurant> getAllRestaurant() {
		return restaurantRepository.findAll();
	}

	@Transactional
	public Restaurant addRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	@Transactional
	public Restaurant updateRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	@Transactional
	public void deleteRestaurant(Integer id) {
		restaurantRepository.deleteById(id);
	}

}
