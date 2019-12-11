package com.rms.data;

import org.springframework.data.repository.CrudRepository;

import com.rms.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
