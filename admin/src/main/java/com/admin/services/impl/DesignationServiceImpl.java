package com.admin.services.impl;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.data.DesignationRepository;
import com.admin.entities.Designation;
import com.admin.services.DesignationService;

@Service
public class DesignationServiceImpl implements DesignationService {
	@Autowired
	DesignationRepository designationRepository;
	
	
	public Iterable<Designation> getAllDesignation() {
		return designationRepository.findAll();
	}

	@Transactional
	public Designation addDesignation(Designation designation) {
		return designationRepository.save(designation);
	}

	@Transactional
	public Designation updateDesignation(Designation designation) {
		return designationRepository.save(designation);
	}

	@Transactional
	public void deleteDesignation(Integer id) {
		designationRepository.deleteById(id);
	}

}
