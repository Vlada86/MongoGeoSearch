package com.stone.studio.software;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.stone.studio")
public class RestaurantGeoSearch {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantGeoSearch.class, args);
	}

}
