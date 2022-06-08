package com.spring.rest.testing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.testing.entities.Asset;

//@Repository(value="asset")
public interface AssetDao extends JpaRepository<Asset, Long>{
//
//	Asset getByAssetId(Long assetId);
//
//	void deleteByAssetId(Long assetId);

}
 