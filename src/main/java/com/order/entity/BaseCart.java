package com.order.entity;

import javax.validation.constraints.NotNull;

import org.hibernate.envers.Audited;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@Audited
@MappedSuperclass
public class BaseCart {
	
	@Column(name="ORDER_NUMBER", nullable = false, updatable = false)
	private String orderNumber;
	
	@Column(name="PRODUCT_ID", nullable = false)
	@NotNull(message="")
	private Integer productId;

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
}
