package com.product.entity;

import java.io.Serializable;

import org.hibernate.envers.Audited;

import com.product.base.entity.BaseMobile;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Audited
@Table(name = "MOBILE")
public class Mobile extends BaseMobile implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2363410698115801014L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
