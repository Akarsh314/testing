package com.spring.rest.testing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.testing.entities.Employee;

//@Repository(value="employee")
public interface EmployeeDao extends JpaRepository<Employee,Long>{


//	Employee getByEmployeeId(long empId);
//
//	void deleteByEmployeeId(Long employeeId);

	
	
}
 