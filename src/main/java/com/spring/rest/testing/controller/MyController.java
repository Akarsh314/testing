package com.spring.rest.testing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.testing.entities.Organization;
import com.spring.rest.testing.services.OrganizationService;

@RestController
public class MyController {
	@Autowired
	private OrganizationService organizationService;
	
	@GetMapping("/")
	public String home() {
		return "New Welcome to Spring Boottttttttttt !!!!!!!!!!!!";
	}
	
	@GetMapping("/organizations")
	public List<Organization> getList(){
		return this.organizationService.getOrganizationList();
	}
	
	@GetMapping("/organizations/{orgName}")
	public Organization getOrg(@PathVariable String orgName) throws Throwable {
		
		return this.organizationService.get(orgName);
	}
	
	@PostMapping(path = "/organizations", consumes="application/json")
	public Organization addOrg(@RequestBody Organization org) {
		
		return this.organizationService.add(org);
	}
	
	@PutMapping("/organizations")
	public Organization updateOrg(@RequestBody Organization org) {
		
		return this.organizationService.update(org);
	}
	
	@DeleteMapping("/organizations/{orgName}")
	public ResponseEntity<HttpStatus> deleteOrg(@PathVariable String orgName) {
		

			
			try {
				this.organizationService.deleteOrg(orgName);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
			}
		
		
	}
	
}
