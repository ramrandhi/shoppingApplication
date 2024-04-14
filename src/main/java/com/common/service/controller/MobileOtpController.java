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
@RequestMapping("/v1/otp")
@CrossOrigin(origins = "http://localhost:4200")
public class MobileOtpController {

	@Autowired
	private MobileOtpRepository mobileOtpRepository;

	@GetMapping("/generate")
	public String generateOtp(@RequestParam String mobileNumber) {
		// Generate a random 6-digit OTP
		String otp = generateRandomOtp();

		// Get current date and time
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String createdDateTime = now.format(formatter);

		// Set expiry date and time (e.g., 5 minutes from now)
		LocalDateTime expiryDateTime = now.plusMinutes(5);
		String expiryDateTimeStr = expiryDateTime.format(formatter);

		// Save OTP to the database
		MobileOtp mobileOtpDate = new MobileOtp();
		mobileOtpDate.setMobileNumber(mobileNumber);
		mobileOtpDate.setOtp(otp);
		mobileOtpDate.setCreataedDateTime(createdDateTime);
		mobileOtpDate.setExpiryDateTime(expiryDateTimeStr);
		mobileOtpRepository.save(mobileOtpDate);

		// Return the generated OTP to the frontend
		return otp;
	}

	private String generateRandomOtp() {
		Random random = new Random();
		int otp = 100000 + random.nextInt(900000); // Generate a random 6-digit number
		return String.valueOf(otp);
	}

}
