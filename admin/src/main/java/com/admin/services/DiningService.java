package com.admin.services;
import com.admin.entities.Dining;

public interface DiningService {
	public Iterable<Dining> getAllDining();
	public Dining addDining(Dining dining);
	public Dining updateDining(Dining dining);
	public void deleteDining(Integer id);
}
