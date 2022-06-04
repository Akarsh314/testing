package com.spring.rest.testing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.rest.testing.dao.AssetDao;
import com.spring.rest.testing.dao.OrganizationDao;
import com.spring.rest.testing.entities.Asset;
import com.spring.rest.testing.entities.Organization;

public class AssetServiceImpl implements AssetService{
 
	@Autowired
	AssetDao assetDao;
	@Override
	public List<Asset> getAssetList() {
		// TODO Auto-generated method stub

		return assetDao.findAll();
	}

	@Override
	public Asset get(Long id) {
		// TODO Auto-generated method stub
		return assetDao.getReferenceById(id);
	}

	@Override
	public Asset add(Asset asset) {
		// TODO Auto-generated method stub
		assetDao.save(asset);

		return assetDao.getReferenceById(asset.getAssetId());
	}

	@Override
	public void deleteEmp(Long id) throws Throwable {
		// TODO Auto-generated method stub
		assetDao.deleteById(id);
		
	}

	@Override
	public Asset update(Asset asset) {
		// TODO Auto-generated method stub
		assetDao.save(asset);
		return assetDao.getReferenceById(asset.getAssetId());
	}

}
