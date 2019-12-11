package com.sathya.rms.admin.services;

import com.sathya.rms.admin.entities.Dining;

public interface DiningService {
	public Iterable<Dining> getAllDining();
	public Dining addDining(Dining dining);
	public Dining updateDining(Dining dining);
	public void deleteDining(Integer id);
}
