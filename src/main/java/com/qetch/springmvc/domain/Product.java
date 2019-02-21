package com.qetch.springmvc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Size(min=1, max=5)
	private String name;
	private String description;
	private Float price;
	
	@Past
	@NotNull
	private Date productionDate;
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
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Date getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", price=" + price + ", productionDate="
				+ productionDate + "]";
	}
}
