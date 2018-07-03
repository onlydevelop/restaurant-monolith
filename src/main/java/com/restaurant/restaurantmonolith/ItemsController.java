package com.restaurant.restaurantmonolith;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
	
	@GetMapping("/items/{name}")
	public Item getItem(@PathVariable String name) {
		return new Item(1001, name, BigDecimal.valueOf(220)); 
	}
}
