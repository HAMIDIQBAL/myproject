package com.rms.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.data.EmpShiftRepository;
import com.rms.entities.EmpShift;
import com.rms.services.EmpShiftService;
@Service
public class EmpShiftServiceImpl implements EmpShiftService {
	@Autowired
	EmpShiftRepository empShiftRepository;
	
	@Override
	public Iterable<EmpShift> getAllEmpShift() {
		return empShiftRepository.findAll();
	}

	@Transactional
	public EmpShift addEmpShift(EmpShift empShift) {
		return empShiftRepository.save(empShift);
	}

	@Transactional
	public EmpShift updateEmpShift(EmpShift empShift) {
		return empShiftRepository.save(empShift);
	}

	@Transactional
	public void deleteEmpShift(int id) {
		empShiftRepository.deleteById(id);
	}

}
