package com.admin.services;
import java.util.List;

import com.admin.entities.City;

public interface CityService {
	public List<City> getAllCity();
	public City addCity(City city);
	public City updateCity(City city);
	public void deleteCity(Integer id);
}
