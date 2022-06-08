package com.spring.rest.testing.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

//import org.hibernate.annotations.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

//@SuppressWarnings("deprecation")
//@EntityScan
//(name = "organization")//@Table(name="Organization", schema="info")

@Entity
public class Organization {
//	@Column(name = "OrganizationName")
//	@Column(name = "OrganizationCity")

//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private String organizationName;
	private String organizationCity;

//	@OneToMany(mappedBy = "organization", cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<Asset> assets = new HashSet<>();
	
	@OneToMany(targetEntity = Organization.class, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "emp_fk", referencedColumnName = "organizationName")
    private Set<Employee> employees = new HashSet<>();
	
	
//	public Set<Asset> getAssets() {
//		return assets;
//	}
//
//	public void setAssets(Set<Asset> assets) {
//		this.assets = assets;
//	}
//
	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getOrganizationCity() {
		return organizationCity;
	}

	public void setOrganizationCity(String organizationCity) {
		this.organizationCity = organizationCity;
	}

	@Override
	public String toString() {
		return "Organization [orgName=" + organizationName + ", orgCity=" + organizationCity + "]";
	}
	
	
}
