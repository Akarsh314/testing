package com.spring.rest.testing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.rest.testing.dao.AssetDao;
import com.spring.rest.testing.dao.EmployeeDao;
import com.spring.rest.testing.entities.Employee;
import com.spring.rest.testing.entities.Organization;

//@Service("employeeService")
//@SessionAttributes("employee")
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}
 
	@Override
	public Employee get(Long employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.getByEmployeeId(employeeId);
	}

	@Override
	public Employee add(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
		return employeeDao.getByEmployeeId(employee.getEmployeeId());
	}

	@Override
	public void deleteEmp(Long employeeId) throws Throwable {
		// TODO Auto-generated method stub
		
		employeeDao.deleteByEmployeeId(employeeId);
		
	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
		return employeeDao.getByEmployeeId(employee.getEmployeeId());
	}

}
