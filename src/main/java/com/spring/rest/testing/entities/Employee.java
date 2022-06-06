package com.spring.rest.testing.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

//import org.hibernate.annotations.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Id;
//(name = "employee")//@Table(name = "Employee",schema = "info")

@Entity
public class Employee {
//	@Column(name = "EmployeeId")
//	@Column(name="EmployeeName")
//	@Column(name = "EmployeeOrg")

//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long employeeId;
	private String employeeName;
	private String employeeOrg;
//	public Employee(long empId, String empName, String empOrg) {
//		super();
//		this.employeeId = empId;
//		this.employeeName = empName;
//		this.employeeOrg = empOrg;
//	}
//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeOrg() {
		return employeeOrg;
	}
	public void setEmployeeOrg(String employeeOrg) {
		this.employeeOrg = employeeOrg;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + employeeId + ", empName=" + employeeName + ", empOrg=" + employeeOrg + "]";
	}

}
