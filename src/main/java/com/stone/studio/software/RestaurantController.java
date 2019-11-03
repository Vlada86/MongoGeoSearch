package com.stone.studio.software;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/restaurants")
public class RestaurantController {

	@Autowired
	private RestaurantRepository repoR;

	@Autowired
	private RestaurantService restS;

	@PostMapping
	public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
		return repoR.save(restaurant);
	}

	@GetMapping(value = "/all")
	public List<Restaurant> findAll() {
		return repoR.findAll();
	}

	@GetMapping(value = "/distance")
	public List<Restaurant> findByDistance(@RequestParam(value="long")float longitude,@RequestParam(value="lat") float latitude,@RequestParam(value="dist") int distance) {
		return restS.findByDistance(longitude, latitude, distance);
	}

}
