package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Mobile;
import com.product.productservice.MobileService;

@RestController
@RequestMapping("/v1/mobile")
@CrossOrigin(origins = "http://localhost:4200")
public class MobileController {
	
	@Autowired
	private MobileService mobileService;
	
	@GetMapping(value="/all")
	public List<Mobile> getAllMobiles() {
		return mobileService.getAllMobiles();
	}

}
