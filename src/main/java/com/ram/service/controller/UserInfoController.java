package com.ram.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.service.entity.UserInfo;
import com.ram.service.productservice.UserInfoService;

@RestController
@RequestMapping("/v1/product")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@GetMapping("/all")
	public List<UserInfo> getAllUserInfo() {
		return userInfoService.getAllUsers();
	}
	
	@GetMapping("/id/{id}")
	public UserInfo getUserById(@PathVariable("id") Integer id) {
		return userInfoService.getUserById(id);
	}
	
	@PostMapping("/save")
	public UserInfo saveUserInfo(@RequestBody UserInfo userInfo) {
		return userInfoService.saveUserInfo(userInfo);
	}
	
	@PutMapping("/update")
	public UserInfo updateUserInfo(@RequestBody  UserInfo userInfo) {
		return userInfoService.updateUserInfo(userInfo);
	}
	
	@DeleteMapping("/delete")
	public void deleteUserInfoById(@PathVariable("id") Integer id) {
		userInfoService.updateUserInfo(id);
	}

}
