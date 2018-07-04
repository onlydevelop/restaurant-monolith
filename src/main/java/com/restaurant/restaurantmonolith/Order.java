package com.restaurant.restaurantmonolith;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List <LineItem> lineItems;
	private int total;
	
	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public int getTotal() {
		return total;
	}

	public Order() {
		lineItems = new ArrayList<LineItem>();
	}
	
	public void addItem(LineItem lineItem) {
		this.total += lineItem.getTotal();
		this.lineItems.add(lineItem);
	}
}
