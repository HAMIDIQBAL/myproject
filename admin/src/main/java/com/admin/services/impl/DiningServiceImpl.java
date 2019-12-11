package com.admin.services.impl;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.data.DiningRepository;
import com.admin.entities.Dining;
import com.admin.services.DiningService;
@Service
public class DiningServiceImpl implements DiningService {
	@Autowired
	DiningRepository diningRepository;
	
	@Transactional
	public Iterable<Dining> getAllDining() {
		return diningRepository.findAll();
	}
	@Transactional
	public Dining addDining(Dining dining) {
		return diningRepository.save(dining);
	}
	
	/*
	 * @Transactional public <Dining extends > S updateDining(Dining dining) {
	 * 
	 * if (entityInformation.isNew(dining)) { em.persist(dining); return dining; }
	 * else { return em.merge(dining); } }
	 */
	
	@Transactional
	public Dining updateDining(Dining dining) {
		return diningRepository.save(dining);
	}
	@Transactional
	public void deleteDining(Integer id) {
		diningRepository.deleteById(id);
	}
}
