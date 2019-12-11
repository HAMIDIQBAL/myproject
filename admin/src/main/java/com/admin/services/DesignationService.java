package com.admin.services;
import com.admin.entities.Designation;

public interface DesignationService {
	public Iterable<Designation> getAllDesignation();
	public Designation addDesignation(Designation designation);
	public Designation updateDesignation(Designation designation);
	public void deleteDesignation(Integer id);
}
