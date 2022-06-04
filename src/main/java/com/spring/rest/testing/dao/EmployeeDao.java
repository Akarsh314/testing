package com.spring.rest.testing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.testing.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Long>{

}
 