package com.spring.rest.testing.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.rest.testing.entities.Employee;

@Service
public interface EmployeeService {
 
	public List<Employee> getEmployeeList();

	public Employee get(Long id);

	public Employee add(Employee emp);

	public void deleteEmp(Long id) throws Throwable;

	public Employee update(Employee emp);
}
