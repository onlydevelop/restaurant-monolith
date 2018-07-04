package com.restaurant.restaurantmonolith;

public class LineItem {
	
	private long itemId;
	private String name;
	private int price;
	private int quantity;
	private int total;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getTotal() {
		this.total = this.price * this.quantity;
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public LineItem() {}

	public LineItem(int itemId, String name, int price, int quantity) {
		this.itemId = itemId;
		this.price = price;
		this.quantity = quantity;
		this.name = name;
	}
}
