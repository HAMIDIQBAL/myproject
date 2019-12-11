package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.Location;

public interface LocationService {
	public Iterable<Location> getAllLocation();
	public Location addLocation(Location location);
	public Location updateLocation(Location location);
	public void deleteLocation(Integer id);
}
