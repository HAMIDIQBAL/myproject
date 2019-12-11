package com.rms.services;

import com.rms.entities.Employee;

public interface EmployeeService {
		public Iterable<Employee>getAllEmployee();
		public Employee addEmployee(Employee employee);
		public Employee updateEmployee(Employee employee);
		public void deleteEmployee(int id);
}
