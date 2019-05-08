package com.cg.myproject.dto;

/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the Menu class which contains a list of items 
*/

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class Menu {
	@Column(name ="menu_name")
	private String menuName;
	@Id
	@Column(name="menu_id")
	private int menuId;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "menu_id")
	private List <Item> items ;
	public Menu() {
	}
	public Menu(String menuName, List<Item> itemName) {
		super();
		this.menuName = menuName;
		this.items = itemName;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public List<Item> getItem() {
		return items;
	}
	public void setItem(List<Item> itemName) {
		this.items = itemName;
	}
	@Override
	public String toString() {
		return "Menu [menuName=" + menuName + ", menuId=" + menuId + ", itemName=" + items + "]";
	}
	}
