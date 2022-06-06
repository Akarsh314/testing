package com.spring.rest.testing.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

//import org.hibernate.annotations.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Id;

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

	public Organization(String organizationName, String organizationCity) {
		super();
		this.organizationName = organizationName;
		this.organizationCity = organizationCity;
	}

	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrgName(String organizationName) {
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
