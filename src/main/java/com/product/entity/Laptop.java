package com.product.entity;

import java.time.LocalDateTime;

import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Audited
@Table(name = "LAPTOP")
public class Laptop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Integer id;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "BRAND", nullable = false)
	private String brand;
	
	@Column(name = "MODEL", nullable = false)
	private String model;
	
	@Column(name = "DESCRIPTION", nullable = false)
	private String description;
	
	@Column(name = "PRICE", nullable = false)
	private Double price;

	@Column(name = "STOCK_QUANTITY", nullable = false)
	private Integer stockQuantity;

	@Column(name = "CREATED_AT", nullable = false)
	private LocalDateTime createdAt;

	@Column(name = "UPDATED_AT")
	private LocalDateTime updatedAt;

	@Column(name = "CATEGORY", nullable = false)
	private String category;
	
	@Column(name = "IMAGE_LOCATION", nullable = false)
	private String imageLocation;
	
	public Laptop() {
		super();
	}

	public Laptop(Integer id, String name, String brand, String model, String description, Double price,
			Integer stockQuantity, LocalDateTime createdAt, LocalDateTime updatedAt, String category,
			String imageLocation) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.description = description;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.category = category;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", brand=" + brand + ", model=" + model + ", description="
				+ description + ", price=" + price + ", stockQuantity=" + stockQuantity + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", category=" + category + ", imageLocation=" + imageLocation + "]";
	}
}
