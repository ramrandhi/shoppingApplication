package com.ram.service.entity;

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
	@Column(name = "country")
	private String country;
	@Column(name = "state")
	private String state;
	@Column(name = "district")
	private String district;
	@Column(name = "town")
	private String town;
	@Column(name = "land_mark")
	private String landMark;
	@Column(name = "pincode")
	private String pincode;
	public Address() {
		super();
	}
	
	public Address(Integer id, String country, String state, String district, String town, String landMark,
			String pincode) {
		super();
		Id = id;
		this.country = country;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Address [Id=" + Id + ", country=" + country + ", state=" + state + ", district=" + district + ", town="
				+ town + ", landMark=" + landMark + ", pincode=" + pincode + "]";
	}

}
