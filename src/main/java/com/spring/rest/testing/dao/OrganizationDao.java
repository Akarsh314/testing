package com.spring.rest.testing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.testing.entities.Organization;

//@Repository
public interface OrganizationDao extends JpaRepository<Organization, String>{

}
