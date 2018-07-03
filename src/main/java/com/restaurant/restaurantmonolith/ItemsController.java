package com.restaurant.restaurantmonolith;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
	
	@Autowired
	private Configuration configuration;
	
	@Autowired
	private ItemRepository repository;
	
	@GetMapping("/items/{id}/type/{type}")
	public Item getItem(@PathVariable Long id, @PathVariable String type) {
		
		Optional<Item> item = repository.findById(id);
		return getCalculatedItem(item.get(), type); 
	}
	
	private Item getCalculatedItem(Item item, String type) {
		double factor = 1.0;
		if (type.equals("restaurant")) factor = configuration.getFactor();
		item.setPrice((int) (item.getPrice() * factor));
		return item;
	}
}
