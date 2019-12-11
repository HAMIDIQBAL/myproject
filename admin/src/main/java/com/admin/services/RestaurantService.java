package com.admin.services;
import com.admin.entities.Restaurant;

public interface RestaurantService {
	public Iterable<Restaurant> getAllRestaurant();
	public Restaurant addRestaurant(Restaurant restaurant);
	public Restaurant updateRestaurant(Restaurant restaurant);
	public void deleteRestaurant(Integer id);
}
