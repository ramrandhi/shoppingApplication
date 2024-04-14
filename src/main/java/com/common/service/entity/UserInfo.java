package com.common.service.entity;

import java.io.Serializable;
import org.hibernate.envers.Audited;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Audited
@Table(name = "user_info")
public class UserInfo implements Serializable {

	private static final long serialVersionUID = -6265530196155564064L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer Id;
	@Column(name = "first_name", nullable = false)
	private String firstName;
	@Column(name = "last_name", nullable = false)
	private String lastName;
	@Column(name = "mobile_number", nullable = false)
	private String mobileNumber;
	@Column(name = "email", nullable = true)
	private String email;
	@Column(name = "password", nullable = false)
	private String password;
	@Column(name = "country_code", nullable = false)
	private String countryCode;
	@Column(name = "country_name", nullable = false)
	private String countryName;
	@Column(name = "country_short_name", nullable = false)
	private String countryShortName;

	public UserInfo() {
		super();
	}

	public UserInfo(Integer id, String firstName, String lastName, String mobileNumber, String email, String password,
			String countryCode, String countryName, String countryShortName) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.password = password;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.countryShortName = countryShortName;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryShortName() {
		return countryShortName;
	}

	public void setCountryShortName(String countryShortName) {
		this.countryShortName = countryShortName;
	}

	@Override
	public String toString() {
		return "UserInfo [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", email=" + email + ", password=" + password + ", countryCode=" + countryCode
				+ ", countryName=" + countryName + ", countryShortName=" + countryShortName + "]";
	}
}
