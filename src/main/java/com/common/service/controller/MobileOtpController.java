package com.common.service.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.common.service.entity.MobileOtp;
import com.common.service.repository.MobileOtpRepository;

@RestController
@RequestMapping("/api/v1/common/otp")
@CrossOrigin(origins = "http://localhost:4200")
public class MobileOtpController {

	@Autowired
	private MobileOtpRepository mobileOtpRepository;

	@GetMapping("/generate")
	public String generateOtp(@RequestParam String mobileNumber) {
		String otp = generateRandomOtp();

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String createdDateTime = now.format(formatter);

		LocalDateTime expiryDateTime = now.plusMinutes(5);
		String expiryDateTimeStr = expiryDateTime.format(formatter);

		MobileOtp mobileOtpDate = new MobileOtp();
		mobileOtpDate.setMobileNumber(mobileNumber);
		mobileOtpDate.setOtp(otp);
		mobileOtpDate.setCreataedDateTime(createdDateTime);
		mobileOtpDate.setExpiryDateTime(expiryDateTimeStr);
		mobileOtpRepository.save(mobileOtpDate);

		return otp;
	}

	private String generateRandomOtp() {
		Random random = new Random();
		int otp = 100000 + random.nextInt(900000);
		return String.valueOf(otp);
	}

}
