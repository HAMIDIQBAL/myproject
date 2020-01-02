package com.admin.services.impl;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.data.CityRepository;
import com.admin.entities.City;
import com.admin.services.CityService;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	CityRepository cityRepository;

	
	public List<City> getAllCity() {
		return cityRepository.findAll();
	}
	@Transactional
	public City addCity(City city) {
		return cityRepository.save(city);
	}
	
	@Transactional	
	public void deleteCity(Integer id) {
		cityRepository.deleteById(id);
	}
	
	@Transactional
	public City updateCity(City city) {
		return cityRepository.save(city);
	}
}
