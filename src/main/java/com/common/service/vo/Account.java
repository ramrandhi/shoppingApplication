package com.common.service.vo;

public class Account {
	private Integer id;
	private String name;
	private String description;
	private String imageLocation;
	
	public Account() {
		super();
	}
	public Account(Integer id, String name, String description, String imageLocation) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageLocation = imageLocation;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageLocation() {
		return imageLocation;
	}
	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", description=" + description + ", imageLocation="
				+ imageLocation + "]";
	}	
}
