package com.sathya.rms.admin.services.impl;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sathya.rms.admin.data.CityRepository;
import com.sathya.rms.admin.entities.City;
import com.sathya.rms.admin.services.CityService;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	CityRepository cityRepository;

	
	public Iterable<City> getAllCity() {
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
