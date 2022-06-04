package com.spring.rest.testing.entities;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Employee {

	@Id
	private long empId;
	private String empName;
	private String empOrg;
	public Employee(long empId, String empName, String empOrg) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empOrg = empOrg;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpOrg() {
		return empOrg;
	}
	public void setEmpOrg(String empOrg) {
		this.empOrg = empOrg;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empOrg=" + empOrg + "]";
	}

}
