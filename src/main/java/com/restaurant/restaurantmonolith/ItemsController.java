package com.restaurant.restaurantmonolith;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
	
	@Autowired
	private ItemRepository repository;
	
	@GetMapping("/items/{id}")
	public Item getItem(@PathVariable Long id) {
		
		Optional<Item> item = repository.findById(id);
		return item.get(); 
	}
}
