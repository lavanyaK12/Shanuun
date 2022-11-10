package com.application.shanuun.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PopularBrands {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long brandId;
	private String brandName;
	private String brandImg;
	public PopularBrands() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PopularBrands(Long brandId, String brandName, String brandImg) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.brandImg = brandImg;
	}
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandImg() {
		return brandImg;
	}
	public void setBrandImg(String brandImg) {
		this.brandImg = brandImg;
	}
	

}
