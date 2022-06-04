package com.spring.rest.testing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.rest.testing.dao.AssetDao;
import com.spring.rest.testing.dao.EmployeeDao;
import com.spring.rest.testing.entities.Employee;
import com.spring.rest.testing.entities.Organization;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}
 
	@Override
	public Employee get(Long id) {
		// TODO Auto-generated method stub
		return employeeDao.getReferenceById(id);
	}

	@Override
	public Employee add(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.save(emp);
		return employeeDao.getReferenceById(emp.getEmpId());
	}

	@Override
	public void deleteEmp(Long id) throws Throwable {
		// TODO Auto-generated method stub
		
		employeeDao.deleteById(id);
		
	}

	@Override
	public Employee update(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.save(emp);
		return employeeDao.getReferenceById(emp.getEmpId());
	}

}
