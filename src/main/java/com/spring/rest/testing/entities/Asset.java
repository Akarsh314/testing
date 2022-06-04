package com.spring.rest.testing.entities;

import org.springframework.data.annotation.Id;

public class Asset { 

	
	@Id
	private long assetId;
	private String assetName;
	private String assetOrg;
	public Asset(long assetId, String assetName, String assetOrg) {
		super();
		this.assetId = assetId;
		this.assetName = assetName;
		this.assetOrg = assetOrg;
	}
	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getAssetId() {
		return assetId;
	}
	public void setAssetId(long assetId) {
		this.assetId = assetId;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getAssetOrg() {
		return assetOrg;
	}
	public void setAssetOrg(String assetOrg) {
		this.assetOrg = assetOrg;
	}
	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", assetName=" + assetName + ", assetOrg=" + assetOrg + "]";
	}
	
}
