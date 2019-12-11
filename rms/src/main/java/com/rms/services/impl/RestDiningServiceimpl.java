package com.rms.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.data.RestDiningRepository;
import com.rms.entities.RestDining;
import com.rms.services.RestDiningService;
@Service
public class RestDiningServiceimpl implements RestDiningService {
	@Autowired
	
	RestDiningRepository restDiningRepository;
	@Override
	public Iterable<RestDining> getAllRestDining() {
		return restDiningRepository.findAll();
	}

	@Transactional
	public RestDining addRestDining(RestDining restDining) {
		return restDiningRepository.save(restDining);
	}

	@Transactional
	public RestDining updateRestDining(RestDining restDining) {
		return restDiningRepository.save(restDining);
	}

	@Transactional
	public void deleteRestDining(int id) {
		restDiningRepository.deleteById(id);
	}

}
