package com.cg.myproject.dto;
/*@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the item class where item's properties are specified
*/
import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
public class Restaurant {
	@Id
	@Column(name ="res_phone")
	private	BigInteger phone;
	@Column(name ="res_name")
	private String name;
	
	@Column(name ="res_addr")
	private String address;
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name ="menu_id")
	private Menu menu;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getPhone() {
		return phone;
	}

	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", address=" + address +
				"]";
	}

	public Restaurant(String name, BigInteger phone, String address, Menu menu) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.menu = menu;
	}

	public Restaurant() {
	}
}
