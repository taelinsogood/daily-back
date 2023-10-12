package com.daily.daily.service;

import java.util.List;

import com.daily.daily.model.Employee;

public interface EmployeeService {

		// post(save)
	 	Employee createEmployee(Employee employee);
	 	// get
	    List<Employee> getAllEmployees();
	    // delete
	    boolean deleteEmployee(Long id);
	    // 해당 id get
	    Employee getEmployeeById(Long id);
	    // put
	    Employee updateEmployee(Long id, Employee employee);
	}
