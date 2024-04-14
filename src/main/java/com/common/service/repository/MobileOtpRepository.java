package com.common.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.common.service.entity.MobileOtp;

@Repository
public interface MobileOtpRepository extends JpaRepository<MobileOtp, Integer> {

	@Query(value = "SELECT * FROM common.mobile_otp WHERE mobile_number = :mobileNumber ORDER BY id DESC LIMIT 1", nativeQuery = true)
	public MobileOtp getDataByNumber(String mobileNumber);

}
