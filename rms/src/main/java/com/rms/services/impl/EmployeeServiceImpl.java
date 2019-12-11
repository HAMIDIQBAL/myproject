package com.rms.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.data.EmployeeRepository;
import com.rms.entities.Employee;
import com.rms.services.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Iterable<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Transactional
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Transactional
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Transactional
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}

}
