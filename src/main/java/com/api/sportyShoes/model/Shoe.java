package com.api.sportyShoes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Shoe {
	public Shoe(int id, String name, String category, double price) {
		super();
		this.id = id;
		this.setName(name);
		this.setCategory(category);
		this.setPrice(price);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String category;
	private double price;
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}


}
