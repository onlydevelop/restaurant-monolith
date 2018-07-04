package com.restaurant.restaurantmonolith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@Autowired
	private ItemsController itemController;
	
	@PostMapping("/orders/type/{type}")
	public Order getOrder(@PathVariable String type, @RequestBody LineItem[] lineItems) {
		Order order = new Order();
		for(LineItem lineItem : lineItems) {
			Item item = itemController.getItem(lineItem.getItemId(), type);
			lineItem.setName(item.getName());
			lineItem.setPrice(item.getPrice());
			System.out.println(item.getName() + " x " + lineItem.getQuantity());
			order.addItem(lineItem);
		}
		return order;
	}
}
