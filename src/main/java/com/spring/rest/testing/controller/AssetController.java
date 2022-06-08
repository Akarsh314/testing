package com.spring.rest.testing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.testing.entities.Asset;
import com.spring.rest.testing.entities.Employee;
import com.spring.rest.testing.services.AssetService;
import com.spring.rest.testing.services.EmployeeService;

@RestController
public class AssetController {
//	@Autowired
//	private AssetService assetService;
////	
	
//	@GetMapping("/assets")
//	public List<Asset> getList(){
//		return this.assetService.getAssetList();
//	}
//	
//	@GetMapping("/assets/{assetId}")
//	public Asset getEmp(@PathVariable Long assetId) throws Throwable {
//		
//		return this.assetService.get(assetId);
//	}
//	
//	@PostMapping(path = "/assets", consumes="application/json")
//	public Asset addOrg(@RequestBody Asset asset) {
//		
//		return this.assetService.add(asset);
//	}
//	
//	@PutMapping("/assets")
//	public Asset updateOrg(@RequestBody Asset asset) {
//		
//		return this.assetService.update(asset);
//	}
//	
//	@DeleteMapping("/assets/{assetId}")
//	public ResponseEntity<HttpStatus> deleteOrg(@PathVariable Long assetId) {
//			
//			try {
//				this.assetService.deleteEmp(assetId);
//				return new ResponseEntity<>(HttpStatus.OK);
//			} catch (Throwable e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//			}
//		
//		
//	}
	
}
