package com.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="dishinfo")
public class Dishes {

	@Id
	@GeneratedValue
	private int dishid;
	private String dishname;
	
	@ManyToMany(targetEntity=Customers.class, cascade=CascadeType.ALL)
/*	@JoinTable(
			name="dish_cust",
			joinColumns = {
					@JoinColumn(name="dishid")
			},
			inverseJoinColumns = {
					@JoinColumn(name="cusid")
			}
			)
			*/
	
	private List<Customers> customer;
	
	public int getDishid() {
		return dishid;
	}
	
	public void setDishid(int dishid) {
		this.dishid = dishid;
	}
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	
	public List<Customers> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customers> customer) {
		this.customer = customer;
	}	
}
