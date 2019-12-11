package com.sathya.rms.admin.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.LocationRepository;
import com.sathya.rms.admin.entities.Location;
import com.sathya.rms.admin.services.LocationService;
@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	LocationRepository locationRepository;
	
	@Transactional
	public Iterable<Location> getAllLocation() {
		return locationRepository.findAll();
	}
	@Transactional
	public Location addLocation(Location location) {
		return locationRepository.save(location);
	}
	@Transactional
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}
	@Transactional
	public void deleteLocation(Integer id) {
		locationRepository.deleteById(id);
	}
}
