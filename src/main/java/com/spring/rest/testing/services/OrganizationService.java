package com.spring.rest.testing.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.rest.testing.entities.Organization;

@Service
public interface OrganizationService {

	public List<Organization> getOrganizationList();

	public Organization get(String orgName);

	public Organization add(Organization org);

	public void deleteOrg(String orgName) throws Throwable;
 
	public Organization update(Organization org);
	
}
