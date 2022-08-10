package br.com.santander.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fruit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private int daysToExpire;
	
	@Column(nullable = false)
	private FruitGenderE gender;
	
	private double cost;
	
	private double salePrice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDaysToExpire() {
		return daysToExpire;
	}

	public void setDaysToExpire(int daysToExpire) {
		this.daysToExpire = daysToExpire;
	}

	public FruitGenderE getGender() {
		return gender;
	}

	public void setGender(FruitGenderE gender) {
		this.gender = gender;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
	
}
