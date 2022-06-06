package com.spring.rest.testing.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.rest.testing.entities.Employee;

//@Service
public interface EmployeeService {
 
	public List<Employee> getEmployeeList();

	public Employee get(Long employeeId);

	public Employee add(Employee employee);

	public void deleteEmp(Long employeeId) throws Throwable;

	public Employee update(Employee employee);
}
