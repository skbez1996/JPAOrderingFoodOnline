/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
*MyApplication
* This is the main class where where the user can Add, View and search Restaurants 
*/
package com.cg.myproject.ui;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.xml.ws.Service;

import com.cg.myproject.DBUtil.DbUtil;
import com.cg.myproject.dto.Item;
import com.cg.myproject.dto.Menu;
import com.cg.myproject.dto.Restaurant;
import com.cg.myproject.exception.RestaurantNotFoundException;
import com.cg.myproject.service.MenuService;
import com.cg.myproject.service.MenuServiceImpl;

public class MyApplication {
	
public static void main(String args[]) {
	Scanner sc= new Scanner (System.in);
	
	
	MenuServiceImpl service = new MenuServiceImpl();
		int choice;
	do {
		System.out.println(" 1.Add Restaurants \n 2.Show Restaurants \n 3.Search Restaurant by name \n 4 .Exit");
    choice= sc.nextInt();
	switch (choice) {
	case 1: 
		
		List <Item> itemList = new ArrayList<>();
		
		
		System.out.println("enter restaurant name");
		String rname = sc.next();
		System.out.println("enter restaurant phone number");
		String rmobile = sc.next();
		System.out.println("enter restaurant city");
		String rcity = sc.next();
		
		
		
		System.out.println("enter menu name");
		String menuName = sc.next();
		
		String ch ;
		
		do {
		System.out.println("enter item name");
		String itemName= sc.next();
		
		System.out.println("enter item price");
		double itemPrice = sc.nextDouble();
		
		System.out.println("enter item description");
		String description = sc.next();
		
		Item item = new Item(itemName, itemPrice, description);
		itemList.add(item);
		
		System.out.println("do you want add more items(yes/no)");
		 ch = sc.next();
		
		}while(ch.equals("yes"));
		
		Menu menu = new Menu(menuName,itemList);
		
		Restaurant  restaurant = new Restaurant(rname,new BigInteger(rmobile), rcity,menu);
		
	
		

		try {
			System.out.println("Restaurants added Successfully"+service.add(restaurant));
		} catch (RestaurantNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		break;

	case 2:List<Restaurant> restur= service.showRestaurant();
	  
	for (Restaurant rest : restur) {
		  System.out.println("rest name: "+rest.getName());
		  System.out.println("rest phone: "+rest.getPhone());
		  System.out.println("rest addr: "+rest.getAddress());
	}
	
		break;
	
	case 3 :
		List<Restaurant> restaurants = new ArrayList<Restaurant>() ;
		

		System.out.println("Enter the name of the restaurant to search");
		String Rname =sc.next();
	
		try {
			System.out.println(service.searchByNameR(Rname));
			
		} catch (RestaurantNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		break;
	case 4: break;
	
		
	}
	}
	while(choice < 4) ;
}

}





 

