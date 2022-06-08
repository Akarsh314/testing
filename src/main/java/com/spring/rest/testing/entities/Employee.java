package com.spring.rest.testing.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

//import org.hibernate.annotations.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
//	@Column(name = "EmployeeId")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Id
	private long employeeId;
	private String employeeName;
	private String employeeOrg;

	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="organizationName", nullable=false, referencedColumnName = "employeeId")
	    private Organization organization;
	
	
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
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
