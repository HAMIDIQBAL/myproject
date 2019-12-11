package com.admin.services;
import com.admin.entities.City;

public interface CityService {
	public Iterable<City> getAllCity();
	public City addCity(City city);
	public City updateCity(City city);
	public void deleteCity(Integer id);
}
