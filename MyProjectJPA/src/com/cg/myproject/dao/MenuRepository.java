/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the MenuRepository interface used to specify the methods
* 
*/
package com.cg.myproject.dao;

import java.util.List;

import com.cg.myproject.dto.Restaurant;
import com.cg.myproject.exception.RestaurantNotFoundException;




public interface MenuRepository {
	//the following Query is used to insert the values for Restaurant in the DB
	public static final String queryInsertRestaurant= "INSERT INTO restaurants(name,phone,address,menu_id) values(?,?,?,?) ";
	//this query is used to insert values into the menu in the DB
	public static final String queryInsertMenu= "INSERT INTO menu(menu_name) values(?) ";
	//this query is used to insert items into the DB
	public static final String queryInsertItem= "INSERT INTO items(name,price,description,menu_id) values(?,?,?,?) ";
	
	
	public Restaurant save(Restaurant restaurant) throws RestaurantNotFoundException;
	public Restaurant findByName(String name);
	public List<Restaurant> getRestaurant();
	

}