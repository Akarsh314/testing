package com.spring.rest.testing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.rest.testing.dao.AssetDao;
import com.spring.rest.testing.dao.OrganizationDao;
import com.spring.rest.testing.entities.Asset;
import com.spring.rest.testing.entities.Organization;

//@Service("assetService")
//@SessionAttributes("asset")
@Service
public class AssetServiceImpl implements AssetService{
 
	@Autowired
	AssetDao assetDao;
	@Override
	public List<Asset> getAssetList() {
		// TODO Auto-generated method stub

		return assetDao.findAll();
	}

	@Override
	public Asset get(Long assetId) {
		// TODO Auto-generated method stub
		return assetDao.getByAssetId(assetId);
	}

	@Override
	public Asset add(Asset asset) {
		// TODO Auto-generated method stub
		assetDao.save(asset);

		return assetDao.getByAssetId(asset.getAssetId());
	}

	@Override
	public void deleteEmp(Long assetId) throws Throwable {
		// TODO Auto-generated method stub
		assetDao.deleteByAssetId(assetId);
		
	}

	@Override
	public Asset update(Asset asset) {
		// TODO Auto-generated method stub
		assetDao.save(asset);
		return assetDao.getByAssetId(asset.getAssetId());
	}

}
