package com.wellsfargo.training.pms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity  /* The @Entity annotation specifies that the class is an entity and is mapped to a database table.*/
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Auto Number
	private Long pid;
	
	private String name;
	private String brand;
	private String madein;
	private float price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Long pid, String name, String brand, String madein, float price) {
		super();
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.madein = madein;
		this.price = price;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
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

	public String getMadein() {
		return madein;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
}
