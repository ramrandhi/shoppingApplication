package com.common.service.entity;

import java.io.Serializable;

import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Audited
@Table(name = "mobile_otp")
public class MobileOtp  implements Serializable {
	
	private static final long serialVersionUID = -6265530196155565566L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer Id;
	@Column(name = "mobile_number", nullable = false)
	private String mobileNumber;
	@Column(name = "otp", nullable = false)
	private String otp;
	@Column(name = "created_date_time", nullable = false)
	private String creataedDateTime;
	@Column(name = "expiry_date_time", nullable = false)
	private String expiryDateTime;
	public MobileOtp() {
		super();
	}
	public MobileOtp(Integer id, String mobileNumber, String otp, String creataedDateTime, String expiryDateTime) {
		super();
		Id = id;
		this.mobileNumber = mobileNumber;
		this.otp = otp;
		this.creataedDateTime = creataedDateTime;
		this.expiryDateTime = expiryDateTime;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getCreataedDateTime() {
		return creataedDateTime;
	}
	public void setCreataedDateTime(String creataedDateTime) {
		this.creataedDateTime = creataedDateTime;
	}
	public String getExpiryDateTime() {
		return expiryDateTime;
	}
	public void setExpiryDateTime(String expiryDateTime) {
		this.expiryDateTime = expiryDateTime;
	}
	@Override
	public String toString() {
		return "MobileOtp [Id=" + Id + ", mobileNumber=" + mobileNumber + ", otp=" + otp + ", creataedDateTime="
				+ creataedDateTime + ", expiryDateTime=" + expiryDateTime + "]";
	}
}
