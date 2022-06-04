package com.spring.rest.testing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.testing.entities.Asset;

public interface AssetDao extends JpaRepository<Asset, Long>{

}
 