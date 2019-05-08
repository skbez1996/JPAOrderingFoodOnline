/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the MenuService Interface  shows the functionalities that will work
*/
package com.cg.myproject.service;

import java.math.BigDecimal;
import java.util.List;

import com.cg.myproject.dto.Menu;
import com.cg.myproject.dto.Restaurant;
import com.cg.myproject.exception.RestaurantNotFoundException;

public interface MenuService {
	public Restaurant add(Restaurant restaurant) throws RestaurantNotFoundException;
	public Restaurant searchByNameR(String restaurantName) throws RestaurantNotFoundException;
	public List<Restaurant> showRestaurant();

	
	
	
}
