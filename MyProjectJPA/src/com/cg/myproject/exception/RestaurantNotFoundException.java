package com.cg.myproject.exception;
/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the RestaurantNotFoundException class which extends RunTimwe Exception
*/
public class RestaurantNotFoundException extends Exception {

	public RestaurantNotFoundException() {
	
		super();
	
	}

	public RestaurantNotFoundException(String msg) {
		
		super(msg);
		
	}
	
	
}
