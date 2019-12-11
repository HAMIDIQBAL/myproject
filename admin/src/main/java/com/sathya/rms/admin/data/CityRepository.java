package com.sathya.rms.admin.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sathya.rms.admin.entities.City;
@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
}
