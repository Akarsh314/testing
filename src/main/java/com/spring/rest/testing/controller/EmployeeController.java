package com.spring.rest.testing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.testing.entities.Employee;
import com.spring.rest.testing.services.EmployeeService;

@RestController
public class EmployeeController {
//	@Autowired
//	private EmployeeService employeeService;
//	
//	
//	@GetMapping("/employees")
//	public List<Employee> getList(){
//		return this.employeeService.getEmployeeList();
//	}
//	
//	@GetMapping("/employees/{empId}")
//	public Employee getEmp(@PathVariable Long empId) throws Throwable {
//		
//		return this.employeeService.get(empId);
//	}
//	
//	@PostMapping(path = "/employees", consumes="application/json")
//	public Employee addOrg(@RequestBody Employee org) {
//		
//		return this.employeeService.add(org);
//	}
//	
//	@PutMapping("/employees")
//	public Employee updateOrg(@RequestBody Employee emp) {
//		
//		return this.employeeService.update(emp);
//	}
//	
//	@DeleteMapping("/employees/{empId}")
//	public ResponseEntity<HttpStatus> deleteOrg(@PathVariable Long empId) {
//		
//
//			
//			try {
//				this.employeeService.deleteEmp(empId);
//				return new ResponseEntity<>(HttpStatus.OK);
//			} catch (Throwable e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//			}
//		
//		
//	}
	
}
