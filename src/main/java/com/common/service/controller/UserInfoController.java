package com.common.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.common.service.commonservice.UserInfoService;
import com.common.service.entity.MobileOtp;
import com.common.service.entity.UserInfo;
import com.common.service.repository.MobileOtpRepository;
import com.common.service.repository.UserInfoRepository;


@RestController
@RequestMapping("/v1/userInfo")
@CrossOrigin(origins = "http://localhost:4200")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@Autowired
	private MobileOtpRepository mobileOtpRepository;
	
	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@GetMapping("/all")
	public List<UserInfo> getAllUserInfo() {
		return userInfoService.getAllUsers();
	}
	
	@GetMapping("/id/{id}")
	public UserInfo getUserById(@PathVariable("id") Integer id) {
		return userInfoService.getUserById(id);
	}
	
	@PostMapping("/register")
	public UserInfo saveUserInfo(@RequestBody UserInfo userInfo, @RequestParam String otp) {
		MobileOtp mobileOtp = mobileOtpRepository.getDataByNumber(userInfo.getMobileNumber());
		if(mobileOtp != null && mobileOtp.getOtp() == otp) {
			return userInfoService.saveUserInfo(userInfo);
		} else {
			return userInfoService.saveUserInfo(userInfo);
		}
	}
	
	@PutMapping("/update")
	public UserInfo updateUserInfo(@RequestBody  UserInfo userInfo) throws Exception {
		return userInfoService.updateUserInfo(userInfo);
	}
	
	@DeleteMapping("/delete")
	public void deleteUserInfoById(@PathVariable("id") Integer id) throws Exception {
		userInfoService.updateUserInfo(id);
	}
	
	@GetMapping("/login-username-check")
	public ResponseEntity<?> checkUserName(@RequestParam String userName){
		UserInfo userInfo = userInfoRepository.findUserName(userName);
//	    boolean hasUserName = count > 0;
	    if(userInfo != null) {
	        return ResponseEntity.ok(true);
	    } else {
	    	return ResponseEntity.ok(false);
	    }
	}
	
	@GetMapping("/verify-signin")
	public ResponseEntity<?> checkUserNamePassword(@RequestParam String userName, @RequestParam String password){
		UserInfo userInfo = userInfoRepository.checkUserNamePassword(userName, password);
//	    boolean hasUserName = count > 0;
	    if(userInfo != null) {
	        return ResponseEntity.ok(true);
	    } else {
	    	return ResponseEntity.ok(false);
	    }
	}

}
