package com.spring.rest.testing.entities;

import org.hibernate.annotations.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

//@SuppressWarnings("deprecation")
@Entity
public class Organization {
 
	@Id
	private String orgName;
	private String orgCity;

	public Organization(String orgName, String orgCity) {
		super();
		this.orgName = orgName;
		this.orgCity = orgCity;
	}

	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgCity() {
		return orgCity;
	}

	public void setOrgCity(String orgCity) {
		this.orgCity = orgCity;
	}

	@Override
	public String toString() {
		return "Organization [orgName=" + orgName + ", orgCity=" + orgCity + "]";
	}
	
	
}
