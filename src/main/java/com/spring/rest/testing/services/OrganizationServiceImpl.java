package com.spring.rest.testing.services;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.rest.testing.dao.OrganizationDao;
import com.spring.rest.testing.entities.Organization;

//@Service("organizationService")
//@SessionAttributes("organization")
@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	OrganizationDao organizationDao;

	 
	@Override
	public List<Organization> getOrganizationList() {
		// TODO Auto-generated method stub
//		return this.list;
		return organizationDao.findAll();
	}
	@Override
	public Organization get(String organizationName) {
		// TODO Auto-generated method stub
		return organizationDao.getByOrganizationName(organizationName);
	}

	@Override
	public Organization add(Organization organization) {
		// TODO Auto-generated method stub
		organizationDao.save(organization);
		return organizationDao.getByOrganizationName(organization.getOrganizationName());
		
	}

	@Override
	public void deleteOrganization(String organizationName) throws Throwable {
		// TODO Auto-generated method stub
		organizationDao.deleteByOrganizationName(organizationName);
	
	}

	@Override
	public Organization update(Organization organization) {
		// TODO Auto-generated method stub
		organizationDao.save(organization);
				return organizationDao.getByOrganizationName(organization.getOrganizationName());
	}
	
	

}
