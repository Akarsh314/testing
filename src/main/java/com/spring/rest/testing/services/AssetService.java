package com.spring.rest.testing.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.rest.testing.entities.Asset;
import com.spring.rest.testing.entities.Employee;
import com.spring.rest.testing.entities.Organization;

//@Service
public interface AssetService {
 
	public List<Asset> getAssetList();

	public Asset get(Long assetId);

	public Asset add(Asset asset);

	public void deleteEmp(Long assetId) throws Throwable;

	public Asset update(Asset asset);

	
	
}
