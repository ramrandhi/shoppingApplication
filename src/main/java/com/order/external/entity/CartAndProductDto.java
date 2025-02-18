package com.order.external.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CartAndProductDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3300061670855345159L;
	
	private Integer id;
	private String name;
	private String brand;
	private String model;
	private String color;
	private String description;
	private Double oldPrice;
	private Double price;
	private Integer stockQuantity;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private String category;
	private String imageLocation;
	private String type;
	private String orderNumber;
	private Integer productId;
	
	public CartAndProductDto(Integer id, String name, String brand, String model, String color, String description,
			Double oldPrice, Double price, Integer stockQuantity, LocalDateTime createdAt, LocalDateTime updatedAt,
			String category, String imageLocation, String type, String orderNumber, Integer productId) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.description = description;
		this.oldPrice = oldPrice;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.category = category;
		this.imageLocation = imageLocation;
		this.type = type;
		this.orderNumber = orderNumber;
		this.productId = productId;
	}

	public CartAndProductDto() {
		super();
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getOldPrice() {
		return oldPrice;
	}

	public void setOldPrice(Double oldPrice) {
		this.oldPrice = oldPrice;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "CartAndProductDto [id=" + id + ", name=" + name + ", brand=" + brand + ", model=" + model + ", color="
				+ color + ", description=" + description + ", oldPrice=" + oldPrice + ", price=" + price
				+ ", stockQuantity=" + stockQuantity + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", category=" + category + ", imageLocation=" + imageLocation + ", type=" + type + ", orderNumber="
				+ orderNumber + ", productId=" + productId + "]";
	}	
}
