package com.rms.services;

import com.rms.entities.EmpShift;

public interface EmpShiftService {
	public Iterable<EmpShift>getAllEmpShift();
	public EmpShift addEmpShift(EmpShift empShift);
	public EmpShift updateEmpShift(EmpShift empShift);
	public void deleteEmpShift(int id);
}
