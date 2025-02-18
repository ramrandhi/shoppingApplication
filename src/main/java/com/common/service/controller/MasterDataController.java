package com.common.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common.service.commonservice.MasterDataService;
import com.common.service.vo.Account;
import com.common.service.vo.country;

@RestController
@RequestMapping("/api/v1/common/masterData")
@CrossOrigin(origins = "http://localhost:4200")
public class MasterDataController {
	@Autowired
	private MasterDataService masterDataService;
	
	@GetMapping(value = "/countries")
	public List<country> masterDataService() {
		return masterDataService.getAllCountryCodes();
	}
	
	@GetMapping(value = "/account")
	public List<Account> getAccountDetails() {
		return masterDataService.getAccountDetails();
	}

}
