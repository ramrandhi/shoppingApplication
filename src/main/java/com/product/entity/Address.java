package com.product.entity;

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
@Table(name = "address")
public class Address implements Serializable{
	
	private static final long serialVersionUID = -6265530196155564557L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer Id;
	@Column(name = "country_code", nullable = false)
	private String countryCode;
	@Column(name = "country_name", nullable = false)
	private String countryName;
	@Column(name = "country_short_name", nullable = false)
	private String countryShortName;
	@Column(name = "state", nullable = false)
	private String state;
	@Column(name = "district", nullable = false)
	private String district;
	@Column(name = "town", nullable = false)
	private String town;
	@Column(name = "land_mark", nullable = false)
	private String landMark;
	@Column(name = "pincode", nullable = false)
	private String pincode;
	public Address() {
		super();
	}
	public Address(Integer id, String countryCode, String countryName, String countryShortName, String state,
			String district, String town, String landMark, String pincode) {
		super();
		Id = id;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.countryShortName = countryShortName;
		this.state = state;
		this.district = district;
		this.town = town;
		this.landMark = landMark;
		this.pincode = pincode;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [Id=" + Id + ", countryCode=" + countryCode + ", countryName=" + countryName
				+ ", countryShortName=" + countryShortName + ", state=" + state + ", district=" + district + ", town="
				+ town + ", landMark=" + landMark + ", pincode=" + pincode + "]";
	}
}
