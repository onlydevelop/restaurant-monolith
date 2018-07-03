package com.restaurant.restaurantmonolith;

import java.math.BigDecimal;

public class Item {
	
	private long id;
	private String name;
	private BigDecimal price;
	
	public Item() {}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Item(long id, String name, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
