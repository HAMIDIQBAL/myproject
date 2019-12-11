package com.rms.services;

import com.rms.entities.ShiftType;

public interface ShiftTypeService {
	public Iterable<ShiftType> getShiftDetails();
	public ShiftType addShift(ShiftType shiftType);
	public ShiftType updateShift(ShiftType shiftType);
	public void deleteShift(int id);
}
