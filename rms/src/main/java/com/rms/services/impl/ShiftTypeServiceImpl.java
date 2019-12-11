package com.rms.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.entities.ShiftType;
import com.rms.services.ShiftTypeService;
@Service
public class ShiftTypeServiceImpl implements ShiftTypeService {
	
	@Autowired
	ShiftTypeService shiftTypeService;

	@Transactional
	public Iterable<ShiftType> getShiftDetails() {
		return shiftTypeService.getShiftDetails();
	}

	@Transactional
	public ShiftType addShift(ShiftType shiftType) {
		return shiftTypeService.addShift(shiftType);
	}

	@Transactional
	public ShiftType updateShift(ShiftType shiftType) {
		return shiftTypeService.updateShift(shiftType);
	}

	@Transactional
	public void deleteShift(int id) {
		shiftTypeService.deleteShift(id);
	}

}
