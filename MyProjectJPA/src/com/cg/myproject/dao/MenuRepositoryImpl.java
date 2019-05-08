package com.cg.myproject.dao;
/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the MenuRepositoryImpl class which implements the logic 
*/
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.myproject.DBUtil.DbUtil;
import com.cg.myproject.dto.Restaurant;
import com.cg.myproject.exception.RestaurantNotFoundException;

public class MenuRepositoryImpl implements MenuRepository {
EntityManager em ;


	@Override
	public Restaurant save(Restaurant restaurant) throws RestaurantNotFoundException {
		try {
		em = DbUtil.getConnection();		
		em.persist(restaurant);
		em.getTransaction().commit();
		
		return restaurant;
		}catch (Exception e) {
			throw new RestaurantNotFoundException("Restaurant not added properly");

		}finally {
			em.close();
		}
	}
	@Override
	public List<Restaurant> getRestaurant() {
		List<Restaurant> mylist=new ArrayList<>();
		em = DbUtil.getConnection();
		String qu="Select r from Restaurant r";
			TypedQuery<Restaurant> query=em.createQuery(qu,Restaurant.class);
			mylist=query.getResultList();
		return mylist;
	}
	@Override
	public Restaurant findByName(String name) {
		em = DbUtil.getConnection();
		String qu="Select r from Restaurant r where name = ?";
		TypedQuery<Restaurant> query=em.createQuery(qu,Restaurant.class);
		query.setParameter(1, name);
		Restaurant restaurant = new Restaurant();
		restaurant = query.getSingleResult();
		
		return restaurant;
}
}
