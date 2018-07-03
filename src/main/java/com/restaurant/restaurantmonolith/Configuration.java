package com.restaurant.restaurantmonolith;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("restaurant-monolith-service")
public class Configuration {
	private float factor;

	public float getFactor() {
		return factor;
	}

	public void setFactor(float factor) {
		this.factor = factor;
	}
	
}
