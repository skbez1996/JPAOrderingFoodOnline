/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the item class where item's properties are specified
*/
package com.cg.myproject.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
public class Item {
	@Id
	@Column(name="item_id")
 	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Column(name= "item_name")
	private String name;
	@Column(name= "item_price")
	private double price;
	@Column (name = "item_desc")
	private String description;
	public Item(int id, String name, double price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}
	public Item(String name, double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", description=" + description + "]";
	}
}
