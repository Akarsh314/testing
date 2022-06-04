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

import com.spring.rest.testing.dao.OrganizationDao;
import com.spring.rest.testing.entities.Organization;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	OrganizationDao organizationDao;
	
//	List<Organization> list;
//	 public OrganizationServiceImpl() {
//		 list = new ArrayList<>();
//		 list.add(new Organization("TCS", "Chennai"));
//		 list.add(new Organization("Siemens", "Banglore"));
//		 
//	 }
	 
	@Override
	public List<Organization> getOrganizationList() {
		// TODO Auto-generated method stub
//		return this.list;
		return organizationDao.findAll();
	}
	@Override
	public Organization get(String orgName) {
		// TODO Auto-generated method stub
//		return list.stream().filter(e->e.getOrgName().equalsIgnoreCase(orgName)).findFirst().get();
		return organizationDao.getReferenceById(orgName);
	}

	@Override
	public Organization add(Organization org) {
		// TODO Auto-generated method stub
//		list.add(org);
//		return list.stream().filter(e->e.equals(org)).findFirst().get();
		organizationDao.save(org);
		return organizationDao.getReferenceById(org.getOrgName());
		
	}

	@Override
	public void deleteOrg(String orgName) throws Throwable {
		// TODO Auto-generated method stub
//		list = this.list.stream().filter((e->e.getOrgName()!=orgName)).
//				collect(Collectors.toList());
		organizationDao.deleteById(orgName);
	
	}


	@SuppressWarnings("deprecation")
	@Override
	public Organization update(Organization org) {
		// TODO Auto-generated method stub
//				list.stream().filter(e->e.getOrgName().equalsIgnoreCase(org.getOrgName())).
//				forEach(e->e.setOrgCity(org.getOrgCity()) );
		organizationDao.save(org);
				return organizationDao.getReferenceById(org.getOrgName());
	}
	
	

}
