/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the MenuServiceIMPl class which implements the logic of the functionalities
*/
package com.cg.myproject.service;
import java.util.ArrayList;
import java.util.List;
import com.cg.myproject.dao.MenuRepository;
import com.cg.myproject.dao.MenuRepositoryImpl;
import com.cg.myproject.dto.Item;
import com.cg.myproject.dto.Menu;
import com.cg.myproject.dto.Restaurant;
import com.cg.myproject.exception.RestaurantNotFoundException;

public class MenuServiceImpl implements MenuService{
	private static int menu_id = 0 ;
	private static int item_id =1 ;
	 
	MenuRepositoryImpl repo= new MenuRepositoryImpl() ;

	@Override
	public Restaurant add(Restaurant restaurant) throws RestaurantNotFoundException {
		List<Item> items = new ArrayList<>();
		
		List <Item> myList = new ArrayList<>();
		
		menu_id++;
//		item_id++;
		restaurant.getMenu().setMenuId(menu_id);
	items = restaurant.getMenu().getItem();
	for (Item item : items) {
		item.setId(item_id++);
		myList.add(item);
		
		
	}
	restaurant.getMenu().setItem(myList);
	
	
	
//		System.out.println("In Service");
		return repo.save(restaurant);
	}

	@Override
	public Restaurant searchByNameR(String restaurantName) throws RestaurantNotFoundException{
		
		Restaurant rest = repo.findByName(restaurantName);
		if(rest!=null)
		{
		
			return rest;
		}
		else
		{
		throw new RestaurantNotFoundException("Restaurant not found");
		}
	
		
		
	}
/*
//	@Override
//	public Menu add(Menu menu) {
//		// TODO Auto-generated method stub
//		return null;
//	}
*/

	@Override
	public List<Restaurant> showRestaurant() {
		return repo.getRestaurant();
	}


	
}
