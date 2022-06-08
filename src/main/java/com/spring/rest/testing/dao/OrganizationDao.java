package com.spring.rest.testing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.testing.entities.Organization;

//@Repository(value="organization")
public interface OrganizationDao extends JpaRepository<Organization, String>{

//	void deleteByOrganizationName(String organizationName);
//
//	Organization getByOrganizationName(String organizationName);

} 
